import java.util.*;
 
public class Class1
{
    static class employee
    {
        String name;
        int salary;

        public void detail()
        {
            System.out.println("Name : "+name);
            System.out.println("Salary : "+salary);
        }

        public int getSalary(int salary)
        {
            return salary;
        }

        public String getName(String name)
        {
            return name;
        }

        public void setName(String n)
        {
            name = n;
        }

    }
    public static void main(String args[])
    {
        employee e1 = new employee();
        e1.salary = 10000;
        e1.name = "Alpha";

        e1.getName("beta");
        
        e1.detail();
        e1.setName("beta");
        

    }
}