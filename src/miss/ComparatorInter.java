package miss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Student
 */
class Student {
    int rollNo;
    String name, addres;

    public Student(int rollNo, String name, String addres) {
        this.rollNo = rollNo;
        this.name = name;
        this.addres = addres;
    }

    public String toString() {
        return this.name + this.rollNo + this.addres + "";
    }
}

/**
 * SortByRollNo
 */
class SortByRollNo implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.rollNo - b.rollNo;
    }
}

/**
 * sortByName
 */
class sortByName implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);
    }
}

public class ComparatorInter {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student(12, "Rohan", "Kaij"));
        al.add(new Student(18, "Rohit", "Nanded"));
        al.add(new Student(13, "Rahul", "Pune"));
        Collections.sort(al, new SortByRollNo());
        System.out.println(al);
    }
}
