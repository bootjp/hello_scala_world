package me.bootjp.sort

import scala.collection.mutable


object BubbleSort extends App with SortInterface {

  def sort(list: mutable.MutableList[Int]): mutable.MutableList[Int] = {

    var fixed = 0
    val end = list.length.-(1)

    while (fixed.!= (end)) {
      var current = 0
      while (current.!= (end - fixed)) {
        val next = current.+(1)
        if (list(current) > list(next)) {
          val tmp = list(current)
          list(current) = list(next)
          list(next) = tmp
        }
        current = current.+(1)
      }
      fixed = fixed.+(1)
    }
    list
  }

  val sortedList = sort(mutable.MutableList(5, 2, 4, 3, -1, 1))

  sortedList.foreach(println)
}

