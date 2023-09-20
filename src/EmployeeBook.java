public class EmployeeBook {

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

    public static Employee findEmployeeWithMinSalary(Employee[] array) {
        Employee employeeWithMinSalary = array[0];
        for (Employee employee : array) {
            if (employee != null && employeeWithMinSalary == null || employee.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    public static Employee findEmployeeWithMaxSalary(Employee[] array) {
        Employee employeeWithMaxSalary = array[0];
        for (Employee employee : array) {
            if (employee != null && employeeWithMaxSalary == null || employee.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }

    public static double calculateAverageSalary(Employee[] array) {
        int numberOfEmployees = 0;
        for (Employee employee : array) {
            if (employee != null) {
                numberOfEmployees++;
            }
        }
        if (numberOfEmployees == 0) {
            return 0;
        } else {
            return calculateTotalSalary(array) / numberOfEmployees;
        }
    }

    public static void printFullNamesOfAllEmployees(Employee[] array) {
        for (Employee employee : array) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
}


