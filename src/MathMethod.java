public class MathMethod {

    public static void main(String[] args) {
        System.out.println("Max: " + Math.max(10, 20));
        System.out.println("Min: " + Math.min(10, 20));
        System.out.println("Absolute: " + Math.abs(-50));
        System.out.println("Power: " + Math.pow(2, 3));
        System.out.println("Square Root: " + Math.sqrt(49));
        System.out.println("Random Number (1-100): " + ((int)(Math.random() * 100) + 1));
        System.out.println("Round: " + Math.round(4.5));
        System.out.println("Floor: " + Math.floor(4.9));
        System.out.println("Ceil: " + Math.ceil(4.1));
        System.out.println("Sine of 90°: " + Math.sin(Math.toRadians(90))); // Convert degrees to radians
    }
}
