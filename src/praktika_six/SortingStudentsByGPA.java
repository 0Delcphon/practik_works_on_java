package praktika_six;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    public int compare(Student o1, Student o2) {
        if (o1.GPA < o2.GPA) {
            return 1;
        }
        else if (o1.GPA == o2.GPA) {
            return 0;
        }
        else {
            return -1;
        }
    }
}
