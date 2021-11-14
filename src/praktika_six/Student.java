package praktika_six;

import java.util.Arrays;

public class Student implements Comparable<Student> {
    int id;
    int GPA;

    public Student(int id, int GPA) {
        this.id = id;
        this.GPA = GPA;
    }

    @Override
    public int compareTo(Student o) {
        if (this.id > o.id) {
            return 1;
        } else if (this.id == o.id) {
            return 0;
        } else
            return -1;
    }

    @Override
    public String toString() {
        return "Student: " +
                "id=" + id +
                ", GPA=" + GPA;
    }

}