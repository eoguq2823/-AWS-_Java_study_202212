package j16_Object;

//임시 클래스
class Test { //이패키지안에서만 참조변수를 쓸 수 있다. 학습을 위해 임시로 만들었으니 이렇게 쓰지말것
	private int num;
	
	public Test(int num) {
		super();
		this.num = num;
		System.out.println(num + "생성");
	}
	// 생성하면 힙메모리를 빌려오는데 어느 변수에서 참조해서 쓰지않으면 
	// 생성만 되면 쓰레기로 남아있는데 가비지 컬렉터가 이 메모리를 보고 소멸시킨다. 
	// 사용자가 직접 소멸 시키지는 못한다.
	// 가비지 컬렉터가 소멸이 되어 졌을 때 실행
	
	//finalize 소멸되면 안되는 경우 메모리에 할당 되었던 데이터를 복사해두고 살려둔다.
	@Override
	protected void finalize() throws Throwable {
		System.out.println(num + "객체 소멸");
	}
	

}
// 외부에서 참조할 수 있게 접근지정해준다.
// class명이랑 파일명이랑 같이야한다.
public class ObjectFinalize {
	
	public static void main(String[] args) {
		Test test = null;
		
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500); //빨간줄 싸라운드 위드캐치 포문에 여유를 주면 순차적으로 소멸시킨다.
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			test = new Test(i);
			
			test = null;
			//gc = 가비지컬렉터
			//실행한다고 바로 실행하는게 아니라 JVM이 여유가 있을때 소멸시킨다 (순서대로 소멸되지않는다.)
			System.gc(); //가비지컬렉터를 실행해라
		}
	}
}
