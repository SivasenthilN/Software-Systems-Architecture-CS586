package cs586;
/**
*
* @author Sivasenthil Namachivayan A20391478
*  This class extends States and implements methods for S5 state
*   
*/
public class S5 extends States {
	
	//forward to outputprocessor
	public void Pump(){
		outputProcessor.PumpGasUnit();
		outputProcessor.DisplayGasPumpedMsg();
	}
	
	//forward to outputprocessor
	public void StopPump(){
		outputProcessor.DisplayStopMsg();
	}
}
