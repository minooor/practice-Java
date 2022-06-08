import java.text.SimpleDateFormat;
import java.util.Calender;
import java.util.Date;

public class Main {
  public static void main(String[] args) {
    Date now = new Date();
    Calender c = Calender.getInstance();
    c.setTime(now);
    int day = c.get(Calender.DAY_OF_MONTH);
    //取得した値に100を足して日にセット
    day += 100;
    c.set(Calender.DAY_OF_MONTH, day);
    Date future = c.getTime();
    SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
    System.out.println(f.format(future));
  }
}