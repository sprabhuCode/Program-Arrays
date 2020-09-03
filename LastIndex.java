/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
	   int[] array = {0, 1, 2, 2, 4, 5, 5, 5, 8};
        int num = 5;
       int start =0;
       int end = array.length;
       
       while(start<end){
           int mid = (start+end)/2;
           if(array[mid] == num && ((array[mid]==end) ||(array[mid+1]>num))){
               
               System.out.println("Index  : " + mid);
               break;
           }
           else if(array[mid]<num)
           start = mid+1;
           else if(array[mid]>num)
           end = mid-1;
       }
        
	}
}
