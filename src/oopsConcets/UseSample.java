package oopsConcets;

public class UseSample {
	public static void main(String[] args) {
		Processor p1=new Processor();
		p1.brand="snapdragon";
		p1.price=5000;
		p1.antetuScore=243536;
		Sample mobile1=new Sample();
		mobile1.brand="vivo";
		mobile1.color="black";
		mobile1.price=15000;
		mobile1.processor=p1;
		System.out.println(mobile1.brand+","+mobile1.color+","+mobile1.price+","+mobile1.processor.brand+","+mobile1.processor.price);
	}

}
