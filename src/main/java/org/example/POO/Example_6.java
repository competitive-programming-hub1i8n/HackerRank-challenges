package org.example.POO;
class BiCycle{
    String define_me(){
        return "a vehicle with pedals.";
    }
}

class MotorCycle extends BiCycle{
    String define_me(){
        return "a cycle with an engine.";
    }

    MotorCycle(){
        System.out.println("Hello I am a motorcycle, I am "+ define_me());
        String temp= super.define_me(); //Fix this line
        System.out.println("My ancestor is a cycle who is "+ temp );
    }

}
class Example_6{
    public static void main(String []args){
        MotorCycle M=new MotorCycle();
    }
}
/*
Hello I am a motorcycle, I am a cycle with an engine.
My ancestor is a cycle who is a vehicle with pedals.
 */