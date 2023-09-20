public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        int department1 = 1;
        int department2 = 2;
        int department3 = 3;
        int department4 = 4;
        int department5 = 5;

        Employee emp1 = new Employee("Сарафанова Екатерина Вадимовна", department1, 68550);
        Employee emp2 = new Employee("Братченко Никита Дмитриевич", department5, 25327);
        Employee emp3 = new Employee("Васильева Дарья Олеговна", department3, 33088);
        Employee emp4 = new Employee("Юдина Дарья Романовна", department2, 55457);
        Employee emp5 = new Employee("Синявская Мария Сергеевна", department4, 40789);
        Employee emp6 = new Employee("Орлова Виктория Алексеевна", department1, 37440);
        Employee emp7 = new Employee("Ларионова Мария Сергеевна", department3, 27890);
        Employee emp8 = new Employee("Сиротина Софья Александровна", department2, 42220);
        Employee emp9 = new Employee("Тихонов Никита Игоревич", department5, 38990);
        Employee emp10 = new Employee("Сергеев Александр Владимирович", department4, 70888);

        EmployeeBook.addToArray(employees, emp1);
        EmployeeBook.addToArray(employees, emp2);
        EmployeeBook.addToArray(employees, emp3);
        EmployeeBook.addToArray(employees, emp4);
        EmployeeBook.addToArray(employees, emp5);
        EmployeeBook.addToArray(employees, emp6);
        EmployeeBook.addToArray(employees, emp7);
        EmployeeBook.addToArray(employees, emp8);
        EmployeeBook.addToArray(employees, emp9);
        EmployeeBook.addToArray(employees, emp10);

        emp2.setSalary(58890);

        System.out.println("Список всех сотрудников со всеми имеющимися по ним данными:");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
        printSeparator();

        System.out.println("Сумма затрат на зарплаты в месяц: " + EmployeeBook.calculateTotalSalary(employees));
        printSeparator();

        System.out.println("Сотрудник с минимальной зарплатой: " + EmployeeBook.findEmployeeWithMinSalary(employees));
        printSeparator();

        System.out.println("Сотрудник с максимальной зарплатой: " + EmployeeBook.findEmployeeWithMaxSalary(employees));
        printSeparator();

        System.out.println("Среднее значение зарплат: " + EmployeeBook.calculateAverageSalary(employees));
        printSeparator();

        System.out.println("Список имен всех сотрудников");
        EmployeeBook.printFullNamesOfAllEmployees(employees);
        printSeparator();
    }

    public static void printSeparator() {
        System.out.println("=====================================================================");
    }
}