package TwoArgsPredefinedFunctional_Interface;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class Employee
{
    String name;
    double salary;

    Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name+":"+salary;
    }
}
public class BiConsumer_Example {
    public static void main(String[] args) {
        ArrayList<Employee> arrayList = new ArrayList<Employee>();
        arrayList.add(new Employee("Shivi",1000));
        arrayList.add(new Employee("ravi",2000));
        arrayList.add(new Employee("vishal",3000));
        arrayList.add(new Employee("sailesh",4000));
        arrayList.add(new Employee("vikas",5000));

        System.out.println("Before incrementing salary");
        System.out.println(arrayList);

        // creating a consumer to increment salary of employee
        BiConsumer<Employee,Double> c = (e,d) -> e.salary = e.salary+d;

        // applying consumer
        for(Employee e:arrayList)
        {
            c.accept(e,500.0);
        }
        System.out.println("After incrementing salary");
        System.out.println(arrayList);
    }
}
