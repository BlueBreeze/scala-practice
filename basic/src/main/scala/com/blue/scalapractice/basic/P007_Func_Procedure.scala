package com.blue.scalapractice.basic

object P007_Func {
  def main(args: Array[String]): Unit = {
    val calc = new Calc
    //方法转成函数
    val f: (Int, Int) => Int = calc.sum _
    println(f)
    println(f.getClass)
    println(f(1, 2))
    println("=====")
    println(f2)
    println(f2.getClass)
    println(f2(1, 2))

    println("=====")
    println(calc.sum23(1, 2))

    //带名参数调用
    println(calc.sum3(b = 10))

    // 5 从第一个值开始覆盖
    println(calc.sum3(1))

    /**
     * 方法里面可以再定义方法，与其他方法平级，当前没有调用不会被执行
     */
    def ff(): Unit = { //编译为ff$1
      println("main ff")

      def ff(): Unit = { //编译为ff$2
        println("main ff ff")
      }
    }

  }

  def ff(): Unit = { //编译为ff
    println("ff")
  }

  /**
   * 定义函数
   */
  val f2 = (a: Int, b: Int) => {
    a + b
  }


  /**
   * 定义3个形参的函数
   */
  val f3 = (a: Int, b: Int, c: Int) => {
    a + b + c
  }

}


class Calc {
  //定义方法
  def sum(a: Int, b: Int): Int = {
    a + b
  }

  //返回值类型字段推测
  def sum21(a: Int, b: Int) = {
    a + b
  }

  //写了return关键字，但不写返回值类型，会报错
  def sum22(a: Int, b: Int) = {
    //    return a + b
  }

  //a+b的值不会被返回
  def sum23(a: Int, b: Int) {
    a + b
  }

  //a+b的值不会被返回
  //没有返回值/返回值为Unit的函数也可以叫过程
  def sum24(a: Int, b: Int): Unit = {
    a + b
  }

  //形参默认值
  def sum3(a: Int = 2, b: Int = 4): Int = {
    a + b
  }
}
