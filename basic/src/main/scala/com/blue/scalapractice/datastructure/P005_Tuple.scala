package com.blue.scalapractice.datastructure

object P005_Tuple {
  def main(args: Array[String]): Unit = {
    //Tuple 最多有22个元素
    val t1 = (1, 2, 3, "xx")
    println(t1)

    //获取第1个元素的2种方式
    println(t1._1)
    println(t1.productElement(0))

    for (item <- t1.productIterator) {
      printf("%s\t", item)
    }

  }
}
