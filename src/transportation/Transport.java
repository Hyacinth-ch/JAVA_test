package transportation;

abstract public class Transport {
	
	private float timeToStation ;  //����վ(����)ʱ��
	private float timeReturn ;	   //�ӳ�վ(����)����ʱ��
	private float timeForTicket ;  //ȡƱʱ��
	private float timeForSecurityCheck ;  //����ʱ��
	private float timeForWait ;		//��ʱ��
	private float journeyTime ;     //���ʱ��
	private float speed ;			//����
	private float unitPrice ;		//����
	private float cost ;            //����
	
	
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
	
	//���������а��������ʱ��
	public abstract float calculateConsumption(float a,float b,float c,float d,float e) ;
	
	//�����Ϣ
	public void print() {
		System.out.println("���к�ʱ���ķ���Ϣ��");
		System.out.println("��ʱ��"+this.journeyTime+"Сʱ"+"  �ķѣ�"+this.cost+"Ԫ");
		
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
	 * ��η���
	 * ���ݶ�Ӧ���з�ʽ�ĵ��ۼ������غ�Ŀ�ĵؾ������
	 */
	public abstract float journeyConsumption(float p,float d) ;
	
}

interface VehicleTime {
	/**
	 * ���ʱ��
	 * ���ݶ�Ӧ���з�ʽ���ٶȼ������غ�Ŀ�ĵؾ������
	 */
	public abstract float vehicleTime(float s,float d ) ;
}






