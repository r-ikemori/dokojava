package dokojava15;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 LocalDate now = LocalDate.now();
		 LocalDate future = now.plusDays(100);
		 DateTimeFormatter fmt =
				 DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		 System.out.println(future.format(fmt));
		 

	}

}
