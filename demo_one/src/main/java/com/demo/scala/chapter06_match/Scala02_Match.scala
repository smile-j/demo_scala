package com.demo.scala.chapter06_match

object Scala02_Match {

  /**
    * 模式匹配 规则匹配
    *
    *
    */

  def main(args: Array[String]): Unit = {

    /**
      * 匹配常量
      * @param x
      * @return
      */
   def describe(x:Any) ={
     x match {
       case 5 => "Int five"
       case "hello" => "String hello"
       case true => "Boolean true"
       case '+' => "char +"
       case _ => "未知"
     }
   }
//    println(describe("hello"))
    //匹配类型
    //1.如果所有的的规则都不匹配，会查找下划线的分支，但是如果想使用下划线的值，一般给下划线起个别名
    //2.类型匹配不考虑泛型.Array除外，因为它的泛型其实不是真正的泛型
    //    真正的泛型只在编译时有效，而Array的泛型在运行时也有效
    //3.如果case后面直接写类型，并不表示类型匹配，而是对象匹配
    def describeType(x:Any) ={
      x match {
//        case Int => "Int1"
//        case i:Int => "Int"
        case s:String =>"String"
//        case m:List[_] => "collection"
        case m:List[Int] => "collection"
        case c:Array[Int] => "Array[Int]"
//        case someThing => "something else "+ someThing
        case d => "something else "+ d

      }
    }
//    println(describeType("abc"))
//    println(describeType(List("abc")))
//    println(describeType(List(1,2)))
//    println(describeType(Array(1,2,3)))
//    println(describeType(Array("1","2","3")))
//    println(describeType('c'))
//    println(describeType(1))
//    println(describeType(Int))

    /**
      * 3.匹配数组
      *
      */
    for (arr <- Array(
      Array(1),
      Array(0),
      Array(1,0),
      Array(0,1,0),
      Array(1,1,0,1),
      Array("hello",100))){

      val res = arr match {
        case Array(0) => "0" //匹配数组Array(0)
        case Array(x,y) => x + "," + y //匹配俩个元素的数组
        case Array(0,_*) => "以0开头的数组"//匹配0开头的数组
        case _ => "someThing else"
      }
//      println(res)

    }

    /**
      * 4. 匹配列表
      */
    def matchList(any:Any) ={
      any match {
        case List(0) => "0" //匹配List(0)
        case List(x,y) => x + "," + y  //匹配有俩个元素的list
        case List(0,_*) => "0......." //
        case _ => "someThing else"
      }
    }
    for (list <- Array(
      List(0),
      List(1,0),
      List("abc",'A'),
      List(0,0,0),
      List(1,0,0),
      List(88))){
//      println(matchList(list))
    }

//    var list :List[Int] = List(1,2,5,6,7)
//    var list :List[Int] = List(1,2)
    var list = 1::2::Nil
//    var list  = List(1,2,Nil)
//    var list  = List(1)
    list match {
      case first :: sencode :: rest =>println(first + "-" + sencode + "-" +rest)
      case _ => println("some else")
    }

    println("-"*20)
    /**
      * 5.匹配元组
      *
      */
    for (tuple <- Array(
      (0,1),
      (1,0),
      (1,1),
      (1,0,2))){
      var res = tuple match {
        case (0,_) => "0...."//第一个元素是0的元组
        case (y,0) => ""+y +"0"//匹配最后一个元素是0 的对偶元组
        case (a,b) => ""+a + " " + b
        case _ => "some else."
      }
      println(res)
    }
  }

}
