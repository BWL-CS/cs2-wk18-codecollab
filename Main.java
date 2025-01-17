public class Main {

	public static void main(String []args) {
		// One way to create Array
		String[] countries = { "🇺🇸 USA", "🇯🇵 Japan", "🇮🇳 India" };

		// Another way to create Array
		// How is this process different than above?
		int[] populations = new int[3];
		populations[0] = 339665118;
		populations[1] = 123719238;
		populations[2] = 1399179585;

		// Why doesn't this work as intended?
		System.out.println("Check out your new arrays: ");
		System.out.println(countries);
		System.out.println(populations);

		System.out.println("---");

		// Standard for loop
		for (int i = 0; i < countries.length; i++) {
			System.out.println("Array Index: " + i);
			System.out.println("Country: " + countries[i]);
			System.out.println("Population: " + populations[i]);
		}
		
		System.out.println("---");

		// Enhanced for-each loop
		for (String country : countries) {
			System.out.println(country);
		}

		// Another enhanced for-each loop
		int totalPop = 0;
		for (int countryPop : populations) {
			totalPop = totalPop + countryPop;
		}
		System.out.println("Total: " + totalPop);

		System.out.println("---");

		// Why does this raise an error?
		int numberOfCountries = countries.length;
		System.out.println(countries[numberOfCountries]);
   }
}
