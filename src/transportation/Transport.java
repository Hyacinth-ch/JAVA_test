package transportation;

abstract public class Transport {
	
	private float timeToStation ;  //到车站(机场)时间
	private float timeReturn ;	   //从车站(机场)返回时间
	private float timeForTicket ;  //取票时间
	private float timeForSecurityCheck ;  //安检时间
	private float timeForWait ;		//候车时间
	private float journeyTime ;     //班次时长
	private float speed ;			//车速
	private float unitPrice ;		//单价
	private float cost ;            //费用
	
	
	public Transport() {}
	
	public Transport (float timeToStation,float timeReturn,float timeForTicket,
			          float timeForSecurityCheck,float timeForWait,float speed,
			          float unitPrice,float cost,float journeyTime) 
	{
		this.timeToStation = timeToStation ;
		this.timeReturn = timeReturn ;
		this.timeForTicket = timeForTicket ;
		this.timeForSecurityCheck = timeForSecurityCheck ;
		this.timeForWait = timeForWait ;
		this.speed = speed ;
		this.unitPrice = unitPrice ;
		this.cost = cost ;
		this.journeyTime = journeyTime ;
	}
	
	//计算消出行班次外所耗时间
	public abstract float calculateConsumption(float a,float b,float c,float d,float e) ;
	
	//输出信息
	public void print() {
		System.out.println("出行耗时及耗费信息：");
		System.out.println("耗时："+this.journeyTime+"小时"+"  耗费："+this.cost+"元");
		
	}
	
	//getters and setters
	public float getTimeToStation() {
		return timeToStation;
	}
	public void setTimeToStation(float timeToStation) {
		this.timeToStation = timeToStation;
	}
	public float getTimeReturn() {
		return timeReturn;
	}
	public void setTimeReturn(float timeReturn) {
		this.timeReturn = timeReturn;
	}
	public float getTimeForTicket() {
		return timeForTicket;
	}
	public void setTimeForTicket(float timeForTicket) {
		this.timeForTicket = timeForTicket;
	}
	public float getTimeForSecurityCheck() {
		return timeForSecurityCheck;
	}
	public void setTimeForSecurityCheck(float timeForSecurityCheck) {
		this.timeForSecurityCheck = timeForSecurityCheck;
	}
	public float getTimeForWait() {
		return timeForWait;
	}
	public void setTimeForWait(float timeForWait) {
		this.timeForWait = timeForWait;
	}
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	public float getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public float getJourneyTime() {
		return journeyTime;
	}
	public void setJourneyTime(float journeyTime) {
		this.journeyTime = journeyTime;
	}
	
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
}

interface JourneyConsumption {
	
	/**
	 * 班次费用
	 * 根据对应出行方式的单价及出发地和目的地距离求得
	 */
	public abstract float journeyConsumption(float p,float d) ;
	
}

interface VehicleTime {
	/**
	 * 班次时间
	 * 根据对应出行方式的速度及出发地和目的地距离求得
	 */
	public abstract float vehicleTime(float s,float d ) ;
}






