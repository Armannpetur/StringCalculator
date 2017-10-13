package is.ru.StringCalculator;

import java.util.*;
import java.util.ArrayList;

public class StringCalculator {

	public static int add(String text){

		if(text.contains(",") || text.contains("\n") || text.contains(";")){
			return getSum(text);
		}
		else{
			return toInt(text);
		}
	}


	private static int toInt(String number){
		if(number.equals("") || Integer.parseInt(number) > 1000 || number.contains("//")){
			return 0;
		}
		else{
			return Integer.parseInt(number);
		}
	}

	private static void NegNumbMessage(ArrayList<String> NegNumbers){
		StringBuilder sb = new StringBuilder("Negatives not allowed: ");
		for(String numb : NegNumbers){
			sb.append(numb);
			sb.append(",");
		}
		sb.setLength(sb.length() - 1);
		throw new RuntimeException(sb.toString());
	}

	private static int getSum(String text){
		text = text.replaceAll("\n", ",");
		String []numbers = text.split(",");
		int sum = 0;
		boolean isNegative = false;
		ArrayList<String> NegNumbers = new ArrayList<String>();
		for(String numb : numbers){
			
			if(numb.isEmpty() || numb.contains("/")){
				continue;
			}
			if(toInt(numb) < 0){
				NegNumbers.add(numb);
				isNegative = true;
			}
			if(!isNegative){
				sum +=toInt(numb);
			}
		}

		if(isNegative){	
			NegNumbMessage(NegNumbers);
		}
		else{
			return sum;
		}

		return 0;	
	}

}