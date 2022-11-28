public class Main {

    private static final Employee[] EMPLOYEES = new Employee[10];

    public static void main(String[] args) {
        EMPLOYEES[0] = new Employee("Демин", "Адам", "Владиславович", 1, 45000);
        EMPLOYEES[1] = new Employee("Кузнецов", "Илья", "Глебович", 1, 39000);
        EMPLOYEES[2] = new Employee("Макеев", "Артём", "Григорьевич", 3, 52000);
        EMPLOYEES[3] = new Employee("Муравьев", "Максим", "Васильевич", 5, 80000);
        EMPLOYEES[4] = new Employee("Никитин", "Михаил", "Даниилович", 4, 39000);

        printFullInfo();
        printSumSalary();
        printMinSalary();
        printMaxSalary();
        printMidSalary();
        printSurnameNamePatronymic();
        System.out.println();

        indexingSalary();
        printFullInfo();
        printMinSalaryDepartment(1);
        printMaxSalaryDepartment(1);
        printSumSalaryDepartment(1);
        printMidSalaryDepartment(1);
        indexingSalaryDepartment(1);
        fullInfoDepartment(1);
        printSalaryLessThan(50000);
        printSalaryMoreThan(60000);

    }

    private static void printFullInfo() {
        for (Employee employee :
                EMPLOYEES) {
            if (employee == null) continue;
            System.out.println(employee);
        }
    }

    private static void printSumSalary() {
        double sum = 0;
        for (Employee employee :
                EMPLOYEES) {
            if (employee == null) continue;
            sum += employee.getSalary();
        }
        System.out.println("Сумма затрат на ЗП в месяц составила: " + sum);
    }

    private static void printMinSalary() {
        double minSalary = Double.MAX_VALUE;
        for (Employee employee :
                EMPLOYEES) {
            if (employee != null && minSalary > employee.getSalary())
                minSalary = employee.getSalary();
        }
        for (Employee employee :
                EMPLOYEES) {
            if (employee != null && minSalary == employee.getSalary())
                System.out.println("Сотрудник с минимальной ЗП " + employee);
        }
    }

    private static void printMaxSalary() {
        double maxSalary = Double.MIN_VALUE;
        for (Employee employee :
                EMPLOYEES) {
            if (employee != null && maxSalary < employee.getSalary())
                maxSalary = employee.getSalary();
        }
        for (Employee employee :
                EMPLOYEES) {
            if (employee != null && maxSalary == employee.getSalary())
                System.out.println("Сотрудник с максимальной ЗП " + employee);
        }
    }

    private static void printMidSalary() {
        double midSalary = 0;
        double sum = 0;
        int count = 0;
        for (Employee employee :
                EMPLOYEES) {
            if (employee == null) continue;
            sum += employee.getSalary();
            count++;
        }
        if (count != 0) {
            midSalary = sum / count;
        }
        System.out.println("Среднее значение ЗП: " + midSalary);
    }

    private static void printSurnameNamePatronymic() {
        for (Employee employee :
                EMPLOYEES) {
            if (employee == null) continue;
            System.out.println("ФИО сотрудника: " + employee.getSurname() + " " + employee.getName() + " " + employee.getPatronymic());
        }
    }

    private static void indexingSalary() {
        double indexing = 0.1;
        for (Employee employee :
                EMPLOYEES) {
            if (employee == null) continue;
            employee.setSalary(employee.getSalary() + employee.getSalary() * indexing);
        }
    }

    private static void printMinSalaryDepartment(int numDepartment) {
        double minSalary = Double.MAX_VALUE;
        for (Employee employee :
                EMPLOYEES) {
            if (employee != null && minSalary > employee.getSalary() && employee.getDepartment() == numDepartment)
                minSalary = employee.getSalary();
        }
        for (Employee employee :
                EMPLOYEES) {
            if (employee != null && minSalary == employee.getSalary() && employee.getDepartment() == numDepartment)
                System.out.println("Сотрудник с минимальной ЗП из отдела №" + numDepartment + ": " +
                        employee.getSurname() + " " + employee.getName() + " " + employee.getPatronymic() +
                        ", с ЗП " + employee.getSalary());
        }
    }

    private static void printMaxSalaryDepartment(int numDepartment) {
        double maxSalary = Double.MIN_VALUE;
        for (Employee employee :
                EMPLOYEES) {
            if (employee != null && maxSalary < employee.getSalary() && employee.getDepartment() == numDepartment)
                maxSalary = employee.getSalary();
        }
        for (Employee employee :
                EMPLOYEES) {
            if (employee != null && maxSalary == employee.getSalary() && employee.getDepartment() == numDepartment)
                System.out.println("Сотрудник с максимальной ЗП из отдела №" + numDepartment + ": " +
                        employee.getSurname() + " " + employee.getName() + " " + employee.getPatronymic() +
                        ", с ЗП " + employee.getSalary());
        }
    }

    private static void printSumSalaryDepartment(int numDepartment) {
        double sum = 0;
        for (Employee employee :
                EMPLOYEES) {
            if (employee != null && employee.getDepartment() == numDepartment)
                sum += employee.getSalary();
        }
        System.out.println("Сумма затрат на ЗП в отделе №" + numDepartment + " в месяц составила: " + sum);
    }

    private static void printMidSalaryDepartment(int numDepartment) {
        double sum = 0;
        double midSalary = 0;
        int countPeople = 0;
        for (Employee employee :
                EMPLOYEES) {
            if (employee != null && employee.getDepartment() == numDepartment) {
                sum += employee.getSalary();
                countPeople++;
            }
        }
        if (countPeople != 0)
            midSalary = sum / countPeople;
        System.out.println("Средняя ЗП по отделу №" + numDepartment + ": " + midSalary);
    }

    private static void indexingSalaryDepartment(int numDepartment) {
        double indexing = 0.1;
        for (Employee employee :
                EMPLOYEES) {
            if (employee != null && employee.getDepartment() == numDepartment) {
                employee.setSalary(employee.getSalary() + employee.getSalary() * indexing);
            }
        }
    }

    private static void fullInfoDepartment(int numDepartment) {
        for (Employee employee :
                EMPLOYEES) {
            if (employee != null && employee.getDepartment() == numDepartment)
                System.out.println("ФИО: " + employee.getSurname() + " " + employee.getSurname() + " "
                        + employee.getPatronymic() + ", ЗП: " + employee.getSalary());
        }
    }

    private static void printSalaryLessThan(int sum) {
        for (Employee employee :
                EMPLOYEES) {
            if (employee != null && employee.getSalary() < sum)
                System.out.println("Сотрудник с ЗП меньше чем " + sum + ": " + employee);
        }
    }

    private static void printSalaryMoreThan(int sum) {
        for (Employee employee :
                EMPLOYEES) {
            if (employee != null && employee.getSalary() >= sum)
                System.out.println("Сотрудник с ЗП больше чем " + sum + ": " + employee);
        }
    }

}
