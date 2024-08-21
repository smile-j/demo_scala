package com.demo.scala.chapter01

import java.net.Socket

object Scala03_Net_Client {

  def main(args: Array[String]): Unit = {
    val server = new Socket("127.0.0.1",8080)
    println("连接服务器成功！！！")
    val outPut = server.getOutputStream
    outPut.write("hello world".getBytes())
    outPut.flush()
    outPut.close()
    server.close()
  }

}
