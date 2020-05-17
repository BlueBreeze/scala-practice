package com.blue.scalapractice.extend

object P020_TypeConvert {
  def main(args: Array[String]): Unit = {

    println(classOf[String])

    println("hello".getClass.getName)

    import P019_Extends01.{Student, Person}
    val s1 = Student("Tom", 20, 98)
    val p1 = new Person("jim", 30)
    println(s1.isInstanceOf[Person])
    val s2: Person = s1
    //强制转换
    s2.asInstanceOf[Student].sayHi()
  }
}
