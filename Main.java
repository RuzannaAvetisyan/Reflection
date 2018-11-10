public class Main{
	public static void main(String[] args) throws IllegalAccessException {
		
		Swimmer mp = new Swimmer();
		String s = GetFields.toJson(mp);

		System.out.println(s);
	}
}