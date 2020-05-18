package com.blue.scalapractice.extend

object P021_Extends02 {

  def main(args: Array[String]): Unit = {
    /*
    Person()
    Person this(inName: String)
    Student(inName: String)
    */
    new Student("java")

    println("+++++++++++++++++")
    /*
    Person()
    Person this(inName: String)
    Student(inName: String)
    student this(inName: String, inAge: Int)
    */
    new Student("jack", 10)

    println("+++++++++++++++++")

    /*
    Person()
    Teacher
    this(inName: String)
    */
    new Teacher("java")
  }

  class Person() {
    var name: String = _
    println("Person()")

    def this(inName: String) {
      this
      this.name = inName
      println("Person this(inName: String)")
    }
  }

  class Student(inName: String) extends Person(inName) {
    var age: Int = _
    println("Student(inName: String)")

    def this(inName: String, inAge: Int) {
      this(inName)
      this.age = inAge
      println("student this(inName: String, inAge: Int)")
    }
  }

  class Teacher extends Person {
    println("Teacher")

    def this(inName: String) {
      this
      println("this(inName: String)")
    }
  }

}
