package com.blue.scalapractice.basic

import scala.beans.BeanProperty

object P013_Constructor {
  def main(args: Array[String]): Unit = {
    val p1 = new Person("Jack")
    println(p1.toString)

    val s1 = new Student("Han")
    println(s1.toString)

    val w1 = new Worker("Jack")
    println(w1.inName)

    val m1 = new Master("Jim")
    m1.inName = "ketty"

    val j1 = new Job()
    j1.name = "hunter"
    j1.getName
  }
}

//会生成一个无参主构造器，仅仅用来执行类体中的所有语句而已
class Person {
  var name: String = _
  var age: Int = _
  //主构造器会执行类定义中的所有语句，因此创建对象时，该行代码会执行
  println("ok")

  def this(inName: String) {
    //辅助构造器必须在第一行调用主构造器
    this()
    this.name = inName
  }

  //方法重写
  override def toString: String = {
    s"name:%s, age: %d".format(name, age)
  }

}

class Student(inName: String, inNationality: String = "Chinese") {
  var name: String = inName
  var nationality:String = inNationality
  var score: Double = _

  println("ok")

  def this(inName: String) {
    //直接调用主构函数
    this(inName, "America")
  }

  def this(inName: String, inScore: Double) {
    //通过this(inName)会间接调用主构函数
    this(inName)
    this.score = inScore
  }

  override def toString: String = {
    "name:%s,nationality:%s".format(name, nationality)
  }
}

//主构函数形参 val inName: String，会生成
// 1. private final String inName
// 2. public String inName() { return this.inName; }
class Worker(val inName: String) {
  var name: String = inName
}

//主构函数形参 var inName: String，会生成
// 1. private final String inName
// 2. public String inName() { return this.inName; }
// 3. public void inName_$eq(String x$1) {this.inName = x$1;}
class Master(var inName: String) {
  var name: String = inName
}


class Job {
  /*
  @BeanProperty会同时生成2套赋值和取值的方法，一共4个，可以同时使用
  1. name
  2. name_$eq
  3. setName
  4. getName
  */
  @BeanProperty var name: String = _
  @scala.beans.BeanProperty var address: String = _
  @_root_.scala.beans.BeanProperty var phone: String = _
}