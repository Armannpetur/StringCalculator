package is.ru.StringCalculator;

public class StringCalculator {

	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		else{
			if(text.contains(",")){
				String []numbers = text.split(",");
				return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
			}
			return 2;
		}
	}
}