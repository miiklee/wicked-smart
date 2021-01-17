//*******************************************************************
// Mirea Klee for CS3134 at Columbia University
// RectangleTester
//
// testingrectangle class
//*******************************************************************

public class RectangleTester{
    public static void main(String[] args){
        Rectangle r = new Rectangle(2,3);
        System.out.println(r.getLength()+","+r.getWidth()+","+r.getPerim());
        System.out.println(r.compareTo(new Rectangle(3,4)));
    }
}