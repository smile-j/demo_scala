package com.demo.scala.chapter05_collection

object Scala09_Collection_Method_3_Sort {

  /**
    * 集合 通用方法- 功能方法（函数）
    */

  def main(args: Array[String]): Unit = {

    val list = List(new User(12,500),new User(12,100),new User(10,200),new User(15,200),new User(12,200))
    println(list.sortBy(user=>user.age))
//    println(list.sortBy(user=>user.age)(Ordering.Int.reverse))
    println(list.sortWith((e1,e2)=>{
      if(e1.age == e2.age){
        e1.money > e2.money
      }else{
        e1.age<e2.age
      }
    }))
    //简化,默认是升序
    println(list.sortBy(user=>(user.age,user.money)))
    //年龄升序，金额降序
    println(list.sortBy(user=>(user.age,user.money))(Ordering.Tuple2(Ordering.Int,Ordering.Int.reverse)))


  }

  class User{
    var age:Int = _
    var money:Int = _

    def this(_age:Int,_money:Int){
      this()
      age = _age
      money = _money
    }

    override def toString: String = {
      s"User,age:${age},money:${money}"
    }

  }

}
