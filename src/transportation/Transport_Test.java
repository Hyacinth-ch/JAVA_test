package transportation;

import java.util.Scanner ;
public class Transport_Test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		String departure;
		String destination;
		float distance;
		System.out.println("请输入出发地、目的地和距离：");
		departure = sc.next() ;
		destination = sc.next() ;
		distance = sc.nextFloat() ;
		
		
		System.out.println("选择汽车出行时间及费用：");
		Car c = new Car() ;
		float cTime ;
		System.out.println("请输入到汽车站所用时间、从汽车站返回所用时间、取票时间、安检时间、候车时间");

		c.setTimeToStation(sc.nextFloat());
		c.setTimeReturn(sc.nextFloat());
		c.setTimeForTicket(sc.nextFloat());
		c.setTimeForSecurityCheck(sc.nextFloat());
		c.setTimeForWait(sc.nextFloat());
		
		cTime = c.calculateConsumption(c.getTimeToStation(),c.getTimeReturn(),c.getTimeForTicket()
				 ,c.getTimeForSecurityCheck(),c.getTimeForWait());
		
		System.out.println("请输入汽车速度、单价：") ;
		c.setSpeed(sc.nextFloat());
		c.setUnitPrice(sc.nextFloat());
		
		c.setJourneyTime(cTime+c.vehicleTime(c.getSpeed(), distance));
		c.setCost(c.journeyConsumption(c.getUnitPrice(),distance));
		
		System.out.println("出发地："+departure +"  目的地："+destination );
		c.print();
		
		
		System.out.println("选择高铁出行时间及费用：");
		HighSpeedTrain h = new HighSpeedTrain() ;
		float hTime ;
		System.out.println("请输入到高铁站所用时间、从高铁站返回所用时间、取票时间、安检时间、候车时间");

		h.setTimeToStation(sc.nextFloat());
		h.setTimeReturn(sc.nextFloat());
		h.setTimeForTicket(sc.nextFloat());
		h.setTimeForSecurityCheck(sc.nextFloat());
		h.setTimeForWait(sc.nextFloat());
		
		hTime = h.calculateConsumption(h.getTimeToStation(),h.getTimeReturn(),h.getTimeForTicket()
				 ,h.getTimeForSecurityCheck(),h.getTimeForWait());
		
		System.out.println("请输入高铁速度、单价：") ;
		h.setSpeed(sc.nextFloat());
		h.setUnitPrice(sc.nextFloat());
		
		h.setJourneyTime(hTime+h.vehicleTime(h.getSpeed(), distance));
		h.setCost(h.journeyConsumption(h.getUnitPrice(),distance));
		
		System.out.println("出发地："+departure +"  目的地："+destination );
		h.print();
		
		
		System.out.println("选择飞机出行时间及费用：");
		
		Plane p = new Plane() ;
		float pTime ;
		System.out.println("请输入到机场所用时间、从机场返回所用时间、取票时间、安检时间、候车时间");

		p.setTimeToStation(sc.nextFloat());
		p.setTimeReturn(sc.nextFloat());
		p.setTimeForTicket(sc.nextFloat());
		p.setTimeForSecurityCheck(sc.nextFloat());
		p.setTimeForWait(sc.nextFloat());
		
		pTime = p.calculateConsumption(p.getTimeToStation(),p.getTimeReturn(),p.getTimeForTicket()
				 ,p.getTimeForSecurityCheck(),p.getTimeForWait());
		
		System.out.println("请输入飞机速度、单价：") ;
		p.setSpeed(sc.nextFloat());
		p.setUnitPrice(sc.nextFloat());
		
		p.setJourneyTime(pTime+p.vehicleTime(p.getSpeed(), distance));
		p.setCost(p.journeyConsumption(p.getUnitPrice(),distance));
		
		System.out.println("出发地："+departure +"  目的地："+destination );
		p.print();
		
		
	}

}
