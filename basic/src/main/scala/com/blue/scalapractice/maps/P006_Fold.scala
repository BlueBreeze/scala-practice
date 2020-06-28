package com.blue.scalapractice.maps

object P006_Fold {
  def main(args: Array[String]): Unit = {
    val data = List(1, 2, 3, 4)
    println(data.foldLeft(5)(minus))
    println(data.fold(5)(minus))
    println(data.foldRight(5)(minus))

    //FoldLeft
    println((5 /: data) (minus))
    //FoldRight
    println((data :\ 5) (minus))

  }

  def minus(a: Int, b: Int): Int = {
    a - b
  }
}
