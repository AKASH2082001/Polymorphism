package com.harman.java;

public class Polymorphism {
    public int Addnumbers(int a, int b)
    {
        return a+b;
    }

    public int Addnumbers(int a, int b, int c)
    {
        return a+b+c;
    }

    public static void main(String[] args) {
        Polymorphism p_obj = new Polymorphism();


        int result1 = p_obj.Addnumbers(12,13);
        int result2 = p_obj.Addnumbers(12,23,34);
        System.out.println(result1);
        System.out.println(result2);


    }
}
