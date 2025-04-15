import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] arr= {1,2,3,4,6,7};
//		//output-2,4,6
//		for(int i=0; i<arr.length; i++) {
//			if (arr[i]%2 ==0) {
//				System.out.println(arr[i]);
//			}
//		}
//		
//		//check if the array has multiple of 2
//		for(int i=0; i<arr.length;i++) {
//			if(arr[i]%2==0) {
//				System.out.println("Array has multiple of 2");
//				break;
//			}
//		}
		int[]  numbers= {2,4,6,8,19};
        //first element of the Array
//        System.out.println(numbers[0]);
//        
//        //last element
//        System.out.println(numbers[numbers.length-1]);
//        
//        
//        for(int i=4; i>=0; i--){
//            System.out.println(numbers[i]);
//        }
		//Arraylist
		String[] arr3= {"shaima", "anvar", "ehsan"};
		ArrayList<String> a = new ArrayList<String>();
		a.add("Shaima");
		a.add("Anvar");
		System.out.println(a);
		//a.get(1);
		//System.out.println(a.get(1));
		//a.remove(0);
		//System.out.println(a);
		for(int i=0; i<a.size();i++) {
			System.out.println(a.get(i));
		}
		System.out.println("------");
		//enhanced for loop
		for( String val:a) {
			System.out.println(val);
		}
		//check if an item is present in the arraylist
		System.out.println(a.contains("Anva"));
		
		//convert array into arraylist
		List<String> newArraylist= Arrays.asList(arr3);
		//System.out.println(newArraylist);
		
		//string literal- only one object will be created
		String s1= "shaima";
		String s2= "shaima";
		
		//using new keyword
		String s3= new String("welcome");
		String s4= new String("welecome guys hi");
		//String[] newArr= s4.split(" ");
		//System.out.println(newArr[0]);
		//System.out.println(newArr[1]);
		//String[] newArr= s4.split("guys");
		//System.out.println(newArr[0]);
		//System.out.println(newArr[1].trim());
		//----printing all letters in  a string----
		
//		for(int i=0; i<s1.length(); i++) {
//			System.out.println(s1.charAt(i));
//		}
		
		//----print the string in reverse order---
		for(int i=s1.length()-1; i>=0; i--) {
			System.out.println(s1.charAt(i));
		}
		
		
	}

}
