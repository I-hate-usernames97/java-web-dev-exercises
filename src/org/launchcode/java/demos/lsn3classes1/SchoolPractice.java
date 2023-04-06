package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student student1 = new Student("Chris", 1, 98, 4.0);
        Student student2 = new Student("Anna", 2);

        System.out.println(student1);
        student2.addGrade(10, 3);
        System.out.println(student2);
        student2.addGrade(10, 4);
        System.out.println(student2);

    }
}
