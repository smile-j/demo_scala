package com.demo.scala.chapter06_match

object Scala05_Match {

  def main(args: Array[String]): Unit = {

    /**
      * 模式匹配 -- 对象
      * 匹配的是对象所有属性，不是对象地址
      * 普通的对象无法在模式匹配中使用，因为对象的匹配其实就是属性匹配
      * 那么需要通过对象获取其属性，这里需要使用一个方法：unapply
      * obj => fields
      */
    val user = thirdPart()

    user match {
      case User("zhangsan",23)=>{
        println("zhangsan用户")
      }
      case _ =>{
        println("不是zhangsan")
      }
    }

  }

  class User{

    var age: Int = _
    var name : String = _

  }
  object User{
    def apply(age:Int,name:String): User = {
      val user = new User()
      user.age = age
      user.name = name
      user
    }

    def unapply(user: User): Option[(String,Int)] ={
      Option((user.name,user.age))
    }
  }

  def thirdPart()={
    User(23,"zhangsan")
  }

}
