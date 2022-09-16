package oopsConcets;

public class UseMarker {
	public static void main(String[] args) {
		Marker m1=new Marker();
		m1.setcolor("black");
		m1.setprice(25);
		m1.setisRefillable(true);
		Marker m2=new Marker();
		m2.setcolor("blue");
		m2.setprice(20);
		m2.setisRefillable(true);
		Marker m3=new Marker();
		m3.setcolor("red");
		m3.setprice(27);
		m3.setisRefillable(false);
		Marker[] markers= {m1,m2,m3};
		for(int i=0;i<markers.length;i++) {
		System.out.println(markers[i].getcolor()+","+markers[i].getprice()+","+markers[i].getisRefillable());
		}
		System.out.println(m1.getcolor()+","+m1.getprice()+","+m1.getisRefillable());
		System.out.println(m2.getcolor()+","+m2.getprice()+","+m2.getisRefillable());
	}

}
