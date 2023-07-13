import java.util.Arrays;

public class Company {
    private int id;
    private String companyName;
    private String location;
    private Employee[] employees;

    public Company() {
    }

    public Company(int id, String companyName, String location, Employee[] employees) {
        this.id = id;
        this.companyName = companyName;
        this.location = location;
        this.employees = employees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public int maxSalary(Company company) {
        int count = 0;
        for (int i = 0; i < company.employees.length; i++) {
            if (company.employees[i].getSalary() > count) {
                count = company.employees[i].getSalary();
            }
        }
        return count;
    }

    public String geEmployeeByName(String employeeName, Company company) {
        Employee employee = null;
        for (int i = 0; i < company.employees.length; i++) {
            if (company.employees[i].getName().equals(employeeName)) {
                employee = company.employees[i];
            }

        }


        return "name : " + employee.getName() + ": SurName : " + employee.getSurName() + " : Age :" + employee.getAge() + " :Salary:" + employee.getSalary();
    }

    public int countAge(int age, Company company) {
        int san = 0;
        for (int i = 0; i < company.employees.length; i++) {
            if (company.employees[i].getAge() == age) {
                san++;
            }

        }
        return san;

    }


}
