package com.demo.scala.chapter09

object Scala04_Generic_Scala {

  /**
    * 泛型的应用
    *
    */
  def main(args: Array[String]): Unit = {

    val userList:List[User] = List(new User(),new User(),new User)

//    val res = userList.reduce[Parent]((a1,b1)=>a1)
    val res:Parent = userList.reduce[Parent]((a1,_)=>a1)

//    val res:Child = userList.reduce[Child]((a1,_)=>a1)
//    println(res)

  }
  class  Parent{

  }
  class User extends Parent{

  }
  class Child extends User{

  }

}
