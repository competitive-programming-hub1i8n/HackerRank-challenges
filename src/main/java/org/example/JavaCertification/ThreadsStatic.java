package org.example.JavaCertification;

public class ThreadsStatic {
    public static void main(String[] args) {
        Sample a = new Sample("A");
        Sample b = new Sample("B");

        b.start();
        a.start();
    }
}


class Sample implements Runnable{
    private Thread t;
    private String threadName;

    public Sample(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        while (true){
            System.out.println(threadName);
        }
    }

    public void start(){
        if (this.t == null){
            this.t = new Thread(this, this.threadName);
            t.start();
        }
    }
}