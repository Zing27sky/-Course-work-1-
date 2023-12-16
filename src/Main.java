public abstract class Main {
    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Volkov", "Alexandr", "Sergeevich", 1, 6500);
        employees[1] = new Employee("Stepnov", "Oleg", "Nikolaevich", 5, 4800);
        employees[2] = new Employee("Ivanov", "Dmitriy", "Leonidovich", 1, 6200);
        employees[3] = new Employee("Fedorov", "Kirill", "Ivanovich", 2, 3700);
        employees[4] = new Employee("Semenov", "Stanislav", "Vitalievich", 4, 5000);
        employees[5] = new Employee("Kozlov", "Denis", "Alekseevich", 3, 4200);
        employees[6] = new Employee("Orlov", "Egor", "Romanovich", 5, 5600);
        employees[7] = new Employee("Petrov", "Konstantin", "Olegovich", 1, 7200);
        employees[8] = new Employee("Svetlov", "Igor", "Fedorovich", 2, 4000);
        employees[9] = new Employee("Govorov", "Ivan", "Kirillovich", 3, 4500);

        printEmployees(employees);
        System.out.println("Сумма затрат на зарплаты: " + calculateTotalSalary(employees));
        System.out.println("Сотрудник с минимальной зарплатой: " + findEmployeeWithMinSalary(employees));
        System.out.println("Сотрудник с максимальной зарплатой: " + findEmployeeWithMaxSalary(employees));
        System.out.println("Средняя зарплата: " + calculateAverageSalary(employees));
        printAllEmployeeNames(employees);
    }

    public static void printEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i]);
            }
        }
    }

    public static double calculateTotalSalary(Employee[] employees) {
        double total = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                total = total + employees[i].getSalary();
            }
        }
        return total;
    }

    public static Employee findEmployeeWithMinSalary(Employee[] employees) {
        Employee minSalaryEmployee = employees[0];
        double minSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                minSalaryEmployee = employees[i];
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findEmployeeWithMaxSalary(Employee[] employees) {
        Employee maxSalaryEmployee = employees[0];
        double maxSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                maxSalaryEmployee = employees[i];
            }
        }
        return maxSalaryEmployee;
    }

    public static double calculateAverageSalary(Employee[] employees) {
        double totalSalary = 0;
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                totalSalary += employees[i].getSalary();
                count++;
            }
        }
        if (count > 0) {
            return totalSalary / count;
        } else {
            return 0;
        }
    }
    public static void printAllEmployeeNames(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getLastName() + " " + employees[i].getFirstName() + " " + employees[i].getSurName());
            }
        }
    }

}