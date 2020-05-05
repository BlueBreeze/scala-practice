package com.blue.scalapractice.basic

object P001_Output {

  def main(args: Array[String]): Unit = {
    output()
  }

  /**
   * 不同格式化的输出
   */
  def output(): Unit ={
    val name = "blue"
    val age = 20
    val salary = 20.5f
    //直接引用变量
    println(s"name: $name; age: $age; salary: $salary")
    //变量做简单的运算
    println(s"name: $name; age: $age; salary: ${salary*1.5}")
  }
}
