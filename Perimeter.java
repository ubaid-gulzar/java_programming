//write a program to print area of circle and rectangle
public class Perimeter {
    public static void main(String[] args){
        int length = 5;
        int breadth = 4;
        int perimeter_rect = 2*(length + breadth);
        System.out.println("Perimeter of the rectangle is: "+perimeter_rect);
        int rad = 5;
        double perimeter_cir = 2*3.14*rad;
        System.out.println("Perimeter of the circle is: "+perimeter_cir);
    }
}
