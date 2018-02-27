package me.bootjp.sort

import scala.collection.mutable


object SelectionSort extends App {

  def sort(list: mutable.MutableList[Int]): mutable.MutableList[Int] = {

    // 線形探索で最小値を探す
    // for .. i ..
    //   最小値が一番左であった場合はなにもしない
    // 最小値を一番先頭と交換しソート済みとして扱う n - sorted
    //
    // 現在の最小値
    var min = Long.MinValue
    val end = list.length - 1
    // 何個目が確定したか
    var fixed = 0
    while (fixed != end) {
      val pos = indexOfMin(list, min)
      min = list(pos)
      // 見つかった数値がソート済みか未ソートの一番左だった場合はなにもしない
      if (pos > fixed) {
        swap(list, fixed, pos)
      }
      fixed += 1
    }

    list
  }

  def swap(list: mutable.MutableList[Int], target:Int, source : Int): mutable.MutableList[Int] = {
    val tmp = list(target)
    list(target) = list(source)
    list(source) = tmp
    list
  }


  /**
    * 線形探索で最小値を探す
    * @param list 対象のMutableList
    * @return int 最小値のListの位置 みつからない場合は -1
    */
  def indexOfMin(list: mutable.MutableList[scala.Int], over :Long = Long.MinValue): Int = {
    var position = -1
    var minNum  = Long.MaxValue
    var index = 0

    for (elem <- list) {
      if (minNum >= elem && elem > over) {
        // TODO 同じ値だけどアドレスが異なるとき（重複した値）
        // Scalaだとどうにもメモリアドレスをみることが難しそう
        // 前回のメモリアドレスを保持しておき、値が同一の場合メモリアドレスも同一かをチェックする
        minNum = elem
        position = index
      }
      index = index + 1
    }

    position
  }

  val sortedList = sort(mutable.MutableList(5, -1, 1))

  sortedList.foreach(println)
}

