
import java.util.Scanner;

class Bank
{
	String uName,PermAddress;
	public void  bankDetails()
	{	
		System.out.println("enter all the your personal details ⬇");
		//name
		Scanner name=new Scanner(System.in);
		System.out.print("Enter user name : ");
		uName=name.nextLine();
		
		//phone
		Scanner phNo=new Scanner(System.in);	
		System.out.print("Enter the phone Number : ");
		long phoneNo=phNo.nextLong();
		//Address
		Scanner address=new Scanner(System.in);
		System.out.print("Enter user Address : ");
		PermAddress=address.nextLine();
		
	}
}
 class PersnolLoan extends Bank
{
	 int netAmount,loanDuration;
	 double rateOfIntrest=10;
	public  void persnolLoanEmiCalculator()
	{	
		System.out.println("\n\n\nBank of Ineuron\n🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰");
		System.out.println("❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀");
		System.out.print("WELCOME TO INEURON BANK  "+uName);
		System.out.println("\n❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀");
		
		System.out.println("We understand that in these unprecedented times, \n"
				+ "our plans for travelling and have destination weddings have got\n"
				+ " postponed & new needs have emerged. A need for a safe and comfortable lifestyle,\n"
				+ " a need to have a safety net to tackle any unplanned/immediate requirement.\n"
				+ "\n"
				+ "​​​​​And to help you fulfil all these needs during these challenging times,\n"
				+ "Ineuron Bank is ‘There For You’ with its instant Personal Loan.\n\n");
		
		//Take input from keyboard amount needed
		Scanner amt=new Scanner(System.in);
		
		System.out.print("Enter the Amount You Need  "+uName +" : ");
		netAmount=amt.nextInt();
		//Take input from keyboard Duration needed
		Scanner duration=new Scanner(System.in);
		System.out.print("Enter the Loan Duration (* in months ex:12 *) : ");
		loanDuration=duration.nextInt();
		System.out.println("🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰");
		System.out.println("The net amount needed is:"+netAmount);
		System.out.println("The Loan Duration is:"+loanDuration+" Months");
		System.out.println("Personal Loan Rate Of Intrest is:"+rateOfIntrest);
		System.out.println("🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰");

		System.out.println("\n\nPersonal Loan EMI Cakculator\n"+"🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰");
	}
	public void monthlyEmi()
	{
			//System.out.println("THE MONTHLY EMI IS");
			double emi= (netAmount *0.1*Math.pow(1+0.1,loanDuration))/(Math.pow(1+0.1,loanDuration)-1);
			System.out.println("❤︎ ❤︎ ❤︎  ︎❤︎ ❤︎ ❤︎ ❤︎ ❤︎ ❤︎ ︎❤︎ ❤︎  ❤︎  ︎❤︎ ❤︎ ❤︎");
			System.out.println("THE MONTHLY EMI IS \n"+"🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰\n"+emi+"/month");
			System.out.println("❤︎ ❤︎ ❤︎  ︎❤︎ ❤︎ ❤︎ ❤︎ ❤︎ ❤︎ ︎❤︎ ❤︎  ❤︎  ︎❤︎ ❤︎ ❤︎ \n\n\n");
			System.out.println("                                 🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🏻Thank You🙏🙏🙏🙏🙏🙏🙏🙏                           ");
			System.out.println("                           🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰                   \n\n\n ");
			
	}
			
		
	
}
 //VEHICLE LOAN START !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 
 class VehicleLoan extends Bank
 {	
	 int vehicleType;
	 double twowheelROI;
	 double fourWheelROI;
	 double electricVehicleROI;
	 
	 public void towWheel() 
	 {
		 int loanDuration;
		 int netAmount;
		 //------------------------------------------------
		 Scanner amt=new Scanner(System.in);
			
			System.out.print("Enter the Amount You Need  "+uName+" :" );
			netAmount=amt.nextInt();
			//Take input from keyboard Duration needed
			Scanner duration=new Scanner(System.in);
			System.out.print("Enter the Loan Duration(* in months ex:12 *) : ");
			loanDuration=duration.nextInt();
			System.out.println("🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰");
			System.out.println("The net amount needed is:"+netAmount);
			System.out.println("The Loan Duration is:"+loanDuration+" Months");
			System.out.println("TWO WHEEL Loan Rate Of Intrest is:"+twowheelROI);
			System.out.println("🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰");

			//System.out.println("THE MONTHLY EMI IS");
			double emi= (netAmount *0.07*Math.pow(1+0.07,loanDuration))/(Math.pow(1+0.07,loanDuration)-1);
			System.out.println("❤︎ ❤︎ ❤︎  ︎❤︎ ❤︎ ❤︎ ❤︎ ❤︎ ❤︎ ︎❤︎ ❤︎  ❤︎  ︎❤︎ ❤︎ ❤︎");
			System.out.println(uName+" THE MONTHLY EMI IS \n"+"🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰\n"+emi+"/month");
			System.out.println("❤︎ ❤︎ ❤︎  ︎❤︎ ❤︎ ❤︎ ❤︎ ❤︎ ❤︎ ︎❤︎ ❤︎  ❤︎  ︎❤︎ ❤︎ ❤︎\n\n\n");
			System.out.println("                                 🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🏻Thank You🙏🙏🙏🙏🙏🙏🙏🙏                           ");
			System.out.println("                           🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰                   \n\n\n ");
		//------------------------------------------------
	 }
	 public void fourWheel() 
	 {
		 //----------------------------------------------------
		 int loanDuration;
		 int netAmount;
		 
		 	Scanner amt=new Scanner(System.in);
			
			System.out.print("Enter the Amount You Need  "+uName+" :" );
			netAmount=amt.nextInt();
			//Take input from keyboard Duration needed
			Scanner duration=new Scanner(System.in);
			System.out.print("Enter the Loan Duration (* in months ex:12 *) : ");
			loanDuration=duration.nextInt();
			System.out.println("🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰");
			System.out.println("The net amount needed is:"+netAmount);
			System.out.println("The Loan Duration is: "+loanDuration+" Months");
			System.out.println("Four WHEEL Loan Rate Of Intrest is: "+fourWheelROI);
			System.out.println("🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰");

			//System.out.println("THE MONTHLY EMI IS");
			double emi= (netAmount *0.08*Math.pow(1+0.08,loanDuration))/(Math.pow(1+0.08,loanDuration)-1);
			System.out.println("❤︎ ❤︎ ❤︎  ︎❤︎ ❤︎ ❤︎ ❤︎ ❤︎ ❤︎ ︎❤︎ ❤︎  ❤︎  ︎❤︎ ❤︎ ❤︎");
			System.out.println(uName+"THE MONTHLY EMI IS \n"+"🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰\n"+emi+"/month");
			System.out.println("❤︎ ❤︎ ❤︎  ︎❤︎ ❤︎ ❤︎ ❤︎ ❤︎ ❤︎ ︎❤︎ ❤︎  ❤︎  ︎❤︎ ❤︎ ❤︎ \n\n\n");
			System.out.println("                                 🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🏻Thank You🙏🙏🙏🙏🙏🙏🙏🙏                           ");
			System.out.println("                           🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰                   \n\n\n ");
		 //----------------------------------------------------

	 }
	 public void evVehicles() 
	 {
		 //----------------------------------------
		 int loanDuration;
		 int netAmount;
		 
		 	Scanner amt=new Scanner(System.in);
			
			System.out.print("Enter the Amount You Need "+uName+" :" );
			
			netAmount=amt.nextInt();
			//Take input from keyboard Duration needed
			Scanner duration=new Scanner(System.in);
			System.out.print("Enter the Loan Duration (* in months ex:12 *) : ");
			loanDuration=duration.nextInt();
			System.out.println("🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰");
			System.out.println("The net amount needed is: "+netAmount);
			System.out.println("The Loan Duration is: "+loanDuration+"Months");
			System.out.println("Four WHEEL Loan Rate Of Intrest is: "+electricVehicleROI);
			System.out.println("🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰");

			//System.out.println("THE MONTHLY EMI IS");
			double emi= (netAmount *0.04*Math.pow(1+0.04,loanDuration))/(Math.pow(1+0.04,loanDuration)-1);
			System.out.println("❤︎ ❤︎ ❤︎  ︎❤︎ ❤︎ ❤︎ ❤︎ ❤︎ ❤︎ ︎❤︎ ❤︎  ❤︎  ︎❤︎ ❤︎ ❤︎");
			System.out.println(uName+"THE MONTHLY EMI IS \n"+"🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰\n"+emi+"/month");
			System.out.println("❤︎ ❤︎ ❤︎  ︎❤︎ ❤︎ ❤︎ ❤︎ ❤︎ ❤︎ ︎❤︎ ❤︎  ❤︎  ︎❤︎ ❤︎ ❤︎\n\n\n");
			
			
			System.out.println("                                 🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🏻Thank You🙏🙏🙏🙏🙏🙏🙏🙏                           ");
			System.out.println("                           🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰                   \n\n\n ");
		 //---------------------------------------
	 }
		
	 public void vehicleLoanEmiCalculator()
	 {
		 System.out.println("\n\n\nBank of Ineuron\n🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰");
			System.out.println("❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀");
			System.out.print("WELCOME TO INEURON BANK  "+uName);
			System.out.println("\n❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀");
		 System.out.println("Ineurn offers you the best deal for financing your new car. "
		 					+ "Lowest interest rates, lowest EMI, minimal paperwork and quick disbursement.\n\n");
		 
		 System.out.print(" 1.TwoWheel \n 2.FourWheel \n 3.Ev Vehicles \n\n Enter Your choice :  ");
		 Scanner vt=new Scanner(System.in);
		 vehicleType= vt.nextInt();
		 switch(1)
		 {
			 case 1: twowheelROI=7;
			 		System.out.println("The Rate of intrest for TWO-WHEEL vehicles are"+twowheelROI);
			 		towWheel();
			 		break;
			 case 2: fourWheelROI=8;
			 		System.out.println("The Rate of intrest for FOUR-WHEEL vehicles are"+fourWheelROI);
			 		fourWheel() ;
			 		break;
			 case 3:electricVehicleROI=4;
					 System.out.println("The Rate of intrest for ELECTRIC-VEHICLE are"+electricVehicleROI);
					 evVehicles() ;
					 		break;
			 
			 default:System.out.println("invalid choice");
		 		
		 }//switch close
		 
		 
		
		 
	 }
 }
 //VEHICLE LOAN CLOSE !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 
 //education loan start!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 class EducationLoan extends Bank
 {
	 	public void educationLoan() 
	 	{	
	 		System.out.println("\n\n\nBank of Ineuron\n🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰");
			System.out.println("❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀");
			System.out.print("WELCOME TO INEURON BANK  "+uName);
			System.out.println("\n❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀\n\n\n");
	 		System.out.println("A term loan granted to Indian Nationals for pursuing higher education"
	 				+ " in India or abroad where admission has been secured.\n\n\n");
	 		//------------------------
	 		int loanDuration;
			 int netAmount;
			 double educationLoanROI=8;
			 	Scanner amt=new Scanner(System.in);
				
				System.out.print("Enter the Amount You Need  "+uName+" : ");
				netAmount=amt.nextInt();
				//Take input from keyboard Duration needed
				Scanner duration=new Scanner(System.in);
				System.out.print("Enter the Loan Duration (* in months ex:12 *) : ");
				loanDuration=duration.nextInt();
				System.out.println("🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰");
				System.out.println("The net amount needed is: "+netAmount);
				System.out.println("The Loan Duration is: "+loanDuration+"Months");
				System.out.println("Education Loan Rate Of Intrest is: "+educationLoanROI);
				System.out.println("🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰");

				//System.out.println("THE MONTHLY EMI IS");
				double emi= (netAmount *0.08*Math.pow(1+0.08,loanDuration))/(Math.pow(1+0.08,loanDuration)-1);
				System.out.println("❤︎ ❤︎ ❤︎  ︎❤︎ ❤︎ ❤︎ ❤︎ ❤︎ ❤︎ ︎❤︎ ❤︎  ❤︎  ︎❤︎ ❤︎ ❤︎");
				System.out.println(uName+" THE MONTHLY EMI IS \n"+"🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰\n"+emi+"/month");
				System.out.println("❤︎ ❤︎ ❤︎  ︎❤︎ ❤︎ ❤︎ ❤︎ ❤︎ ❤︎ ︎❤︎ ❤︎  ❤︎  ︎❤︎ ❤︎ ❤︎\n\n\n");
				
				
				System.out.println("                                 🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🏻Thank You🙏🙏🙏🙏🙏🙏🙏🙏                           ");
				System.out.println("                           🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰                   \n\n\n ");
	 		//-------------------------
	 	}//method educationLoan close
 }//Education loan class close
 //Home Loan start
 class HomeLoan extends Bank
 {
	 public void  homeLoan()
	 {
		 System.out.println("\n\n\nBank of Ineuron\n🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰");
		System.out.println("❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀");
		System.out.print("WELCOME TO INEURON BANK  "+uName);
		System.out.println("\n❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀\n\n");
		 System.out.println("◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉");
		 System.out.println("About Ineuron Bank");
		 System.out.println("HOME LOAN");
		 System.out.println("◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉\n\n");
		 
		 System.out.println("Ineuron Home Loans is the largest Mortgage Lender in India,"
		 		+ " which has helped over 30 lakh families to achieve the dream of owning a home.");
		 //--------------
		 int loanDuration;
		 int netAmount;
		 double homeLoanROI=8;
		 	Scanner amt=new Scanner(System.in);
			
			System.out.print("Enter the Amount You Need  "+uName+" : ");
			netAmount=amt.nextInt();
			//Take input from keyboard Duration needed
			Scanner duration=new Scanner(System.in);
			System.out.print("Enter the Loan Duration (* in months ex:12 *): ");
			loanDuration=duration.nextInt();
			System.out.println("🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰");
			System.out.println("The net amount needed is: "+netAmount);
			System.out.println("The Loan Duration is: "+loanDuration+"Months");
			System.out.println("Home Loan Rate Of Intrest is: "+homeLoanROI);
			System.out.println("🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰");

			//System.out.println("THE MONTHLY EMI IS");
			double emi= (netAmount *0.08*Math.pow(1+0.08,loanDuration))/(Math.pow(1+0.08,loanDuration)-1);
			System.out.println("❤︎ ❤︎ ❤︎  ︎❤︎ ❤︎ ❤︎ ❤︎ ❤︎ ❤︎ ︎❤︎ ❤︎  ❤︎  ︎❤︎ ❤︎ ❤︎");
			System.out.println(uName+" THE MONTHLY EMI IS \n"+"🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰\n"+emi+"/month");
			System.out.println("❤︎ ❤︎ ❤︎  ︎❤︎ ❤︎ ❤︎ ❤︎ ❤︎ ❤︎ ︎❤︎ ❤︎  ❤︎  ︎❤︎ ❤︎ ❤︎\n\n\n");
			
			
			System.out.println("                                 🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🏻Thank You🙏🙏🙏🙏🙏🙏🙏🙏                           ");
			System.out.println("                           🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰                   \n\n\n ");
		 //-------------
		 
	 }
 }
//main method 
public class Loans {
	
	public static void main(String[] args) {
		
		System.out.println("                              🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🏻‍Welcome To ineuron Bank🙏🙏🙏🙏🙏🙏🙏🙏                      ");
		System.out.println("                               🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰                    ");
		System.out.println("Types of loan we provide ⬇\n"+
						 "1❭PERSONAL LOAN \n"+
						 "2❭VEHICLE LOAN \n" +
						 "3❭EDUCATION LOAN  \n"+
						 "4❭HOME LOAN \n" +
						 "5❭Exit");
		
		
						
							Scanner cho=new Scanner(System.in);
							//TAKE INPUT FROM USER 
							System.out.print("ENTER YOUR CHOICE : ︎");
							
								int choice=cho.nextInt();
							while(choice!=5)
							{
									switch(choice)
									{
											case 1: PersnolLoan pl=new PersnolLoan();
													pl.bankDetails();
													pl.persnolLoanEmiCalculator();
													pl.monthlyEmi();
													break;
											case 2: VehicleLoan vl=new VehicleLoan();
													vl.bankDetails();
													vl.vehicleLoanEmiCalculator();
													break;
											case 3: EducationLoan el=new EducationLoan();
													el.bankDetails();
													el.educationLoan();
													break;
											case 4:HomeLoan hl=new HomeLoan();
													hl.bankDetails();
													hl.homeLoan();
													break;
											default:
												System.out.println("Please enter Correct option");
											
									}
									System.out.println("                              🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🏻‍Welcome To ineuron Bank🙏🙏🙏🙏🙏🙏🙏🙏                      ");
									System.out.println("                               🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰🀰                    ");
									System.out.println("Types of loan we provide ⬇\n"+
													 "1❭PERSONAL LOAN \n"+
													 "2❭VEHICLE LOAN \n" +
													 "3❭EDUCATION LOAN  \n"+
													 "4❭HOME LOAN \n" +
													  "5❭Exit");
									
									
													
										Scanner cho1=new Scanner(System.in);
										//TAKE INPUT FROM USER 
										System.out.print("︎ENTER YOUR CHOICE : ");
														
										choice=cho1.nextInt();
									
									
							}	
						}
				}
	


