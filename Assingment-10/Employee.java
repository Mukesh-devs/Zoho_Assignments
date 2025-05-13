class Employee {
    private static int employeeCount = 0;
    private int employeeId;
    private String name;
    private String department;
    private String email;

    public Employee(int employeeId, String name, String department, String email) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.email = email;
        employeeCount++;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmail() {
        return email;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public String getInfo() {
        return "Employee ID: " + employeeId + "\nName: " + name + "\nDepartment: " + department + "\nEmail: " + email;
    }
}

class SalariedEmployee extends Employee {
    int salary;

    public SalariedEmployee(int employeeId, String name, String department, String email, int salary) {
        super(employeeId, name, department, email);
        this.salary = salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSalary() {
        return "The Employee Salary is: " + this.salary;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nSalary: " + salary;
    }
}

class IntershipsEmployee extends Employee {
    int totalNumberOfDays;

    public IntershipsEmployee(int employeeId, String name, String department, String email, int totalNumberOfDays) {
        super(employeeId, name, department, email);
        this.totalNumberOfDays = totalNumberOfDays;
    }

    public void setTotalNumberOfDays(int days) {
        totalNumberOfDays = days;
    }

    public String getTotalNumberOfDays() {
        return "The Total Number Of Days for this Employee is: " + this.totalNumberOfDays;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nTotal Internship Days: " + totalNumberOfDays;
    }
}

class Q1 {
    public static void main(String[] args) {
        Employee emp1 = new SalariedEmployee(1, "Gogul", "Development", "gk@gmail.com", 500000);
        Employee emp2 = new IntershipsEmployee(2, "Arun", "ZSGS", "ak@gmail.com", 60);

        System.out.println(emp1.getInfo());
        System.out.println("--------------------------");
        System.out.println(emp2.getInfo());
    }
}
