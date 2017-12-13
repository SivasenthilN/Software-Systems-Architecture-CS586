package cs586;
/**
*
* @author Sivasenthil Namachivayan A20391478
*  Includes all the methods from AbstractFactory which will be used by GasPump2 and its methods to get specific concrete objects
*   
*/
public class ConcreteFactory2 extends AbstractFactory {


	//get object of type Data2
	public Data getData() {
		Data2 data2 = new Data2();
		
		return data2;
	}

	//get object of type StoreData2
	@Override
	public StoreData getStoreData() {
		StoreData2 storedata2 = new StoreData2();
		
		return storedata2;
	}

	//get object of type DisplayMenu2
	@Override
	public DisplayMenu getDisplayMenu() {
		DisplayMenu2 displayMenu2= new DisplayMenu2();
		
		return displayMenu2;
	}

	//get object of type PumpGasUnit2
	@Override
	public PumpGasUnit getPumpGasUnit() {
		PumpGasUnit2 pumpGasUnit2 = new PumpGasUnit2();
		
		return pumpGasUnit2;
	}

	//get object of type PrintReceipt2
	@Override
	public PrintReceipt getPrintReceipt() {
		PrintReceipt2 printReceipt2 = new PrintReceipt2();
		
		return printReceipt2;
	}
	
	//get object of type PrintNoReceipt2
	@Override
	public PrintNoReceipt getPrintNoReceipt() {
		PrintNoReceipt2 printNoReceipt2 = new PrintNoReceipt2();
		
		return printNoReceipt2;
	}
	
	//get object of type StoreCash2
	@Override
	public StoreCash getStoreCash() {
		StoreCash2 storeCash2 = new StoreCash2();
		
		return storeCash2;
	}

	//get object of type DisplayGasPumpedMsg2
	@Override
	public DisplayGasPumpedMsg getDisplayGasPumpedMsg() {
		DisplayGasPumpedMsg2 displayGasPumpedMsg2 = new DisplayGasPumpedMsg2();
		
		return displayGasPumpedMsg2;
	}

	//get object of type SetInitialValues2
	@Override
	public SetInitialValues getSetInitialValues() {
		SetInitialValues2 setInitialValues2= new SetInitialValues2();
		
		return setInitialValues2;
	}

	//get object of type SetPrice2
	@Override
	public SetPrice getSetPrice() {
		SetPrice2 setPrice2 = new SetPrice2();
		
		return setPrice2;
	}

	//get object of type Messages
	@Override
	public Messages getMessages() {
		// TODO Auto-generated method stub
		Messages messages= new Messages();
		return messages;
	}
	
	//get object of type DisplayPayMsg2
	@Override
	public DisplayPayMsg getDisplayPayMsg() {
		// TODO Auto-generated method stub
		DisplayPayMsg2 displayPayMsg2 = new DisplayPayMsg2();
		return displayPayMsg2;
	}
	
	
}
