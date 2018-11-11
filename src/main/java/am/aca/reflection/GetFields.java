package am.aca.reflection;
import java.lang.reflect.Field;

public class GetFields{
	public static String toJson(Object o)throws IllegalAccessException{
		Class<?> sc = o.getClass();
		Field[] fields = sc.getDeclaredFields();
		int length = fields.length;
		String jsonString = new String("{");

		for (int i = 0; i < length; ++i){
			if(fields[i].isAnnotationPresent(Transient.class)){
				continue;
			}
			fields[i].setAccessible(true);
			String fieldName =  fields[i].getName(); 
			Object fieldValue = fields[i].get(o);
			String s = new String("\t\"" + fieldName + "\" : \"" + fieldValue + "\"");
			jsonString += s;
			if(i != length - 1){
				jsonString += ",\n";
			}else{
				jsonString += "\n";
			}

		}

		jsonString +="}";
		return jsonString;

	}
}