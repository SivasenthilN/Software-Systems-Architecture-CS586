package cs586;
/**
*
* @author Sivasenthil Namachivayan A20391478
*  Includes all the methods from AbstractFactory which will be used by GasPump1 and its methods to get specific concrete objects
*   
*/
public class ConcreteFactory1 extends AbstractFactory {

	/*private static final ReturnCash ReturnCash2 = null;*/
	//get object of type Data1
	public Data1 getData() {
		Data1 data1 = new Data1();
		
		return data1;
	}

	//get object of type StoreData1
	@Override
	public StoreData getStoreData() {
		StoreData1 storedata1 = new StoreData1();
		
		return storedata1;
	}

	//get object of type DisplayMenu1
	@Override
	public DisplayMenu getDisplayMenu() {
		DisplayMenu1 displayMenu1 = new DisplayMenu1();
		
		return displayMenu1;
	}

	//get object of type PumpGasUnit1
	@Override
	public PumpGasUnit getPumpGasUnit() {
		PumpGasUnit1 pumpGasUnit1 = new PumpGasUnit1();
		
		return pumpGasUnit1;
	}

	//get object of type PrintReceipt1
	@Override
	public PrintReceipt getPrintReceipt() {
		PrintReceipt1 printReceipt1 = new PrintReceipt1();
		
		return printReceipt1;
	}
	//get object of type PrintNoReceipt1
	@Override
	public PrintNoReceipt getPrintNoReceipt() {
		PrintNoReceipt1 printNoReceipt1 = new PrintNoReceipt1();
		
		return printNoReceipt1;
	}

	//will return null because cash is not used in GP1
	@Override
	public StoreCash getStoreCash() {
		return null;
	}

	//get object of type GasPumpedMsg1
	@Override
	public DisplayGasPumpedMsg getDisplayGasPumpedMsg() {
		DisplayGasPumpedMsg1 displayGasPumpedMsg1 = new DisplayGasPumpedMsg1();
		
		return displayGasPumpedMsg1;
	}

	//get object of type SetInitialValues1
	@Override
	public SetInitialValues getSetInitialValues() {
		SetInitialValues1 setInitialValues1 = new SetInitialValues1();
		
		return setInitialValues1;
		
	}

	//get object of type SetPrice1
	@Override
	public SetPrice getSetPrice() {
		SetPrice1 setPrice1 = new SetPrice1();
		
		return setPrice1;
	}
	
	//get object of type Messages
	@Override
	public Messages getMessages() {
		// TODO Auto-generated method stub
		Messages messages= new Messages();
		return messages;
	}

	
	@Override
	public DisplayPayMsg getDisplayPayMsg() {
		// TODO Auto-generated method stub
		DisplayPayMsg1 displayPayMsg1 = new DisplayPayMsg1();
		return displayPayMsg1;
	}

}
