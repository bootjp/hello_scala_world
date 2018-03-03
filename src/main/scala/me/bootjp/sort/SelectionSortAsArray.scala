package me.bootjp.sort


object SelectionSortAsArray extends SortArrayTrait {
  // I referred to the implementation of handling duplicate values of iterators with trouble position.
  // Thanks. https://gist.github.com/abonander/6648739
  def sort(array: Array[Int]): Array[Int] = {

    // loop of array size
    for (sortIndex <- array.indices) {
      var minPos = sortIndex

      // find of min num pos
      // and sorted value exclude
      for (minPosIndex <- sortIndex + 1 until array.length) {
        if (array(minPosIndex) < array(minPos) && minPos < minPosIndex) {
          minPos = minPosIndex
        }
      }

      // swap of array
      val temp = array(sortIndex)
      array(sortIndex) = array(minPos)
      array(minPos) = temp
    }

    array
  }
}
