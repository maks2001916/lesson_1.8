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
    public static void main(String[] args) {
        int currentYear = LocalDate.now().getYear();
        findingALeapYear(currentYear);
        int result = findingALeapYear(currentYear);
        if (result == 0) {
            System.out.println(currentYear + " - високосный год");
        } else {
            System.out.println(currentYear + " - не високосный год");
        }
    }
}