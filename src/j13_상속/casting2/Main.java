package j13_상속.casting2;

public class Main {

	public static void main(String[] args) {
		Taxi taxi = new Taxi();
		Subway subway = new Subway();
		
		Transportation transportation = new Transportation(); 
//		Taxi t1 = (Taxi) transportation; //안되는 다운캐스팅 택시라는 자료형은 택스클라스와 
		//트랜클라스와 의 조합으로 만들어졋는데 트랜에는 택시가 없기때문에 택시형태로 변할수 없다.
		
		Transportation transportation1 = taxi; //업캐스팅
//		Subway s1 = (Subway) transportation1; // 서브웨이를 택시로 바꿔서 사용 불가

		Transportation transportation2 = subway;
		
//		taxi.checkTaxiNember(); 부모가 가지고 있는 것만 사용가능하다.
//		transportation1.체크텍시넘벌이 없음
		
		Transportation[] transportations = new Transportation[6];
		
		transportations[0] = taxi;
		transportations[1] = subway;
		transportations[2] = taxi;
		transportations[3] = subway;
		transportations[4] = taxi;
		transportations[5] = subway;
		
		//업캐스팅이 된 후에 다운캐스팅을 해야한다.
		//본래의 모습으로 돌아갈때만 다운캐스팅이 가능하다.
		for(int i = 0; i < transportations.length; i++) {
			if(transportations[i]  instanceof Taxi) {
				Taxi tx = (Taxi) transportations[i]; //다운캐스팅 
				tx.checkTaxiNember();
		}else if(transportations[i] instanceof Subway) {
				Subway sb = (Subway) transportations[i];
				sb.checkRoute();
		}
		transportations[i].go(); 
		}
		// 중앙제어시스템 
		for(Transportation t : transportations) {
			t.stop();
		}
	}

}
