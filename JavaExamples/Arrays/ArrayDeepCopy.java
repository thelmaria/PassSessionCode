import java.util.Arrays;

/**
 * This demonstrates a method for making a deep copy of an array
 * using int's as an example.
 *
 */
public class ArrayDeepCopy {

	/**
	 * Makes a deep copy of an array.
	 * 
	 * @param array1 the array to be copied.
	 * @return a duplicate of array1.
	 */
	public static int[] deepCopy(int[] array1) {
		// Array to copy too.
		// Get size of array1 (length)
		int[] array2 = new int[array1.length];
		
		for(int i = 0; i < array1.length; i++) {
			array2[i] = new Integer(array1[i]);
		}
		
		return array2;
	}
	
	public static void main(String[] args) {
		// What I use to separate in the console, you will notice if you run the program.
		String separator = "-------------------------------------";
		
		// when example2 = example1 this just tells Java
		// to refer to the object contained in example1.
		// Therefore any changes to example1 will change example2
		// and vice versa.
		int[] example1 = {1,2,3};
		int[] example2 = example1;
		
		System.out.println(separator);
		System.out.println("Copying the object.");
		System.out.println(separator);
		
		// Java pre-built methods to print arrays.
		// CHALLENGE: Try make this method yourself!!
		System.out.println("example1: " + Arrays.toString(example1));
		System.out.println("example2: " + Arrays.toString(example2));
		System.out.println(separator);
		
		// Example change.
		example1[0] = 0;
		
		// Print off to show results.
		System.out.println("example1: " + Arrays.toString(example1));
		System.out.println("example2: " + Arrays.toString(example2));
		
	}

}
