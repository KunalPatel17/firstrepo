package demoapp;

public class SalesClass {
	
	public void display() {
		int[] arr= {1,3,45,56,90};
		for(int num:arr)
			System.out.println(num);
	}
	
	public void print() {
		System.out.println("Print all the array number:");
		display();
		
	}
}
