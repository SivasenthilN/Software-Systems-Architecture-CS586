package cs586;
/**
*
* @author Sivasenthil Namachivayan A20391478
*  This class extends States and implements methods for S6 state
*   
*/
public class S6 extends States {
	
	//forward to outputprocessor
	public void Receipt(){
		outputProcessor.PrintReceipt();
	}
	
	public void NoReceipt(){
		System.out.println("Transaction over, No receipt will be printed");
		outputProcessor.PrintNoReceipt();
		
		
	}
}
