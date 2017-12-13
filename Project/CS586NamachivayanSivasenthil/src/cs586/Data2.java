package cs586;
/**
*
* @author Sivasenthil Namachivayan A20391478
*  This class implements data elements for GasPump3 and includes methods for manipulation
*   
*/
public class Data2 extends Data {

	static float tempA;					//stores user input
	static float tempB;					//stores user input
	static float tempC;					//stores user input
	static int g;						//units of gas pumped
	static int t;						//cash(0) or credit(1)
	static float total;					//total for printing receipt
	static float cash;					//stores cash paid by user
	static float price;					//stores price of gas which is selected for pumping
	
	
	static float priceRegular;			//stores price of regular gas
	static float pricePremium;			//stores price of premium gas
	static float priceSuper1;			//stores price of super gas
	
	public float getFloatTempA() {
		return tempA;
	}
	public void setFloatTempA(float tempA) {
		Data2.tempA = tempA;
	}
	public float getFloatTempB() {
		return tempB;
	}
	public void setFloatTempB(float tempB) {
		Data2.tempB = tempB;
	}
	public float getFloatTempC() {
		return tempC;
	}
	public void setFloatTempC(float tempC) {
		Data2.tempC = tempC;
	}
	public int getG() {
		return g;
	}
	public void setG(int l) {
		Data2.g = l;
	}
	public float getTotal(){
		Data2.total = (Data2.g * Data2.price);		//calculates total from current g and price and returns
		return Data2.total;
	}
	public void setTotal(float total){
		Data2.total= total;
	}
	public float getPriceRegular() {
		return priceRegular;
	}
	public void setPriceRegular(float priceRegular) {
		Data2.priceRegular = priceRegular;													
	}
	public float getFloatCash(){
		return cash;
	}
	public float getPriceSuperPremium() {
		return pricePremium;
	}
	public void setPriceSuperPremium(float priceSuperPremium) {
		Data2.pricePremium = priceSuperPremium;												
	}
	public void setFloatCash(float cash) {
		Data2.cash = cash;
	}
	public float getPrice() {
		return price;
	}

	public float getPriceSuper1() {
		return priceSuper1;
	}
	public void setPriceSuper1(float priceSuper1) {
		Data2.priceSuper1 = priceSuper1;												
	}
	
	public void setPremiumPrice() {
		Data2.price = pricePremium;
	}
	public void setRegularPrice() {
		Data2.price = priceRegular;
	}
	public void setSuperPrice1() {
		Data2.price = priceSuper1;
		
	}
	
	
}
