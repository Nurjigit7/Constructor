public class Main {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.setName("nurjigit");
//        student.setAge(22);
//        System.out.println(student.getName());
//        System.out.println(student.getAge());
        Employee employee = new Employee("Nurjigit", "Umarov", 22, 60000);
        Employee employee1 = new Employee("Pysbek ", "Shaparov", 25, 90000);
        Employee employee3 = new Employee("Aigerim", "Bazarbaieva", 24, 65000);
        Employee[] employees = {employee, employee1, employee3};
        Company company = new Company(1, "Google", "USA", employees);
        System.out.println(company.geEmployeeByName("Nurjigit", company));
        System.out.println("ushul jashtagy adamdar " + company.countAge(22, company));

    }


}
