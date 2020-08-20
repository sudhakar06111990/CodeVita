import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Program_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l=Arrays.asList("Ram","Lovely","Zaheda");
		List<String> l1=l.stream().sorted().collect(Collectors.toList());
		l1.forEach(System.out::println);
		
	}

}
