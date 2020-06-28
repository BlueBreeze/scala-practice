package com.blue.scalapractice.datastructure

import java.util

import scala.collection.mutable.ArrayBuffer

object P002_ArrayBuffer {
  def main(args: Array[String]): Unit = {
    val arr01 = new ArrayBuffer[Int](10)
    arr01.append(8, 9)

    arr01.remove(0)


    for (item <- arr01) {
      printf("%s\t", item)
    }
    println("\n=================")

    printf("length=%s;size=%s\n", arr01.length, arr01.size)

    println(arr01.hashCode())

    //转定长
    val arr02: Array[Int] = arr01.toArray


    import scala.collection.JavaConverters._
    val lst: util.List[Int] = arr01.toList.asJava
    val sLst: List[Int] = lst.asScala.toList

  }
}
