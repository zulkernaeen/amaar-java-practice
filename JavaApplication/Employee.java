class Employee {
    private String name;
    private int id;
    private double salary;
    
    public Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
            public String getName(){
                return name;
            }
           public int getId(){
               return id;
           }
           public double getSalary(){
               return salary;
           }
        }

public class MyClass{
    public static void main(String[]args){
        Employee emp = new Employee("Rahim", 101, 25000.0);
        System.out.println("Employee Name:" + emp.getName());
        System.out.println("Employee ID:" + emp.getId());
        System.out.println("Employee Salary:" + emp.getSalary());
    }
}
