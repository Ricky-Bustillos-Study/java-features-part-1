package one.digitalinnovation.abstracts;

public class Square extends GeometricForm {

    private String name;
    private Double area;

    public Square(final String name, final Double area) {
        this.name = name;
        this.area = area;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public Double area() {
        return area;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder("Square [" + "name=" + name + ",area=" + area + "]");
        return builder.toString();
    }
}
