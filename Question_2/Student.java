package CS221Course.src.DS_assignment5.Question_2;

public class Student implements  Comparable<Student>{

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

  /* @Override
    public int compareTo(Object o) {

       if (o != null) return 1;
       if (!(o instanceof Student)) return -1;
       Student temp = (Student) o;

       return (this.getScore() - temp.getScore()) * -1;

   }*/
    //Compare method
    @Override
    public int compareTo(Student o) {

        return this.getScore() - o.getScore();
    }
    //equal method
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
