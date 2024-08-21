package com.demo.scala.chapter03

object Scala07_Object_Extends {

  def main(args: Array[String]): Unit = {
    /**
      * 继成
      * 1主要目的是为了复用功能和属性
      * 2.scala中的继承和java继承一样 单继承
      * 3.构造对象时，父类对象优于字类对象构造
      * 4.如果父类的构造方法存在参数，那么需要显示地调用父类的构造方法
      * 5.构造函数存在访问权限，可以设定私有的,需要在参数列表（主构造函数）的前面增加private关键字
      *   如果类构造函数私有化，如果创建对象
      *     1.辅助构造方法使用
      *     2.采用半生对象 可以访问伴生类中的私有内容
      */

//    val teacher = new Teacher()
//    val student = new Student(22)

    val person1 =  Person.apply(11)
    val person2 = Person(20)

  }

}

class  Person private (age:Int){
  var name:String = _
  println("..init person")
}

object  Person {

  def apply(age: Int): Person = new Person(age)

}

/*class Student(age:Int) extends Person(age) {
  println("..init student")

}

class Teacher() extends Person(20) {
  println("..init teacher")

}*/
