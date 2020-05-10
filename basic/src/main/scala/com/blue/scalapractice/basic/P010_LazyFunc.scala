package com.blue.scalapractice.basic

//java里面是单例模式来处理
object P010_LazyFunc {
  def main(args: Array[String]): Unit = {
    /*标志为lazy，只能修饰val，真正需要该变量值时候，才会计算，输出结果如下：
-------------
sum run
rs = 3
    */
    lazy val rs = sum()
    println("-------------")
    println("rs = " + rs)
  }

  def sum(a: Int = 1, b: Int = 2): Int = {
    println("sum run")
    a + b
  }
}
