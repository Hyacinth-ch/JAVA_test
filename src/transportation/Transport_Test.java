package transportation;

import java.util.Scanner ;
public class Transport_Test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		String departure;
		String destination;
		float distance;
		System.out.println("����������ء�Ŀ�ĵغ;��룺");
		departure = sc.next() ;
		destination = sc.next() ;
		distance = sc.nextFloat() ;
		
		
		System.out.println("ѡ����������ʱ�估���ã�");
		Car c = new Car() ;
		float cTime ;
		System.out.println("�����뵽����վ����ʱ�䡢������վ��������ʱ�䡢ȡƱʱ�䡢����ʱ�䡢��ʱ��");

		c.setTimeToStation(sc.nextFloat());
		c.setTimeReturn(sc.nextFloat());
		c.setTimeForTicket(sc.nextFloat());
		c.setTimeForSecurityCheck(sc.nextFloat());
		c.setTimeForWait(sc.nextFloat());
		
		cTime = c.calculateConsumption(c.getTimeToStation(),c.getTimeReturn(),c.getTimeForTicket()
				 ,c.getTimeForSecurityCheck(),c.getTimeForWait());
		
		System.out.println("�����������ٶȡ����ۣ�") ;
		c.setSpeed(sc.nextFloat());
		c.setUnitPrice(sc.nextFloat());
		
		c.setJourneyTime(cTime+c.vehicleTime(c.getSpeed(), distance));
		c.setCost(c.journeyConsumption(c.getUnitPrice(),distance));
		
		System.out.println("�����أ�"+departure +"  Ŀ�ĵأ�"+destination );
		c.print();
		
		
		System.out.println("ѡ���������ʱ�估���ã�");
		HighSpeedTrain h = new HighSpeedTrain() ;
		float hTime ;
		System.out.println("�����뵽����վ����ʱ�䡢�Ӹ���վ��������ʱ�䡢ȡƱʱ�䡢����ʱ�䡢��ʱ��");

		h.setTimeToStation(sc.nextFloat());
		h.setTimeReturn(sc.nextFloat());
		h.setTimeForTicket(sc.nextFloat());
		h.setTimeForSecurityCheck(sc.nextFloat());
		h.setTimeForWait(sc.nextFloat());
		
		hTime = h.calculateConsumption(h.getTimeToStation(),h.getTimeReturn(),h.getTimeForTicket()
				 ,h.getTimeForSecurityCheck(),h.getTimeForWait());
		
		System.out.println("����������ٶȡ����ۣ�") ;
		h.setSpeed(sc.nextFloat());
		h.setUnitPrice(sc.nextFloat());
		
		h.setJourneyTime(hTime+h.vehicleTime(h.getSpeed(), distance));
		h.setCost(h.journeyConsumption(h.getUnitPrice(),distance));
		
		System.out.println("�����أ�"+departure +"  Ŀ�ĵأ�"+destination );
		h.print();
		
		
		System.out.println("ѡ��ɻ�����ʱ�估���ã�");
		
		Plane p = new Plane() ;
		float pTime ;
		System.out.println("�����뵽��������ʱ�䡢�ӻ�����������ʱ�䡢ȡƱʱ�䡢����ʱ�䡢��ʱ��");

		p.setTimeToStation(sc.nextFloat());
		p.setTimeReturn(sc.nextFloat());
		p.setTimeForTicket(sc.nextFloat());
		p.setTimeForSecurityCheck(sc.nextFloat());
		p.setTimeForWait(sc.nextFloat());
		
		pTime = p.calculateConsumption(p.getTimeToStation(),p.getTimeReturn(),p.getTimeForTicket()
				 ,p.getTimeForSecurityCheck(),p.getTimeForWait());
		
		System.out.println("������ɻ��ٶȡ����ۣ�") ;
		p.setSpeed(sc.nextFloat());
		p.setUnitPrice(sc.nextFloat());
		
		p.setJourneyTime(pTime+p.vehicleTime(p.getSpeed(), distance));
		p.setCost(p.journeyConsumption(p.getUnitPrice(),distance));
		
		System.out.println("�����أ�"+departure +"  Ŀ�ĵأ�"+destination );
		p.print();
		
		
	}

}
