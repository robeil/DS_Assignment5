package CS221Course.src.DS_assignment5.Question_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> stuList = new ArrayList<>();

        Student s1 = new Student(33,"Haben",2);
        Student s2 = new Student(11,"Robeil",4);
        Student s3 = new Student(23,"Keleab",3);
        Student s4 = new Student(33,"Haben",2);

        stuList.add(s1);
        stuList.add(s2);
        stuList.add(s3);
        stuList.add(s4);

        //equal method
      if(s1.equals(s4)){
          System.out.println("They are equal");
      } else {
          System.out.println("They are NOT equal");
      }

      Collections.sort(stuList);

      System.out.println(s1.compareTo(s4));


      for(Student s: stuList){
            System.out.println(s);
      }

    }
}
