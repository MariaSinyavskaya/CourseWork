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

        Employee.addToArray(employees, emp1);
        Employee.addToArray(employees, emp2);
        Employee.addToArray(employees, emp3);
        Employee.addToArray(employees, emp4);
        Employee.addToArray(employees, emp5);
        Employee.addToArray(employees, emp6);
        Employee.addToArray(employees, emp7);
        Employee.addToArray(employees, emp8);
        Employee.addToArray(employees, emp9);
        Employee.addToArray(employees, emp10);

        emp2.setSalary(59890);

        System.out.println("Список всех сотрудников со всеми имеющимися по ним данными:");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
        Employee.printSeparator();

        System.out.println("Сумма затрат на зарплаты в месяц: " + Employee.calculateTotalSalary(employees));
        Employee.printSeparator();

        Employee.findEmployeeWithMinSalary(employees);
        Employee.printSeparator();

        Employee.findEmployeeWithMaxSalary(employees);
        Employee.printSeparator();

        System.out.println("Среднее значение зарплат: " + Employee.calculateAverageSalary(employees));
        Employee.printSeparator();

        Employee.printFullNamesOfAllEmployees(employees);
        Employee.printSeparator();
    }
}