public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        String fullName = "", firsName = "Ivan", middleName = "Ivanovich", lastName = "Ivanov";
        fullName = lastName + " " + firsName + " " + middleName;
        System.out.println("Ф.И.О сотрудника - " + fullName);

        System.out.println("Задача 2");

        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        System.out.println("Задача 3");

        fullName = "Иванов Семён Семёныч";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника - " + fullName);

    }
}



