package com.blue.scalapractice

/*
Scala 提供包对象作为在整个包中方便的共享使用的容器。
1. 在包中直接定义变量、方法会报错，通过使用package object来解决
2. 每个包都可以有一个包对象，包对象与需要和子包的名字一样
3. 包对象中对应的变量、方法，可以在包中直接使用
*/
package object packages {
  var packageObjectStr: String = "包对象packages中对应的字符串"

  def showStr(str: String): Unit = {
    println("包对象packages中打印的字符串: " + str)
  }
}

