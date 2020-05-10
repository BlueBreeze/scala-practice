package com.blue.scalapractice.basic

object P005_LoopFor {
  def main(args: Array[String]): Unit = {

    for7()
  }

  /**
   * 控制步长
   */
  def for7(): Unit = {
    for (i <- Range(1, 5, 2)) {
      println(i)
    }
  }

  /**
   * 循环返回vector值
   *
   * @return
   */
  def for6(): Any = {
    for (i <- 1 to 5) yield i * 2
  }

  /**
   * 引入变量
   */
  def for5(): Unit = {
    for (i <- 1 to 5; j = i - 1) {
      print(i + " " + j + ";")
    }
  }

  /**
   * 双重循环
   */
  def for4(): Unit = {
    for (i <- 1 to 5; j <- 1 to 2) {
      print(i + " " + j + ";")
    }
  }

  /**
   * 循环守卫 满足某些条件才执行
   */
  def for3(): Unit = {
    for (i <- 1 to 5 if i != 2) {
      print(i + " ")
    }
  }


  /**
   * 范围数据循环 前闭后开
   */
  def for2(): Unit = {
    for (i <- 1 until 5) {
      print(i + " ")
    }
  }

  /**
   * 范围数据循环 闭区间
   */
  def for1(): Unit = {
    for (i <- 1 to 5) {
      print(i + " ")
    }
  }


}
