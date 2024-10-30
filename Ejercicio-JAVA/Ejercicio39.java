
package yaz;
import java.time.LocalDateTime;
public class yaz39 {
	public static void main(String[] args) throws InterruptedException 	{   
		LocalDateTime locaDate = LocalDateTime.now();
		int hours  = locaDate.getHour();
		int minutes = locaDate.getMinute();
		int seconds = locaDate.getSecond();
		while(1==1) {
		System.out.print(hours+":"+minutes+":"+seconds+"\n");
		if(hours==24) {hours=0;minutes=0;seconds=0;}
		if(minutes==60) {hours+=1;minutes=0;}
		if(seconds==60) {minutes+=1;seconds=0;}
		Thread.sleep(1000);
		seconds+=1;
		}
	}
}
