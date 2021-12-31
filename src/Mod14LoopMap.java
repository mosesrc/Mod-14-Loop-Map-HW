import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Mod14LoopMap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList
		Scanner input = new Scanner(System.in);

		List<Integer> numbers = new ArrayList<>();
		int sum = 0;
		double product = 1;

		for (int i = 0; i < 5; ++i) {

			System.out.println("Enter a number: ");
			String num1 = input.nextLine();
			int value = Integer.parseInt(num1);
			sum += value;
			product *= value;
			numbers.add(value);
		}
		
		// OUTPUTS
				System.out.println("Your Array: " + numbers);

				System.out.println("Sum of Array: " + sum);
				System.out.println("Sum of Product: " + product);
				System.out.println("Largest number of Array: " + Collections.max(numbers));
				System.out.println("Smallest number of Array: " + Collections.min(numbers));

//		HashMap
		Map<String, String> vehicles = new HashMap<>();

		vehicles.put("JETTA", "VOLSWAGEN");
		vehicles.put("T100", "TOYOTA");
		vehicles.put("CIVIC", "HONDA");
		vehicles.put("CR-V", "HONDA");
		vehicles.put("SUPRA", "TOYOTA");
		vehicles.put("CORVETTE", "CHEVROLET");
		vehicles.put("ODYSSEY", "HONDA");
		vehicles.put("CAMRY", "TOYOTA");
		vehicles.put("AMG", "MERCEDES BENZ");
		vehicles.put("RAM", "DODGE");
		vehicles.put("MODEL 3", "TESLA");
		vehicles.put("Canyon Extended Cab", "GMC");
		vehicles.put("Cascada", "Buick");		
		vehicles.put("Cayenne", "Porsche");		
		vehicles.put("Cayenne Coupe", "Porsche");	
		vehicles.put("C-Class", "Mercedes-Benz");		
		vehicles.put("Challenger", "Dodge");
		vehicles.put("Charger", "Dodge");	
		vehicles.put("Cherokee", "Jeep");	
		vehicles.put("C-HR", "Toyota");		
		vehicles.put("Tundra", "Toyota");  
		vehicles.put("Civic", "Honda");	
		vehicles.put("Civic Type R", "Honda");
		vehicles.put("Model Y", "Tesla");

		Scanner custInput = new Scanner(System.in);

		System.out.println("\nWhat car(model) are you looking for??");
		String model = custInput.nextLine().toUpperCase();
		
		if(vehicles.containsKey(model)) {
			System.out.println("Oh, you're looking for a " + model + "?");
			System.out.println("Our " + vehicles.get(model) + " selection is right over here...");
			
		}
	
	}
}
