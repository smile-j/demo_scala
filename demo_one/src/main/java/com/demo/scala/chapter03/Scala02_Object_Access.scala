package com.demo.scala.chapter03


object Scala02_Object_Access {

  /**
    * java权限:以方法为例，方法提供者和方法调用者之间的关系，决定了访问权限
    *  1.private:  私有的，同类
    *  2.private[包名]:  私有的，同类,同包(及子包)
    *  3.protected:  受保护权限，同类，子类
    *  4.（default）:   公共的，任何地方
    */

  def main(args: Array[String]): Unit = {

  }

  class User{
    private var name :String ="zhangsan"
    private[chapter03] var age :Int = 18
    protected var email:String ="email"
    var address :String = "beijing"

    def test()={
      println(this.name)
      println(this.age)
      println(this.email)
      println(this.address)
    }
  }

  class  Emp{

    def test()={
      var user = new User()
//      println(user.name)
      println(user.age)
//      println(user.email)
      println(user.address)
    }


  }

































}

