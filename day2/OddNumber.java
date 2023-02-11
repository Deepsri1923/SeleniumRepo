package week1.day2;

public class OddNumber {
public static void main(String[] args) {
	int num=10;
	int reminder;
	
	for(int i=1;i<=20;i++) {
		//System.out.println(i);
		reminder =i%2;
		if(reminder==1)
		{
			System.out.println("odd number is "+i);
		}
	}
}
}
