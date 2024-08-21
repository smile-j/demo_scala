package com.demo.scala.chapter01


object Scala04_DataType {

  def main(args: Array[String]): Unit = {
    /**
      * Java数据类型主要分为2大类
      * 1.基本数据类型（不是面向对象）
      * 2.引用数据类型（面向对象）
      *
      * scala语言是一个完全面向对象的语言，没有基本数据类型
      * 所有的基本数据类型在scala中都有专门的数据类型
      *
      */
    var b:Byte = 10
    var s:Short = 10
    var age:Int = 10
    var l:Long = 10
    var f:Float = 10
    var d:Double = 10
    var c:Char = 10
    var bool:Boolean = true;

    /**
      * scala中的数据类型也分为2大类型
      * 1.任意值的类型
      *   对应java的基本数据类型 scala类型都是值类型
      *   Unit表示方法没有返回值，只有一个对象：()
      *   StringOps:和字符串相关的类型
      */
    println(test())

    /**
      * 2.任意的引用类型
      * 所有的Java类型，scala集合，scala类型都是引用类型
      * 引用类型为空时，一般会赋值为null,但是null本身也应该有类型，也表示对象
      *
      * 3.Nothing
      * 一般应用于异常处理
      */
    var name:Null = null

    //------------------------------
    var i:Int=10;
    var bb:Byte=10;
    var anyv:AnyVal = i;
    anyv = b;

    var ss:String ="abc"
    var anyr:AnyRef = ss

    var any:Any = anyv
    any = anyr
    i.toByte
    var cc:Char ='A'+1;
    println(cc)
  }
  def test1():Nothing = {

    throw new Exception()
  }

  def test():Unit = {

  }

}
