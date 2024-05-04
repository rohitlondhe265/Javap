package tcs;

import java.util.*;
import java.io.*;

/**
 * Student
 */
class Student {

    String name;
    int age;
    String grade;
    String gender;

    public Student(String n, int a, String g, String gender) {
        this.name = n;
        this.age = a;
        this.grade = g;
        this.gender = gender;
    }
}

public class NextShift21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input :- 2
        // AA 21 A Female
        // AB 24 B Male
        int n = sc.nextInt();
        ArrayList<Student> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int age = sc.nextInt();
            String grade = sc.next();
            String gender = sc.next();
            Student s = new Student(name, age, grade, gender);
            list.add(s);
        }
        int sum = 0;
        int count = 0;
        for (Student s : list) {
            if (s.gender.equals("Female")) {
                sum = sum + (s.grade.charAt(0) + 0);
                count = count + 1;
            }
            if(s.age > 20) System.out.print(s.name + " ");
        }
        System.out.println();
        System.out.print(sum/count);
    }
}
// 2
// AA 21 A Female
// AB 24 B Male