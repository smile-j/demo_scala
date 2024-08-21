package com.demo.scala.chapter01



object Scala01_Str {

  def main(args: Array[String]): Unit = {
    val name:String = "张三";
    val age = "20";
    println("name:"+name+"\tage:"+age)
    //传值字符串
    printf("name:%s\n",name)
    //插值字符串
    //注意：老版本不能拼接json的字符串，新版本可以
    //    println(s"name=${name}")
    //    println(s"name=$name")
    //    println(s"name=${name.substring(0,1)}")
    //    println("name=${name}")
    println(s"{\"name\":\"${name}\",\"age\":\"${age}\"}")
    //多行字符串，主要用于sql和json格式的字符串
    //这里的竖线表示顶格符，
    println(
      """
        |hello
        |scala
        |""".stripMargin)
    println(
      """
        #hello
        #scala
        #""".stripMargin('#'))
    //json
    printf(
      s"""
         |{"name":"${name}","age":"${age}"
         |""".stripMargin)
    //sql
    printf(
      """
        |select *
        |from student s
        |join classes c
        |on s.class_id = c.id
        |where s.age>18
        |""".stripMargin)
    println(".....end")
  }







}
