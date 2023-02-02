
public class Casting {
	public static void main(String[] args) {
		Program[] programs = new Program[2];
		programs[0] = new Java();
		programs[1] = new C();
		for(int i = 0; i < programs.length; i++) {
			if(programs[i] instanceof Java) {
				Java java = (Java) programs[i];
				java.develop();
				java.garbageCollection();
			}else if (programs[i] instanceof C) {
				C c = (C) programs[i];
				c.develop();
				c.garbageCollection();
			}
		}
	}
}
