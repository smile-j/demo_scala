package com.demo.scala.chapter08

object Scala01_Transform {

  def main(args: Array[String]): Unit = {

    /**
      * 隐式转换
      * implicit修饰的函数称之为隐式函数
      *
      */

    //1.俩个数据类型之间如果想要转换，那么必须类型之间有关系：父子类，接口
    //Byte 和Int 类型之间没有关系，所以不应该能转换
    //scala底层实现了隐式转换，可以自动将不同的类型进行转换
//    val b :Byte = 10
//    val i:Int = b
//    println(i)
    //2.scala中没有字符串，使用的时候就是java的字符串
    //
    var s = "hello"
    val ss = s(0).toUpper+s.substring(1)
//    println(ss)
    //3. 程序运行扩展功能，但是应该对修改改变
    //如果在作用域存在相同的转换规则，那么转换不起作用
    implicit def transform(user:User)={
      new UserExt()
    }
    val user = new User()
    user.insertUser()
    user.updateUser()

  }
  trait Update{
    def updateUser()={
      println("update.....")
    }
  }

  class UserExt{
    def updateUser()={
      println("update.....")
    }
  }
  class User{
    def insertUser()={
      println("insert ....")
    }
    def getUser()={
      new User()
    }
  }

}
