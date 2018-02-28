package me.bootjp.sort

import scala.collection.mutable

trait SortInterface {

  def sort(l:mutable.MutableList[Int]): mutable.MutableList[Int]
}
