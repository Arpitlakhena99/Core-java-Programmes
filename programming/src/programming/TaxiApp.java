package programming;

import java.util.Scanner;
interface DistanceCalculator {
    int calculateDistance(int start, int end);
}
interface FareCalculator {
    int calculateFare(int distance);
}
class CoordinateDistance implements DistanceCalculator {
    @Override
    public int calculateDistance(int start, int end) {
        return Math.abs(end - start);
    }
}
class TaxiFare implements FareCalculator {
    @Override
    public int calculateFare(int distance) {
        int fare = 0;
        int remainingDistance = distance;

        // First 2 km fare
        if (remainingDistance >= 2) {
            fare += 25;
            remainingDistance -= 2;
        } else {
            fare += remainingDistance * 25;
            remainingDistance = 0;
        }

        // Next 5 km fare
        if (remainingDistance > 0 && remainingDistance <= 5) {
            fare += remainingDistance * 15;
            remainingDistance = 0;
        } else if (remainingDistance > 0) {
            fare += 75; // 5 km * 15
            remainingDistance -= 5;
        }

        // Next 5 km fare
        if (remainingDistance > 0 && remainingDistance <= 5) {
            fare += remainingDistance * 20;
            remainingDistance = 0;
        } else if (remainingDistance > 0) {
            fare += 100; // 5 km * 20
            remainingDistance -= 5;
        }

        // Remaining km fare
        if (remainingDistance > 0) {
            fare += remainingDistance * 25;
        }

        return fare;
    }
}

class TaxiService implements DistanceCalculator, FareCalculator {
    private final DistanceCalculator distanceCalculator;
    private final FareCalculator fareCalculator;

    public TaxiService() {
        this.distanceCalculator = new CoordinateDistance();
        this.fareCalculator = new TaxiFare();
    }

    @Override
    public int calculateDistance(int start, int end) {
        return distanceCalculator.calculateDistance(start, end);
    }

    @Override
    public int calculateFare(int distance) {
        return fareCalculator.calculateFare(distance);
    }
}

public class TaxiApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance in kilometers: ");
        int distance = scanner.nextInt();

        TaxiService taxi = new TaxiService();
        int calculatedDistance = taxi.calculateDistance(0, distance);
        int fare = taxi.calculateFare(calculatedDistance);

        System.out.println("Distance: " + calculatedDistance + " kilometers");
        System.out.println("Fare: $" + fare);

        scanner.close();
    }
}

