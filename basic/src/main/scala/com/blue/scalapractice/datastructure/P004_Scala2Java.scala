package com.blue.scalapractice.datastructure

object P004_Scala2Java {
  def main(args: Array[String]): Unit = {
    import scala.collection.JavaConverters._
    import java.util
    val aa: Array[Int] = Array(1, 2, 3)
    val jAa: util.List[Int] = aa.toBuffer.asJava
    val sArray: Array[Int] = jAa.asScala.toArray

    println(jAa)
    println(sArray)

  }
}
