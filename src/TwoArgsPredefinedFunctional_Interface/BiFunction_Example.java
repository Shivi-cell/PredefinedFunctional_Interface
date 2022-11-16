package TwoArgsPredefinedFunctional_Interface;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Student
{
    int rollNo;
    String name;
    Student(int rollNo, String name)
    {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return rollNo+":"+name;
    }
}
public class BiFunction_Example {
    public static void main(String[] args) {
        BiFunction<Integer,String,Student> f1 = (a,b) -> new Student(a,b);
        System.out.println(f1.apply(101,"Shivam"));

        // creating arraylist of students using BiFunction
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(f1.apply(101,"Shivam"));
        students.add(f1.apply(102,"Rohan"));
        students.add(f1.apply(103,"Shivanshu"));
        students.add(f1.apply(104,"Ramesh"));
        students.add(f1.apply(105,"Salman"));
        students.add(f1.apply(106,"Aman"));

        System.out.println(students);
    }
}
