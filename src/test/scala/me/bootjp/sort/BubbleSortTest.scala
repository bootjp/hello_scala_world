package me.bootjp.sort

import org.scalatest.FunSuite

import scala.collection.mutable

class BubbleSortTest extends FunSuite {
  test("BubbleSort.sort_general") {
    val expected = mutable.MutableList(5, 2, 4, 3, 1).sorted
    val output = BubbleSort.sort(mutable.MutableList(5, 2, 4, 3, 1))

    assert(output == expected)
  }

  test("BubbleSort.sort_negative_value") {
    val expected = mutable.MutableList(5, 2, 4, 3, -1, 1).sorted
    val output = BubbleSort.sort(mutable.MutableList(5, 2, 4, 3, -1, 1))

    assert(output == expected)
  }

  test("BubbleSort.sort_reverse") {
    val expected = mutable.MutableList(5, 2, 4, 3, 1).sorted.reverse
    val output = BubbleSort.sort(mutable.MutableList(5, 2, 4, 3, 1)).reverse

    assert(output == expected)
  }

  test("BubbleSort.sort_int_max") {
    val expected = mutable.MutableList(5, 2, 4, 3, Int.MaxValue).sorted
    val output = BubbleSort.sort(mutable.MutableList(5, 2, 4, 3, Int.MaxValue))

    assert(output == expected)
  }

  test("BubbleSort.sort_int_min") {
    val expected = mutable.MutableList(5, 2, 4, 3, Int.MinValue).sorted
    val output = BubbleSort.sort(mutable.MutableList(5, 2, 4, 3, Int.MinValue))

    assert(output == expected)
  }

  test("BubbleSort.sort_duplicate") {
    val expected = mutable.MutableList(5, 2, 2, 3, Int.MinValue).sorted
    val output = BubbleSort.sort(mutable.MutableList(5, 2, 2, 3, Int.MinValue))

    assert(output == expected)
  }

  test("BubbleSort.sort_duplicate_negative") {
    val expected = mutable.MutableList(5, -2, -2, 3, Int.MinValue).sorted
    val output = BubbleSort.sort(mutable.MutableList(5, -2, -2, 3, Int.MinValue))

    assert(output == expected)
  }
}
