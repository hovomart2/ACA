package week4HomeworkTask2;


public final class Triangle {
    private final Point point1;
    private final Point point2;
    private final Point point3;


    public Triangle(Point point1, Point point2, Point point3) {
        AssertionUtils.assertNotNull(point1);
        this.point1 = point1;
        AssertionUtils.assertNotNull(point2);
        this.point2 = point2;
        AssertionUtils.assertNotNull(point3);
        this.point3 = point3;
    }

    public Triangle(Triangle other){
        this.point1 = new ImmutablePoint(other.getPoint1().getX(),other.getPoint1().getY());
        this.point2 = new ImmutablePoint(other.getPoint2().getX(),other.getPoint2().getY());
        this.point3 = new ImmutablePoint(other.getPoint3().getX(),other.getPoint3().getY());
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public Point getPoint3() {
        return point3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if(!(o instanceof Triangle)){
            return false;
        }
        Triangle oTriangle = (Triangle)o;
        return this.getPoint1().getX()==oTriangle.getPoint1().getX() &&
                this.getPoint1().getY() == oTriangle.getPoint1().getY() &&
                this.getPoint2().getX() == oTriangle.getPoint2().getX() &&
                this.getPoint2().getY() == oTriangle.getPoint2().getY() &&
                this.getPoint3().getX() == oTriangle.getPoint3().getX() &&
                this.getPoint3().getY() == oTriangle.getPoint3().getY();
    }

    @Override
    public String
    toString() {
        return "Triangle{" +
                "point1=" + new ImmutablePoint(point1.getX(),point1.getY()).toString() +
                ", point2=" + new ImmutablePoint(point2.getX(),point2.getY()).toString() +
                ", point3=" + new ImmutablePoint(point3.getX(),point3.getY()).toString() +
                '}';
    }
}
