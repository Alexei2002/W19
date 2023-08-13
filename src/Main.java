// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] aregs) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        int clientOS = 11;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке».");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке».");
        } else{
            System.out.println("Ошибка");
        }
    }

    public static void task2(){
        int clientOS = 1;
        int deveiceYear = 2022;

        if (clientOS == 0){
            if (deveiceYear < 2015){
                System.out.println("Установите облегчённую версию приложения для iOS по ссылке».");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке».");
            }
        } else if (clientOS == 1) {
            if (deveiceYear <2015 ){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке».");
            }
        }
    }

    public static void task3(){
        int year = 2020;

        if ((year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0) {
            System.out.println("год является високосным");
        } else {
            System.out.println("год не является високосным");
        }
    }

    public static void task4(){
        int distance = 50;
        int time = 1;

        if (distance <= 20){
            time = 1;
        }else  if ( distance > 20 && distance <= 60) {
            time = 2;
        }else  if (distance > 60 && distance <= 100) {
            time = 3;
        }
        System.out.println(time);
    }
    public static void task5(){
        int month = 12;

        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Невозможный месяц");
        }
    }
}
