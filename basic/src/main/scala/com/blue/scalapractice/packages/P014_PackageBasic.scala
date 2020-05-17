import scala.beans.BeanProperty

package com.blue.scalapractice.packages {

  //可以在一个文件中创建子package
  package subpackage {

    class Person {
      var name: String = _
    }

  }

  class Person {
    /*
    3种包的引入方式:
    1. 相对
    2. 绝对
    3. root开始
    */
    @BeanProperty var name: String = _
    @scala.beans.BeanProperty var address: String = _
    @_root_.scala.beans.BeanProperty var phone: String = _
  }


  object P014_PackageBasic {
    def main(args: Array[String]): Unit = {
      //默认使用同一个包中的类: com.blue.scalapractice.packages.Person
      val p2 = new Person
      //也可以通过完整的包名引用使用其他包下的类
      val p1 = new com.blue.scalapractice.packages.subpackage.Person
    }
  }

}


