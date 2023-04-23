import java.util.ArrayList;
import java.util.List;

public class EmployeeReportees implements EmployeeSystem{

    List<EmployeeSystem > employeeSystemList;
    String empName;
    EmployeePosition position;
    public EmployeeReportees(String empName,EmployeePosition employeePosition){
        this.empName=empName;
        this.position=employeePosition;
        employeeSystemList = new ArrayList<>();
    }

    public void addReportees(EmployeeSystem obj){
        employeeSystemList.add(obj);
    }

    @Override
    public void printEmployee() {
        System.out.println("Employee " + this.empName + " has position as : " + this.position);
        System.out.println("Reporting employees of " + this.empName + " --> ");
        for(EmployeeSystem employee:employeeSystemList){
            employee.printEmployee();
        }
    }
}
