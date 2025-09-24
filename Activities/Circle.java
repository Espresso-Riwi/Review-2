public class Circle extends Shape{

    @Override
    double area(double circumference) {
        return circumference / (3.141516 * 2);
    }
}
