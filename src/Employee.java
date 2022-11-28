public class Employee {

    private final String surname;
    private final String name;
    private final String patronymic;
    private int department;
    private double salary;
    private static int countID = 1;
    private final int id;

    public Employee(String surname, String name, String patronymic, int department, double salary) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        this.id = countID++;
    }



    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public static int getCountID() {
        return countID;
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
        return "ID: " + id + ", ФИО: " + surname + " " + name + " " +
                patronymic + ", отдел №" + department + ", зарплата: " + salary;
    }
}
