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
public class TetraMult {

/**
 * 
 * @param n Integer.
 * @return The n-th Tetranacci number
 * 
 * This method recursively calculates the n-th Tetranacci number using multiple recursion.
 */
public static BigInteger Tetranacci1(int n) {
	
	if (n == 0) {
		
        return BigInteger.ZERO;
        
    } 
	else if(n < 3) {
		
		return BigInteger.ONE;
	}
	else if (n == 3) {
    
        return BigInteger.TWO;
	}
	else {
	
        	
            return Tetranacci1(n - 1).add(Tetranacci1(n - 2)).add(Tetranacci1(n - 3)).add(Tetranacci1(n - 4));
       
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
		
		FileWriter w = new FileWriter("TetraOutMult.txt");

        for (int i = 5; i <= 200; i += 5) {
        	
        	long start = System.currentTimeMillis();
        	
        	BigInteger result = Tetranacci1(i);
            
            long end = System.currentTimeMillis();
            
            long total = (end - start) ;
            
            
            System.out.print("Tetranacci(" + i + ") = " + result + " (Execution Time: " + total + "ms)\n");
            w.write("Tetranacci(" + i + ") = " + result + " (Execution Time: " + total + "ms)\n");
            
        }
        
        w.close();
		

	}

}
