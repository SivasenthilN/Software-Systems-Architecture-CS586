package cs586;
/**
*
* @author Sivasenthil Namachivayan A20391478
*  This class implements data elements for GasPump1 and includes methods for manipulation
*   
*/
public class Data1 extends Data {
	
	static float tempA;						//stores user input
	static float tempB;						//stores user input
	static int t; 							//cash(0) or credit(1)
	static int g;							//units of gas pumped
	static float total;						//total for printing receipt
	static float price;						//price of gas selected for pumping
	static float priceRegular;				//stores price of regular gas
	static float priceSuper;				//stores price of super gas
	
	public float getFloatTempA() {
		return tempA;
	}
	public void setFloatTempA(float tempA) {
		Data1.tempA = tempA;
	}
	public float getFloatTempB() {
		return tempB;
	}
	public void setFloatTempB(float tempB) {
		Data1.tempB = tempB;
	}
	public int getT() {
		return t;
	}
	public void setT(int t) {
		Data1.t = t;
	}
	public int getG() {
		return g;
	}
	public void setG(int g) {
		Data1.g = g;
	}
	public float getTotal(){
		Data1.total = (Data1.g * Data1.price);		//calculates total from current g and price and returns
		return Data1.total;
	}
	public float getPriceRegular() {
		return priceRegular;
	}
	public void setPriceRegular(float priceRegular) {
		Data1.priceRegular = priceRegular;                                                              
	}
	public float getPriceSuperPremium() {
		return priceSuper;																				
	}
	public void setPriceSuperPremium(float priceSuperPremium) {
		Data1.priceSuper = priceSuperPremium;																	
	}	
	public void setTotal(float total) {
		Data1.total = total;
	}
	public float getPrice() {
		return price;
	}
	public void setRegularPrice() {
		Data1.price = priceRegular;
	}
	public void setSuperPrice() {
		Data1.price = priceSuper;
	}
	
}
