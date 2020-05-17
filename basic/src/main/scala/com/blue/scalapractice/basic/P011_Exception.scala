package com.blue.scalapractice.basic

object P011_Exception {
  def main(args: Array[String]): Unit = {
    exception_deal()
    funWithException()
  }

  def exception_deal(): Unit = {

    try {
      var r = 5 / 0
    } catch {
      case ex: ArithmeticException => {
        println("除数为0")
        ex.printStackTrace()
      }
      case ex: Exception => println("异常")
    }
    finally {
      println("finally代码")
    }
  }

  /**
   * 方法申明会跑出的异常
   * @throws java.lang.NumberFormatException
   */
  @throws(classOf[NumberFormatException])
  def funWithException(): Unit = {
    "aa".toInt
  }

}
