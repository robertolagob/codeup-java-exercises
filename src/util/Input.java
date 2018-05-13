package util;
import java.util.Scanner;

    public class Input {
        // option 1) Inline the assignment
        // private Scanner scanner = new Scanner(System.in);  // = null
        private  static Scanner scanner=new Scanner(System.in);

        // option 2 -> Create a constructor
        public Input() {
            scanner = new Scanner(System.in);
        }
        static public String getString() {
            return scanner.nextLine();
        }
        static public boolean yesNo() {
            String answer = scanner.nextLine();  // null
            // auto-boxing => value (string) -> wrap it in a an object -> new String("y").equalsIgnoreCase()
            return "y".equalsIgnoreCase(answer) || "yes".equalsIgnoreCase(answer);
        }
        static public int  getInt(int min, int max) {
            int value = getInt();
            if (value < min || value > max) {
                System.out.printf("Enter a number between %d and %d%n", min, max);
                return getInt(min, max);
            }
            return value;
        }
        static public int getInt() {
            return scanner.nextInt();
        }

        static public double getDouble(double min, double max) {
            double value = getDouble();
            if (value < min || value > max) {
                System.out.printf("Enter a number between %f and %f%n", min, max);
                return getDouble(min, max);
            }
            return value;
        }
        static public double getDouble() {
            return scanner.nextDouble();
        }
    }

