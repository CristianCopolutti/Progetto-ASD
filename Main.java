package QuickSelect;

public class Main {

	public static void main(String[] args) {
		
		
		
/*       int[] array = new int[]{10, 4, 5, 8, 6, 11, 26}; 
        int[] arraycopy = {10, 4, 5, 8, 6, 11, 26};
                  
        int kPosition = 3; 
        int length = array.length; 
          
        if(kPosition > length) 
        { 
            System.out.println("Index out of bound"); 
        } 
        else
        { 
            // find kth smallest value 
            System.out.println("K-th smallest element in array : " +  
                                quickSelect(arraycopy, kPosition - 1, 0, length - 1));  
        }  
    }  */

		
		int[] arr = new int[] {23, 4, 5, 87, 3};
		
		int length = arr.length;
		
		System.out.println(quickSelect(arr, 2, 0, length-1));
		

 }
	
	public static int quickSelect(int[] arr, int k, int p, int q) {
		
		if (p<q) {
			
			int g = partition(arr, p, q);
			
			if (g == k) {
				return arr[g];
			} else if (k < g) {
				return quickSelect(arr, k, p, g-1);
			} else if (k > g) {
				return quickSelect(arr, k, g+1, q);
			}
		}
		return -1;
	}
	
	
	public static int partition(int[] array, int p, int q) {
		
		int i = p-1;
		
		int x = array[q];
		
		for (int j=p; j<=q; j++) {
			
			if (array[j] <= x) {
				
				i = i+1;
				
				scambia(array, i, j);
			}
		}
		
		return i;
	}
	
	public static void scambia(int[] arr, int i, int j) {
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
