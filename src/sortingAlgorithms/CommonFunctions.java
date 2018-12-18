package sortingAlgorithms;


import java.util.Random;
import java.util.Scanner;

public class CommonFunctions {
	 
	 // A function that creates an array of random numbers of length i
		 public static int[]  RandomNumbers(int i){
		 Random r = new Random();
		 int[] ar1 = new int[i];
		 for(i = 0; i < ar1.length; i++) {
	            ar1[i] = r.nextInt(5000);
	            
	        }
		 
		 return ar1;
	 }
	 
	// A function that prints the numbers in the array
	  static void printNumbers(int[] input) {

	        for (int i = 0; i < input.length; i++) {
	            System.out.print(input[i] + ", ");
	        }
	        System.out.println("\n");
	    }
	  
	  
	 // A function that gets input from the user.
	 //In this case it gets the length of the array
	  static  int userInput() {
		  
		  Scanner reader = new Scanner(System.in);  // Reading from System.in
		  System.out.println("Enter the value: ");
		// Scans the next token of the input as an int.
		  int n = reader.nextInt(); 
		  reader.close();
		  return n;
	  }
	  
	  
	  // A function that copies the elements of array to other variable arrays
	  public static int[] DuplicateArray(int[] randomArray) {
		int[] DuplicateArray = new int [randomArray.length];
		for (int i = 0; i < randomArray.length; i++) {
        	DuplicateArray[i] = randomArray[i];
        	        }
	  return DuplicateArray;
	            
		
	}
	  
	  
	   // A function that reverses array
	      static int[] reverseArray(int inputArray[])
	      {
	          	           
	          int temp;
	          // Swaps the first n/2 elements in the array with the remaining
	          for (int i = 0; i < inputArray.length/2; i++) 
	          {
	              temp = inputArray[i];	               
	              inputArray[i] = inputArray[inputArray.length-1-i];	               
	              inputArray[inputArray.length-1-i] = temp;
	          }
	           
	          return inputArray;
	      }
	        

}
