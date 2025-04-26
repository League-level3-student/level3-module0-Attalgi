package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
    	String[] element = new String[5];
    	element[0] = "Uno";
    	element[1] = "Dos";
    	element[2] = "Tres";
    	element[3] = "Quatro";
    	element[4] = "Cinco";
        // 2. print the third element in the array
        System.out.println("String at element 3 is " + element[2]);
        // 3. set the third element to a different value
        element[2] = "Trees";
        // 4. print the third element again
        System.out.println("String at element 3 is " + element[2]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
        for (int i = 0; i < element.length; i ++) {
        	element[i] = "bozo";
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
        	System.out.println(element[i] + "!");
        }
        

        // 7. make an array of 50 integers
        int[] num = new int[50];
        int lowest = 1000;
        int highest = 0;
        // 8. use a for loop to make every value of the integer array a random
        //    number
        Random r= new Random();
        for (int i = 0; i < num.length; i ++) {
        	num[i] = r.nextInt(1000);
        	// 9. without printing the entire array, print only the smallest number
            //    on the array
        	if (lowest > num[i]) {
        		lowest = num[i];
        	}
        	if (highest < num[i]) {
        		highest = num[i];
        	}
        }
        // 10 print the entire array to see if step 8 was correct
        System.out.println(lowest);
        // 11. print the largest number in the array.
        System.out.println(highest);
        // 12. print only the last element in the array
        System.out.println(num[49]);
    }
}
