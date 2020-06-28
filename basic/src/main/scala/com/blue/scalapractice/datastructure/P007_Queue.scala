package com.blue.scalapractice.datastructure

import scala.collection.mutable

object P007_Queue {
  def main(args: Array[String]): Unit = {
    val q1 = new mutable.Queue[Int]
    q1 += 1
    q1 ++= List(2,3,4)
    println(q1)

    q1.dequeue()
    q1.enqueue(10)
    println(q1)
    println("============")
    println(q1.head) //2
    println(q1.tail) //Queue(3, 4, 10)
    println(q1.last)  //10

  }
}
