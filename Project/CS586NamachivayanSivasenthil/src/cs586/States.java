package cs586;
/**
*
* @author Sivasenthil Namachivayan A20391478
*  This class is used by all state objects and includes methods that are going be called by the state objects
*   
*/
public class States {
	int stateId;	
	OutputProcessor outputProcessor;	//pointer to OP
	
	public int getStateId(){
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	
	public void setOutputProcessor(OutputProcessor outputProcessor) {
		this.outputProcessor = outputProcessor;
	}
	
	public void Activate(){};   	//Start
	public void Start(){};			//S0
	public void PayCredit(){};		//S1
	public void PayCash(){};		//S1
	public void Reject(){};			//S2
	public void Cancel(){};			//S3
	public void Approved(){};		//S2
	public void StartPump(){};		//S4
	public void Pump(){};			//S5
	public void StopPump(){};		//S5
	public void SelectGas(int G){};	//S3
	public void Receipt(){};		//S6
	public void NoReceipt(){}		//S6
	public void StoreData(){}		//S1
	public void StoreCash(){}		//S1
	public void setT(int i) {}		//S1,S2
	public void SetPrice(int g) {}//S3
	public void ReturnCash() {} //S6
	
	
}
