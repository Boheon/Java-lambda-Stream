package rambdaex.ex01;

import org.w3c.dom.ls.LSOutput;

public class MyFunctionalInterfaceExample {
    public static void main(String[] args) {
        rambdaex.ex01.MyFunctionalInterface fi;

        fi = () -> {
            String str = "method call1";
            System.out.println(str);
        };
        fi.method();

        fi = () -> {
            System.out.println("method call2");
        };
        fi.method();

        fi = () -> System.out.println("method call3");
        fi.method();

        Runnable r = () ->  System.out.println("method call4");
        r.run();
    }
}
