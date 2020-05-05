package com.blue.scalapractice.basic

object P002_Vars {
  def main(args: Array[String]): Unit = {

    val name: String = "blue"
    val age: Int = 12
    val salary: Float = 12.25F
    var amount: Double = 12.30
    val isPass: Boolean = true

    println(s"name: $name; salary: $salary; isPass: $isPass")


    //类型推导
    val number = 12
    println(number.getClass)

    //类型在前面已经确认了，静态语言不可修改类型
    //    number = 12.2

    amount = 12.4
    val cons = 12
    //val 常量，值不能修改，编译后会被加final修饰，没有线程安全问题效率高 ；var变量
    //    cons = 23

  }

}
