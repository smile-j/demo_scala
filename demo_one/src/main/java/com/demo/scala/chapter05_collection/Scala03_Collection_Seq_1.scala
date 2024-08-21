package com.demo.scala.chapter05_collection

object Scala03_Collection_Seq_1 {

  /**
    * 集合-seq (序列)
    * scala集合中的seq表示就是有序,数据可重复的数据集合
    * 有序:插入顺序
    *
    */


  def main(args: Array[String]): Unit = {

    val list1 = List(1,2,3,4)
    val list2 = List(5,6,7,8)
    //使用一个不同的方式构建集合
    //:: 这个运算符表示向集合添加数据,但是因为以冒号结尾,所以计算规则从后向前
    //如果直接使用List(),表示空集合,向空集合添加数据比较常见就是下面这种
    //为了操作方便,所以采用特殊对象代替空集合:Nil
    val list3 = 1::2::3::4::List()
    val list4 = 1::2::3::4::Nil
    List().::(4).::(3).::(2).::(1)

    var list5:List[Any]= 9::list2::list1
    var list6:List[Int]= 9::list2:::list1

    println(list3)

    println(list5.length)
    println(list5)
    println(list6.length)
    println(list6)

  }

}
