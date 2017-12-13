package cs586;
/**
*
* @author Sivasenthil Namachivayan A20391478
*  This class includes all the methods that will be implemented by the ConcreteFactory inheriting it.
*   
*/
public abstract class AbstractFactory {
	public abstract StoreData getStoreData(); 
	public abstract DisplayMenu getDisplayMenu();
	public abstract PumpGasUnit getPumpGasUnit();
	public abstract PrintReceipt getPrintReceipt();
	public abstract PrintNoReceipt getPrintNoReceipt();
	public abstract StoreCash getStoreCash();
	public abstract DisplayGasPumpedMsg getDisplayGasPumpedMsg();
	public abstract SetInitialValues getSetInitialValues();
	public abstract SetPrice getSetPrice();
	public abstract Messages getMessages();
	public abstract DisplayPayMsg getDisplayPayMsg();
}
