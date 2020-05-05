package com.blue.scalapractice.basic

object P004_Ex {
  def main(args: Array[String]): Unit = {
    println(cal1(3))
    println(cal2("cray"))
    //最大值
    println(10 max 2)
    println(pow(2, 1024))
    println(BigInt(2).pow(1024))
    val str: String = "hello"
    //获取字符串第一个字符
    println(str.charAt(0), str.take(1))
    //获取字符串最后一个字符
    println(str.charAt(str.length - 1), str.reverse.take(1), str.takeRight(1))
    typeConvert()


  }

  /**
   * 计算一个整数的平方根之后的再求平方与原始数值的差异
   *
   * @param num 待计算值
   * @return
   */
  def cal1(num: Int): Double = {
    val sqrt = math.sqrt(num)
    val square = sqrt * sqrt
    num - square
  }

  /**
   * 字符串乘法
   *
   * @param str 待计算值
   * @return
   */
  def cal2(str: String): Any = {
    str * 3
  }

  /**
   * N次方
   *
   * @param num 底数
   * @param pow 指数
   * @return
   */
  def pow(num: Int, pow: Int): BigInt = {
    var result: BigInt = 1
    var times: Int = pow
    while (times > 0) {
      result = result * num
      times = times - 1
    }
    result
  }

  def typeConvert(): Unit = {
    val str: String = "23.5"
    println(str.toDouble)
    //exception 字符串转数字时，需要确保字符串可以直接或隐式转化为对应类型
    println(str.toInt)

  }

}
