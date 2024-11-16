public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);

        int ONE_HOUR_IN_MINUTES = 60;
        int HOURS_IN_A_DAY = 24;

        String hours = "";
        String minutes = "";

        int totalMinutes;
        int totalHours;

        hours = "" + time.charAt(0) + time.charAt(1);
        minutes = "" + time.charAt(3) + time.charAt(4);

        totalMinutes = ONE_HOUR_IN_MINUTES * Integer.parseInt(hours) + Integer.parseInt(minutes) + minutesToAdd;
        totalHours = totalMinutes / ONE_HOUR_IN_MINUTES;
        int newHours = totalHours % HOURS_IN_A_DAY;
        int newMinutes = totalMinutes - (totalHours * ONE_HOUR_IN_MINUTES);

        String formattedHours = "" + newHours;
        String formattedMinutes = "" + newMinutes;

        if(newHours < 10) {
            formattedHours = "0" + formattedHours;
        }
        if(newMinutes < 10) {
            formattedMinutes = "0" + formattedMinutes;
        }

        System.out.println(formattedHours + ":" + formattedMinutes);
    }
}
