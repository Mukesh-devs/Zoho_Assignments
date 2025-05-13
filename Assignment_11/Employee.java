abstract class Employee {
    
    protected static int employeeCount = 0;

    abstract int getEmployeeId() ;

    abstract String getName() ;

    abstract String getDepartment() ;

    abstract String getEmail() ;

    abstract public  void  setDepartment(String department);

    abstract public  void setEmail( String email);

    abstract int getEmployeeCount() ;

    abstract String getInfo() ;
}

class SalariedEmployee extends Employee {
    int salary;
    private int employeeId;
    private String name;
    private String department;
    private String email;

    public SalariedEmployee(int employeeId, String name, String department, String email, int salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.email = email;
        this.salary = salary;
        employeeCount++;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSalary() {
        return "The Employee Salary is: " + this.salary;
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

    public int getEmployeeCount() {
        return employeeCount;
    }

    public String getInfo() {
        return "Employee ID: " + employeeId + "\nName: " + name + "\nDepartment: " + department + "\nEmail: " + email + "\nSalary: "+ salary;
    }
}

class IntershipsEmployee extends Employee {
    int totalNumberOfDays;
    private int employeeId;
    private String name;
    private String department;
    private String email;

    public IntershipsEmployee(int employeeId, String name, String department, String email, int totalNumberOfDays) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.email = email;
        this.totalNumberOfDays = totalNumberOfDays;
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

    public int getEmployeeCount() {
        return employeeCount;
    }

    public String getInfo() {
        return "Employee ID: " + employeeId + "\nName: " + name + "\nDepartment: " + department + "\nEmail: " + email + "\nTotalNumberOfDays: "+ totalNumberOfDays;
    }

    public int getTotalNumberOfDays() {
        return totalNumberOfDays;
    }

    public void setTotalNumberOfDays(int totalNumberOfDays) {
        this.totalNumberOfDays = totalNumberOfDays;
    }    
}

class Q1 {
    public static void main(String[] args) {
        Employee emp1 = new SalariedEmployee(1, "Mukesh", "Development", "gk@gmail.com", 500000);
        Employee emp2 = new IntershipsEmployee(2, "Saran", "ZSGS", "ak@gmail.com", 60);

        System.out.println(emp1.getInfo());
        System.out.println("--------------------------");
        System.out.println(emp2.getInfo());
    }
}