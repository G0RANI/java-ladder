package nextstep.ladder.domain;

import java.util.List;
import java.util.Objects;

public class Line {
    private final Points points;

    public Line(Points points) {
        this.points = points;
    }

    public Line(List<Point> points) {
        this(new Points(points));
    }

    public List<Point> getAll() {
        return this.points.getAll();
    }

    public Direction nextDirection(int point) {
        return this.points.move(point);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(points, line.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(points);
    }
}
