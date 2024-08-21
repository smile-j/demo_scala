package com.demo.scala.chapter01

import java.net.{ServerSocket, Socket}

object Scala03_Net_Server {

  def main(args: Array[String]): Unit = {
    val server = new ServerSocket(8080)
    println("服务器启动成功")
    val client:Socket = server.accept()
    val inputStream = client.getInputStream
    var bytes:Array[Byte] =new Array[Byte](inputStream.available())
    val result = new String(bytes)
    println("获取的结果"+result)
    client.close()
    server.close()
  }

}
