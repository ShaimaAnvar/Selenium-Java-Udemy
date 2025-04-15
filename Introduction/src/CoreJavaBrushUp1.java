
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		String name="shaima";
		char letter = 's';
		double dec = 1.5;
		boolean mycard= true;
		System.out.println(name);
		System.out.println(num+ "is the value stored");
		//Arrays -

		int[] arr = new int[5];// 5, 10

		arr[0] = 1;

		arr[1] = 2;

		arr[2]= 4;

		arr[3]= 5;

		arr[4]= 6;
		int[] arr2 = {1,2,4,5,6,8,10,12};
		System.out.println(arr2[0]);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		String[] names= {"Shaima", "Anvar","Ehsan"};
		for(int i=0;i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		for(String s: names) {
			System.out.println(s);
		}
		for(int n:arr2) {
			System.out.println(n);
		}

	}

}
