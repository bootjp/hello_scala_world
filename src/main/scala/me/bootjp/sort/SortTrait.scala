package me.bootjp.sort

import scala.collection.mutable

trait SortTrait {

  def sort(list : mutable.MutableList[Int]): mutable.MutableList[Int]
}
