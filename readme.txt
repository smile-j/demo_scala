2.13

下划线的作用：
1.import
    import xxx.yyy._

2.可以声明变量
    val _ = "zhangsan"

3.可以将函数作为对象使用
    val obj = fun _

4.如果匿名函数的参数按照顺序之使用一次，那么采用下划线替换
    _ + _

5.Import 类时，使用下划线替代java中的星号
    import java.util._

6.import 类时，用于屏蔽类
    import java.util.{Date=>_}

7.属性默认初始化
    var name:String = _

8. 默认匹配时表示任意值
    case _ => {

    }
    case(1,_){

    }
9.泛型中下划线标识任意类型
    List[_]




