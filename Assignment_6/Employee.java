package Assignment_6;

public class Employee {
    private String empName;
    private static int empId;
    private String empEmail;
    private String empPhone;
    private String empDept;

    public Employee(String empName, String empEmail, String empPhone, String empDept)  {
        this.empName = empName;
        this.empEmail = empEmail;
        this.empPhone = empPhone;
        this.empDept = empDept;
        empId++; 
    }

    public void setName(String empName) {
        this.empName = empName;
    }

    public void setEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public void setPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    public void setDept(String empDept) {
        this.empDept = empDept;
    }

    public String getName() {
        return empName;
    }

    public String getEmail() {
        return empEmail;
    }

    public String getPhone() {
        return empPhone;
    }

    public String getDept() {
        return empDept;
    }

    public String printEmployee() {
        return "EmpId \t: " + empId + 
            "Empname \t: " + empName + 
            "EmpEmail \t: " + empEmail +
            "EmpPhone \t: " + empPhone +
            "EmpDept \t: " + empDept;
    }

    
}
