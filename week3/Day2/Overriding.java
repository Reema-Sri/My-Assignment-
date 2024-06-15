package week3.Day2;

public class Overriding extends Overloading {
	
	
	@Override
	public void sendRequest(String a, String b, boolean c) {
		System.out.println(a+b+c);
		System.out.println(a);
	}
	public static void main(String[] args) {
		Overriding riding = new Overriding();
		riding.sendRequest("Achieved", "Great" , false);
        String a = "Reema";
        System.out.println(a);
	}

}
