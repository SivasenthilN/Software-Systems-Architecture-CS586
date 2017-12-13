package cs586;
/**
*
* @author Sivasenthil Namachivayan A20391478
*  extends SetPrice and implements SetPrice for GasPump2
*   
*/
public class SetPrice2 extends SetPrice {

	@Override
	public void setPrice(Data data) {
		// TODO Auto-generated method stub
		System.out.println("The Price of the Gas you selected is"+ ((Data2)data).getPrice());
	}

}
