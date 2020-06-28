package com.blue.scalapractice.maps

import com.blue.scalapractice.maps.P006_Fold.minus

import scala.collection.{immutable, mutable}

object P007_Scan {
  def main(args: Array[String]): Unit = {
    val data: immutable.Seq[Int] = List(1, 2, 3, 4)
    //List(5, 4, 2, -1, -5)
    println(data.scanLeft(5)(minus))
  }
}
