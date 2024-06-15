package week3.Day2;

public class Overloading {
	//APIClient

	public void sendRequest(String a) {
		System.out.println(a);
	}
	public void sendRequest(String a, String b, boolean c) {
		System.out.println(a+b+c);
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		Overloading over  = new Overloading();
		over.sendRequest("Successfull");
		over.sendRequest("Good", "better", true);
		boolean c=false;
		System.out.println(c);

	}

}
