//*******************************************************************
// Mirea Klee for CS3134 at Columbia University
// GenericMethods
//
// methods for different search algorithms on generic input types
//*******************************************************************

public class GenericMethods implements GenericMethodsInterface{
    
    //generic method that can go through binary search on a sorted list
    public <AnyType extends Comparable<AnyType>> int binarySearch(AnyType[] a, AnyType x){
        int bsLocation = binarySearch(a, x, 0, a.length-1);
        if (bsLocation >= 0){
            return bsLocation;
        }else{
            return -1;
        }
    }
    
    //this is a recursive helper method for the public binarySearch method
    private <AnyType extends Comparable<AnyType>> 
    int binarySearch(AnyType[] a, AnyType x, int l, int h){
        
        int low = l;
        int high = h;
        int mid = (low + high)/2;
        
        int comparison = a[mid].compareTo(x);
        
        if (comparison == 0){
            return mid;
        }else if (comparison < 0){
            low = mid + 1;
        }else{
            high = mid - 1;
        }
        return binarySearch(a, x, low, high);
    }
    
    //generic method that can search through an unsorted list
    public <AnyType extends Comparable<AnyType>> int linearSearch(AnyType[] a, AnyType x){
        for (int j = 0; j < a.length; j++){
            if (a[j].compareTo(x) == 0){
                return j;
            }          
        }return -1;
    }
}