
package week04CodingAssignment;

import java.util.Scanner;

public class Week04CodingAssigment {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
// Question 1:
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		System.out.println((ages[ages.length-1]) - ages[0]);    // Subtract first index element from last element. 
		
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 103}; 
		System.out.println((ages2[ages2.length-1]) - ages2[0]);  // Subtract first index element from last element. 
		
		System.out.println(ages[4]);
		System.out.println(ages[2]);
		System.out.println(ages[7]);
		
		int sum = 0; 
		int average = 0;
		for(int i=0; i<ages2.length; i++) {						// Iterate loop for calculation of the average. 
			sum+=ages2[i]; 
			average=sum/ages2.length;	
		} System.out.println("result: " + average);
		
// Question 2:
		
		String[] names =  new String[]  {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int sum1= 0;
		String result1 = "";
		for (String name : names) {
			sum1+=name.length();								// Adding up the length of each strings.
			result1 += (name + " ") ;							// Concat the names from a array. 
			
			
		} System.out.println("Average no of letters per name: " + sum/names.length);
		
		System.out.println(result1);
		
// Question 3: 
		/*
		 * The last element of the array can be assessed by using arrayName[array.length-1];   
		 */
	
// Question 4: 
		
		/*
		 * The first element of the array can be assessed by using arrayName[0];
		 */
	
		
// Question 5: 
		
		int[] namesLength = new int[names.length];
		
		for (int i=0; i<names.length; i++) { 							// Iterate to access the length of each string 
		namesLength[i] =(names[i]).length();							// Making new array consisting of the length of each element of the string array. 
		System.out.println(namesLength[i]); 							// Printing the element of new array using the loop. 
		}
		
		 
// Question 6: 
		
		int sumNew=0;
		
		for (int length : namesLength) {
			sumNew=+length;
		} System.out.println(sumNew);
		
		//		String[] strArray= {"James", "Brown", "Smith"};
		//		System.out.println(sumOfNamesLength(strArray)); 		// Calling the method to sum each string in a string array. 
		
// Question 7: 
		System.out.println(multiplyString("James", 3));					// Calling method to print the name 3 times. 
		
// Question 8:
		
		System.out.println(fullName ("James ", "Brown"));				// Calling method to concat the names to make full name. 
		
// Question 9:
		
		int[] numberArray = {1,2,3,4,97};
		System.out.println(isGreaterThan100(numberArray));     			// Calling method to find if the sum of integers in an array is greater than 100. 
		
		
		
// Question 10; 
		
		double[] uArray = {13.10, 23.4, 34.0};
		System.out.println(averageElementInArray(uArray));      		// Calling method to calculate average character in each string of array. 
		
// Question 11
		
		double[] array1 = {13.10, 23.4, 34.0};
		double[] array2 = {12.10, 23.4, 34.0};
		System.out.println(checkArray(array1, array2));       			// Calling method to check if the sum of each element in first array is greater than that of second array. 
		
// Question 12
		
		boolean hotWeather = true; 
		double money =12; 
		System.out.println(willBuyDrink(hotWeather,money));    			// Calling method to decide whether to buy drink based on the weather condition and the money in the pocket. 
		
// Question 13
		
				System.out.println("Enter the temp: ");
				System.out.printf("%.2f",feherenhitToCelsius(sc.nextDouble()));   // Calling method to convert temperature from one unit to another by letting the user enter the temperature for conversion. 
	
		
		
	
	} // End of main method
	

// Method 13
	public static double feherenhitToCelsius (double a) {  
		double result = (a-32) * (0.505 ); 
		return result;													// Returning result to calculate the temperature to another unit. 
	}   
	
// Method 12
	
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) { 
		if ((isHotOutside==true) && (moneyInPocket > 10.5)) {
			
		} return true; 													// Creating method to decide whether to buy drink based on the money and the weather condition. 
		
	}
		
// Method 11
	
	public static boolean checkArray (double[] arr, double[] arr1) { 
		double av=0;
		double av1=0;
		for (double ar : arr) {
			av+=ar;	
		}
		for (double ar1 : arr1) {
			av1+=ar1;
		} 
			return ((av/arr.length) > (av1/arr1.length));     			// Returning true or false to check the sum of first array is greater or not. 
			
	}
		
	
// Method 10
	
	public static double averageElementInArray (double[] arr) {
		double sum = 0; 
		for (double ar : arr) {
			sum+=ar; 
		} return sum/arr.length;										// returning the average elements in an array. 
	}
	
// Method 9
	
	public static boolean isGreaterThan100 (int[] a) {
		int sum=0;
		for (int element : a) {
			sum+=element; 
		} return (sum>100);												// Method to find if the sum of integer array is greater than 100 or not. It returns true or false. 
	}
	
// Method 8
	
	public static String fullName (String firstName, String lastName) {  // Method to concat the names to form full name. 
		return firstName.concat(lastName); 
	} 
	
// Method 7
	
	public static String multiplyString (String word, int a) {      // Method to multiply the string given number of times. 
		String result = "";
		for (int i=1; i<=a; i++) {
			result+=word; 
			if(a!=0) {
				result+=" ";
			}
		} return result;
		
	}
	
// Method 6
	
	public static int sumOfNamesLength (String[] names) {      		// method to find the sum of length of the names in string array. 
		int[] lengthNames = new int[names.length];
		int sum = 0; 
		
		for (int i=0; i<names.length; i++) {
			lengthNames[i] = (names[i]).length(); 	
		} 
		for (int name : lengthNames) {
			sum+=name; 
		}
		return sum; 
	} 
		
} // End of class
