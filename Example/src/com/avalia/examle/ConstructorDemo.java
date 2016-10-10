package com.avalia.examle;


public class ConstructorDemo {
 
ConstructorDemo(){
        this(1);
        System.out.println("Zero argument constructor");
}
    
ConstructorDemo(int a){
        this("Hi",1);
        System.out.println("One argument constructor");
}
 
ConstructorDemo(String str, int x){
    
        System.out.println("Two argument constructor");
}
 
@SuppressWarnings("unused")
public static void main(String[] args) {
 
        ConstructorDemo obj =new ConstructorDemo();
 
    }
 
}
