package com.demo.scala.chapter06_match

object Scala03_Test {

  def main(args: Array[String]): Unit = {

    var t = ( 1,"zhangsan",23)
    //模式匹配简化
    var (id,name,age) = ( 1,"zhangsan",23)
//    println(s"id:${id},name:${name},age:${age}")
    val map = Map(
      ("a",1),("b",2),("c",3)
    )
//    for (kv <- map){
//        if(kv._2==2)
//      println(kv._1+"="+kv._2)
//    }
//    for((k,2)<-map){
//      println(k+"="+2)
//    }
    var map2 = Map(
  (("河北","鞋"),2),
  (("河南","衣服"),3),
  (("河北","衣服"),4),
  (("河南","电脑"),5)
    )
    //todo 数据结构转换 (河北,(鞋,2))
//  map2.toList.map(j=>{
//    (j._1._1,(j._1._2,j._2))
//  }).foreach(println)
    /**
      * 小括号在匿名函数中表示参数列表，所以无法直接作为模式匹配规则
      * map的参数列表中只有一个参数，那么发生错误
      * 如果想要使用模式匹配来匹配元组，需要使用关键字case明确告诉编译器
      * 需要将小括号变成大括号
      */
    map2.toList.map{
      case ((prv,item),num) =>{
        (prv,(item,num))
      }
    }.foreach(println)


  }

}
