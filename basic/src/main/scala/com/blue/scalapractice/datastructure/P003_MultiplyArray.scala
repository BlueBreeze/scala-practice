package com.blue.scalapractice.datastructure

object P003_MultiplyArray {
  def main(args: Array[String]): Unit = {
    //定义3个一维数组，每个数组含有4个元素
    val arr01 = Array.ofDim[Int](3, 4)
    arr01(0)(0) = 1

    for (arr <- arr01) {
      for (item <- arr) {
        printf("%d\t", item)
      }
      println()
    }
  }
}