package com.blue.scalapractice.maps

import P002_Map.toUpper


object P003_FlatMap {
  def main(args: Array[String]): Unit = {
    val data = List("Job","work")
    println(data.map(toUpper))
    println("===============")


    val data1 = List(1,2,3)

    println(data1.map(P001_HighFunction.multiply))

//    println(data1.flatMap(P001_HighFunction.multiply))
scala.collection.GenTraversable
  }
}
