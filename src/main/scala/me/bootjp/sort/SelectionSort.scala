package me.bootjp.sort

import scala.collection.mutable


object SelectionSort extends App {

  // 動く、動くが Int.Max or Int.Min を投げれば壊れる
  def sort(list: mutable.MutableList[Int]): mutable.MutableList[Int] = {

    // 現在の最小値を探す
    // 最小値を一番先頭に移動する
    // ソート済みとして扱う n - sorted
    var cur = 0
    var fixed = Long.MinValue
    val end = list.length.-(1)
    do {
      val pos = findMinPos(list, fixed)
      val tmp = list(cur)
      list(cur) = list(pos)
      fixed = list(cur).toLong
      list(pos) = tmp

      cur = cur + 1
    } while (cur != end)

    list
  }

  def findMinPos(list: mutable.MutableList[Int], exclude : Long): Int = {
    var position = 0
    var minNum = Int.MaxValue

    var index = 0
    for (elem <- list) {
      if (minNum >= elem && exclude < elem) {
        minNum = elem
        position = index
      }
      index = index + 1
    }
    position
  }

  val sortedList = sort(mutable.MutableList(5, 2, 4, 3, -1, 1))

  sortedList.foreach(println)
}

