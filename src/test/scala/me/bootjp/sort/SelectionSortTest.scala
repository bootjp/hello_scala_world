package me.bootjp.sort

import org.scalatest.FunSuite

import scala.collection.mutable

class SelectionSortTest extends FunSuite {
//  test("SelectionSort.list_of_min_position") {
//    val expected = 4
//    val output = SelectionSort.findMinPos(mutable.MutableList(5, 2, 4, 3, 1))
//
//    assert(output == expected)
//  }
//
//  test("SelectionSort.list_of_min_position_negative") {
//    val expected = 3
//    val output = SelectionSort.findMinPos(mutable.MutableList(5, 2, 4, -1, 1))
//
//    assert(output == expected)
//  }
//
//  test("SelectionSort.list_of_min_position_twopattern") {
//    val expected = 1
//    val output = SelectionSort.findMinPos(mutable.MutableList(5, 1))
//
//    assert(output == expected)
//  }


  test("SelectionSort.sort_negative_value") {
    val expected = mutable.MutableList(5, 2, 4, 3, -1, 1).sorted
    val output = SelectionSort.sort(mutable.MutableList(5, 2, 4, 3, -1, 1))

    assert(output == expected)
  }


  test("SelectionSort.sort_int_max") {
    val expected = mutable.MutableList(5, 2, 4, 3, Int.MaxValue).sorted
    val output = SelectionSort.sort(mutable.MutableList(5, 2, 4, 3, Int.MaxValue))

    assert(output == expected)
  }

  test("SelectionSort.sort_int_min") {
    val expected = mutable.MutableList(5, 2, 4, 3, Int.MinValue).sorted
    val output = SelectionSort.sort(mutable.MutableList(5, 2, 4, 3, Int.MinValue))

    assert(output == expected)
  }

//  test("SelectionSort.sort_duplicate") {
//    val expected = mutable.MutableList(5, 2, 2, 3, Int.MinValue).sorted
//    val output = SelectionSort.sort(mutable.MutableList(5, 2, 2, 3, Int.MinValue))
//
//    assert(output == expected)
//  }

//  test("SelectionSort.sort_duplicate_negative") {
//    val expected = mutable.MutableList(5, 2, 2, 3, Int.MinValue).sorted
//    val output = SelectionSort.sort(mutable.MutableList(5, -2, -2, 3, Int.MinValue))
//
//    assert(output == expected)
//  }
}
