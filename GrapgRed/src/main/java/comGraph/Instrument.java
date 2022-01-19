package comGraph;

public abstract class Instrument implements Draw {

    private Instrument currentInstrument;

    public String getShape(Shape shape){
        return shape.toString();
    }
    @Override
    public void draw(Canvas canvas) {

    }
}
