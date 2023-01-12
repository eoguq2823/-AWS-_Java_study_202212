package j17_스태틱;

public class SeriaalMain {

	public static void main(String[] args) {
		
		Car[] cars  = new Car[10];

		
		cars[0] = new Car("아반떼");
		cars[1] = new Car("소나타");
		cars[2] = new Car("그랜져");
		cars[3] = new Car("제네시스G80");
		cars[4] = new Car("제네시스GV80");
		cars[5] = new Car("제네시스G90");
		cars[6] = new Car("제네시스GV70");
		cars[7] = new Car("싼타페");
		cars[8] = new Car("스타렉스");
		cars[9] = new Car("투싼");
		
		for(int i = 0; i < cars.length; i ++) {
			System.out.println(cars[i]);
		}
	}
	
}
