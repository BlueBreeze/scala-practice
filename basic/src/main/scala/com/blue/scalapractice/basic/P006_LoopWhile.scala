package com.blue.scalapractice.basic

object P006_LoopWhile {

  def main(args: Array[String]): Unit = {
    while2()
  }

  /**
   * break跳出循环
   */
  def while2(): Unit = {
    //需要引入包
    import scala.util.control.Breaks._
    var i = 1
    breakable {
      while (i < 5) {
        printf("%d,", i)
        if (i == 3) {
          break()
        }
        i = i + 1
      }
    }
  }


  /**
   * 普通循环
   */
  def while1(): Unit = {
    var i = 1
    while (i < 5) {
      printf("%d,", i)
      i = i + 1
    }
  }



}
