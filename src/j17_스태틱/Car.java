package j17_스태틱;

import java.time.LocalDateTime;
import java.util.Date;

public class Car {

//	private final int NOW_YEAR = new Date().getYear();
	private static final int NOW_YEAR = LocalDateTime.now().getYear();
	
	
	private static final String CODE = "KIA-" + NOW_YEAR + "-";
	private static int ai = 1;
	
	private String seriaalCode; // KIA-2023-
	private String modelName;

/*	
 	% : 명령의 시작
	0 : 채워질 문자
	4 : 총 자리수
	d : 십진정수
*/
	public Car(String modelName) {
		seriaalCode = CODE + String.format("%04d", ai);
		this.modelName = modelName;		
		ai++;
	}

	@Override
	public String toString() {
		return "Car [seriaalCode=" + seriaalCode +
				", modelName=" + modelName + "]";
	}

	
	
	

	
	
}
