package com.demo.scala.chapter01

object Scala07_case {

  /**
    * case 用法
    * 1.模式匹配
    * 2.可以在class 前声明为case class
    *   class之前添加case可以自动生成equal、hashcode、toString、copy方法和他的伴生对象，
    *   并且为伴生对象生成apply、unapply方法。
    * 3.用于创建偏函数
    *   case语句从本质上讲就是PartialFunction的子类。
    *   所以在Scala中，被“{}”包含的一系列case语句可以被看成是一个函数字面量
    *
    */
  def main(args: Array[String]): Unit = {
    var arr = Array(1,2,6)
    arr.foreach(i => i match {
      case 1 => println("==1")
      case _ => println("!=1")
    })
    println("-"*5)
    val num3 = -10
    // 模式守卫
    def myAbs(num: Int) = num3 match {
      case i:Int if i >= 0 => i
      case j:Int if j < 0 => -j
    }

    println(myAbs(num3))

    println("-"*5)
    val num1 = 10
    val num2 = 20
    val option = '+'

    // 模式匹配
    val res: Any = option match {
      case '+' => num1 + num2
      case '-' => num1 - num2
      case '*' => num1 * num2
      case '/' => num1 / num2
      case _ => "运算符不合法"
    }
    println(res)

    println("*"*10)
    //2. case class
    val zhangsan1 = new User("zhangsan",12)
    val zhangsan2 = new User("zhangsan",12)

    println(zhangsan1 == zhangsan2)


    val lisi1 = new Person("lisi",18)
    Person.apply("abc",12)
    val lisi2 = new Person("lisi",18)
    println(lisi1 == lisi2)

    //3. 用于创建偏函数
    println("*"*10)


  }

  class User(var name:String,var age:Int){

  }

  case class Person(name:String,age:Int){

  }
}
