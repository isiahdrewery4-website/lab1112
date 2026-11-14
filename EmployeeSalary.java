public class EmployeeSalary {

    public double calculateSalary(double annualSalary) {
        return annualSalary;
    }
    
    public double calculateSalary(double hourlyRate, int hoursWorked) {
        return hourlyRate * hoursWorked;
    }
    
    public double calculateSalary(int completedAssignments, double feePerAssignment) {
        return completedAssignments * feePerAssignment;
    }
    
    public static void main(String[]args) {
        
        EmployeeSalary employee = new EmployeeSalary();
        
        double permanentSalary = employee.calculateSalary(55000);
        double hourlySalary = employee.calculateSalary(25.50, 40);
        double consultantSalary = employee.calculateSalary(5, 350.0);
        
        System.out.println("Permanent Employee Salary: $" + permanentSalary);
        System.out.println("Hourly Employee Weekly Salary: $" + hourlySalary);
        System.out.println("Consultant total payment: $" + consultantSalary);
    }
}
