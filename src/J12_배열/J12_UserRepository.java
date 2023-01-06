package J12_배열;

// 저장소
public class J12_UserRepository {
	
	private J12_User[] userTable;

	public J12_UserRepository(J12_User[] userTable) {
		this.userTable = userTable;
	}
	//배열 전부다 리턴해주는 메소드
	public J12_User[] getUserTable() {
		return userTable;
	}
	
	//유저 저장하는 메소드
	public void saveUser(J12_User user) { //외부로 user을받아와서 userTable에 저장해야함
//		userTable[0] = user; //유저담기 유저를 담기위해서 userTable이 계속해서 늘어나야한다.
		userTable[userTable.length - 1] = user;
	}
	//배열 여러개 확장 메소드
	private void extendArray(int length) {  //int length를 쓰고 밑에 + length를 쓰면 몇개를 올리는만큼 올라간다.
		J12_User[] newArray = new J12_User[userTable.length + length];
		transferDataToNewArray(userTable, newArray);// + 1을 하면 무조건 하나씩 올라간다.
		userTable = newArray;
	}
	//배열 하나씩 확장 메소드
	private void extendArrayOne() { 
		J12_User[] newArray = new J12_User[userTable.length + 1]; 
		transferDataToNewArray(userTable, newArray); // userTable 에 있는 것을 뉴Array에 다 옮겨라
		userTable = newArray; // 덮어써라
	}
	//배열 확장 될 때 실행되는 메소드
	private void transferDataToNewArray(J12_User[] oldArray, J12_User[] newArray) { //기존의 array 새로운 array
		for(int i = 0; i < oldArray.length; i++) {
			newArray[i] = oldArray[i];
		}
		
	}
	
}
