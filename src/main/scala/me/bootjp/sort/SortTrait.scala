package me.bootjp.sort

import scala.collection.mutable

trait SortTrait {

  def sort(list : mutable.MutableList[Int]): mutable.MutableList[Int]


  final def swap(list: mutable.MutableList[Int], target:Int, source : Int): mutable.MutableList[Int] = {
    val tmp = list(target)
    list(target) = list(source)
    list(source) = tmp
    list
  }

}
