package cs586;

/**
*
* @author Sivasenthil Namachivayan A20391478
* This is the main starting class of the project and has the main function of the project. 
* The user will be provided a menu to choose the instance of the GasPump that must be run from the 2 GasPumps.
* Inputs for various arguments will be taken from the user in this class. 
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GasPumpMain {

	public static void main(String[] args) {
		
        try{	int choice=0;
        	BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        	
        	System.out.println("****CS-586 Software Systems Architecture**** \n Done by Sivasenthil Namachivayan (A20391478) \n");																				// User can select an instance of GasPump
            System.out.println("Select the Pump you want to use :");
            System.out.println("1. GasPump-1 :");
            System.out.println("2. GasPump-2 :");

            choice=(int)Float.parseFloat(buf.readLine()); 										// give the choice for the user to choose the gas pump
            System.out.println("You choosed the Gaspump:"+choice);
        	
            switch(choice)
            {
                case 1:
                {
                    GasPump1 gasPump1 = new GasPump1();					//create the gaspump1 object
                    	
                    S0 s0 = new S0();									//Instantiate all the states of the State Pattern
                    S1 s1 = new S1();
                    S2 s2 = new S2();
                    S3 s3 = new S3();
                    S4 s4 = new S4();
                    S5 s5 = new S5();
                    S6 s6 = new S6();
                    Start s7 = new Start();
                    
                    MdaEfsm mdaEfsm= new MdaEfsm();								//instantiate MDA
                    OutputProcessor outputProcessor = new OutputProcessor();	//instantiate OutputProcessor
                    ConcreteFactory1 concreteFactory1 = new ConcreteFactory1();	//instantiate correct ConcreteFactory
                    
                    Data data;
                    data = concreteFactory1.getData();							//get data of ConcreteFactory
                    
                    
                    gasPump1.setMdaEfsm(mdaEfsm);								//set GasPump1 to access MDA
                    gasPump1.setFactory(concreteFactory1);						//set GasPump1 to use ConcreteFactory1
                    gasPump1.setData(data);
                    
                    
                    
                    s0.setOutputProcessor(outputProcessor); 				//create connections between the states and IDs
                    s0.setStateId(0);
                    
                    s1.setOutputProcessor(outputProcessor);
                    s1.setStateId(1);
                    
                    s2.setOutputProcessor(outputProcessor);
                    s2.setStateId(2);
                    
                    s3.setOutputProcessor(outputProcessor);
                    s3.setStateId(3);
                    
                    s4.setOutputProcessor(outputProcessor);
                    s4.setStateId(4);
                    
                    s5.setOutputProcessor(outputProcessor);
                    s5.setStateId(5);
                    
                    s6.setOutputProcessor(outputProcessor);
                    s6.setStateId(6);
                    
                    s7.setOutputProcessor(outputProcessor);
                    s7.setStateId(7);
                    
                    mdaEfsm.setListOfStates(s0,s1,s2,s3,s4,s5,s6,s7);		//set all states to MDA
                    
                    outputProcessor.setData(data);
                    outputProcessor.setAbstractFactory(concreteFactory1);	//set ConcreteFactory1
                    
                    String input=null;
                    int i;
                    while(true)
                    {
                        System.out.println("Enter the number for your Operation in sequence:  \n 1.Activate 2.Start 3.PayCredit 4.Reject 5.Cancel 6.Approved 7.SuperGas 8.RegularGas 9.StartPump 10.PumpGallon 11.StopPump");

                        input=buf.readLine();
                        i=Integer.parseInt(input);
                        
                        switch(i)
                        {
                            case 1: 													//Accept inputs for regulargas and supergas and activate them
                            	System.out.println("Enter the price($) for Regular Gas");
                                float a = Float.parseFloat(buf.readLine());
                                System.out.println("Enter the price($) for Super Gas");
                                float b = Float.parseFloat(buf.readLine());
                               	gasPump1.Activate(a,b);	
                               	break;

                            case 2: 													//start
                            	gasPump1.Start();
                                break;
                                
                            case 3:														//paycredit  
                            	gasPump1.PayCredit();
                            	System.out.println("You have Inserted the Credit Card- Waiting for approval\n");
                                break;

                            case 4: 													//Reject
                            	gasPump1.Reject();
                                break;

                            case 5: 													//Cancel transaction
                            	gasPump1.Cancel();
                                break;

                            case 6: 													//Card approved
                            	gasPump1.Approved();
                                break;

                            case 7: 													//super gas
                            	gasPump1.Super();
                                break;
                                	
                            case 8: 													//regular gas
                            	gasPump1.Regular();
                                break;
                                
                            case 9: 													//startpump
                            	gasPump1.StartPump();
                            	break;
                            	
                            case 10:													//pumpGallon	
                            	gasPump1.PumpGallon();	
                            	break;
                            	
                            case 11:gasPump1.StopPump();								//stopPump
                            		break;
                     
                            	
                            default: 
                                System.out.println("You have entered the incorrect choice of the operation, please try again with the correct choice");
                        }
                    }
                }
                case 2:
                {
                    GasPump2 gasPump2 = new GasPump2();					//create the gaspump 2 object
                    
                    S0 s0 = new S0();									//instantiate all the states of the State pattern
                    S1 s1 = new S1();
                    S2 s2 = new S2();
                    S3 s3 = new S3();
                    S4 s4 = new S4();
                    S5 s5 = new S5();
                    S6 s6 = new S6();
                    Start s7 = new Start();
                    
                    MdaEfsm mdaEfsm= new MdaEfsm();						//instantiate MDA
                    OutputProcessor outputProcessor = new OutputProcessor();		//instantiate OutputProcessor
                    ConcreteFactory2 concreteFactory2 = new ConcreteFactory2();		//instantiate ConcreteFactory2
                    
                    Data data;
                    data = concreteFactory2.getData();					//get Data2 from ConcreteFactory2

                    gasPump2.setMdaEfsm(mdaEfsm);						//set gasPump MDA pointer
                    gasPump2.setFactory(concreteFactory2);				//set gasPump CconcreteFactory2 pointer
                    gasPump2.setData(data);								//set Data2 to GasPump2
                    
                    
                    s0.setOutputProcessor(outputProcessor); 			//instantiate all states of State OO Pattern
                    s0.setStateId(0);
                    
                    s1.setOutputProcessor(outputProcessor);
                    s1.setStateId(1);
                    
                    s2.setOutputProcessor(outputProcessor);
                    s2.setStateId(2);
                    
                    s3.setOutputProcessor(outputProcessor);
                    s3.setStateId(3);
                    
                    s4.setOutputProcessor(outputProcessor);
                    s4.setStateId(4);
                    
                    s5.setOutputProcessor(outputProcessor);
                    s5.setStateId(5);
                    
                    s6.setOutputProcessor(outputProcessor);
                    s6.setStateId(6);
                    
                    s7.setOutputProcessor(outputProcessor);
                    s7.setStateId(7);
                    
                    mdaEfsm.setListOfStates(s0,s1,s2,s3,s4,s5,s6,s7);		//set all State pattern states to MDA
                    
                    outputProcessor.setData(data);							//set OutputProcessor data as Data 2
                    outputProcessor.setAbstractFactory(concreteFactory2);	//set OutputProcessor to use ConcreteFactory2
                    
                    String input=null;
                    int i;
                    while(true)
                    {
                        System.out.println("Enter the number for your Operation in sequence::  \n 1:Activate 2.Start 3.PayCash 4.Cancel 5.PremiumGas 6.RegularGas 7.SuperGas 8.StartPump 9.PumpLiter 10.StopPump 11.Receipt 12.NoReceipt");

                        input=buf.readLine();
                        i=Integer.parseInt(input);
                        
                        switch(i)
                        {
                            case 1: 											//take input of regular gas, super gas and premium gas prices and activate them
                                
                            	System.out.println("Enter the price($) for Regular Gas");
                                float a = Float.parseFloat(buf.readLine());
                                System.out.println("Enter the price($) for Premium Gas");
                                float b = Float.parseFloat(buf.readLine());
                                System.out.println("Enter the price($) for Super Gas");
                                float C = Float.parseFloat(buf.readLine());
                                gasPump2.Activate(a,b,C);	
                               	break;
                               	

                            case 2: 											//start
                            	gasPump2.Start();


                            case 3: 											//take cash from user and PayCash
                            	System.out.println("Enter the Cash($) you want to set for this Gaspump Usage :\t");
                            	int c = (int)Float.parseFloat(buf.readLine());
                            	gasPump2.PayCash(c);
                                break;
                                
                            case 4: 											//Cancel transaction
                            	gasPump2.Cancel();
                                break;

                            case 5: 											//set premium gas
                                gasPump2.Premium();
                                break;
                            case 6: 											//set regular Gas
                            	gasPump2.Regular();
                                break;

                            case 7: 											//set Super Gas
                            	gasPump2.Super1();
                                break;
                                
                            case 8: 											//startPump
                            	gasPump2.StartPump();	
                                break;

                            case 9: 											//pump gas in liters
                            	gasPump2.PumpLiter();
                                break;

                            case 10: 											//stopPump
                            	gasPump2.StopPump(); 
                            	break;
                            	
                            case 11:											//Receipt
                            	gasPump2.Receipt();
                            	break;
                            case 12:											//No receipt to be printed
                            	gasPump2.NoReceipt();
                            	break;
                            
                            default: 
                                System.out.println("You have entered the incorrect choice of the operation, please try again with the correct choice");

                        }
                    }
                }
            }
        }
        catch(Exception exc)															//catch exceptions if any
        {
        System.out.println(exc);														//print the exception
        }
        
    
	}

}
