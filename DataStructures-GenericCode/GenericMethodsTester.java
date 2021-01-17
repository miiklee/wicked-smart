//*******************************************************************
// Mirea Klee for CS3134 at Columbia University
// GenericMethodsTester
//
// testing generic methods to make sure they are acting how they should
//*******************************************************************

import java.util.Arrays;

public class GenericMethodsTester{
    public static void main(String[] args){
        //create an array of Rectangles and assign values to all the locations
        Rectangle rectArray[] = new Rectangle[5];
        rectArray[0] = new Rectangle(2,3);
        rectArray[1] = new Rectangle(7,19);
        rectArray[2] = new Rectangle(20,1);
        rectArray[3] = new Rectangle(4,8);
        rectArray[4] = new Rectangle(1,1);
        
        GenericMethods generic = new GenericMethods();
        //the Rectangle to look for in the array
        Rectangle searchFor = new Rectangle(1,1);
        
        
        //run linear search
        int linear = generic.linearSearch(rectArray, searchFor);
        System.out.println(linear);
        //sort the array
        Arrays.sort(rectArray);
        System.out.println(rectArray[0].getWidth());
        //run binary search on the newly sorted array
        int binary = generic.binarySearch(rectArray, searchFor);
        System.out.println(binary);
        
    }
}
