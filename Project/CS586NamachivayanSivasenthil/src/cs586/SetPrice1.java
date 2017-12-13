package cs586;
/**
*
* @author Sivasenthil Namachivayan A20391478
*  extends SetPrice and implements SetPrice for GasPump1
*   
*/
public class SetPrice1 extends SetPrice {

	@Override
	public void setPrice(Data data) {
		// TODO Auto-generated method stub
		System.out.println("The Price of the Gas you selected is "+ ((Data1)data).getPrice());
	}

}
