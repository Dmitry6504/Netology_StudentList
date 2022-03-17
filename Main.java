package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        printMessage1();

        Set<Student> setStudents = new HashSet<>();

        while (true) {
            printMessage2();
            String answer = scanner.nextLine();
            if (!answer.equals("end")) {
                String[] parts = answer.split(", ");
                String name = parts[0];
                String group = parts[1];
                String studentId = parts[2];
                Student s = new Student(name, group, studentId);

                if (!setStudents.isEmpty()) {
                    if (setStudents.contains(s)) {
                        System.out.println("Такой номер билета уже существует! ");
                    }
                }

                setStudents.add(s);
                System.out.println(setStudents);
            } else {
                System.out.println("Список студентов:");
                Iterator<Student> st = setStudents.iterator();
                while (st.hasNext()) {
                    System.out.println(st.next());
                }
                break;
            }
        }
    }

    public static void printMessage1() {
        System.out.println("Введите информацию о студенте: \"ФИО, номер группы, номер студенческого билета\"");
    }

    public static void printMessage2() {
        System.out.println("Введите информацию о студенте (для завершения работы программы введите \"end\")");
    }
}
