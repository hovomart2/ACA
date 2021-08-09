package week4HomeworkTask2;

import java.util.Objects;

public final class ImmutablePoint implements Point {

    private final int x;
    private final int y;

    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public ImmutablePoint(ImmutablePoint other) {
        this.x = other.x;
        this.y = other.y;
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    public Point shiftLeft() {
        return new ImmutablePoint(getX() - 1, getY());
    }

    public Point shiftRight() {
        return new ImmutablePoint(getX() + 1, getY());
    }

    public Point shiftUp() {
        return new ImmutablePoint(getX(), getY() + 1);
    }

    public Point shiftDown() {
        return new ImmutablePoint(getX(), getY() - 1);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ImmutablePoint)) {
            return false;
        }
        if (this == o) {
            return true;
        }
        ImmutablePoint oImmutablePoint = (ImmutablePoint) o;
        return this.getX() == oImmutablePoint.getX() && this.getY() == oImmutablePoint.getY();
    }

    @Override
    public String toString() {
        return "ImmutablePoint{" +
                "x=" + getX() +
                ", y=" + getY() +
                '}';
    }
}
