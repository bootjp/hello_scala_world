package me.bootjp.sort

import org.scalatest.FunSuite

import scala.collection.mutable

class BubbleSortTest extends FunSuite {
  test("BubbleSort.sort") {

    assert(
      BubbleSort.sort(mutable.MutableList(5, 2, 4, 3, 1)) == mutable.MutableList(5, 2, 4, 3, 1).sorted
    )
  }
}
