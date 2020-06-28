package com.blue.scalapractice.maps

object P001_HighFunction {
  def main(args: Array[String]): Unit = {
    println(calc(multiply, 3))
    test(sayHi)
    println("================")



  }

  def calc(f: Int => Int, n: Int): Int = {
    f(n)
  }
  def multiply(n: Int): Int = {
    printf("%s*2\t", n)
    n * 2
  }


  def test(f: () => Unit): Unit = {
    f()
  }

  def sayHi(): Unit = {
    println("hi")
  }




}
