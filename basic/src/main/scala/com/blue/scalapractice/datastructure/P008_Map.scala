package com.blue.scalapractice.datastructure

import scala.collection.mutable

object P008_Map {
  def main(args: Array[String]): Unit = {
    //有序的
    val m1: Map[String, Any] = Map("k1" -> "v1", "K2" -> 2, "K3" -> "北京")
    println(m1)

    //无序的
    val m2: mutable.Map[String, Any] = mutable.Map("k1" -> "v1", "K2" -> 2, "K3" -> "北京")
    println(m2)

    Map(("v1", 1), ("v2", 2)) //以Tuple2方式创建

    println(m2.getOrElse("k1", "Null"))
    println(m2("k1"))
    println(m2.get("k1").get)
    if (m2.contains("v1")) println(m2("k1"))

    m2 += ("v3" -> 3, "v4" -> 4)
    m2 ++= Map(("v5", 5))
    println(m2)
    m2.remove("v2")
    m2 -= ("v2", "v3")

    for ((k, v) <- m2) println(k)
    for (k <- m2.keys) println(k)
    for (k <- m2.values) println(k)
    for (k <- m2) println(k)



  }
}
