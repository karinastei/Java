package Week1;

public class SecondsInAYear {
    public static void main(String[] args) {
        int secInMin = 60;
        int minInHour = 60;
        int hourInDay = 24;
        int dayInYear = 365;
        int result = secInMin * minInHour * hourInDay * dayInYear;
        System.out.print("There are " + result + " seconds in a year.");
    }
}
