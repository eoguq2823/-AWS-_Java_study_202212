package test1222;

public class Factory {
	private static Factory instance = null;
	
	private Factory() {}
	
	public static Factory getInstance() {
		if(instance == null) {
			instance = new Factory();
		}
		return instance;
	}
	
	public void factoryName() {
		System.out.println(getClass().getSimpleName());
	}
}
