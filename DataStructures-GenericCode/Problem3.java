//*******************************************************************
// Mirea Klee for CS3134 at Columbia University
// Problem3
//
// testing run times of previous methods on a given 
//*******************************************************************

public class Problem3{
    public static void main(String[] args){
        BigO bigO = new BigO();
        
        //run time tests for cubic method
        long startTime = System.nanoTime();
        bigO.cubic(1);
        long endTime = System.nanoTime();
        System.out.println("Cubic Test 1: " + (endTime-startTime));
        startTime = System.nanoTime();
        bigO.cubic(20);
        endTime = System.nanoTime();
        System.out.println("Cubic Test 2: " + (endTime-startTime));
        startTime = System.nanoTime();
        bigO.cubic(50);
        endTime = System.nanoTime();
        System.out.println("Cubic Test 3: " + (endTime-startTime));
        startTime = System.nanoTime();
        bigO.cubic(100);
        endTime = System.nanoTime();
        System.out.println("Cubic Test 4: " + (endTime-startTime));
        
        //run time tests for exp method
        startTime = System.nanoTime();
        bigO.exp(1);
        endTime = System.nanoTime();
        System.out.println("Exponential Test 1: " + (endTime-startTime));
        startTime = System.nanoTime();
        bigO.exp(10);
        endTime = System.nanoTime();
        System.out.println("Exponential Test 2: " + (endTime-startTime));
        startTime = System.nanoTime();
        bigO.exp(20);
        endTime = System.nanoTime();
        System.out.println("Exponential Test 3: " + (endTime-startTime));
        startTime = System.nanoTime();
        bigO.exp(30);
        endTime = System.nanoTime();
        System.out.println("Exponential Test 4: " + (endTime-startTime));
        
        //run time tests for constant method
        startTime = System.nanoTime();
        bigO.constant(1);
        endTime = System.nanoTime();
        System.out.println("Constant Test 1: " + (endTime-startTime));
        startTime = System.nanoTime();
        bigO.constant(20);
        endTime = System.nanoTime();
        System.out.println("Constant Test 2: " + (endTime-startTime));
        startTime = System.nanoTime();
        bigO.constant(100);
        endTime = System.nanoTime();
        System.out.println("Constant Test 3: " + (endTime-startTime));
        startTime = System.nanoTime();
        bigO.constant(1000);
        endTime = System.nanoTime();
        System.out.println("Constant Test 4: " + (endTime-startTime));
    }
}