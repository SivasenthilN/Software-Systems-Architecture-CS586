package cs586;
/**
*
* @author Sivasenthil Namachivayan A20391478
*  This class extends States and implements methods for S1 state
*   
*/
public class S1 extends States {
	public void PayCredit(){
	}
	
	//forward to outputprocessor
	public void PayCash(){
		//outputProcessor.SetT(0);
		outputProcessor.DisplayMenu();
		
	}
	
	//forward to outputprocessor
	public void StoreCash(){
		outputProcessor.StoreCash();
		
	}
}
