package org.example.others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Add{
    public void add(int ...n){
        int sum = 0;
        String separator = "";
        for (int i : n) {
            sum += i;
            System.out.print(separator + i);
            separator = "+";
        }
        System.out.print("=" + sum);
        System.out.println();
    }
}
public class JavaVarargsSimpleAddition {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n1=Integer.parseInt(br.readLine());
        int n2=Integer.parseInt(br.readLine());
        int n3=Integer.parseInt(br.readLine());
        int n4=Integer.parseInt(br.readLine());
        int n5=Integer.parseInt(br.readLine());
        int n6=Integer.parseInt(br.readLine());
        Add ob = new Add();
        ob.add(n1,n2);
        ob.add(n1,n2,n3);
        ob.add(n1,n2,n3,n4,n5);
        ob.add(n1,n2,n3,n4,n5,n6);
    }
}
