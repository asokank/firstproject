package oopsConcets;

public class Chair {
		private int noOfLegs;
		private String material;
		private boolean isRockingChair;
		public Chair(int noOfLegs,String material,boolean isRockingChair) {
			this.noOfLegs=noOfLegs;
			this.material=material;
			this.isRockingChair=isRockingChair;
		}
			public String toString(){
				return "no of legs="+noOfLegs+","+"material="+material+","+"rocking chair="+isRockingChair;
			}
	}


