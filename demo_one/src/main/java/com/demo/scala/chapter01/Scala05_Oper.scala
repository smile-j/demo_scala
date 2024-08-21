package com.demo.scala.chapter01



object Scala05_Oper {

  def main(args: Array[String]): Unit = {

    /**
      * 1.双等号
      * java中的双等号可以理解为比较值（基本数据类型是值，引用数据类型是内存地址）
      * scala中的双等号可以理解为非空equlas操作
      * 如果想比较内存地址 需要采用 eq方法
      * 2.scala 没有++ --
      *
      * 3.运算符的本质 其实是对象的方法
      */

    println(11==11)
    val name1:String = null
    val name2 = "123"
    val name3 = new String("123")
    val name4 = new String("123")
    println(name1==name2)
    println(name1==name3)
    println(name3.equals(name4))
    println(name3 eq name4)

    //3.运算符的本质 其实是对象的方法
    val i = 1.+(1)
//    可以简写，省略点，加个空格
    val i2 = 1 + (1)
    //    再可以简写，方法单个参数，可以不写小括号
    val i3 = 1 + 1
    println(i)
  }







}
