//*******************************************************************
// Mirea Klee for CS3134 at Columbia University
// Rectangle
//
// a class to represent a rectangle for comparison in searches
//*******************************************************************


public class Rectangle implements RectangleInterface, Comparable<Rectangle> {
    private double width;
    private double length;
    private double perimeter;
    
    public Rectangle(double w, double l){
        width = w;
        length = l;
        perimeter = (2*w)+(2*l);
    }
    public double getPerim(){
        return perimeter;
    }
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    //the compareTo method compares based on perimeters
    @Override
    public int compareTo(Rectangle r){
        double rPerim = r.getPerim();
        if (perimeter > rPerim){
            return 1;
        }else if (perimeter < rPerim){
            return -1;
        }else{
            return 0;
        }
    }
}
