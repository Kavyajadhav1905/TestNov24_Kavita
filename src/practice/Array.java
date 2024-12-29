package practice;

public class Array {
	int getSumOfnum(int[] arr){
		int sum=0;
		int count=0;
			for(int i=0;i<arr.length;i++){
				if(arr[i]%5==0 ||arr[i]%7==0){
					sum=sum+arr[i];
					count++;
				}
				}
				System.out.println(+sum);
				return sum;
	}
	public static void main(String[] args){
		Array array=new Array();
		int[] arr={44,45,22,25,21,29};
		System.out.println("commit3");
		array.getSumOfnum(arr);
	}
}
