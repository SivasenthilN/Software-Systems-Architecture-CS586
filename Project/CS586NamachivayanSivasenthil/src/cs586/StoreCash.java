package cs586;
/**
*
* @author Sivasenthil Namachivayan A20391478
*  Abstract class whose methods will be called by concrete classes for implementation
*   
*/
public abstract class StoreCash {
	Data data;

	public abstract void storeCash();

	public void setCash(Data data) {
		this.data = data;
	}
}
