package com.blue.scalapractice.basic

object P008_Recursive {
  def main(args: Array[String]): Unit = {
    r1(4)
    println("-----------")
    r2(4)
  }

  def r1(num: Int): Unit = {
    if (num > 1) {
      r1(num - 1)
    }
    else {
      println(num)
    }
  }

  def r2(num: Int): Unit = {
    if (num > 1) {
      r2(num - 1)
    }
    println(num)
  }

}
