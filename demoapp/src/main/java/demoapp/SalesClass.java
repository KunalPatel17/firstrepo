package demoapp;

public class SalesClass {
	
	public void display() {
		int[] arr= {1,3,45,56,90};
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			System.out.println(arr[i]);
		}
		System.out.println("Array size:" + arr.length)
		System.out.println("Sumatiom:" + sum );
	}
	
	public void print() {
		System.out.println("Print all the array number:");
		display();
		
	}
}
