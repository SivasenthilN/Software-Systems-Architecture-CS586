package cs586;
/**
*
* @author Sivasenthil Namachivayan A20391478
*  extends abstract class StoreData and implements it for GasPump2
*   
*/
public class StoreData2 extends StoreData {

	//stores user input values for premium, super  and regular gas 
	@Override
	public void storeData() {
		float a = data.getFloatTempA();		
		float b = data.getFloatTempB();
		float c = data.getFloatTempC();
		data.setPriceRegular(a);
		data.setPriceSuperPremium(b);
		data.setPriceSuper1(c);
	}

}
