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
public class TetraTail {
	
	/**
	 * 
	 * @param n Integer.
	 * @param a Integer.
	 * @param b Integer.
	 * @param c Integer.
	 * @param d Integer.
	 * @return The n-th Tetranacci number
	 * 
	 * This method uses tail recursion to calculate the n-th Tetranacci number
	 */
	public static BigInteger tailTetranacci(int n, BigInteger a, BigInteger b, BigInteger c, BigInteger d) {
		
		if(n == 0) {
			
			return a;
		}
		
		else if(n == 1) {
			
			return b;
		}
		
		else if(n == 2) {
			
			return c;
		}
		
		else if(n == 3) {
			
			return c;
		}
		
		else {
			
			return tailTetranacci(n - 1, b, c, d, a.add(b).add(c).add(d));
		}
			
			
	}

	/**
	 * 
	 * @param args String array.
	 * @throws IOException
	 * 
	 * The main method goes through Tetranacci(5) until Tetranacci(200)
 by increments of 5 using a for loop. The execution time is calculated using the built in 
 currentTimeMillis(). Finally, using the FileWriter class, it is printed 
 in a text file.
	 */
	public static void main(String[] args) throws IOException {
		
		FileWriter w = new FileWriter("TetraOutTail.txt");

        for (int i = 5; i <= 200; i += 5) {
        	
        	long start = System.currentTimeMillis();
        	
            BigInteger result = tailTetranacci(i, BigInteger.ZERO, BigInteger.ZERO, BigInteger.ZERO, BigInteger.ONE);
            
            long end = System.currentTimeMillis();
            
            long total = (end - start) ;
            
            System.out.print("Tetranacci(" + i + ") = " + result + " (Execution Time: " + total + "ms)\n");
            w.write("Tetranacci(" + i + ") = " + result + " (Execution Time: " + total + "ms)\n");
            
        }
        
        w.close();
		

	}

}
