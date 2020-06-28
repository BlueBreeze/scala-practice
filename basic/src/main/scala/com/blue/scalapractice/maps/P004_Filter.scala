package com.blue.scalapractice.maps

object P004_Filter {
  def main(args: Array[String]): Unit = {
    val data = List("Job", "Work", "Jack")
    println(data.filter(containsJ))
  }

  def containsJ(str: String): Boolean = {
    str.contains("J")
  }
}
