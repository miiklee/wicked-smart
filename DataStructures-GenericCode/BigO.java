public class BigO implements BigOInterface{
    
    public void cubic(int n){
        for (int j = 0; j<n; j++){
            for (int z = 0; z<n; z++){
                for(int a = 0; a<n; a++){
                    int q = 3;
                }
            }
        }
    }
    
	public void exp(int n){
        fib(n);
        System.out.println("well that took a while");
        }

    //recursive method to call inside exp that still alows use of return
    private int fib(int x){
        if(x <= 1){
            return x;
        }
        return fib(x-1)+fib(x-2);
    }
    
	public void constant(int n){
        System.out.println("this takes a constant time :)");
    }
    
}