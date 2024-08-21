package com.demo.scala.test;

public class TestOverload {

    public static void main(String[] args) {

        //方法的重载
        //1.方法名相同
        //2.参数列表不同（个数、类型、顺序）

//        AA aa = new AA();
//        test(aa);
//        A a = new A();
//        test(a);

        //查找方法，以类型为基础进行查找，如果指定类型不存在，会扩大类型范围继续查找
        //父类范围>字类范围
        A a = new AA();
        test(a);


    }

    public static void  test(A a){
        System.out.println("A.....");
    }
    public static void  test(AA aa){
        System.out.println("AA.....");
    }
}

class A{

}

class AA extends A{

}
