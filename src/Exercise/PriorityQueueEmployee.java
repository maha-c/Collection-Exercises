package Exercise;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEmployee {
    public static void main(String[] args) {
/*        PriorityQueue<Employee> emp = new PriorityQueue<>();

        //Create using natural order and add employees
        emp.add(new Employee("Anton", 35, 5));
        emp.add(new Employee("Ben", 25, 1));
        emp.add(new Employee("Carol", 40, 10));
        emp.add(new Employee("Daisy", 50, 20));
        emp.add(new Employee("Ben", 47, 15));

        while (!emp.isEmpty()) {
            System.out.println(emp.poll());
        }*/

        Queue<Employee> emp1 = new PriorityQueue<>(new EmployeeCompare());

        emp1.add(new Employee("Adam", 45, 8));
        emp1.add(new Employee("Ben", 25, 1));
        emp1.add(new Employee("Carol", 40, 10));
        emp1.add(new Employee("Daisy", 50, 20));
        emp1.add(new Employee("Ben", 47, 15));

        while (!emp1.isEmpty()) {
            System.out.println(emp1.poll());
        }

        System.out.println("___________________************____________________");

        Queue<Employee> emp2 = new PriorityQueue<>(new EmployeeNameComparator());

        emp2.add(new Employee("Adam", 45, 8));
        emp2.add(new Employee("Ben", 25, 1));
        emp2.add(new Employee("Carol", 40, 10));
        emp2.add(new Employee("Daisy", 50, 20));
        emp2.add(new Employee("Ben", 47, 15));
        emp2.add(new Employee("Anton", 40, 5));

        while (!emp2.isEmpty()) {
            System.out.println(emp2.poll());

        }
    }

}
