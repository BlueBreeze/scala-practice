package com.blue.scalapractice.packages.visible

object P017_Visible {
  def main(args: Array[String]): Unit = {
    val p1 = new Person
    p1.name = "blue"
  }

  //编译后生成 static Person类
  class Person {
    //private[packages] 表示是私有，但是在 packages 中，包括子包 都是可见的
    private[packages] var name: String = _
  }

}
