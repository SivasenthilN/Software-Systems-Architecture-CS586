package cs586;
/**
*
* @author Sivasenthil Namachivayan A20391478
*  extends abstract class and implements SetInitialValues for GasPump1
*   
*/
public class SetInitialValues1 extends SetInitialValues {
	//set units of gas pumped and total cost to zero
	@Override
	public void setInitialValues(Data data) {
		data.setG(0);
		data.setTotal(0);
	}

}
