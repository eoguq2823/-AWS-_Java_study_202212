package j20_JSON;

import com.google.gson.Gson;

public class Json1 {

	public static void main(String[] args) {
		
		Gson gson = new Gson();
		
//		System.out.println(Integer.valueOf("100") + 50);
//		System.out.println(Integer.parseInt("100") + 50);
		
		gson.toJson(null); // object -> json
		gson.fromJson("", Object.class); // json -> object
		
	}
}
