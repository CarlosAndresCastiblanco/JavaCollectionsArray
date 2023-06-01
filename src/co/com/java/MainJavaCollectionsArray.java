/**
 * 
 */
package co.com.java;

import java.util.Collection;

/**
 * @author carlos.castiblanco
 *
 */
public class MainJavaCollectionsArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * Declarations with primitive data types
		 * 
		 */
		
		int intArray[]; 
		// Optional Sintax
		int[] intArrayT;
		// Optional Sintax
		byte byteArray[];
		short shortsArray[];
		boolean booleanArray[];
		long longArray[];
		float floatArray[];
		double doubleArray[];
		char charArray[];

		/*
		 * Declarations with specific Class
		 * 
		 */
		MyClass myClassArray[];
		/*
		 * Declarations with super Object Class
		 * 
		 */
		Object[]  ao;
		/*
		 * Declarations with Collection Interface
		 * 
		 */
		Collection[] ca;
		/*
		 * Allocated values inside the previous declaration
		 * 
		 */
		int intsArray[];    //declaring array
		intsArray = new int[20];  // allocating memory to array
		
		int[] inteArray = new int[20]; // combining both statements in one
		
		int[] intcArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; // Declaring array literal
		
	}

}

class MyClass {
}

class GFG {
	public static void main(String[] args)
	{
		// declares an Array of integers.
		int[] arr;

		// allocating memory for 5 integers.
		arr = new int[5];

		// initialize the first elements of the array
		arr[0] = 10;

		// initialize the second elements of the array
		arr[1] = 20;

		// so on...
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		// accessing the elements of the specified array
		for (int i = 0; i < arr.length; i++)
			System.out.println("Element at index " + i
							+ " : " + arr[i]);
	}
}

//Java program to illustrate creating
//an array of objects

class Student {
	public int roll_no;
	public String name;
	Student(int roll_no, String name)
	{
		this.roll_no = roll_no;
		this.name = name;
	}
}

//Elements of the array are objects of a class Student.
class GFGO {
	public static void main(String[] args)
	{
		// declares an Array of integers.
		Student[] arr;

		// allocating memory for 5 objects of type Student.
		arr = new Student[5];

		// initialize the first elements of the array
		arr[0] = new Student(1, "aman");

		// initialize the second elements of the array
		arr[1] = new Student(2, "vaibhav");

		// so on...
		arr[2] = new Student(3, "shikar");
		arr[3] = new Student(4, "dharmesh");
		arr[4] = new Student(5, "mohit");

		// accessing the elements of the specified array
		for (int i = 0; i < arr.length; i++)
			System.out.println("Element at " + i + " : "
							+ arr[i].roll_no + " "
							+ arr[i].name);
	}
}

//Java program to illustrate creating
//an array of objects

class StudentE
{
	
	public String name;
	StudentE(String name)
	{
		this.name = name;
	}
	@Override
	public String toString(){
		return name;
	}
}

//Elements of the array are objects of a class Student.
class GFGE
{
	public static void main (String[] args)
	{
		// declares an Array and initializing the elements of the array
		StudentE[] myStudents = new StudentE[]{new StudentE("Dharma"),new StudentE("sanvi"),new StudentE("Rupa"),new StudentE("Ajay")};

		// accessing the elements of the specified array
		for(StudentE m:myStudents){
			System.out.println(m);
		}
	}
}

//Code for showing error "ArrayIndexOutOfBoundsException"

class GFGERR {
	public static void main(String[] args)
	{
		int[] arr = new int[4];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;

		System.out.println(
			"Trying to access element outside the size of array");
		System.out.println(arr[5]);
	}
}

class multiDimensional {
	public static void main(String args[])
	{
		// declaring and initializing 2D array
		int arr[][]
			= { { 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } };

		// printing 2D array
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++)
				System.out.print(arr[i][j] + " ");

			System.out.println();
		}
	}
}

//Java program to demonstrate
//passing of array to method

class PassingOfArrayToMethod {
	// Driver method
	public static void main(String args[])
	{
		int arr[] = { 3, 1, 2, 5, 4 };

		// passing array to method m1
		sum(arr);
	}

	public static void sum(int[] arr)
	{
		// getting sum of array values
		int sum = 0;

		for (int i = 0; i < arr.length; i++)
			sum += arr[i];

		System.out.println("sum of array values : " + sum);
	}
}


//Java program to demonstrate
//return of array from method

class ReturnOfArrayFromMethod {
	// Driver method
	public static void main(String args[])
	{
		int arr[] = m1();

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static int[] m1()
	{
		// returning array
		return new int[] { 1, 2, 3 };
	}
}

//Java program to demonstrate
//Class Objects for Arrays

class ObjectsForArrays {
	public static void main(String args[])
	{
		int intArray[] = new int[3];
		byte byteArray[] = new byte[3];
		short shortsArray[] = new short[3];

		// array of Strings
		String[] strArray = new String[3];

		System.out.println(intArray.getClass());
		System.out.println(
			intArray.getClass().getSuperclass());
		System.out.println(byteArray.getClass());
		System.out.println(shortsArray.getClass());
		System.out.println(strArray.getClass());
	}
}

//Java program to demonstrate
//cloning of one-dimensional arrays

class Cloning {
	public static void main(String args[])
	{
		int intArray[] = { 1, 2, 3 };

		int cloneArray[] = intArray.clone();

		// will print false as deep copy is created
		// for one-dimensional array
		System.out.println(intArray == cloneArray);

		for (int i = 0; i < cloneArray.length; i++) {
			System.out.print(cloneArray[i] + " ");
		}
	}
}

//Java program to demonstrate
//cloning of multi-dimensional arrays

class CloningOfMultiDimensional {
	public static void main(String args[])
	{
		int intArray[][] = { { 1, 2, 3 }, { 4, 5 } };

		int cloneArray[][] = intArray.clone();

		// will print false
		System.out.println(intArray == cloneArray);

		// will print true as shallow copy is created
		// i.e. sub-arrays are shared
		System.out.println(intArray[0] == cloneArray[0]);
		System.out.println(intArray[1] == cloneArray[1]);
	}
}





