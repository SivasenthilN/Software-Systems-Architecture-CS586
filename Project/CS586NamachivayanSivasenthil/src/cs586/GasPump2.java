package cs586;
/**
*
* @author Sivasenthil Namachivayan A20391478
*  GasPump2 class consists of functions that will call methods in MdaEfsm class using references of objects being passed
*/

public class GasPump2 {
	
	MdaEfsm mdaEfsm;
	AbstractFactory abstractFactory;
	Data data;
	
	//set reference to MdaEFSM object
	public void setMdaEfsm(MdaEfsm mdaEfsm) {
		this.mdaEfsm = mdaEfsm;
	}

	//Set reference to CF object
	public void setFactory(ConcreteFactory2 concreteFactory2) {
		this.abstractFactory = concreteFactory2;
	}
	
	//Set reference to Data object
	public void setData(Data data) {
		this.data = data;
	}
	
	//verify and store data forward to MdaEfsm
	public void Activate(float a,float b, float C) {
		
		if(a>0 && b>0){
			((Data2)data).setFloatTempA(a);
			((Data2)data).setFloatTempB(b);
			((Data2)data).setFloatTempC(C);
			mdaEfsm.Activate();
		}
		
	}

	//forward to MdaEfsm
	public void Start() {		
		mdaEfsm.Start();		
	}

	//verify and store data and forward to MdaEfsm
	public void PayCash(int c) {
		if(c>0){
			((Data2)data).setFloatTempC(c);
			
			mdaEfsm.PayCash();
		}
	}
	
	//forward to MdaEfsm
	public void Cancel() {
		mdaEfsm.Cancel();
	}

	//set data and forward to MdaEfsm to select gas
	public void Premium() {
		((Data2)data).setPremiumPrice();
		mdaEfsm.SelectGas(2);
	}
	
	//set data and forward to MdaEfsm to select gas
	public void Regular(){
		((Data2)data).setRegularPrice();
		mdaEfsm.SelectGas(1);
	}
	
	//set data and forward to MdaEfsm to select gas
	public void Super1(){
		((Data2)data).setSuperPrice1();
		mdaEfsm.SelectGas(3);
	}

	//forward to MdaEfsm
	public void StartPump() {
		mdaEfsm.StartPump();		
	}

	//increment counter of liters pumped and forward to MdaEfsm
	public void PumpLiter() {
		if(((Data2)data).getFloatCash() < ( ((Data2)data).getG() + 1) * ((Data2)data).getPrice()){
				mdaEfsm.StopPump();
			}
			else{ 
				((Data2)data).setG( ( ((Data2)data).getG() + 1) );
				mdaEfsm.Pump();
			}
	}

	//forward to MdaEfsm
	public void StopPump() {
		mdaEfsm.StopPump();
		
		
	}
	
	//forward to MdaEfsm
	public void Receipt(){
		mdaEfsm.Receipt();
	}
	
	//forward to MdaEfsm
	public void NoReceipt(){
		mdaEfsm.NoReceipt();
	}

}
