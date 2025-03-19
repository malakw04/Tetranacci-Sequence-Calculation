import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;

/**
 * @author Malak Abdelkafy(40235257)
 * COMP 352
 * Assignment 1
 * Due Date: October 3, 2023
 *
 */
public class TetraLin {
	
	/**
	 * 
	 * @param n Integer.
	 * @return The n-th Tetranacci number
	 * 
	 * This method recursively calculates the n-th Tetranacci number using linear recursion.
	 */
	public static BigInteger Tetranacci2(int n) {
		
		
		BigInteger A[] = new BigInteger[n+1];
	        	A[0] = BigInteger.ZERO;
	        	A[1] = BigInteger.ZERO;
	        	A[2] = BigInteger.ZERO;
	        	A[3] = BigInteger.ONE;
	        	
	        	
	        	
	        	for (int i = 4; i <= n; i++) {
	        		
	        		A[i] = A[i-1].add(A[i-2]).add(A[i-3]).add(A[i-4]) ;
	        	}
	        	
	        	return A[n];
	        	
	        	
		
	    }
		 	
	
/**
 * 
 * @param args String array.
 * @throws IOException
 * The main method goes through Tetranacci(5) until Tetranacci(200)
 by increments of 5 using a for loop. The execution time is calculated using the built in 
 currentTimeMillis(). Finally, using the FileWriter class, it is printed 
 in a text file.
 */
	public static void main(String[] args) throws IOException {
		
		FileWriter w = new FileWriter("TetraOutLin.txt");

        for (int i = 5; i <= 200; i += 5) {
        	
        	long start = System.currentTimeMillis();
        	
            BigInteger result = Tetranacci2(i);
            
            long end = System.currentTimeMillis();
            
            long total = (end - start) ;
            
            System.out.print("Tetranacci(" + i + ") = " + result + " (Execution Time: " + total + "ms)\n");
            w.write("Tetranacci(" + i + ") = " + result + " (Execution Time: " + total + "ms)\n");
            
        }
        
        w.close();
		

		

}
}
