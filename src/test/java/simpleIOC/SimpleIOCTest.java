package simpleIOC;

import org.junit.Test;

import simpleIOC.entity.Car;
import simpleIOC.entity.Wheel;

public class SimpleIOCTest {

	@Test
	public void getBean() throws Exception {
		String location = SimpleIOC.class.getClassLoader().getResource("ioc.xml").getFile();
		SimpleIOC ioc = new SimpleIOC(location);
		Wheel wheel = (Wheel) ioc.getBean("wheel");
		System.out.println(wheel);
		Car car = (Car) ioc.getBean("car");
		System.out.println(car);
	}
}
