package me.bootjp.sort

import org.scalatest.FunSuite

import scala.collection.mutable

class SelectionSortAsArrayTest extends FunSuite {
  test("SelectionSort.sort_negative_value") {
    val expected = Array(5, 2, 4, 3, -1, 1).sorted
    val output = SelectionSortAsArray.sort(Array(5, 2, 4, 3, -1, 1))

    assert(output sameElements expected)
  }


  test("SelectionSort.sort_int_max") {
    val expected = Array(5, 2, 4, 3, Int.MaxValue).sorted
    val output = SelectionSortAsArray.sort(Array(5, 2, 4, 3, Int.MaxValue))

    assert(output sameElements expected)
  }

  test("SelectionSort.sort_int_min") {
    val expected = Array(5, 2, 4, 3, Int.MinValue).sorted
    val output = SelectionSortAsArray.sort(Array(5, 2, 4, 3, Int.MinValue))

    assert(output sameElements expected)
  }

  test("SelectionSort.sort_duplicate") {
    val expected = Array(5, 2, 2, 3, Int.MinValue).sorted
    val output = SelectionSortAsArray.sort(Array(5, 2, 2, 3, Int.MinValue))

    assert(output sameElements expected)
  }

  test("SelectionSort.sort_duplicate_negative") {
    val expected = Array(5, -2, -2, 3, Int.MinValue).sorted
    val output = SelectionSortAsArray.sort(Array(5, -2, -2, 3, Int.MinValue))

    assert(output sameElements expected)
  }
}
