/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *  @author:
 *
 *  Takes a 12 or 13 digit integer as a command line argument, then computes
 *  and displays the check digit
 *
 *  java CheckDigit 048231312622
 *  0
 *
 *  java CheckDigit 9780470458310
 *  0
 * 
 *  java CheckDigit 9780470454310
 *  8
 * 
 *  Print only the check digit character, nothing else.
 *
 *************************************************************************/

public class CheckDigit {

    public static void main (String[] args) {
        int[] b = {11,20, 12,15,69,42,21,39};
        mystery2(3,b);
        printArray(b);

        
    }
    public static void printArray(int[] b){
        for(int elt : b){
            System.out.println(elt+" ");

        }
        System.out.println();


    }
    public static void mystery2(int x, int[] nums){
        for(int k = 1;k<nums.length;k=k+x){
            nums[k]=nums[k-1]+x;
        }
    }
}