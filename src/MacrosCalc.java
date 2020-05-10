import java.util.Scanner;

public class MacrosCalc {

	private static float finalCalories;

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Weight in kg");
		float weight = scan.nextFloat();
		
		System.out.println("Enter Height in cm");
		float height = scan.nextFloat();
		
		System.out.println("Enter Age");
		int age = scan.nextInt();
		
		System.out.println("Enter LifeStyle Multiplier "
				+ "\nSedentary + Training 3-6x/wk (1.2 - 1.5)"
				+ "\nLight Active + Training 3-6x/wk (1.5 - 1.8)"
				+ "\nModerately Active + Training 3-6x/wk (1.8 - 2.0)"
				+ "\nHighly Active + Training 3-6x/wk (2.0 - 2.2)");
		float lifeStyleMultiplier = scan.nextFloat();
		while (lifeStyleMultiplier < 1.2 || lifeStyleMultiplier > 2.2) {
			System.out.println("Enter LifeStyle Multiplier within Given Parameters");
			lifeStyleMultiplier = scan.nextFloat();
		}
		
		System.out.println("Enter your Body Fat Percentage: ");
		float bodyFatPercentage = scan.nextFloat() / 100;
		
		float BMR = (float) ((10 * weight) + (6.25 * height) - (5 * age) + 5);
		float maintenance = BMR * lifeStyleMultiplier;
		float weightToPounds = (float) (weight / 0.453592);
		float leanBodyMass = (weightToPounds-(weightToPounds * bodyFatPercentage));
		
		System.out.println("BMR is: " + BMR);
		System.out.println("Maintenance Calories is: " + maintenance);
		System.out.println("Lean Body Mass is " + leanBodyMass);
		
		System.out.println("Do you want to 1.Cut, 2.Bulk, or 3.Maintain? Please enter a number");
		int goal = scan.nextInt();
		while (goal < 1 || goal > 3) {
			System.out.println("Please enter a number within the Given Parameters: ");
			goal = scan.nextInt();
		}
		if (goal == 1) {
			finalCalories = maintenance - (maintenance * .10f);
		} else if (goal == 2) {
			finalCalories = maintenance + (maintenance * .10f);
		} else {
			finalCalories = maintenance;
		}
		
		System.out.println(finalCalories);
		
	}

}
