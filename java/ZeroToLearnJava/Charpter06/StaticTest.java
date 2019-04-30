package com.oootwo;

public class StaticTest
{
    static String name;

    static
    {
        System.out.println(name + "静态代码块");
    }

    {
        System.out.println(name + "Not static code");
    }

    public StaticTest(String a)
    {
        name = a;
        System.out.println(name + "struct method");
    }

    public void method()
    {
        System.out.println(name + "member method");
    }

    public static void main(String[] args)
    {
        StaticTest s1;
    }
}