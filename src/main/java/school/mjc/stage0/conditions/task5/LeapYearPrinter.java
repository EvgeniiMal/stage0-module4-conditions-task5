package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        if ((0 == year % 400) || (0 == year % 4 && 0 != year % 100)) {
            System.out.println("leap");
            return;
        }
        System.out.println("not leap");
    }
}
