import java.time.LocalDate;

public class Main {
    //Первое задание
    private static int findingALeapYear(int currentYear) {
        int isLeapYear = 0;
        if (currentYear % 4 == 0 && currentYear % 100 != 0 || currentYear % 400 == 0) {
            isLeapYear = 0;
        } else {
            isLeapYear = 1;
        }
        return isLeapYear;
    }
    private static int yearOfProduction(int year) {
        int ratio = 0;
        if (year <= 2015) {
            ratio = 0;
        } else {
            ratio = 1;
        }
        return ratio;
    }
    private static int determiningTheDistance(int distance) {
        int days = 0;
        if (distance <= 20) {
            days ++;
        }
        if (distance >= 20 && distance <= 60 ) {
            days += 2;
        }
        if (distance >= 60 && distance <= 100) {
            days += 3;
        }
        return days;
    }
    private static int buildingAMessage(int clientOSTwo) {
        int clientOC = clientOSTwo;
        int currentYearTwo = LocalDate.now().getYear();
        int yearOfProductionTwo = yearOfProduction(currentYearTwo);
        if (yearOfProductionTwo == 0 && clientOC == 1 ) {
            System.out.println("Установите облегчённую версию приложения для Android");
        } else if (yearOfProductionTwo == 0 && clientOC == 0 ) {
            System.out.println("Установите облегчённую версию приложения для IOS");
        }
        if (yearOfProductionTwo == 1 && clientOC == 1 ) {
            System.out.println("Установите мобильную версию прриложения для Android");
        } else if (yearOfProductionTwo == 1 && clientOC == 0) {
            System.out.println("Установите мобильную версию приложения для IOS");
        }
        return currentYearTwo;
    }
    public static void main(String[] args) {
        int currentYear  = LocalDate.now().getYear();
        int result = findingALeapYear(currentYear);
        if (result == 0) {
            System.out.println(currentYear + " - високосный год");
        } else {
            System.out.println(currentYear + " - не високосный год");
        }
        //Второе задание
        int clientOC = 1;
        int clientOSTwo = buildingAMessage(clientOC);
        System.out.println(clientOSTwo);
        //Третье задание
        int deliveryDistance = 95;
        int deliveryDays = determiningTheDistance(deliveryDistance);
        System.out.println("Потребуется дней " + deliveryDays);
    }


}