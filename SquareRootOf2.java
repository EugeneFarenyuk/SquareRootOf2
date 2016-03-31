// Task: Compute square root of 2 using "product" formula: sqrt(2)=(1+1/1)*(1-1/3)*(1+1/5)*(1-1/7)*...
import java.lang.*;
public class SquareRootOf2 {
    public static void main(String args[]) {  
        // in sequence {1,3,5,7,...} the n-th term = 2*n-1.
        // to alternate plus and minus use Math.pow(-1.0, i+1.0).
        int iMax = 1000000;      
        double sqrtOf2 = 1.0;
        for(int i=1; i<iMax; i++)  sqrtOf2 = sqrtOf2 * (1.0+1.0/(2.0*i-1) * Math.pow(-1.0, i+1.0));        
        System.out.printf("Square root of 2 equals %.5f (limited to six s.f.)\n", sqrtOf2);
}}