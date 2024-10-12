/*
 * The species Klingon ox has a population of 100 and a growth rate of 15
 * percent, and the species elephant has a population of 10 and a growth rate of 35
 * percent. How many years will it take for the elephant population to exceed the
 * Klingon ox population.
 */
package codingPractice1;

public class Klingon {

	public static void main(String[] args) {
		final int OX_START_POP = 100, ELEPHANT_START_POP = 10;
		final double OX_GROWTH_RATE = 1.15, ELEPHANT_GROWTH_RATE = 1.35;
		
		int oxPop = OX_START_POP, elephantPop = ELEPHANT_START_POP, years = 0;
		
		while(elephantPop < oxPop)
		{
			oxPop *= OX_GROWTH_RATE;
			elephantPop *= ELEPHANT_GROWTH_RATE;
			years++;

		}
		
		System.out.println("It takes " + years + " years for the elephant population to exceed the ox population.");
	}

}
