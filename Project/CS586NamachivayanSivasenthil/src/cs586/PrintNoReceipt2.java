package cs586;
/**
*
* @author Sivasenthil Namachivayan A20391478
*  Extends Abstract class and implements PrintNoReceipt for GasPump2
*   
*/
public class PrintNoReceipt2 extends PrintNoReceipt{
	//print receipt by showing number of liters pumped and total cost
	@Override
	public void printNoReceipt(Data data) {
		System.out.println("ReturnCash:"+(data.getFloatCash()-data.getTotal())+"$");
	}
}
