package comGraph.Shapes;
import comGraph.Canvas;
import comGraph.Point;
import comGraph.Shape;


public class Circle extends Shape {

    private Point centerPoint;
    private float radiusLenght;

    public Circle() {
        this.setName("Circle");
    }

    public Point getCenterPoint() {
        return centerPoint;
    }

    public void setCenterPoint(Point centerPoint) {
        this.centerPoint = centerPoint;
    }

    public float getRadiusLenght() {
        return radiusLenght;
    }

    public void setRadiusLenght(float radiusLenght) {
        this.radiusLenght = radiusLenght;
    }

    @Override
    public void draw(Canvas canvas) {

    }
}
