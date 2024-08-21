package com.demo.scala.chapter01

/**
  * object:声明对象（单例）
  *         scala语言是一个完全面向对象的语言，但是java中的静态语法不是面向对象的。
  *         scala语言没有静态语法。java语言的静态操作在scala中该如何使用？
  *         scala采用新的关键字object来模拟静态语法，可以通过对象名称实现静态操作
  *         如果使用object关键字声明一个对象，那么在编译同时也会编译对应class文件
  *         object关键字声明的对象的类型和当前编译后的class文件的类型不一样，多一个$
  *         HelloWorld$.class
  *         HelloWorld.class
  *  HelloWorld:对象名称；类名
  *
  *  def: scala声明方法的关键字
  *
  *  main: scala的入口方法
  *  参数：
  *   Scala args: Array[String]
  *   java  String[] args
  *
  *   Array[String]：表示参数类型
  *     scala语言是一个完全面向对象的语言，所以数组也是对象，也有自己的的类型：Array
  *     scala的中括号表示泛型
  *
  *   def main: Unit
  *       方法名：方法类型
  *
  */

object HelloWorld {

  def main(args: Array[String]): Unit = {
    val name:String = "张三";
    val age = "20";
    println("name:"+name+"\tage:"+age)
    System.out.println(name)

  }







}
