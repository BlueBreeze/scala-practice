package com.blue.scalapractice.packages

import java.util

import scala.collection.mutable


object P018_ImportPackages {

  def test01: Unit = {

    //导入包，作用范围是当前方法
    //｛｝选择性的导入几个包
    // => 给对应取别名
    import java.util.{HashMap, HashSet => JavaHashSet}
    new HashMap
    new JavaHashSet[String]()

    //引入java.util种的所有类，但忽略ArrayList
    import java.util.{ArrayList => _, _}
    
  }


}
