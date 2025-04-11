package org.example.others;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JavaSort {
    /**
     * Step 1: Su tarea es reorganizarlos según su CGPA en orden decreciente.
     * Step 2: Si dos estudiantes tienen el mismo CGPA, ordénelos según su nombre en orden alfabético.
     * Step 3: Si esos dos estudiantes también tienen el mismo nombre, ordénelos según su identificación.
     */
    static class Student{
        private int id;
        private String name;
        private double cgpa;
        public Student(int id, String name, double cgpa) {
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
        }
        public int getId() {
            return id;
        }
        public String getFname() {
            return name;
        }
        public double getCgpa() {
            return cgpa;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Student> students =  new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int id = scanner.nextInt();
            String name = scanner.next();
            String cgpa = scanner.next();
            students.add(new Student(id, name, Double.parseDouble(cgpa)));
        }

        Collections.sort(students, (student1, student2) -> {
            if (student1.getCgpa() == student2.getCgpa()){
                if(student1.getFname().equals(student2.getFname())){
                    return student1.getId() - student2.getId();
                }else {
                    return student1.getFname().compareTo(student2.getFname());
                }
            }else {
                System.out.println("Multiply for 10 " + student2.getCgpa() * 10 + " " + student1.getCgpa() * 10);
                System.out.println("Multiply for 100 " + student2.getCgpa() * 100 + " " + student1.getCgpa() * 100);
                return (int) (student2.getCgpa()*100 - student1.getCgpa()*100);
            }
        });

        for (Student student : students) {
            System.out.println(student.getFname());
        }
    }
}
/*
Ashis
Fahim
Samara
Samiha
Rumpa
 */