package com.demo.scala.chapter03

object Scala04_Object_Instant {

  def main(args: Array[String]): Unit = {

    /**
      * 实例化--对象
      */
    //1.new
//    new User()
    //2.可以通过反射

    //3.clone

    //4.反序列化

    //5.scala中可以使用object构建单例对象
//    println(Scala03_Object_Instant)
    //6.scala中有一个方法可以构建对象，实际上采用的就是new,但是编译器可以动态识别
    //apply可以省略
    val user1 = User.apply()
    val user2 = User()
    println(user1)
    println(user2)



  }

  class  User{

  }

  object  User{
    def apply(): User = new User()
  }

}
