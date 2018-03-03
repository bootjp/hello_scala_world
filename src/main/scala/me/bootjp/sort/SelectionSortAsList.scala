package me.bootjp.sort

import scala.collection.mutable


object SelectionSortAsList extends SortTrait {
  // I referred to the implementation of handling duplicate values of iterators with trouble position.
  // Thanks. https://gist.github.com/abonander/6648739

  def sort(list: mutable.MutableList[Int]): mutable.MutableList[Int] = {

    for (sortIndex <- list.indices) {
      var minPos = sortIndex

      // 線形探索で最小値を探す
      for (minPosIndex <- sortIndex + 1 until list.length) {
        // 最小値が一番左であった場合はなにもしない
        // 最小値を一番先頭と交換しソート済みとして扱う n - sorted
        if (list(minPosIndex) < list(minPos) && minPos < minPosIndex) {
          minPos = minPosIndex
        }
      }

      // swap of array
      val temp = list(sortIndex)
      list(sortIndex) = list(minPos)
      list(minPos) = temp
    }

    list
  }
}
