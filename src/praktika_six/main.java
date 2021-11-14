package praktika_six;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        Student[] a = new Student[] {
                new Student(1, 9),
                new Student(3, 92),
                new Student(2, 45),
                new Student(9, 34),
                new Student(7, 56),
        };

        Arrays.sort(a);

        System.out.println("By ID:");
        for(int i = 0; i < a.length; i++)
            System.out.println(a[i]);

        Arrays.sort(a, new SortingStudentsByGPA());

        System.out.println("By GPA:");
        for(int i = 0; i < a.length; i++)
            System.out.println(a[i]);

        Student[] b = new Student[]{
                new Student(6, 78),
                new Student(10, 76),
                new Student(14, 25)};

        Student[] ab = new Student[a.length + b.length];
        System.arraycopy(a, 0, ab, 0, a.length);
        System.arraycopy(b, 0, ab, a.length, b.length);
        Arrays.sort(ab);

        System.out.println("Task 3: ");
        for(int i = 0; i < ab.length; i++)
            System.out.println(ab[i]);
    }
}