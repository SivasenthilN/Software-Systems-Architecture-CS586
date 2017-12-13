package cs586;
/**
*
* @author Sivasenthil Namachivayan A20391478
*  Includes methods that will print generic messages for all gas pumps
*   
*/
public class Messages {
	//reject message
	public void displayRejectMsg() {
		System.out.println("\n Credit Card has been Rejected");
	}

	//ready message
	public void displayReadyMsg() {
		System.out.println("\n Ready to Start Pumping Gas");
	}

	//stop message
	public void displayStopMsg() {
		System.out.println("Done with pumping the Selected Gas");
	}

	//cancel message
	public void displayCancelMsg() {
		System.out.println("\n Transaction Cancelled");
	}

}
