package cs586;
/**
*
* @author Sivasenthil Namachivayan A20391478
*  extends abstract class and implements SetInitialValues for GasPump2
*   
*/
public class SetInitialValues2 extends SetInitialValues{
	//set units of gas pumped and total cost to zero
	@Override
	public void setInitialValues(Data data) {
		data.setG(0);
		data.setTotal(0);
	}

}
