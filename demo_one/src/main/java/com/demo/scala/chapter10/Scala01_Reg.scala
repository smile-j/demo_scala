package com.demo.scala.chapter10

object Scala01_Reg {

  def main(args: Array[String]): Unit = {

    /**
      * 正则表达式
      * 正则表达式匹配字符串：字符串的内容是否匹配规则（正则表达式）
      */

//    val reg ="b".r
//    val reg ="[0-9]".r
//    val reg ="^\\d{11}$".r
    val reg ="^((13[0-9])|(14[5,7,9])|(15[^4])|(18[0-9])|(17[0,1,3,5,6,7,8]))\\d{8}$".r
//    val str ="zhangsan"
    val str ="13245678901"
    //将字符串使用规则进行匹配，如果字符串匹配多个规则，取第一个：findFirstIn
    val option = reg.findFirstIn(str)
    if(option.isEmpty){
      println("字符串不符合匹配规则")
    }else{
      println("符合规则，"+option.get)
    }
//    println(reg.findAllIn(str))

  }


}
