import org.graalvm.compiler.phases.common.inlining.info.MultiTypeGuardInlineInfo;

/*************************************************************************
 *  Compilation:  javac LargestOfFive.java
 *  Execution:    java LargestOfFive 35 10 32 1 8
 *
 *  @author:
 *
 *  Takes five distinct integers as command-line arguments and prints the 
 *  largest value
 *
 *
 *  % java LargestOfFive 35 10 32 1 8
 *  35
 *
 *  Assume the inputs are 5 distinct integers.
 *  Print only the largest value, nothing else.
 *
 *************************************************************************/

public class LargestOfFive {

    public static void main (String args[]) {
        int[] a = {6,12,4,7,1,5};
        int[] b = {1,3,7,5,2,13};
        System.out.println(mysteryA(a,0));
        System.out.println(mysteryA(b,0));
        System.out.println(mysteryB(15));
    }
    public static int mysteryA(int[] array, int n){
        if(n == array.length){
            return 0;
        }
        int value = mysteryA(array,n+1);
        if(array[n]%2==0){
            return array[n]+value;
        }else{
            return value;
        }
        
        
    }
    public static int mysteryB(int n){
        if (n == 0){
            return 0;
        }
        int value = mysteryB(n-1);
        if(n%2!=0){
            return 1+value;

        }else{
            return value;
        }
    
        }
}