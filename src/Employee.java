public class Employee implements EmployeeSystem{

    String empName;
    public Employee(String empName){
        this.empName=empName;
    }

    @Override
    public void printEmployee() {
        System.out.println("*" + empName);
    }
}
