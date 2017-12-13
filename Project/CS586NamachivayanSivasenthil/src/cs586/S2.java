package cs586;
/**
*
* @author Sivasenthil Namachivayan A20391478
*  This class extends States and implements methods for S2 state
*   
*/
public class S2 extends States {

	//forward to outputprocessor
	public void Approved(){
		//outputProcessor.SetT(1);
		outputProcessor.DisplayMenu();
	}
	
	//forward to outputprocessor
	public void Reject(){
		outputProcessor.DisplayRejectMsg();
	}
}
