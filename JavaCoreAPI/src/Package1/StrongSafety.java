package Package1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class StrongSafety {
	
	public static void main(String[]args) {
		
		String lastInspectionDate = "2024-03-01";
		System.out.println(daysUntilNextInspection(lastInspectionDate));
	}
	
	public static long daysUntilNextInspection(String lastInspectionDate) {
		LocalDate ladtInspection = LocalDate.parse(lastInspectionDate);
		
		LocalDate nextInspection = ladtInspection.plusDays(45);
		
		LocalDate today = LocalDate.now();
		
		return ChronoUnit.DAYS.between(today,nextInspection);
	}

}
