package cs586;
/**
*
* @author Sivasenthil Namachivayan A20391478
*  Extends Abstract class and implements methods in DisplayGasPumpedMsg for GasPump1
*   
*/
public class DisplayGasPumpedMsg1 extends DisplayGasPumpedMsg{
	//print the total number of gallons pumped
	@Override
	public void displayGasPumpedMsg(Data data) {
		System.out.println("Gas Pumped : "+ data.getG() +" gallon(s)\n");
	}

}
