package org.example.others;

import java.util.BitSet;

public class EjemploBitSet {
    public static void main(String[] args) {
        // Crear dos conjuntos BitSet
        BitSet conjunto1 = new BitSet(8);
        BitSet conjunto2 = new BitSet(8);

        // Establecer algunos bits en los conjuntos
        conjunto1.set(0);
        conjunto1.set(1);
        conjunto1.set(2);
        conjunto1.set(3);

        conjunto2.set(2);
        conjunto2.set(3);
        conjunto2.set(4);
        conjunto2.set(5);

        // Imprimir los conjuntos originales
        System.out.println("Conjunto 1: " + conjunto1);
        System.out.println("Conjunto 2: " + conjunto2);

        // Realizar operaciones lógicas
        conjunto1.and(conjunto2);   // Intersección
        System.out.println("Intersección: " + conjunto1);

        conjunto1.or(conjunto2);    // Unión
        System.out.println("Unión: " + conjunto1);

        conjunto1.xor(conjunto2);   // XOR (diferencia simétrica)
        System.out.println("XOR: " + conjunto1);
    }
}
