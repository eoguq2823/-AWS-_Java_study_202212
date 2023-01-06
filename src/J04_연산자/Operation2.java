package J04_연산자;

public class Operation2 {
	public static void main(String[] args) {
		int num = 10;
		
		num = num +1;

//		++num; //12

//		num++; //앞에 ++num결과값에서 num++이 더해짐

//		System.out.println(num);

//		System.out.println(++num); 앞쪽에서 ++(1)을 더함 (선증가)
		
		System.out.println(num++); //(후증가)
		//넘에 11이 들어있고 더하는 과정은 뒤로 빠진다 현재 변수에는 11이 들어있기때문에 11이 출력된다
		System.out.println(num);
		//뒤에 따로 출력하면 1이 더해진 상태로 출력된다.
		
	}
}
