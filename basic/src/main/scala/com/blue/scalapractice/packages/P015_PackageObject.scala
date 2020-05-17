package com.blue.scalapractice.packages

object P015_PackageObject {
  def main(args: Array[String]): Unit = {
    //直接使用包对象package.scala中定义的字符串packageObjectStr
    println(packageObjectStr)

    val str:String = "Hello"
    //直接使用包对象package.scala中定义的方法showStr
    showStr(str)
  }
}