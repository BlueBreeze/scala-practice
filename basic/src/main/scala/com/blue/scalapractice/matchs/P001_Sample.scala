package com.blue.scalapractice.matchs

import scala.collection.immutable

object P001_Sample {

  def main(args: Array[String]): Unit = {
    val a = 10
    val b = 20
    val opr = '9'
    var res = 0
    opr match {
      case '+' => res = a + b
      case '-' => res = a - b
      case _ if opr.equals('9') => res = -9999
      case _ => -99991111
    }
    println(res)

    val opt = '+'

    val rs = opt match {
      case '+' => 3 + 5
      case '-' => 3 - 5

      case rs => rs
    }


    //判断类型
    val opt1 = if (rs == '+') Map('a' -> 1, 'b' -> 2) else if (rs == '-') List(1, 34) else 1
    val rs1 = opt1 match {
      case a: Int => "Int"
      case b: Map[Char, Int] => "Map"
      case c: List[Int] => "list"
    }
    println(rs1)

    val opt3 = Array(1, 2)
    val rs3 = opt3 match {
      case Array(x, y) => Array(y, x)
    }
    println(rs3)

  }
}
