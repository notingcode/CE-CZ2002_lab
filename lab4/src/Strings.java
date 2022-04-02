
import java.util.Scanner;

import labClasses.Sorting;
public class Strings
{
// --------------------------------------------
// Reads in an array of integers, sorts them,
// then prints them in sorted order.
// --------------------------------------------
public static void main (String[] args)
{
	Comparable[] StrList;
	int size;
	Scanner scan = new Scanner(System.in);
	System.out.print ("\nHow many String objects do you want to sort? ");
	size = scan.nextInt();
	StrList = new Comparable[size];
	System.out.println ("\nEnter the Strings...");
	for (int i = 0; i < size; i++)
		StrList[i] = scan.next();
		Sorting.insertionSort(StrList);
		System.out.println ("\nYour Strings in sorted order...");
	for (int i = 0; i < size; i++)
		System.out.print(StrList[i] + " ");
	System.out.println();
	}
}