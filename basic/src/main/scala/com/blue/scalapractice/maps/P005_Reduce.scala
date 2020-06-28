package com.blue.scalapractice.maps

object P005_Reduce {
  def main(args: Array[String]): Unit = {
    val data = List(1, 2, 3, 4, 5)
    println(data.reduceLeft(minus))
    println(data.reduce(minus))
    println(data.reduceRight(minus))
    println(data.reduce(min))
  }

  def min(a: Int, b: Int): Int = {
    if (a > b) b else a
  }

  def minus(a: Int, b: Int): Int = {
    a - b
  }

  def sum(a: Int, b: Int): Int = {
    a + b
  }
}
