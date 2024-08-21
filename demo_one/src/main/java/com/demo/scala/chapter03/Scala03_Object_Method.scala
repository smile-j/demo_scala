package com.demo.scala.chapter03

object Scala03_Object_Method {




  def main(args: Array[String]): Unit = {

    //类的方法其实就是类中声明的函数
    //方法的声明周期是和类、对象相关
    //类中的函数遵循方法的约束：函数不能重名，方法可以重载，重写
    //访问的权限和属性的访问权限一致
//    User.test()
//    new User().test()

    //todo 对象构建后，可以直接使用那些方法
    //1.Object 类中的方法可以使用
    val user:Object = new User()
    //2.scala中能用的方法
//    user.eq()
//      user.!=()
    println(user.isInstanceOf[User])
    val obj = user.asInstanceOf[Object]



  }

  class User{

//    def test()={
//      println("class user..test")
//    }

  }

  object User{
    def test()={
      println("object user ..test")
    }

  }








}
