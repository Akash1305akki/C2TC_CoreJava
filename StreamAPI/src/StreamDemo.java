import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		// declare a collection to create a stream and use it
		List<Integer> inList = Arrays.asList(12,39,20,56,2,56,12);
		
		// creating a stream of relatable data for a declared collection
		Stream<Integer> streaminList = inList.stream();
		
		// returns the data address of created stream
		System.out.println("Our Stream is :"+streaminList);
		
		
		//map() method
		// map is used with lambda expression to create a stream of collection in it.
		Stream<Integer> squares = inList.stream().map(i->i*i);		
		Stream<Integer> doubletime = inList.stream().map(i->i+i);
		
		System.out.print("The Squares of inList are: ");	
		squares.forEach(n -> System.out.print(" "+n));
		System.out.println();
		
		System.out.print("The double of inList are: ");	
		doubletime.forEach(n -> System.out.print(" "+n));
		System.out.println();
		
		//We can also do the stream operation on a single line as follows:-
		System.out.print("Inside Single line map: ");
		inList.stream().map(i->i*i).forEach(n -> System.out.print(" "+n));
		System.out.println();
		
		//Possible Exception 1
		//squares.forEach(n -> System.out.print("\t"+n));
		//You can't reuse a stream
		
		//Possible Exception 2
		//System.out.println(squares.count());
		//You can't use multiple methods for a same stream	
		
		//sorted()
		Stream<Integer> sorted = inList.stream().sorted();
		
		System.out.print("The sorted stream is:");
		sorted.forEach(n -> System.out.print(" "+n));
		System.out.println();
		
		//We can also do the stream operation on a single line as follows:-
		System.out.print("Inside Single line sorted: ");
		inList.stream()
		          .sorted()
		          .forEach(n -> System.out.print(" "+n));
		System.out.println();
		//This indentation gives a clear idea about the code.
				
		//Reverse ordered stream
		System.out.print("Reversed Stream: ");
		inList.stream()
		          .sorted(Comparator.reverseOrder())
		          .forEach(n -> System.out.print(" "+n));
		System.out.println();
		//filter()		
		//filter method is used with lambda to suppress the list with a condition.

		System.out.print("Odd number stream has: ");
		inList.stream()
                 .filter(n -> n %2==1)//returns odd numbers in "inList"
                 .forEach(n -> System.out.print(" "+n));
		System.out.println();	
		
		System.out.print("Even number stream has: ");
		inList.stream()
                 .filter(n -> n %2==0)//returns even numbers in "inList"
                 .forEach(n -> System.out.print(" "+n));
		System.out.println();
		
		//reduce()		
		//reduce method gives some condition to reduce a given stream of value to a final single output as needed.

		System.out.print("Reduced stream additive output: ");
		int result = inList.stream()
				 .sorted()
                 .reduce(0, (c, e) -> c+e);
		System.out.print(result);
		System.out.println();

		//limit()		
		//limit method is used to suppress the list with printing only n values present initially and skipping the remaining values of the stream.

		System.out.print("Stream after limiting has: ");
		inList.stream()
                 .limit(3)
                 .forEach(n -> System.out.print(" "+n));;
		System.out.println();
		
		//skip()		
		//skip method is used to suppress the list with skip n values initially and printing the remaining values of the stream.

		System.out.print("Stream after Skip has: ");
		inList.stream()
                 .skip(1)
                 .forEach(n -> System.out.print(" "+n));;
		System.out.println();
		
		//distinct()		
		//distinct method is used to suppress the list by making a stream of only distinct values, does not allow repeated values.

		System.out.print("Distict full stream has: ");
		inList.stream()
                 .distinct()
                 .forEach(n -> System.out.print(" "+n));;
		System.out.println();
		
		//findFirst()		
		//findFirst method is used to suppress the list by a first occuring single value of stream which satisfies given condition.

		System.out.print("First number divisible by 5 in given stream is: ");
		System.out.print(inList.stream()
				                  .filter(i -> i%5==0)
                                  .findFirst()
                                  .orElse(0));
		// returns the first occurring number divisible by 5 in given list, if else returns 0 eventually.
		System.out.println();
	}

}