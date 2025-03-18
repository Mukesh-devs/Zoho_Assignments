package Assignment_7;

public class EmployeeCons {
    private String empName;
    private static int empId;
    private String empEmail;
    private String empPhone;
    private String empDept;

    public EmployeeCons(String empName, String empEmail, String empPhone, String empDept)  {
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
    @Override
    public String toString() {
        return "EmpId \t: " + empId + 
            "\nEmpname \t: " + empName + 
            "\nEmpEmail \t: " + empEmail +
            "\nEmpPhone \t: " + empPhone +
            "\nEmpDept \t: " + empDept;
    }

    
}
