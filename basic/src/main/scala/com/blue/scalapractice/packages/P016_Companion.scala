package com.blue.scalapractice.packages

object P016_Companion {
  //伴生对象中可以对应apply方法，new 伴生类，以方便调用创建对象
  def apply(name: String, age: Int): P016_Companion = new P016_Companion(name, age)

  //在伴生对象中定义属性，相当于java中静态变量，通过P016_Companion.legs使用,scala中没有static关键字
  //伴生对象中的private属性，在伴生类中可以访问
  private val legs: Int = 2
}

class P016_Companion(var name: String, var age: Int) {
  def sayHi: Unit = println(s"my name is $name, I'm $age years old, I have ${P016_Companion.legs} legs.")
}

object Test {
  def main(args: Array[String]): Unit = {
    val p1 = P016_Companion("Tom", 18)
    p1.sayHi
    p1.age = 20
  }
}
