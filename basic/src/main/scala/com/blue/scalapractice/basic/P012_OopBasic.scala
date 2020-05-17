package com.blue.scalapractice.basic

object P012_OopBasic {
  def main(args: Array[String]): Unit = {
    val cat = new Cat
    printf("%s,%s,%s\n", cat.name, cat.color, cat.age)
    cat.name = "小花"
    printf("%s,%s,%s\n", cat.name, cat.color, cat.age)
  }
}

class Cat {
  //创建属性，并赋默认值
  var name: String = _ //null
  //编译器自动生成一个private color属性
  //编译器自动生成get set方法:
  // public String color()返回属性的值
  // public void name_$eq给color赋值
  var color: String = ""
  var age: Int = _ //0

  //被自动推导为Null类型，无法再赋值其它内容
  var address = null
  //String类型赋空值
  var nickName: String = null
  //自动推导为Int类型
  var legs = 10
}
