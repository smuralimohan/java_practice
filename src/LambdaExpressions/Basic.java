package LambdaExpressions;

import java.util.Arrays;
import java.util.function.*;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Basic {

	public static void main(String... args) {
		
		String[] arr = {"one", "two", "three", "four"};
		Arrays.sort(arr, (String s1, String s2) -> s1.length() - s2.length());
		Arrays.asList(arr).forEach(s->System.out.println(s));
	}
	
	
}
