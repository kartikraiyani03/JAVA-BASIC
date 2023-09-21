import java.util.*;

class employee
    {
        String name;
        private int salary;

        // employee(String name)
        // {
        //     this.name = name;
        // }

        public void setSalary(int salary)
        {
            this.salary = salary;
        }

        public int getSalary()
        {
            return this.salary;
        }

        public void info()
        {
            System.out.println("Name : "+this.name);
            System.out.println("Salary : "+salary);
        }

    }
 
public class am
{
    public static void main(String args[])
    {
        employee e1 = new employee();
        employee e2 = new employee();
        employee e3 = new employee();

        e1.name = "Alpha";
        e2.name = "Beta";
        e3.name = "Gamma";

        e1.setSalary(10000);
        e2.setSalary(20000);
        e3.setSalary(30000);

        System.out.println("");
        e1.info();
        System.out.println("");
        e2.info();
        System.out.println("");
        e3.info();
        System.out.println("");
        
    //    System.out.println(e1.getSalary());

    }
}