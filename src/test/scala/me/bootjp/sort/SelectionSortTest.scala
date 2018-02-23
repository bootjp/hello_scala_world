package me.bootjp.sort

import org.scalatest.FunSuite

import scala.collection.mutable

class SelectionSortTest extends FunSuite {
  test("SelectionSort.list_of_min_position") {
    val expected = 4
    val output = SelectionSort.findMinPos(mutable.MutableList(5, 2, 4, 3, 1), 0)

    assert(output == expected)
  }

  test("SelectionSort.list_of_min_position_negative") {
    val expected = 3
    val output = SelectionSort.findMinPos(mutable.MutableList(5, 2, 4, -1, 1), -2)

    assert(output == expected)
  }

  test("SelectionSort.list_of_min_position_negative_exclude") {
    val expected = 4
    val output = SelectionSort.findMinPos(mutable.MutableList(5, 2, 4, -1, 1), 0)

    assert(output == expected)
  }

  test("SelectionSort.sort_negative_value") {
    val expected = mutable.MutableList(5, 2, 4, 3, -1, 1).sorted
    val output = SelectionSort.sort(mutable.MutableList(5, 2, 4, 3, -1, 1))

    assert(output == expected)
  }

  test("SelectionSort.sort_reverse") {
    val expected = mutable.MutableList(5, 2, 4, 3, 1).sorted.reverse
    val output = SelectionSort.sort(mutable.MutableList(5, 2, 4, 3, 1)).reverse

    assert(output == expected)
  }

  test("SelectionSort.sort_int_max") {
    val expected = mutable.MutableList(5, 2, 4, 3, Int.MaxValue).sorted.reverse
    val output = SelectionSort.sort(mutable.MutableList(5, 2, 4, 3, Int.MaxValue)).reverse

    assert(output == expected)
  }

  test("SelectionSort.sort_int_min") {
    val expected = mutable.MutableList(5, 2, 4, 3, Int.MinValue).sorted.reverse
    val output = SelectionSort.sort(mutable.MutableList(5, 2, 4, 3, Int.MinValue)).reverse

    assert(output == expected)
  }
}
