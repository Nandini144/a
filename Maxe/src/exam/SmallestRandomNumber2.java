/*Generate 500 random numbers and print the Nth smallest
 *  number in a programming language of your choice.
 *   (Ask user for the Nth smallest number)*/
//Getting smallest number from ascendingly 
//sorted random numbers which includes duplicates.
//Version 2(Short Version)
package exam;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class SmallestRandomNumber2 {

	public static void main(String[] args) {
		System.out.print("Enter the integer number N to generate Nth smallest number : ");
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		// Creating object for random numbers
		Random rand = new Random();
		// creating an array list of Integers
		ArrayList<Integer> randArr = new ArrayList<Integer>();
		// Adding random numbers to the list
		int i = 0;
		while (randArr.size() < 500) {
			randArr.add(i, rand.nextInt(1000));
			i++;
		}
		System.out.println("Integer array list : " + randArr);

		// Sorting ArrayList
		Collections.sort(randArr);

		System.out.println("Sorted Array List : " + randArr);
		System.out.println("Size of the sorted List: " + randArr.size());
		System.out.println(N + "th smallest number : " + randArr.get(N - 1));

	}

}
