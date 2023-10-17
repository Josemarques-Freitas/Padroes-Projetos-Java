package one.digitalinnovation.gof.singleton;

import one.digitalinnovation.gof.singleton.SingletonLazy;


public class Test {
    public static void main(String[] args) {
        // Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

