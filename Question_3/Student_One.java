package CS221Course.src.DS_assignment5.Question_3;

import CS221Course.src.DS_assignment5.Question_2.Student;

import java.util.*;

public class Student_One extends Student implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {

        Student s4 = new Student(45,"Samuel",9);
        Student s2 = new Student(11,"Robeil",4);
        Student s3 = new Student(23,"Keleab",3);
        Student s1 = new Student(33,"Haben",2);

        Student_One comp = new Student_One();
        System.out.println(s1.equals(s4));
        System.out.println(comp.compare(s1,s4));

        List<Student> stuList = new ArrayList<>();
        stuList.add(s1);
        stuList.add(s2);
        stuList.add(s3);
        stuList.add(s4);

        Collections.sort(stuList,comp);
        System.out.println(stuList);

    }
}
