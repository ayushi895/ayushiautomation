package collection;

public class array {

	public static void main(String[] args) {
		/*
		 * Object[] arr=new Object[3]; arr[0]=100; arr[1]="Anand"; arr[2]=true;
		 */		        
//		        for(int i=0;i<arr.length ; i++)
//		        {
//		        	System.out.println(arr[i]);
//		        }
//		        for (Object o:arr)
//		        {
//		        	System.out.println(o);
//		        }
		        
         int[] arr=new int[5];
		        arr[0]=100;
		        arr[1]=200;
		        arr[2]=300;
		        arr[3]=400;
		        arr[4]=500;
		        
		        for (int i:arr)
		        {
		        	System.out.print(i);
		        }
		        



	}

}
