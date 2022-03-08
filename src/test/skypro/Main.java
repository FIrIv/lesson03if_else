package test.skypro;

public class Main {

    public static void main(String[] args) {

        // задание 1
        // переменная clientOS равна 0 — iOS, 1 — Android
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS ==1 ){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Ошибка");
        }
        System.out.println();

        // задание 2
        short clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке (телефон выпущен раньше 2015 года)");
            }
        } else if (clientOS ==1 ){
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке (телефон выпущен раньше 2015 года)");
            }
        } else {
            System.out.println("Ошибка");
        }
        System.out.println();

        // задание 3
        short year = 2021;
        if (year % 4 != 0 || (year % 4 == 0 && year % 100 == 0 && year % 400 != 0)){
            System.out.println (year + " год не является високосным");
        } else {
            System.out.println (year + " год является високосным");
        }
        System.out.println ();

        // задание 4
        // <=20км - 1 день, <=60км - 2 дня, <=100км - 3 дня и т.д.
        int deliveryDistance = 95;
        int distanseMin = 20;
        int distanseInterval = 40;
        int deliveryDays = 0;
        if (deliveryDistance <= distanseMin){
            deliveryDays = 1;
        } else {
            deliveryDays = (deliveryDistance - distanseMin)/ distanseInterval + 1;
            if ((deliveryDistance - distanseMin) % distanseInterval != 0) {
                deliveryDays += 1;
            }
        }
        System.out.println("Расстояние " + deliveryDistance + " км, доставка займет " + deliveryDays + " дн.");
        System.out.println ();

        // задание 5
        byte monthNumber = 12;
        switch (monthNumber){
            case 1:
                System.out.println(monthNumber + " месяц - январь, зима");
                break;
            case 2:
                System.out.println(monthNumber + " месяц - февраль, зима");
                break;
            case 3:
                System.out.println(monthNumber + " месяц - март, весна");
                break;
            case 4:
                System.out.println(monthNumber + " месяц - апрель, весна");
                break;
            case 5:
                System.out.println(monthNumber + " месяц - май, весна");
                break;
            case 6:
                System.out.println(monthNumber + " месяц - июнь, лето");
                break;
            case 7:
                System.out.println(monthNumber + " месяц - июль, лето");
                break;
            case 8:
                System.out.println(monthNumber + " месяц - август, лето");
                break;
            case 9:
                System.out.println(monthNumber + " месяц - сентябрь, осень");
                break;
            case 10:
                System.out.println(monthNumber + " месяц - октябрь, осень");
                break;
            case 11:
                System.out.println(monthNumber + " месяц - ноябрь, осень");
                break;
            case 12:
                System.out.println(monthNumber + " месяц - декабрь, зима");
                break;
            default:
                System.out.println(monthNumber + " месяц - не существует");
                break;
        }
        System.out.println ();


    }
}
