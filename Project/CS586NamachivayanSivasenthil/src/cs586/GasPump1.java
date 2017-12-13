package cs586;
/**
*
* @author Sivasenthil Namachivayan A20391478
*  GasPump1 class consists of functions that will call methods in MdaEfsm class using references of objects being passed
*/

public class GasPump1 {
	
	MdaEfsm mdaEfsm;
	AbstractFactory abstractFactory;
	Data data;
	
	//set reference to MdaEFSM object
	public void setMdaEfsm(MdaEfsm mdaEfsm) {
		this.mdaEfsm = mdaEfsm;
	}

	//Set reference to CF object
	public void setFactory(ConcreteFactory1 concreteFactory1) {
		this.abstractFactory = concreteFactory1;
	}

	//Set reference to Data object
	public void setData(Data data) {
		this.data = data;
	}
	
	//verify and set data and forward to MdaEfsm
	public void Activate(float a,float b) {
		
		if(a>0 && b>0){
			data.setFloatTempA(a);
			data.setFloatTempB(b);
			
			mdaEfsm.Activate();
		}
	}

	//forward to MdaEfsm
	public void Start() {		
		mdaEfsm.Start();		
	}

	//forward to MdaEfsm
	public void PayCredit() {
		mdaEfsm.PayCredit();		
	}

	//forward to MdaEfsm
	public void Reject() {
		mdaEfsm.Reject();
	}

	//forward to MdaEfsm
	public void Cancel() {
		mdaEfsm.Cancel();
	}

	//forward to MdaEfsm
	public void Approved() {
		mdaEfsm.Approved();		
	}

	//set price as super gas price and forward to MdaEfsm
	public void Super() {
		
		((Data1)data).setSuperPrice();
		mdaEfsm.SelectGas(2);
	}
	//set price as regular price and forward to MdaEfsm
	public void Regular(){
		
		((Data1)data).setRegularPrice();
		mdaEfsm.SelectGas(1);
	}

	//forward to MdaEfsm
	public void StartPump() {
		mdaEfsm.StartPump();	
	}
	
	//forward to MdaEfsm
	public void Receipt(){
		mdaEfsm.Receipt();
	}
	
	//increment count and forward to MdaEfsm
	public void PumpGallon() {
		data.setG((((Data1)data).getG() + 1));
		mdaEfsm.Pump();
	}

	//forward to MdaEfsm and also ask for receipt to be printed
	public void StopPump() {
		mdaEfsm.StopPump();
		mdaEfsm.Receipt();
		
	}
	
	
}
