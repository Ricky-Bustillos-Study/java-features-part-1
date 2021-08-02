package one.digitalinnovation.abstracts;

public abstract class GeometricForm {

    public abstract String name();
    public abstract Double area();

    public String draw(int x, int y) {
        return "Drawing in X=" + x +" and Y="+ y +" coordinates";
    }

}
