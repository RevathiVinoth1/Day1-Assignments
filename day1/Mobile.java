package week1.day1;

public class Mobile {
	public void sendSms() {
		System.out.println("This is My Mobile");
		boolean isFullCharged=false;
		System.out.println(isFullCharged);
		int mobileCost=25000;
		System.out.println("My Mobile Cost is "  +mobileCost);
		System.out.println("I am Sending Message");
	}
	public void makeCall() {
		String mobileModel="POCO 3";
		float mobileWeight=4.3f;
		System.out.println("My Mobile Model is "  +mobileModel);
		System.out.println("My Mobile Weight is "  +mobileWeight);
		System.out.println("I Make the Call to Office");
	}
	public static void main(String[] args) {
		Mobile m=new Mobile();
		m.sendSms();
		m.makeCall();
	}
}
