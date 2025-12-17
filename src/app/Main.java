package app;

/**
 * author: user,
 * date: 17.12.2025
 */
public class Main {
    private static final double MILES_CONST = 1.60934;

    public static void main(String[] args) {
        System.out.println("Project with git connect (SSH)\nMy project");
        System.out.println("App for kilometres to miles converting.");
        System.out.println("Version 1.0.");
        double kilometers = 5;
        double miles = 12;
        double milesInKilometers = convKilometersToMiles(kilometers);
        double kilometersInMiles = convMilesToKilometers(miles);
        System.out.println("Result is " + milesInKilometers + " milesInKilometers and "
                + kilometersInMiles + " kilometersInMiles.");
    }
    private static double convKilometersToMiles(double kilometers){
        return kilometers / MILES_CONST;
    }
    private static double convMilesToKilometers(double miles){
        return miles * MILES_CONST;
    }
    // For additional commit for hw
    // *******************************
}
