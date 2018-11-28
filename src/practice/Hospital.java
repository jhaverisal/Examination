package practice;

public class Hospital {
	static InputHelper helper=new InputHelper();

	public static void main(String args[])
	{

		double totCharges=0.0;
		String option;
		do
		{
			option=helper.readString("Do you have patients? (Yes/No)");
			if (option.equalsIgnoreCase("Yes"))
			{
				totCharges= calculateCharges();
				System.out.println("The total charges for this patient is "+totCharges);
			}
			

		}while(option.equalsIgnoreCase("Yes"));
		System.out.println("the loop has ended");
	}


	public static double calculateCharges()
	{
		double charges=0.0;
		String stay=helper.readString("Is there an overnight stay?(Yes/No)");
		if(stay.equalsIgnoreCase("Yes"))
		{
			charges+=helper.readDouble("enter overnight stay charges");

		}
		charges+=helper.readDouble("enter medication charges");
		charges+=helper.readDouble("enter lab charges");

		return charges;

	}

}
