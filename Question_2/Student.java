package CS221Course.src.DS_assignment5.Question_2;

import java.util.Comparator;

public class Student implements  Comparable<Student>, Comparator {

    private int sid;
    private String name;

    private int score;

    public Student() {
    }

    public Student(int sid, String name, int score) {
        this.sid = sid;
        this.name = name;
        this.score = score;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    //Compare method
    @Override
    public int compareTo(Student o) {
        return this.getScore() - o.getScore();
    }

    //todo ---> make sure .....
    @Override
    public int compare(Object o1, Object o2) {

        Student s1 = (Student) o1;
        Student s2 = (Student) o2;

        return s1.compareTo(s2);
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
}
