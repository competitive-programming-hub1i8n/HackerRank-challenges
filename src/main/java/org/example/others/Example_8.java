package org.example.others;

import java.util.Scanner;
/*
    java fin de archivo de java
    El desafío aquí es leer n líneas de entrada hasta llegar a EOF (end of file), luego numerar e
    imprimir todas las n líneas de contenido.
    Sugerencia:
        utilice el método Scanner.hasNext() de Java es útil para este problema.
        que es Scanner.hasNext()?: hasNext() es un método de la clase Java Scanner que devuelve verdadero
                                    si este escáner tiene otro token en su entrada. Hay tres tipos
                                    diferentes de método Java Scanner hasNext() que se pueden diferenciar
                                    según su parámetro. Estos son:
                                        1.-Método Java Scanner hasNext()
                                        2.-Método Java Scanner hasNext(patrón de cadena)
                                        3.-Método Java Scanner hasNext (patrón de patrón)
        generalmente necesitamos usar antes de leer hasNext() Con hasNextLine() que Determine si hay
        datos de entrada:
    Formato de entrada
        Lea n líneas de entrada desconocidas desde stdin(System.in) hasta llegar a EOF;
        cada línea de entrada contiene una cadena no vacía. es decir "Hello world"
    Formato de salida
        Para cada línea, imprima el número de línea, seguido de un solo espacio y luego el contenido
        de la línea recibido como entrada.
    Entrada
        Hello world
        I am a file
        Read me until end-of-file.
    Salida
        1 Hello world
        2 I am a file
        3 Read me until end-of-file.
 */

public class Example_8 {
    public static void main(String[] args)   {
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        while(scan.hasNextLine()){
            counter++;
            String word = scan.nextLine();
            System.out.println(counter + " " + word);
            if(scan.hasNextLine()){
                scan.close();
                break;
            }

        }
    }
}
