package com.teaminternational.web;

/**
 * Created by Stud on 30.10.2017.
 */
public class HttpServlet {


    public int method(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i = i + 1) {
            sum = sum + arr[i];
        }
        return sum;
    }

    void m() {
        return;
    }

    static void k() {
    }
}

class Animal {

    void go() {
        System.out.println("go-go-go");
    }

    void say() {
        System.out.println("say smth");
    }

    void die() {
        System.out.println("i'm dead");
    }
}

class Zebra extends Animal {
    @Override
    void go() {
        System.out.println("run-run-run");
    }

    @Override
    void say() {
        System.out.println("tprphh");
    }
}

class Cat extends Animal {

}

class Main {
    public static void main(String[] args) {
/*        HttpServlet.k();
        HttpServlet httpServlet = new HttpServlet();
        int[] masiv = new int[]{1, 5, 6, 8, 5, 3, 3, 2};
        System.out.println(httpServlet.method(masiv));*/

        Zebra zebra = new Zebra();
        zebra.go();
        zebra.say();
        zebra.die();
    }
}
