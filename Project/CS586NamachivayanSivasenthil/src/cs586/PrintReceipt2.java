package cs586;
/**
*
* @author Sivasenthil Namachivayan A20391478
*  Extends Abstract class and implements PrintReceipt for GasPump2
*   
*/
public class PrintReceipt2 extends PrintReceipt{
	//print receipt by showing number of liters pumped and total cost
	@Override
	public void printReceipt(Data data) {
		System.out.println("GasPump2 receipt: "+ data.getG() +"liters for $"+ data.getTotal());
		System.out.println("ReturnCash:"+(data.getFloatCash()-data.getTotal())+"$");
	}
}
