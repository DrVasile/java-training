import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Intersection {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the times (format \"HH:MM\" or \"-\" for undefined time period) :");

        String start1 = scanner.next();
        String start2 = scanner.next();
        String end1 = scanner.next();
        String end2 = scanner.next();
        scanner.close();

        if (start1.equals("-") || start2.equals("-")) {
            System.out.println("-бесконечность");
            return;
        }

        if (end1.equals("-") || end2.equals("-")) {
            System.out.println("+бесконечность");
            return;
        }

        TimePeriod firstPeriod = new TimePeriod();
        TimePeriod secondPeriod = new TimePeriod();

        try {
            firstPeriod = new TimePeriod(LocalTime.parse(start1), LocalTime.parse(end1));
            secondPeriod = new TimePeriod(LocalTime.parse(start2), LocalTime.parse(end2));
        } catch (DateTimeParseException e) {
            e.printStackTrace();
            System.out.println("Invalid input!");
        }

        if (secondPeriod.getStartTime().isBefore(firstPeriod.getStartTime())) {
            swap(firstPeriod, secondPeriod);
        }

        computeIntersection(firstPeriod, secondPeriod);
    }

    private static void swap(TimePeriod first, TimePeriod second) {
        LocalTime aux = first.getStartTime();
        first.setStartTime(second.getStartTime());
        second.setStartTime(aux);
        aux = first.getEndTime();
        first.setEndTime(second.getEndTime());
        second.setEndTime(aux);
    }

    private static void computeIntersection(TimePeriod firstPeriod, TimePeriod secondPeriod) {

        if (firstPeriod.getEndTime().isBefore(secondPeriod.getStartTime())) {
            System.out.println("Пересечения нет");
            return;
        }

        if (firstPeriod.getEndTime().isBefore(secondPeriod.getEndTime())) {
            System.out.println(secondPeriod.getStartTime() + " " + firstPeriod.getEndTime());
            return;
        }

        if (firstPeriod.getEndTime().isAfter(secondPeriod.getEndTime())) {
            System.out.println(secondPeriod.getStartTime() + " " + secondPeriod.getEndTime());
        }
    }
}

class TimePeriod {

    private LocalTime startTime;
    private LocalTime endTime;

    TimePeriod() { }

    TimePeriod(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }
}
