import java.time.LocalDate;
import java.time.LocalTime;

class currentDateAndCurrentTime {
    
    static String currentDate(){
        int date, year;
        String month;
        LocalDate currentDate = LocalDate.now();

        date = currentDate.getDayOfMonth();
        month = currentDate.getMonth().toString();
        year = currentDate.getYear();

        return date + "/" + month + "/" + year;
    }

    static String currentTime(){
        LocalTime currentTime = LocalTime.now();
        int hour, min, sec;

        hour = currentTime.getHour();
        min = currentTime.getMinute();
        sec = currentTime.getSecond();

        return hour + ":" + min + ":" + sec;
    }

   

}
