package com.blue.scalapractice.maps

import P001_HighFunction.multiply

object P002_Map {
  def main(args: Array[String]): Unit = {
    val data1 = List(1, 2, 3, 4)
    data1.map(multiply).map(println)

    println("===========")

    List("Jack", "blue").map(toUpper).map(println)
  }


  def toUpper(str: String): String = {
    str.toUpperCase
  }
}
