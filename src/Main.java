import java.time.LocalDate;

public class Main {
    //Первое задание
    public static int findingALeapYear(int currentYear) {
        int variable = 0;
        if (currentYear % 4 == 0 && currentYear % 100 != 0 || currentYear % 400 == 0) {
             variable = 0;
        } else {
             variable = 1;
        }
        return variable;
    }
    public static int yearOfProduction(int year) {
        int ratio = 0;
        if (year <= 2015) {
            ratio = 0;
        } else {
            ratio = 1;
        }
        return ratio;
    }
    public static void main(String[] args) {
        int currentYear = LocalDate.now().getYear();
        findingALeapYear(currentYear);
        int result = findingALeapYear(currentYear);
        if (result == 0) {
            System.out.println(currentYear + " - високосный год");
        } else {
            System.out.println(currentYear + " - не високосный год");
        }
        //Второе задание
        int clientOC = 1;
        int currentYearTwo = LocalDate.now().getYear();;
        yearOfProduction(currentYearTwo);
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
    }

}