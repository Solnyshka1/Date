import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Date> dateList = new ArrayList<>();

        try {
            dateList.add(new Date(15, 8, 2021));
            dateList.add(new Date(5, 12, 2020));
            dateList.add(new Date(29, 2, 2024)); // Leap year
            dateList.add(new Date(1, 1, 2023));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Before sorting:");
        for (Date d : dateList) {
            d.printDate();
        }

        Collections.sort(dateList);

        System.out.println("\nAfter sorting:");
        for (Date d : dateList) {
            d.printDate();
        }

        Date d1 = new Date(10, 10, 2023);
        Date d2 = new Date(25, 12, 2023);

        System.out.println("\nDay of the week for first date: " + d1.getDayOfWeek());
        System.out.println("Difference in days: " + d1.calculateDifference(d2));
    }
}
