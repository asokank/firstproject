package oopsConcets;

public class UseComputer {
	public static void main (String[] args) {
		Cpu c=new Cpu();
		c.brand="hp";
		c.ram="4gb";
		c.motherBoard="cyber";
		Cpu cc=new Cpu();
		cc.brand="dell";
		cc.ram="2gb";
		cc.motherBoard="crafton";
		Computer c1=new Computer();
		c1.brand="lenova";
		c1.isWindows=true;
		c1.moniterType="led";
		c1.cpu=c;
		Computer c2=new Computer();
		c2.brand="samsung";
		c2.isWindows=true;
		c2.moniterType="lcd";
		c2.cpu=c;
		Computer c3=new Computer();
		c3.brand="lg";
		c3.isWindows=false;
		c3.moniterType="oled";
		c3.cpu=cc;
		Computer[] computers= {c1,c2,c3};
		for(int i=0;i<computers.length;i++) {
			System.out.println(computers[i].brand+","+computers[i].moniterType+","+computers[i].isWindows+","+computers[i].cpu.brand+","+computers[i].cpu.ram);
		}
		System.out.println(" ");
		System.out.println(c1.brand+","+c1.moniterType+","+c1.isWindows+","+c1.cpu.brand+","+c1.cpu.ram);
		System.out.println(c2.brand+","+c2.moniterType+","+c2.isWindows+","+c2.cpu.brand+","+c2.cpu.ram);
	}

}
