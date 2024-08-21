package com.demo.scala.chapter01


object Scala06_for {

  /**
    * scala for 语法
    *
    * for( var x <- Range ){
    * statement(s);
    * }
    * 1.以上语法中，Range 可以是一个数字区间表示 i to j ，或者 i until j(不包含j)。左箭头 <- 用于为变量 x 赋值。
    * 2.在 for 循环 中你可以使用分号 (;) 来设置多个区间，它将迭代给定区间所有的可能值。以下实例演示了两个区间的循环实例：
    * 3.Scala 可以使用一个或多个 if 语句来过滤一些元素。
    *      for( var x <- List
    *        if condition1; if condition2...
    *          ){
    *          statement(s);
    *        }
    */

  def main(args: Array[String]): Unit = {
    singleFor()
  }



  def singleFor():Unit={
    //1.循环
    val array1 = 1 to 3;
    val array2 = 1 until 3 ;//until 不包含3
    val array3 = Range(1,3) ;//Range 不包含3
    val array4 = List(1,3)
    for (num :Int <- array3){
//      println(num)
    }
    for(num <- 1 to 10 ){
//      println(num)
    }
    println("循环+过滤")
    //2. 循环守卫：循环表达式添加逻辑判断，可以是多组
    for(num <- 1 to 10 if num %2==0 ){
//      println(num)
    }
    //3.循环步长
    val array5 = Range(1,10,3)
    val array6 = 1 to 3
    for (num :Int <- array5){
//            println(num)
    }
    //4.循环嵌套
    for (i <-array1 ){
      for (j<- 1 to 3 ){
//          println("i:"+i+" j:"+j)
      }
    }

    for (i<- 1 to 3; j <- 1 to 3){
//      println("i:"+i+" j:"+j)
    }
    //5.引入变量
    for(i <- 1 to 3 ;j=i+1){
//      println(j)
    }
    //6.循环返回值 Unit ()
    val res1 = for(i <- 1 to 3 ){
        i
    }
    //6.1如果想将集合的数据处理返回，可以用特殊的关键字
    val res2 = for(i <- 1 to 3 ) yield {
      i*2
    }
    println(res2)
//    Thread.`yield`();

  }

}
