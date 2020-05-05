package com.blue.scalapractice.basic

object P003_DataType {
  def main(args: Array[String]): Unit = {

    //类型都是对象
    //分2大类 AnyVal值类型  AnyRef引用类型

    val age: Int = 20
    val arr: Array[Int] = new Array[Int](12)
    val name: String = "blue"

    //scala中没有形参的方法可省略括号
    println(age.toDouble + 101.toFloat)

    printf("Max: %d; Min: %d", Int.MaxValue, Int.MinValue)

    //字面/常量默认为Int，加L转成long才不报错
    var e = 99999999999999999L

    //当把一个运算结果赋值给一个变量时，会判断范围和类型（var a:Char=97+1 报错）；
    //    var a: Char = 97 + 1
    //当把一个字面量赋值给一个变量时，只判断范围(var a:Char = 98 不报错)
    var a: Char = 98


  }
}
