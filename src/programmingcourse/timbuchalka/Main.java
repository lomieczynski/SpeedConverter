package programmingcourse.timbuchalka;

public class Main {

    public static void main(String[] args) {
	    double milesPerhour = toMilesPerHour(1.25);
	    System.out.println(milesPerhour);
        printConversion(1.5);
    }

    public static long toMilesPerHour (double kilometersPerHour) {

        if(kilometersPerHour < 0)
            return -1;
        else
            return (long) Math.round((kilometersPerHour * (1/1.609)));
    }
    public static void printConversion (double kilometersPerHour) {
        if(kilometersPerHour < 0)
            System.out.println("Invalid Value");
        else {

            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }
}
