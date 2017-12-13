package cs586;
/**
*
* @author Sivasenthil Namachivayan A20391478
*  Abstract class whose methods will be called by concrete classes for implementation
*   
*/
public abstract class StoreData {
	
	Data data;

	public abstract void storeData();

	public void setData(Data data) {
		this.data = data;
	}

}
