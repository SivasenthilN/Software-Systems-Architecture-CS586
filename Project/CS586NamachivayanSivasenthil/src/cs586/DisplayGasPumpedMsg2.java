package cs586;
/**
*
* @author Sivasenthil Namachivayan
*  Extends Abstract class and implements methods in DisplayGasPumpedMsg for GasPump2
*   
*/
public class DisplayGasPumpedMsg2 extends DisplayGasPumpedMsg{
	//print the total number of liters pumped
	@Override
	public void displayGasPumpedMsg(Data data) {
		System.out.println("Gas Pumped : "+ data.getG() +" liter(s)\n");
	}

}
