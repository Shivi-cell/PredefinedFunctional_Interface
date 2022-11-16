package Function_Examples;

import java.util.function.Function;
import java.util.function.Predicate;

class Student
{
    String name;
    int s_marks;
    Student(String name, int s_marks)
    {
        this.name = name;
        this.s_marks = s_marks;
    }

    @Override
    public String toString() {
        return name+":"+s_marks;
    }
}
public class Function_Custom {
    public static void main(String[] args) {
        // function to grant the grade to students
        Function<Student, String> f1 = s -> {
            int marks = s.s_marks;
            String grade = "";
            if (marks>=80) grade = "A[Dictinction]";
            else if (marks>=60) grade = "B[First Class]";
            else if (marks>=50) grade = "C[Second Class]";
            else if (marks>=35) grade = "D[Third Class]";
            else grade = "E[Failed]";
            return grade;
        };

        Student[] students = {
                new Student("Shiva",98),
                new Student("Ram",65),
                new Student("Bunny",55),
                new Student("Chirag",35),
                new Student("Santa",29)
        };
        for (Student s : students)
        {
            System.out.println("Student name "+s.name);
            System.out.println("Student marks "+s.s_marks);
            System.out.println("Student grade "+f1.apply(s));
            System.out.println("");
        }

        // want students record having marks greater are equal than 60
        System.out.println("students record having marks greater are equal than 60");
        Predicate<Student> p1 = s -> s.s_marks>=60;
        for (Student s : students)
        {
            if (p1.test(s))
            {
                System.out.println("Student name "+s.name);
                System.out.println("Student marks "+s.s_marks);
                System.out.println("Student grade "+f1.apply(s));
                System.out.println("");
            }
        }
    }
}
