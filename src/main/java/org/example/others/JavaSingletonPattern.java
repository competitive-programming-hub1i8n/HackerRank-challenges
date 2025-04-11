package org.example.others;

public class JavaSingletonPattern {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleInstance();
        singleton.setStr("Hello World");
        singleton.getStr();
    }
}

class Singleton{
    String str;
    private Singleton(){

    }

    static Singleton getSingleInstance(){
        Singleton singleton = new Singleton();
        return singleton;
    }

    public void setStr(String str){
        this.str = str;
    }

    public void getStr(){
        System.out.println("Hello I am a singleton! Let me say hello world to you");
    }
}