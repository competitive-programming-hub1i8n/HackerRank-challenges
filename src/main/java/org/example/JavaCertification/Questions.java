package org.example.JavaCertification;


interface a{
    void getSugary();
}

abstract class b implements a{
}

 class c extends b{
    public void getSugary(){
        ;
    }
 }


 class d extends c{
    void getSugary(int s){
        ;
    }
 }
public class Questions {
    public static void main(String[] args) {
        c c = new c();
        c.getSugary();

        d d = new d();
        d.getSugary(1);
    }
}
