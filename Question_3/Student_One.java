package CS221Course.src.DS_assignment5.Question_3;

import CS221Course.src.DS_assignment5.Question_2.Student;

import java.util.*;

public class Student_One extends Student implements Comparator {

   // @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }

    @Override
    public boolean equals(Object obj) {

        if(obj != null) return true;
        if(!(obj instanceof Student)) return false;
        Student s1 = (Student) obj;

       if(this.getName().equals(s1.getName()) && this.getScore() == s1.getScore() && this.getSid() == s1.getSid()) return true;
       else
           return false;
    }

    public static void main(String[] args) {

        Student s4 = new Student(33,"Samuel",2);
        Student s2 = new Student(11,"Robeil",4);
        Student s3 = new Student(23,"Keleab",3);
        Student s1 = new Student(33,"Samuel",2);

        //Comparator
        Student_One comp = new Student_One();

        //comparing two student using comparator
         System.out.println(comp.compare(s1,s4));

         //Equal method
        if(s4.equals(s1)){
            System.out.println("They are equal");
        } else{
            System.out.println("They are not equal");
        }

        List<Student> stuList = new ArrayList<>();
        stuList.add(s1);
        stuList.add(s2);
        stuList.add(s3);
        stuList.add(s4);

        //collections using comparator (comp)
        Collections.sort(stuList,comp);
        //Iterator
        Iterator<Student> stu = stuList.iterator();
        //printing using Iterator
        while(stu.hasNext()){
            System.out.println(stu.next());

        }



    }
}
