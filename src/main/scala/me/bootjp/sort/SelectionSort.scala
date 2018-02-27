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
    var minReal:Int = 0
    val end = list.length - 1
    // 何個目が確定したか
    var fixed = 0
    while (fixed != end) {
      var position = -1
      var minNum  = Long.MaxValue
      var index = 0

      for (elem <- list) {
        if (minNum >= elem && min < elem)
            // ||
            // TODO
            // 同じ値だけどアドレスが異なるとき（重複した値）
/*            (min == elem && (minReal ne elem))) */
        {
          minNum = elem
          position = index
        }
        index = index + 1
      }
      // 見つかった数値が一番左かソート済みのときは何もしない
      min = list(position)
      minReal = list(position)
      if (position > fixed) {
        move(list, fixed, position)
      }
      fixed = fixed + 1
    }

    list
  }

  def move(list: mutable.MutableList[Int], target:Int, source : Int): mutable.MutableList[Int] = {
    val tmp = list(target)
    list(target) = list(source)
    list(source) = tmp
    list
  }
/*

  /**
    * 線形探索で最小値を探す
    * @param list 対象のMutableList
    * @return int 最小値のListの位置 みつからない場合は -1
    */*/
//  def findMinPos(list: mutable.MutableList[scala.Int], over :Long = Long.MinValue, minReal:scala.Int): Int = {
//    var position = -1
//    var minNum  = Long.MaxValue
//    var index = 0
//
//    for (elem <- list) {
//      if (
//        (minNum >= elem && over < elem) ||
//          // 同じ値だけどアドレスが異なるとき（重複した値）
//        (over == elem && (elem eq minReal))) {
//        minNum = elem
//        position = index
//      }
//      index = index + 1
//    }
//
//    position
//  }

  val sortedList = sort(mutable.MutableList(5, -1, 1))

  sortedList.foreach(println)
}

