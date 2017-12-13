package cs586;
/**
*
* @author Sivasenthil Namachivayan A20391478
*  This class extends States and implements methods for S3 state
*   
*/
public class S3 extends States {

	//forward to outputprocessor
	public void Cancel(){
		outputProcessor.DisplayCancelMsg();
		outputProcessor.PrintNoReceipt();
	}
	
	//forward to outputprocessor
	public void SelectGas(int g){
		outputProcessor.SetPrice(g);
	}
}
