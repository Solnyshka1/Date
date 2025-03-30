import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;

class Date implements Comparable<Date> {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        if (isValidDate(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            throw new IllegalArgumentException("Invalid date");
        }
    }

    public boolean isValidDate(int day, int month, int year) {
        if (month < 1 || month > 12 || day < 1) return false;

        int[] daysInMonth = {31, (isLeapYear(year) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return day <= daysInMonth[month - 1];
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public void updateDate(int day, int month, int year) {
        if (isValidDate(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            System.out.println("Invalid date update attempted.");
        }
    }

    public String getDayOfWeek() {
        return LocalDate.of(year, month, day).getDayOfWeek().toString();
    }

    public long calculateDifference(Date otherDate) {
        LocalDate thisDate = LocalDate.of(this.year, this.month, this.day);
        LocalDate thatDate = LocalDate.of(otherDate.year, otherDate.month, otherDate.day);
        return ChronoUnit.DAYS.between(thisDate, thatDate);
    }

    public void printDate() {
        System.out.printf("%s %d, %d\n", java.time.Month.of(month), day, year);
    }

    @Override
    public int compareTo(Date other) {
        if (this.year != other.year) {
            return Integer.compare(this.year, other.year);
        } else if (this.month != other.month) {
            return Integer.compare(this.month, other.month);
        } else {
            return Integer.compare(this.day, other.day);
        }
    }
}
