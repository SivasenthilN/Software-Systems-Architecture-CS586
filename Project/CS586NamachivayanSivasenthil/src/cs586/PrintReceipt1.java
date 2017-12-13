package cs586;
/**
*
* @author Sivasenthil Namachivayan A20391478
*  Extends Abstract class and implements PrintReceipt for GasPump1
*   
*/
public class PrintReceipt1 extends PrintReceipt{
	//print receipt by showing number of gallons pumped and total cost
	@Override
	public void printReceipt(Data data) {
		System.out.println("GasPump1 receipt: "+ data.getG() +"gallons for $"+ data.getTotal());
	}

	

}
