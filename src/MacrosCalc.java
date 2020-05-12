import java.util.Scanner;

public class MacrosCalc {

	private static float finalCalories;

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		// Initial input 
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
		
		
		//Cutting, Bulking, or Maintaining
		System.out.println("Do you want to 1.Cut, 2.Bulk, or 3.Maintain? Please enter a number");
		int goal = scan.nextInt();
		while (goal < 1 || goal > 3) {
			System.out.println("Please enter a number within the Given Parameters: ");
			goal = scan.nextInt();
		}
		
		//Cutting
		if (goal == 1) {
			finalCalories = maintenance - (maintenance * .10f);
			System.out.println("Your cutting calorie is: " + finalCalories);
			//Protein Calculator 
			System.out.println("Please choose an option for protein between 1.2g - 1.6g per lean body mass"
					+ "\n(Higher body fat percentage should be towards 1.2g and low body fat should be closer to 1.6g)");
			float proteinGoal = scan.nextFloat();
			
			while (proteinGoal < 1.2 || proteinGoal > 1.6) {
				System.out.println("Enter your protein goal within Given Parameters");
				proteinGoal = scan.nextFloat();
			}
			float proteinIntake = leanBodyMass * proteinGoal;
			
			//Fat Calculator
			System.out.println("Please enter your a fat percentage between 20-35%: ");
			float fatGoal = scan.nextFloat();
			
			while (fatGoal < 20 || fatGoal > 35) {
				System.out.println("Enter your fat goal within Given Parameters");
				fatGoal = scan.nextFloat();
			}
			
			float fatIntake = ((finalCalories * (fatGoal/100))/9);
			
			//Carb Calculator
			float carbIntake = (finalCalories - ((proteinIntake * 4) + (fatIntake * 9))) / 4;
			
			
			//Macro nutrients Daily Goals 
			System.out.println("Macro Nutrients Daily Goals");
			System.out.println("Protein intake per day: "+proteinIntake);
			System.out.println("Fat intake per day: " +fatIntake);
			System.out.println("Carb intake per day: " +carbIntake);
		} 
		
		//Bulking
		else if (goal == 2) {
			finalCalories = maintenance + (maintenance * .10f);
			System.out.println("Your bulking calorie is: " + finalCalories);
			//Protein Calculator 
			System.out.println("Please choose an option for protein between 1.2g - 1.6g per lean body mass"
					+ "\n(Higher body fat percentage should be towards 1.2g and low body fat should be closer to 1.6g)");
			float proteinGoal = scan.nextFloat();
			
			while (proteinGoal < 1.2 || proteinGoal > 1.6) {
				System.out.println("Enter your protein goal within Given Parameters");
				proteinGoal = scan.nextFloat();
			}
			float proteinIntake = leanBodyMass * proteinGoal;
			
			//Fat Calculator
			System.out.println("Please enter your a fat percentage between 20-35%: ");
			float fatGoal = scan.nextFloat();
			
			while (fatGoal < 20 || fatGoal > 35) {
				System.out.println("Enter your fat goal within Given Parameters");
				fatGoal = scan.nextFloat();
			}
			
			float fatIntake = ((finalCalories * (fatGoal/100))/9);
			
			//Carb Calculator
			float carbIntake = (finalCalories - ((proteinIntake * 4) + (fatIntake * 9))) / 4;
			
			
			//Macro nutrients Daily Goals 
			System.out.println("Macro Nutrients Daily Goals");
			System.out.println("Protein intake per day: "+proteinIntake);
			System.out.println("Fat intake per day: " +fatIntake);
			System.out.println("Carb intake per day: " +carbIntake);
		} 
		
		//Maintaining
		else {
			finalCalories = maintenance;
			System.out.println("Your maintenance calorie is: " + finalCalories);
			//Protein Calculator 
			System.out.println("Please choose an option for protein between 1.2g - 1.6g per lean body mass"
					+ "\n(Higher body fat percentage should be towards 1.2g and low body fat should be closer to 1.6g)");
			float proteinGoal = scan.nextFloat();
			
			while (proteinGoal < 1.2 || proteinGoal > 1.6) {
				System.out.println("Enter your protein goal within Given Parameters");
				proteinGoal = scan.nextFloat();
			}
			float proteinIntake = leanBodyMass * proteinGoal;
			
			//Fat Calculator
			System.out.println("Please enter your a fat percentage between 20-35%: ");
			float fatGoal = scan.nextFloat();
			
			while (fatGoal < 20 || fatGoal > 35) {
				System.out.println("Enter your fat goal within Given Parameters");
				fatGoal = scan.nextFloat();
			}
			
			float fatIntake = ((finalCalories * (fatGoal/100))/9);
			
			//Carb Calculator
			float carbIntake = (finalCalories - ((proteinIntake * 4) + (fatIntake * 9))) / 4;
			
			
			//Macro nutrients Daily Goals 
			System.out.println("Macro Nutrients Daily Goals");
			System.out.println("Protein intake per day: "+proteinIntake);
			System.out.println("Fat intake per day: " +fatIntake);
			System.out.println("Carb intake per day: " +carbIntake);
		}

	}

}
