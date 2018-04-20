
import java.io.*;
import java.util.Arrays;

public class string_compare{
	public static void main(String args[]) throws IOException{
		BufferedReader x = new BufferedReader (new InputStreamReader(System.in));
		String str1 = x.readLine();
		String str2 = x.readLine();
		
		if(sort(str1).equals(sort(str2)))
			System.out.print("true");
		else
			System.out.print("false");
	}
	
	public static String sort(String str){
		char[] arr = str.toCharArray();
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length; j++){
				if(arr[i]>arr[j]){
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		str = Arrays.toString(arr);
		return str;
	}
}