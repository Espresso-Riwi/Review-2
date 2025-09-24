
package activity3;
import java.util.ArrayList;

public class Activity3 {

    public static void main(String[] args) {
    ArrayList<Shape> shapes = new ArrayList<>();  
    Square s1 = new Square();
    Square s2 = new Square();
    Circle c1 = new Circle();
    Circle c2 = new Circle();
    shapes.add(c1);
    shapes.add(c2);
    shapes.add(s1);
    shapes.add(s2);
    double test = 5.0;
    for(int i = 0; i<shapes.size();i++){
        System.out.println(shapes.get(i).area(test));
        test *= 2;
    }
    }
    
}
