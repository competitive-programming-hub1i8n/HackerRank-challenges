package org.example.POO;

import java.util.ArrayList;
import java.util.Scanner;

/**
    * El operador java instanceof se utiliza para comprobar si el objeto o la instancia es una instancia del
     tipo especificado.
    * En este problema le hemos dado tres clases en el editor:
    *    --> clase de estudiante
    *    --> clase estrella de rock
    *    --> Clase de piratas informáticos
    * En el método principal, completamos una ArrayList con varias instancias de estas clases.
    * El método count calcula cuántas instancias de cada tipo están presentes en ArrayList.
    * El código imprime tres números enteros, el número de instancias de la clase Student,
      el número de instancias de la clase Rockstar, el número de instancias de la clase Hacker.
    * Pero faltan algunas líneas del código, y debe corregirlo modificando solo 3 líneas! No agregue,
     elimine ni modifique ninguna línea adicional.
    * Para restaurar el código original en el editor, haga clic en el icono superior izquierdo del editor
     y cree un nuevo búfer.
 */
public class Example_7 {
    public static void main(String[] args) {
        Scanner inout = new Scanner(System.in);
        ArrayList myList = new ArrayList();
        int t = inout.nextInt();
        for (int i = 0; i < t; i++) {
            String typr = inout.next();
            if (typr.equals("Student")){myList.add(new Student());}
            if (typr.equals("Rockstar")){myList.add(new Rockstar());}
            if (typr.equals("Hacker")){myList.add(new Hacker());}
        }
        System.out.println(counterObjectsinList(myList));
    }

    static String counterObjectsinList( ArrayList myList){
        int s,r,h ;
        s = 0;
        r = 0;
        h = 0;
        for (int i = 0; i < myList.size() ; i++) {
            if (myList.get(i) instanceof  Student)
                s++;
            if (myList.get(i) instanceof  Rockstar)
                r++;
            if (myList.get(i) instanceof Hacker)
                h++;
        }
        return s + " " + r + " " + h;
    }
}

class Student{ }
class  Rockstar{ }
class Hacker{}