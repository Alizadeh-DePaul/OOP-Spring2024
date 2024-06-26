/*
 *
 *  *
 *  *  * Copyright (c) 2024.
 *  *  * Vahid Alizadeh
 *  *  * Object-oriented Software Development
 *  *  * DePaul University
 *  *
 *
 */

package oopPrinciples.abstraction.discussion;

public class InterfaceAbstractExample {
}
interface MyInterface{
    void show1();
    void show2();
}
//MyClass becomes abstract. It has not implemented show2() of MyInterface
//class MyClass implements MyInterface //error
abstract class MyClass implements MyInterface
{
    @Override
    public void show1() {
        System.out.println("MyClass is implementing the interface method show1().");
    }
//    public abstract void show2();
}
class MySubClass extends MyClass
{
    @Override
    public void show2() {
        System.out.println("MySubClass is implementing the interface method show2().");
    }
}
class DemoInterfaceAbstract {
    public static void main(String[] args) {
        System.out.println("***Demo Interface and Abstract.***\n");

        MyInterface myOb = new MySubClass();
        myOb.show1();
        myOb.show2();
    }
}