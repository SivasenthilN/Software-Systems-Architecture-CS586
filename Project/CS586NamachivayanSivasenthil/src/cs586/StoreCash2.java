package cs586;
/**
*
* @author Sivasenthil Namachivayan A20391478
*  Extends Abstract class and implements StoreCash for GasPump2
*   
*/
public class StoreCash2 extends StoreCash{
	//store user given cash in data2
	@Override
	public void storeCash() {
		float c = data.getFloatTempC();	
		data.setFloatCash(c);
	}

}
