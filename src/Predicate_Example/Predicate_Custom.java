package Predicate_Example;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee
{
    String name;
    int eno;

    Employee(String name, int eno)
    {
        this.name = name;
        this.eno = eno;
    }

    public String toString()
    {
        return eno+":"+name;
    }
}
public class Predicate_Custom {
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<Employee>();

        al.add(new Employee("Shivam", 101));
        al.add(new Employee("Salman", 102));
        al.add(new Employee("Rohit", 005));
        al.add(new Employee("Mohit", 010));
        al.add(new Employee("Vikas", 121));
        al.add(new Employee("Aditya", 114));
        al.add(new Employee("Akansha", 105));

        System.out.println(al);
        System.out.println("employee having employee no greater than 100");
        Predicate<Employee> p1 = e -> e.eno>100;
        for(Employee e1: al)
        {
            if (p1.test(e1))
            {
                System.out.println(e1);
            }
        }

        System.out.println("employee having employee name greater than 4 characters");
        Predicate<Employee> p2 = e -> e.name.length()>4;
        for(Employee e1: al)
        {
            if (p1.test(e1))
            {
                System.out.println(e1);
            }
        }
    }
}
