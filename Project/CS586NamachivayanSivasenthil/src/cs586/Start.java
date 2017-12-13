package cs586;
/**
*
* @author Sivasenthil Namachivayan A20391478
*  This class extends States and implements methods for Start state
*   
*/
public class Start extends States {
	
	public void Activate(){
	}
	//forward to outputprocessor
	public void StoreData(){
		outputProcessor.StoreData();
	}
}
