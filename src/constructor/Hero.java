package constructor;

public class Hero {
	String bikecompany;
	int noOfBikes;
	
	public Hero(String bikecompany,int noOfBikes) {
		this.bikecompany=bikecompany;
		this.noOfBikes=noOfBikes;
	}
	
	public void splender() {
		for(int i=1;i<=noOfBikes;i++)
			System.out.println("boom");
	}

}
