import java.util.GregorianCalendar;

public class PE_905_GREGORIANCALENDAR {
    public static void main(String[] args) {
        // Create a GregorianCalendar instance
        GregorianCalendar calendar = new GregorianCalendar();

        // Display the current year, month, and date
        System.out.println("Year is " + calendar.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + calendar.get(GregorianCalendar.MONTH));
        System.out.println("Date is " + calendar.get(GregorianCalendar.DATE));

        // Set time in milliseconds and display the new year, month, and date
        calendar.setTimeInMillis(1234567898765L);
        System.out.println("Year is " + calendar.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + calendar.get(GregorianCalendar.MONTH));
        System.out.println("Date is " + calendar.get(GregorianCalendar.DATE));
    }
}