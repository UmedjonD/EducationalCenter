package Realization;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class OutData {
    LocalDate currentDate =  LocalDate.now();
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public int out(String str){
        LocalDate date =  LocalDate.parse(str, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        int d = currentDate.getDayOfYear() - date.getDayOfYear();
        return d;
    }
}
