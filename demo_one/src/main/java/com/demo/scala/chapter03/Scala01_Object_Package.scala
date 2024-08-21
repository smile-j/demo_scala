package com
package demo.scala

package chapter03{
  object Scala01_Object_Package {


    /**
      * scala的package语法比java更加丰富
      * 1.package关键字可以多次声明，体现不同包的关系
      *   java中的点表示从属关系
      * 2.可以给包设定作用域，体现上下级关系
      * 3.将包也当作对象： package object xxxx
      *   包对象中声明的属性和方法，在当前包和它的子包都可以直接访问
      * 4.scala 中包名和物料名没有关系
      *
      */

    def main(args: Array[String]): Unit = {


      testPackageObject()




    }

  }
}


