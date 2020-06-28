package com.blue.scalapractice.maps

object P009_Iterator {
  def main(args: Array[String]): Unit = {
    val v1 = List(1, 2, 3).iterator

    /*
    while (v1.hasNext) {
      println(v1.next())
    }
    */

    for (item <- v1) {
      println(item)
    }

  }
}
