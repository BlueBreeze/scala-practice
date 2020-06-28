package com.blue.scalapractice.datastructure

object P001_Array {
  def main(args: Array[String]): Unit = {
    val arr01 = new Array[Int](5)
    arr01(2) = 10

    for (item <- arr01) {
      printf("%s\t", item)
    }
    println("\n=================")
    for (index <- arr01.indices) {
      printf("%s\t", arr01(index))
    }

    //推断为Array[Any]
    val arr02: Array[Any] = Array(1, 2, "xx")
    arr02(1) = "yy"

    //推断为Array[Int]
    val arr03: Array[Int] = Array(1, 2, 4)


    val arr04 = arr03.toBuffer
  }
}
