package com.demo.scala.chapter01

import java.io.PrintWriter

import scala.collection.Iterator
import scala.io.{BufferedSource, Source}

object Scala02_IO {



  def main(args: Array[String]): Unit = {
//    input()
    output()
  }

  //输入
  def input():Unit={
    //从控制台获取输入的数值
    val age: Int = scala.io.StdIn.readInt();
    println(
      s"""
         |age:${age}
      """.stripMargin)
    //从文件中获取数据
    //scala获取文件中的数据，需要采用特殊的对象
    val souce:BufferedSource = Source.fromFile("D:\\project\\github\\bigdata_demo\\demo_scala\\datas\\word.txt")
    val iter: Iterator[String] =  souce.getLines()
    while (iter.hasNext){
      val lineStr = iter.next()
      println(lineStr);
    }
    souce.close();
  }

  /**
    * 输出
    * scala中的输出采用就是java中的输出操作
    */
  def output(): Unit = {
    val printWriter = new PrintWriter("D:\\project\\github\\bigdata_demo\\demo_scala\\datas\\test_out.txt")
    printWriter.println("hello")
    printWriter.println("scala")
//    printWriter.write("scala")
    printWriter.flush()
    printWriter.close()
  }






}
