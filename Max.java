
import java.util.*;


       class Max {	
	public static int weight(int arr[],int n,int k){										
	Arrays.sort(arr);
		int sum = 0, sum1 = 0, sum2 = 0;
		for (int i = 0; i < n; i++){
			sum += arr[i];
		}
		for (int i = 0; i < k; i++){
			sum1 += arr[i];
		}
		for (int i = k; i < n; i++){
			sum2 += arr[i];
		}
		return Math.max(Math.abs(sum1 - (sum - sum1)),
					Math.abs(sum2 - (sum - sum2)));
	        } 
	public static void main(String[] args){
		int k = 2;
		int arr[] = { 8, 4, 5, 2, 10 };
	int n = arr.length;	 
	System.out.print(weight(arr, n, k));
              }
              } 











