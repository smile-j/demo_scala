package com.demo.scala.test;

public class TestOverride {

    //方法重写
    //1.应该存在父子类
    //2.改变父类的实现，所以需要改变父类的功能实现
    //3.方法名相同,参数相同，异常不能超出父类的范围
    //  字类重写方法的权限不能低于父类的方法
    //4.重写方法后，字类的方法可以替代父类方法的使用


    public static void main(String[] args) {
//        BB bb =new BB();
//        System.out.println(bb.sum());
//
//        B b =new B();
//        System.out.println(b.sum());

        //方法重写，其实就是在同一个内存区域中存在两个一样的方法
        //jvm在调用对象的成员方法时，会遵循动态绑定机制:
        //所谓的动态绑定机制，就是方法运行时，将方法和当前运行对象的实际内存进行绑定
        //然后调用
        //动态绑定机制和属性没有任何关系，属性在哪里声明在哪里调用
        B b =new BB();
        System.out.println(b.sum());

    }

}

class B{
    public int i=10;
    public int sum(){
        return i+10;
    }
}
class BB extends B{

    public int i=20;

    @Override
    public int sum() {
        return i+20;
    }
}
