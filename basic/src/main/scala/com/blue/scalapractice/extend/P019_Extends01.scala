package com.blue.scalapractice.extend

object P019_Extends01 {

  def main(args: Array[String]): Unit = {
    val s1 = Student("Tome", 20, 95)
    s1.sayHi()
    //    protected，子类可以访问，同包也不可以访问
    //    s1.age

  }

  class Person(var name: String, protected var age: Int) {
    //子类会继承该变量，但没有访问权限
    private var num: Int = _

    def sayHi(): Unit = {
      println(s"person hi=> $name,$age")
    }
  }

  class Student(inName: String, inAge: Int, var score: Int)
    extends Person(inName, inAge) {
    override def sayHi(): Unit = {
      super.sayHi()
      println(s"student hi => $name,$age,$score")
    }
  }

  object Student {
    def apply(inName: String, inAge: Int, score: Int): Student = new Student(inName, inAge, score)
  }

}
