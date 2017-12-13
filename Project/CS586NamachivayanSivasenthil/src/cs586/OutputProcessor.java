package cs586;
/**
*
* @author Sivasenthil Namachivayan A20391478
*  This class processes and requests relevant concrete factory objects from the abstract factory and calls them
*   
*/
public class OutputProcessor {
	
	AbstractFactory abstractFactory;
	Data data;
	Messages messages;
	
	//set the pointer abstract factory to the ConcreteFactory object argument
	public void setAbstractFactory(AbstractFactory abstractFactory) {
		this.abstractFactory = abstractFactory;
	}
	//set the pointer to the passed data object argument
	public void setData(Data data) {
		this.data = data;
	}
	
	//request and return the correct concrete object and call it
	public void StoreData(){
		StoreData storeData;
		
		storeData = abstractFactory.getStoreData();		
		storeData.setData(data);
		storeData.storeData();						
	}
	
	//request and return the correct concrete object and call it
	public void StoreCash(){
		StoreCash storeCash = abstractFactory.getStoreCash();
		storeCash.setCash(data);
		storeCash.storeCash();
	}
	
	//request and return the correct concrete object and call it
	public void DisplayMenu(){
		DisplayMenu displayMenu;
		displayMenu = abstractFactory.getDisplayMenu();
		displayMenu.displayMenu();
	}
	
	//request and return the correct concrete object and call it
	public void DisplayPayMsg(){
		DisplayPayMsg displayPayMsg;
		displayPayMsg = abstractFactory.getDisplayPayMsg();
		displayPayMsg.displayPayMsg();
	}
	
	//request and return the correct concrete object and call it
	public void PumpGasUnit(){
		PumpGasUnit pumpGasUnit;
		pumpGasUnit = abstractFactory.getPumpGasUnit();
		pumpGasUnit.pumpGasUnit(); 
	}
	
	//request and return the correct concrete object and call it
	public void PrintReceipt(){
		PrintReceipt printReceipt;
		printReceipt = abstractFactory.getPrintReceipt();
		printReceipt.printReceipt(data);
	}
	
	//request and return the correct concrete object and call it
		public void PrintNoReceipt(){
			PrintNoReceipt printNoReceipt;
			printNoReceipt = abstractFactory.getPrintNoReceipt();
			printNoReceipt.printNoReceipt(data);
		}
	//request and return the correct concrete object and call it
	public void DisplayRejectMsg(){
		messages = abstractFactory.getMessages();
		messages.displayRejectMsg();
	}
	
	//request and return the correct concrete object and call it
	public void SetPrice(int g){
		SetPrice setPrice = abstractFactory.getSetPrice();
		setPrice.setPrice(data);
	}
	
	//request and return the correct concrete object and call it
	public void DisplayReadyMsg(){
		messages = abstractFactory.getMessages();
		messages.displayReadyMsg();
	}
	
	//request and return the correct concrete object and call it
	public void SetInitialValues(){
		this.data.setG(0);
		this.data.setTotal(0);
	}
	
	//request and return the correct concrete object and call it
	public void DisplayGasPumpedMsg(){
		DisplayGasPumpedMsg displayGasPumpedMsg = abstractFactory.getDisplayGasPumpedMsg();
		displayGasPumpedMsg.displayGasPumpedMsg(data);
	}
	
	//request and return the correct concrete object and call it
	public void DisplayCancelMsg(){
		messages = abstractFactory.getMessages();
		messages.displayCancelMsg();
	}
	
	//request and return the correct concrete object and call it
	public void DisplayStopMsg() {
		messages = abstractFactory.getMessages();
		messages.displayStopMsg();
	}
	
	
}
