import java.util.List;

public class AreaCalculator implements IAreaCalculator {

    @Override
    public int sum(List<Shape> shapes) {
        int sum = 0;
        for (Shape shape : shapes) {
            sum += (int) shape.area();
        }
        return sum;
    }

}
