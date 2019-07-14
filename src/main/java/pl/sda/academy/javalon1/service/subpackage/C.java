package pl.sda.academy.javalon1.service.subpackage;

import java.util.ArrayList;
import java.util.List;

public class C {

    static final B b;

    public static final List<String> list = new ArrayList<String>();

    static {
        b = new B(5);
    }


    public C(){
    }

    public static void main(String[] args) {
        B b = new B(5);
        System.out.println("---");
        b = new B(5,10);
        System.out.println("---");
        b = new B(5, 10, 15);
        System.out.println("tworzenie B");
    }

}
