package me.bootjp.sort

import scala.collection.mutable

object InsertSort extends SortTrait {
  override def sort(list: mutable.MutableList[Int]) : mutable.MutableList[Int] = {
    // 一番左を操作済みにする
    // まだ操作していないものの中で左のものを取り出し
    // 操作済みになっている数値と比較し、左の数値のほうが大きい場合2つを入れ替える
    // loop
    //  if 自分より小さい
    // else if 数字が左側に到達 = fixed = ALL?

    val end = list.length - 1
    var operated = 0
    while (operated != end) {
      // 左を操作済みにする
      operated += 1

      // 現在操作すべき値をコピーする
      var target = operated

      // 未操作のもの中で一番左を取り出す
      var current = list(target)
      var next = list(target - 1)

      // 操作済みの中で数値を比較し、左(Next)の方が大きい場合入れ替えを行う

      while (next > current) {
        // swap of array
        val tmp = list(target - 1)
        list(target - 1) = list(target)
        list(target) = tmp
        target -= 1
        current = list(target)
        next = list(target - 1)
      }
      // 操作済みListの中で入れ替えをする　
    }

    list
  }
}
