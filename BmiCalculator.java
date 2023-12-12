import java.util.Scanner;

public class BmiCalculator {
	public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Input: weight in kilograms
            System.out.print("Enter weight in kilograms: ");
            double weight = scanner.nextDouble();

            // Input: height in meters
            System.out.print("Enter height in meters: ");
            double height = scanner.nextDouble();

            // Validate input: weight should be between 10kg and 300kg, height should be between 0.2m and 2.2m
            if (weight < 10 || weight > 300 || height < 0.2 || height > 2.2) {
                System.out.println("Invalid input. Please enter valid weight (between 10kg and 300kg) and height (between 0.2m and 2.2m).");
            } 
            else {
                // Calculate BMI
                double bmi = calculateBMI(weight, height);

                // Display BMI
                System.out.println("BMI: " + bmi);

                // Display health risk analysis
                System.out.println("Health Risk: " + getHealthRisk(bmi));
            }
        }
    }

    /**
     * Calculates BMI based on weight and height.
     *
     * @param weight Weight in kilograms.
     * @param height Height in meters.
     * @return Calculated BMI.
     */
    public static double calculateBMI(double weight, double height) {
        // BMI formula: weight (kg) / (height (m) * height (m))
        return weight / (height * height);
    }

    /**
     * Determines health risk based on BMI value.
     *
     * @param bmi BMI value.
     * @return Health risk analysis.
     */
    public static String getHealthRisk(double bmi) {
        if (bmi < 18.5) {
            return "Underweight - Possible nutritional deficiency and osteoporosis.";
        } else if (bmi >= 18.5 && bmi <= 22.9) {
            return "Normal - Low risk (healthy range).";
        } else if (bmi >= 23.0 && bmi <= 27.4) {
            return "Mild to moderate overweight - Moderate risk of developing heart disease, high blood pressure, stroke, diabetes mellitus.";
        } else {
            return "Very overweight to obese - High risk of developing heart disease, high blood pressure, stroke, diabetes mellitus. Metabolic Syndrome.";
        }
    }
}

