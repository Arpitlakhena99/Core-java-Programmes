// sortByFuelType.java
package serviceimpln;

import java.util.Comparator;

import entity.Car;

public class SortByFuelType implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getFueltype().compareTo(o2.getFueltype());
    }
}

