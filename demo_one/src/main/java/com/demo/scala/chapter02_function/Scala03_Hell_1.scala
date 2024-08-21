package com.demo.scala.chapter02_function

object Scala03_Hell_1 {

  /**
    * 函数加深版本
    *
    * scala完全面向对象的语言，所以万物皆对象
    * scala语言是完全面向函数式编程语言，所以万物皆函数
    */

  def main(args: Array[String]): Unit = {

    //函数其实就是对象
    //1.对象应该有类型
    //2.对象应该可以赋给其他人调用
    def test():Unit={
        println("test fun ")
    }
    def test1(age:Int):String={
      return age.toString
    }

    //将函数对象test赋值给f
    //此时，f可以通过编译器自动推断类型，函数对象的类型称之为函数类型
    /**
      *Function0[Unit]
      *   这里类型中的0表示参数列表中参数的个数
      *   中括号Unit 表示没有返回值
      */
    var f:Function0[Unit] =test _
    /**
      * Function1[Int,String]
      * 这里类型中的1表示参数列表中参数的个数
      * 中括号Int 表示参数类型
      * 中括号String 表示返回值
      */
    //函数对象的参数最大只能有22个;但是函数的参数没有限制
    var f1:Function1[Int,String] = test1 _

    //为了使用简便，函数类型可以使用另外一种声明方式
    //这里的函数类型为：Int=>String
    var f2 = test1 _

    def fun3(name:String,age:Int): Unit ={

    }
    val f3 = fun3 _
    f1(12)

  }

}
