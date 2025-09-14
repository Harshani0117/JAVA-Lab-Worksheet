package LW01;

    import java.util.Scanner;

    public class Q03 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter length in centimetres: ");
            double cm = scanner.nextDouble();

            double totalInches = cm / 2.54;

            int feet = (int) (totalInches / 12);
            int inches = (int) (totalInches % 12);
            double remaincm =  cm - (feet * 12 + inches) * 2.54;

            System.out.printf("%d feet, %d inches and %.2f cm.",feet, inches, remaincm);

            scanner.close();
        }
    }


