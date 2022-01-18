package CS221Course.src.DS_assignment5.Question_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> stuList = new ArrayList<>();

        stuList.add(new Student(33,"Haben",2));
        stuList.add(new Student(11,"Robeil",4));
        stuList.add(new Student(23,"Keleab",3));

        Collections.sort(stuList);

        System.out.println(stuList);

        for(Student s: stuList){
            System.out.println(s.getScore());
        }

    }
}
