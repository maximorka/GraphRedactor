package comGraph;

import comGraph.Shapes.Line;

import java.awt.*;

public class Session {
    public Instrument instrument;
    public Canvas canvas;

    public void checkInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public void setCanvas(int x, int y) {
        this.canvas = new Canvas(x, y);
    }

    public Canvas getCanvas() {
        return this.canvas;
    }

    public Instrument getInstrument() {
        return this.instrument;
    }

    public static void main(String[] args) {
        Session newSesion = new Session();
        newSesion.setCanvas(25, 25);


        Shape shape = new Line();
        System.out.println("shape.toString() = " + shape.toString());
        Instrument instrument = shape;
        System.out.println("shape.getName() = " + shape.getName());
        shape.setColorBorder(Color.BLACK);

        shape.setFirstPoint(new Point(1, 4, Color.BLACK));
        shape.setSecondPoint(new Point(10, 3, Color.BLACK));
        newSesion.checkInstrument(shape);

        newSesion.instrument.draw(newSesion.getCanvas());



    }
}
