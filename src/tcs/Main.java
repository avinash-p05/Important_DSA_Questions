package tcs;

//Suppose you have the students with fields rollNo and name.
// You have to sort the students based on their names and also print the students having duplicate names.

import java.util.*;

class Student{
    int rollNo;
    String name;

    Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }
    public String getName() {
        return name;
    }

    public String toString(){
        return "Student{name='"+name+"', rollNo="+rollNo+"}";
    }
}

class StudentComparator implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return s1.getName().compareTo(s2.getName());
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Avinash"));
        students.add(new Student(2,"Rahul"));
        students.add(new Student(3,"Rohit"));
        students.add(new Student(4,"Avinash"));

        students.sort(new StudentComparator());

        for(Student student : students){
            System.out.println(student);
        }

        Set<String> set = new HashSet<>();
        System.out.println("Duplicate Students:");
        for(Student student : students){
            if(!set.add(student.getName())){
                System.out.println(student.getName());
            }
        }

    }
}
