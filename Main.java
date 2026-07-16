// YOUR NAME: Rafael Castro
// COLLABORATORS:  
// DATE: 6/25/26

public class Main
{
	public static void main(String[] args)
	{
		// DECLARATION SECTION
		double avgDacaTaxContribution;
		int avgDacaTaxContributionRounded;
		String stateMostDaca;

		char stateMostDaca1 = 'n' , stateMostDaca2 = 'y';
		int numDacaRecipients = 700000;
		long dacaFederalTaxRevenue = 60000000000L;

		// INITIALIZATION SECTION
		
		// INPUT SECTION
		// N/A (no input for this lab)
		
		// CALCULATION & PROCESSING SECTION
		avgDacaTaxContribution = dacaFederalTaxRevenue / (double)numDacaRecipients;
		avgDacaTaxContributionRounded = (int)avgDacaTaxContribution;

		stateMostDaca1 = (char) (stateMostDaca1 - 32);
		stateMostDaca2 = (char) (stateMostDaca2 - 32);


		
		// OUTPUT SECTION
		System.out.println("DACA Tax contribute: " + avgDacaTaxContribution);
		System.out.println("Round: " + avgDacaTaxContributionRounded);
		System.out.println("State: " + stateMostDaca1 + stateMostDaca2);
	}
}
