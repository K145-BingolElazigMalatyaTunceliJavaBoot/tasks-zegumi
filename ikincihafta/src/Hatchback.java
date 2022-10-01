public class Hatchback extends vehicle {
    private static double dailyrental;
    public Hatchback(String vehicleType, int luggage, String color) {
        super(vehicleType, color, luggage);
        Hatchback.dailyrental = 400;
    }
    public static double getDailyrental() {
        return dailyrental;
    }
    public void setDailyrental(double dailyrental) {
        dailyrental = dailyrental;
    }
}
