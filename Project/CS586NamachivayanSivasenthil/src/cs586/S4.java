package cs586;
/**
*
* @author Sivasenthil Namachivayan A20391478
*  This class extends States and implements methods for S4 state
*   
*/
public class S4 extends States {

	//forward to outputprocessor
	public void StartPump(){
		outputProcessor.SetInitialValues();
		outputProcessor.DisplayReadyMsg();
	}
	
}
