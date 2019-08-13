// Exercise 10 on page 226

import java.util.Calendar;
 
public class DaysTilNextMonth {
  public static void main(String[] args)
  {
  Calendar calendar = Calendar.getInstance();
  int year = 2019;
  int month = Calendar.SEPTEMBER;
  int date = 1;
  calendar.set(year, month, date);
  int days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
  System.out.println("Number of Days: " + days);
  }
}