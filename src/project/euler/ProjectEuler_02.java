/*
 * Each new term in the Fibonacci sequence is generated
 * by adding the previous two terms. By starting 
 * with 1 and 2, the first 10 terms will be:
 *
 *      1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 *
 * By considering the terms in the Fibonacci sequence whose values
 * do not exceed four million, find the sum of the even-valued terms.
 */
package project.euler;

/**
 * @author Robert
 */
public class ProjectEuler_02 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        long n=1;
        long m=0;
        long p=0;
        long k=0;
        
        for (int i=0; i<=(35); i++){
          if(k<=4000000){
            p=n+m;
            n=m;
            m=p;
            if ((p%2) == 0){
               k+=p; 
            }
          }  
        } System.out.println(k); 
        
        
      //ALTERNATIVE METHOD
        long prev = 2;
        long current = 3;
        long next = 5;
        long answer = 2;
        do {
            prev = current;
            current = next;
            next = current + prev;
            if (current % 2 == 0){
                answer += current;
            }
        } while(next < 4000000);
        System.out.println(answer);
    }
}
