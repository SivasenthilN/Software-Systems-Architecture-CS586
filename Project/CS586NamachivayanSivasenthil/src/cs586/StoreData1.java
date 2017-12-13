package cs586;
/**
*
* @author Sivasenthil Namachivayan A20391478
*  extends abstract class StoreData and implements it for GasPump1
*   
*/
public class StoreData1 extends StoreData {

	//stores user input values for premium and regular gas 
	@Override
	public void storeData() {
		float a = data.getFloatTempA();						
		float b = data.getFloatTempB();		
		data.setPriceRegular(a);
		data.setPriceSuperPremium(b);
	}

}
