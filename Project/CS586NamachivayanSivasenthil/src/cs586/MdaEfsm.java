package cs586;
/**
*
* @author Sivasenthil Namachivayan A20391478
*  MdaEfsm class is responsible for changing the state of the system (centralized pattern)
*/
public class MdaEfsm {
	
	States currentState;
	States[] listOfStates = new States[8];
	
	public void setState(States states){
		currentState = states;
		
	}

	//list of states which get passed as parameters and this function stores the states in a list
	public void setListOfStates(States a,States b,States c,States d,States e,States f,States g,States h){
		listOfStates[0] = a;
		listOfStates[1] = b;
		listOfStates[2] = c;
		listOfStates[3] = d;
		listOfStates[4] = e;
		listOfStates[5] = f;
		listOfStates[6] = g;
		listOfStates[7] = h;
		this.currentState = listOfStates[7];
	}
	
	//forwards to same function name of current state if the current state is correct
	public void Activate(){															
		int currState = currentState.getStateId();				
		switch(currState)
		{
			case 0: break;
			case 1: break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 6: break; 
			
			case 7:											
					currentState.Activate();
					currentState.StoreData();
					currentState = listOfStates[0];
					break;
		};
	}
	
	//forwards to same function name of current state if the current state is correct
	public void Start(){
		int currState = currentState.getStateId();
		switch(currState){
			
			case 0: 

				currentState.Start();
				currentState = listOfStates[1];
				break;
					
			case 1: break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 6: break; 
			
			case 7: break;
		
		};
	}
	
	//forwards to same function name of current state if the current state is correct
	public void PayCredit(){
		int currState = currentState.getStateId();
		switch(currState){
			
			case 0: break;
			case 1: 
					currentState.PayCredit();
					currentState = listOfStates[2];
					break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 6: break; 
			case 7:	break;
			
		
		};
	}
	
	//forwards to same function name of current state if the current state is correct
	public void PayCash(){
		int currState = currentState.getStateId();
		switch(currState){
			
			case 0: break;
			case 1: 
				currentState.PayCash();
				currentState.StoreCash();
				currentState.setT(0);
				currentState = listOfStates[3];
				break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 6: break; 
			case 7:	break;
			
		
		};
	}
	
	//forwards to same function name of current state if the current state is correct
	public void Reject(){
		int currState = currentState.getStateId();
		switch(currState){
			
			case 0: break;
			case 1: break;
			case 2: 
				currentState.Reject();
				currentState = listOfStates[0];
				break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 6: break; 
			case 7:	break;
			
		
		};
	}
	
	//forwards to same function name of current state if the current state is correct
	public void Cancel(){
		int currState = currentState.getStateId();
		switch(currState){
			
			case 0: break;
			case 1: break;
			case 2: break;
			case 3: 
				currentState.Cancel();
				currentState = listOfStates[0];
				break;
				
			case 4: break;
			case 5: break;
			case 6: break; 
			case 7:	break;
			
		
		};
		
	}
	
	//forwards to same function name of current state if the current state is correct
	public void Approved(){
		int currState = currentState.getStateId();
		switch(currState){
			
			case 0: break;
			case 1: break;
			case 2: 
				currentState.Approved();
				currentState.setT(1);
				currentState = listOfStates[3];
				break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 6: break; 
			case 7:	break;
			
		
		};
		
	}
	
	//forwards to same function name of current state if the current state is correct
	public void StartPump(){
		int currState = currentState.getStateId();
		switch(currState){
			
			case 0: break;
			case 1: break;
			case 2: break;
			case 3: break;
			case 4: 
				//to5
				
					currentState.StartPump();
					
					currentState = listOfStates[5];
				    break;
			case 5: break;
			case 6: break; 
			case 7:	break;
			
		
		};
		
	}
	
	//forwards to same function name of current state if the current state is correct
	public void Pump(){
		int currState = currentState.getStateId();
		switch(currState){
			
			case 0: break;
			case 1: break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: 
				//to5
					
					currentState.Pump();
				break;
			case 6: break; 
			case 7:	break;
			
		
		};
		
	}
	
	//forwards to same function name of current state if the current state is correct
	public void StopPump(){
		int currState = currentState.getStateId();
		switch(currState){
			
			case 0: break;
			case 1: break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: 
				//to6
				currentState.StopPump();
				currentState = listOfStates[6];
				break;
			case 6: break; 
			case 7:	break;
			
		
		};
	}
	
	//forwards to same function name of current state if the current state is correct
	public void SelectGas(int g){
		int currState = currentState.getStateId();
		switch(currState){
			
			case 0: break;
			case 1: break;
			case 2: break;
			case 3: 
				currentState.SelectGas(g);
				//currentState.SetPrice(g);
				currentState = listOfStates[4];
				break;
			case 4: break;
			case 5: break;
			case 6: break; 
			case 7:	break;
			
		
		};
		
	}
	
	//forwards to same function name of current state if the current state is correct
	public void Receipt(){
		int currState = currentState.getStateId();
		switch(currState){
			
			case 0: break;
			case 1: break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 6: 
				//to0
				currentState.Receipt();
				currentState = listOfStates[0];
				break; 
			case 7:	break;
			
		
		};
		
	}
	
	//forwards to same function name of current state if the current state is correct
	public void NoReceipt(){
		int currState = currentState.getStateId();
		switch(currState){
			
			case 0: break;
			case 1: break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 6: 
				//to0
				currentState.NoReceipt();
				currentState = listOfStates[0];
				
				break; 
			case 7:	break;
			
		
		};
		
	}

	//this is only for testing purposes.. to check the current state of the machine
	public int getCurrentStateId() {
		return currentState.getStateId();
	}
	
}
