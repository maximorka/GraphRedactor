package comGraph;

import java.awt.*;
import java.util.Objects;

public class Point {
    private final float x;
    private final float y;
    private final Color color;

    public Point(float x, float y, Color color){
        this.x = x;
        this.y = y;
        this.color = color;
    }



    public float getX() {
         return x;
     }

     public float getY() {
         return y;
     }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "comGraph.Point{" +
                "x=" + x +
                ", y=" + y +
                ", color=" + color +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
       Point point = (Point) o;
        return Float.compare(point.x, x) == 0 &&
                Float.compare(point.y, y) == 0 &&
                Objects.equals(color, point.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, color);
    }
}
