package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<String> names = new ArrayList<>();
//        
//		names.add("David");
//		         
//		names.add("Johnson");
//		         
//		names.add("Samontika");
//		         
//		names.add("Brijesh");
//		         
//		names.add("John"); 
//		         
//		//Normal Execution
//		         
//		names.stream().filter((String name) -> name.length() > 5).skip(2).forEach(System.out::println);
//		         
//		//Parallel Execution
//		         
//		names.parallelStream().filter((String name) -> name.length() > 5).skip(2).forEach(System.out::println);


//		Stream<Student> emptyStream = Stream.empty();
//        
//		System.out.println(emptyStream.count());
		Stream<Integer> streamOfNumbers = Stream.of(7, 2, 6, 9, 4, 3, 1);
        
		System.out.println(streamOfNumbers.count());
		
		List<String> listOfStrings = new ArrayList<>();
        
		listOfStrings.add("One");
		         
		listOfStrings.add("Two");
		         
		listOfStrings.add("Three");
		         
		listOfStrings.stream().forEach(System.out::println);
		
		List<String> names = new ArrayList<>();
        
		names.add("David");
		         
		names.add("Johnson");
		         
		names.add("Samontika");
		         
		names.add("Brijesh");
		         
		names.add("John");
		         
		//Selecting names containing more than 5 characters
		         
//		names.stream().filter((String name) -> name.length() > 5).forEach(System.out::println);
//		names.stream().filter((String name) -> name.length() > 5).forEach(System.out::println);
//		names.stream().distinct().forEach(System.out::println);
//		names.stream().limit(4).forEach(System.out::println);
//		names.stream().skip(4).forEach(System.out::println);
//        names.stream().map(String::length).forEach(System.out::println);
//        names.stream().sorted().forEach(System.out::println);
//        names.stream().sorted((String name1, String name2) -> name1.length() - name2.length()).forEach(System.out::println);
//        int sum = Arrays.stream(new int[] {7, 5, 9, 2, 8, 1}).reduce(0, (a, b) -> a+b);
//        System.out.println(sum);
//        OptionalInt min = Arrays.stream(new int[] {7, 5, 9, 2, 8, 1}).min();
//        System.out.println(min);
//        OptionalInt max = Arrays.stream(new int[] {7, 5, 9, 2, 8, 1}).max();
//        System.out.println(max);
//        long noOfBigNames = names.stream().filter((String name) -> name.length() > 5).count();
//        
//        System.out.println(noOfBigNames);
//        
//      //Storing first 3 names in a mutable container 
//        
//       // List<String> first3Names = names.stream().limit(3).collect(Collectors.toList());
//                 
//        //System.out.println(first3Names);
		 //before methods

//        if(names.stream().anyMatch((String name) -> name.length() == 5))
//        {
//            System.out.println("Yes... There is a name exist with 5 letters");
//        }
//        
//        if(names.stream().noneMatch((String name) -> name.length() == 2))
//        {
//            System.out.println("There is no two letter name");
//        }
//
//        Optional<String> firstElement = Stream.of("First", "Second", "Third", "Fourth").findFirst();
//        System.out.println(firstElement);
//        // wrapped in optional object
//        
//        Optional<String> anyElement = Stream.of("First", "Second", "Third", "Fourth").findAny();
//        System.out.println(anyElement);
//     
//        Stream.of("First", "Second", "Second", "Third", "Fourth").limit(3).distinct().forEach(System.out::println);
//		
//        Object[] streamArray = names.stream().limit(3).toArray();
//        
//        System.out.println(Arrays.toString(streamArray));
        
        names.stream()
        .filter(name -> name.length() > 5)
        .peek(e -> System.out.println("Filtered Name :"+e))
        .map(String::toUpperCase)
        .peek(e -> System.out.println("Mapped Name :"+e))
        .toArray();



	}

}
