import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class DigitRoot {

	public static void main(String[] args) {
		
		//setting up the initial array, this part of the code and the random number generation are not part of the challenge. Notice I didn't worry about repeats, for simplicity.
		int[] a = new int[15]; 
		
		Random r = new Random();
		for(int i = 0; i < a.length; i++){
			a[i] = r.nextInt(100) + 1;
		}
		
		//sorting out the array. This is important because we will use and linkedHashMap to make sure that it will take the smaller number first.
		Arrays.sort(a); 
		
		//creating the array where we will send the numbers ordered by digitRoot order.
		int[] last = new int[a.length];
		
		//This is the linkedHashMap mentioned before.
		LinkedHashMap<Integer, Integer> iRoot = new LinkedHashMap<>();
		//this variable will increment the index of the "last" array when we put the numbers in it.
		int count = 0;
		
		//this loop will iterate through each element in the sorted initial array.
		for(int i = 0; i < a.length; i++){
			int temp = 0; //temp variable to capture the sum of all digits from each element.
			int num = a[i]; //num will copy the element to work on. If we use the element itself, it will become zero and replace the original number. (We don't want that).
			//here we just add temp to the modulo 10 of num and then divide num by 10, all until num is 0.
			while(num > 0){
				temp += num%10;
				num/=10;
			}
			iRoot.put(i, temp); //add the index of the element (key) and the sum of its digits(value) to the linkedHashMap.
		}
		
		
		while(iRoot.size() > 0){
			int min = Integer.MAX_VALUE; //value to compare against. I chose the Max possible value for int, but it doesn't have to be that way if you know the max values the initial array will have.
			int k = -1; //initializing the index value. Any number here would work.
			
			//forEach loop to iterate through each element in the linkedHashMap.
			for(Map.Entry<Integer, Integer> n: iRoot.entrySet()){
				//if the value is smaller than min, then min becomes the value. We sort and check each element.
				if(n.getValue() < min){
					min = n.getValue();
					k = n.getKey();
				}
			}
			last[count] = a[k]; //at this point, we add the value of the initial array at index k, to the last array at index count.
			iRoot.remove(k); //we remove the element with key k, to avoid potential repeats, and make less iterations on the next round.
			count++; //we increment count.
		}
		
		//this would normally be the return statement. Since I did this on my own computer, it's all a main method; so I just printed it.
		for(int n: last){
			System.out.print(n + " ");
		}
		
	}
	
	
}
