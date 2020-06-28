package com.blue.scalapractice.datastructure

import scala.collection.mutable.ListBuffer


object P006_List {

  def main(args: Array[String]): Unit = {
    //只有不可变的，可变的是ListBuffer
    // val List = scala.collection.immutable.List 在scala的包对象中有定义，因此可以直接使用
    val t1 = List(1, 2, 3, "xx")

    //val Nil = scala.collection.immutable.Nil 空集合
    val t2 = Nil

    //:靠近集合，+靠近单个元素
    val t3 = t1 :+ 4
    val t4: List[Any] = 5 +: t3
    val t5 = t4 ++ t2
    //t4 ++= t2
    val t6 = ListBuffer(1, 2, "xx")
    t6 ++= t6 //可以直接增加元素
    t6.remove(0)
    val t7: ListBuffer[Any] = t6 :+ 6

    println(7 :: 8 :: t1 :: Nil) //List(7, 8, List(1, 2, 3, xx))
    println(7 :: 8 :: t1 ::: Nil) //List(7, 8, 1, 2, 3, xx) //:::将左边的集合打散放到右边的集合
    println(7 :: 8 :: t1) //List(7, 8, 1, 2, 3, xx)


  }
}
