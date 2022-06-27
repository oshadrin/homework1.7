import java.util.Locale;

public class Main {
    public static void main(String[] args) {
    task1();
    task2();
    task3();
    }

    public static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);
    }

    public static void task2() {
        String fullName = "Ivanov Ivan Ivanovich";
        String newFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + newFullName);
    }

    public static void task3() {
        String fullName = "Иванов Семён Семёнович";
        String newFullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + newFullName);
    }
}