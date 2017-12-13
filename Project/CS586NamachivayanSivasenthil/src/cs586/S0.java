package cs586;
/**
*
* @author Sivasenthil Namachivayan A20391478
*  This class extends States and implements methods for S0 state
*   
*/
public class S0 extends States{
	//forward to outputprocessor
	public void Start(){
		outputProcessor.DisplayPayMsg();
	}
	
}
