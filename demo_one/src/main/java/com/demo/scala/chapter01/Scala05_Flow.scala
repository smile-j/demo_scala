package com.demo.scala.chapter01

object Scala05_Flow {

  /**
    * 流程控制
    * if else
    * 且带返回值，为所有分支的父类
    * 没有三元运算符、没有switch
    * @param args
    */

  def main(args: Array[String]): Unit = {

    val age:Int =30;
    var rel = if(age == 30){
      26
    }else{
      "张三"
    }
    println(rel)

  }







}
