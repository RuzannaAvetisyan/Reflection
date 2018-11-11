package am.aca.reflection;
public class Main{
	public static void main(String[] args) throws IllegalAccessException {
		
		Swimmer mp = new Swimmer();
		System.out.println(GetFields.toJson(mp));
	}
}