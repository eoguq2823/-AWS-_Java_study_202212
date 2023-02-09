package j26_쓰레드;

public class ThreadTest {

	public static void main(String[] args) {
 		LoopThread loopThread1 = new LoopThread("김상현");
		LoopThread loopThread2 = new LoopThread("강대협");
		LoopThread loopThread3 = new LoopThread("손지호");
		LoopThread loopThread4 = new LoopThread("김재영");
		
		loopThread1.setPriority(6);
		loopThread4.setPriority(7);
		
		//우선순위 확인 현재 5 ( 숫자가 높을수록 우선순위가 높다.)
		System.out.println(loopThread1.getPriority());
		System.out.println(loopThread2.getPriority());
		System.out.println(loopThread3.getPriority());
		System.out.println(loopThread4.getPriority());
		
		//쓰래드는 우선순위 다 같음
		loopThread1.start(); //start 가 실행 되면 run을 호출
		loopThread2.start();
		loopThread3.start();
		loopThread4.start();
	}
}
