public class Employee {
    private String fullName;
    private int department;
    private double salary;
    private int id;
    private static int counter = 1;

    public Employee(String fullName, int department, double salary) {
        this.id = counter++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ФИО - " + fullName + ", отдел - " + department + ", зарплата = " + salary + ", id=" + id;
    }

    public static void addToArray(Employee[] array, Employee employee) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = employee;
                break;
            }
        }
    }

    public static double calculateTotalSalary(Employee []array) {
        double totalSalary = 0;
        for (Employee employee : array) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public static void findEmployeeWithMinSalary(Employee[] array) {
        Employee employeeWithMinSalary = array[0];
        for (Employee employee : array) {
            if (employee != null && employee.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employee;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + employeeWithMinSalary.getFullName() + ", размер зарплаты - " + employeeWithMinSalary.getSalary());
    }

    public static void findEmployeeWithMaxSalary(Employee[] array) {
        Employee employeeWithMaxSalary = array[0];
        for (Employee employee : array) {
            if (employee != null && employee.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employee;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + employeeWithMaxSalary.getFullName() + ", размер зарплаты - " + employeeWithMaxSalary.getSalary());
    }

    public static double calculateAverageSalary(Employee[] array) {
        int numberOfEmployees = 0;
        for (Employee employee : array) {
            if (employee != null) {
                numberOfEmployees++;
            }
        }
        return calculateTotalSalary(array) / numberOfEmployees;
    }

    public static void printFullNamesOfAllEmployees(Employee[] array) {
        for (Employee employee : array) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

    public static void printSeparator() {
        System.out.println("======================================================================");
    }
}
