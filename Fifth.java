import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private String name;
    private String job;
    private String title;
    private double salary;

    Employee(String name,String job,String title,double salary)
    {
        this.name=name;
        this.job=job;
        this.title=title;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", job=" + job + ", title=" + title + ", salary=" + salary + "]";
    }
    public static ArrayList<Employee>empcoll=new ArrayList<>();

    public static void  addEmp(Employee emp)
    {
        empcoll.add(emp);
    }
    public double updatesal(double salary)
    {
        return salary*9;
        
    }
    public static ArrayList<Employee>getcollection()
    {
        return empcoll;
    }

}
public class Fifth {
    public static void main(String[] args) 
    {
        

        Scanner sc=new Scanner(System.in);
        Employee e1=new Employee("keeri","summa","vetti",9);
        System.out.println(e1.getName() + e1.getJob() + e1.getSalary() + e1.getTitle());
        System.out.println("Enter Name: ");
        String name=sc.nextLine();
        System.out.println("Job: ");
        String job=sc.nextLine();
        System.out.println("Salary: ");
        Double salary=sc.nextDouble();
        sc.nextLine();
        System.out.println("title: ");
        String title=sc.nextLine();
        Employee e2=new Employee(name, job, title,salary);
        Employee.addEmp(e2);
        e2.updatesal(12);
        ArrayList <Employee>empcol=Employee.getcollection();

        for(Employee bo:empcol)
        {
            System.out.println(bo);
        }
    }
    
}
