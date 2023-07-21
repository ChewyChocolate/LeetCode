import java.util.Scanner;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> index = new ArrayList<>();
		int[] array = {1,2,3,4,5,6,7,8,9};
		int n = 5;
		
		for(int i = 0; i < array.length; i++){
		    for(int j = i+1; j < array.length; j++){
		       if(i + j == n){
		           ArrayList<Integer> pair = new ArrayList<>();
		           pair.add(i);
		           pair.add(j);
		           index.add(pair);
		       }
		    }
		}
		
		for(ArrayList pair : index){
		    System.out.println(pair.get(0) + ", " + pair.get(1));
		}
		
		
	}
}
