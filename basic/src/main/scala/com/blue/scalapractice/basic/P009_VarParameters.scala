package com.blue.scalapractice.basic

object P009_VarParameters {
  def main(args: Array[String]): Unit = {
    println(sum(10, 20, 30, 40))
  }

  /**
   * 可变参数， 可变参数需要放在最后一个形参位置
   *
   * @param num  第一个参数
   * @param args 可变参数列表
   * @return 求和结果
   */
  def sum(num: Int, args: Int*): Int = {
    var sum = num
    for (item <- args) {
      sum += item
    }
    sum
  }
}
