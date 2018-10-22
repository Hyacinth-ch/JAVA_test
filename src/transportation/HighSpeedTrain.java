package transportation;

import java.util.Scanner;

class HighSpeedTrain extends Transport implements JourneyConsumption,VehicleTime {
	
	public HighSpeedTrain() {}
	
	public HighSpeedTrain(float timeToStation,float timeReturn,float timeForTicket,
	          float timeForSecurityCheck,float timeForWait,float speed,
	          float unitPrice,float cost,float journeyTime) 
	{
		super(timeToStation,timeReturn,timeForTicket,
			timeForSecurityCheck,timeForWait,speed,unitPrice,cost,journeyTime);
		
	}
	
	public float calculateConsumption(float a,float b,float c,float d,float e) {
		
		return (a+b+c+d+e) ;
		
	}

public float journeyConsumption(float p,float d) {
		
		return p*d ;
		
	}
	
	public float vehicleTime(float s,float d ) {
		return d/s ;
	}
	
}