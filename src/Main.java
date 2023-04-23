public class Main {
    public static void main(String[] args) {
        EmployeeReportees CEO = new EmployeeReportees("Tejas",EmployeePosition.CEO);
        EmployeeReportees VP = new EmployeeReportees("Sushant",EmployeePosition.VP);
        EmployeeReportees Manager = new EmployeeReportees("Saurabh",EmployeePosition.Manager);
        CEO.addReportees(VP);
        CEO.addReportees(Manager);

        Employee emp1 = new Employee("Shashank");
        Employee emp2 = new Employee("Faf");
        Employee emp3 = new Employee("Virat");

        VP.addReportees(emp1);
        VP.addReportees(emp2);
        Manager.addReportees(emp3);

        CEO.printEmployee();

    }
}
