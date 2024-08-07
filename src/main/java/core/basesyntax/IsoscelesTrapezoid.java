package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double upperSide;
    private double lowerSide;
    private double height;

    public IsoscelesTrapezoid(String color, double upperSide, double lowerSide, double height) {
        super(color);
        this.upperSide = upperSide;
        this.lowerSide = lowerSide;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (double) Math.round(((upperSide + lowerSide) / 2) * height) * 10 / 10;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + this.calculateArea()
                + " sq. units, upper side: "
                + this.upperSide
                + " units, lower side: "
                + this.lowerSide
                + " units, height: "
                + this.height
                + " units, color : "
                + super.getColor());
    }
}
