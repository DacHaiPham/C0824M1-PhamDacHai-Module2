package AbstractClassAndInterface.Comparable;

import AbstractClassAndInterface.Triangle.Circle.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
    @Override
    public int compareTo(ComparableCircle o) {
        return 0;
    }
}
