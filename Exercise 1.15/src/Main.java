public class Main {
    public static void main(String[] args) {
        final int dayOfWeek = 4;

        System.out.println(dayOfWeek + " as weekday is: " + GetDayOfTheWeekFromInt(dayOfWeek));

    }

    public static String GetDayOfTheWeekFromInt(int dayOfWeek)
    {
        switch (dayOfWeek)
        {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Error";
        }
    }
}