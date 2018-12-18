package sortingAlgorithms;

public class MergeSort {
	
    
    static void merge(int arr[], int l, int m, int r) 
    { 
        // Find sizes of two arrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        // Create temporary arrays 
        int Left[] = new int [n1]; 
        int Right[] = new int [n2]; 
  
        //Copy data to temporary arrays
        for (int i=0; i<n1; ++i) 
        	Left[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
        	Right[j] = arr[m + 1+ j]; 
  
  
        // Merge the temporary arrays 
  
         
        int i = 0, j = 0; 
  
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (Left[i] <= Right[j]) 
            { 
                arr[k] = Left[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = Right[j]; 
                j++; 
            } 
            k++; 
        } 
  
        // Copy remaining elements of L[] if any 
        while (i < n1) 
        { 
            arr[k] = Left[i]; 
            i++; 
            k++; 
        } 
  
        // Copy remaining elements of R[] if any 
        while (j < n2) 
        { 
            arr[k] = Right[j]; 
            j++; 
            k++; 
        } 
    } 
  
    // A function that sorts the input array  
    
    static int[] sort(int arr[], int l, int r) 
    { 
        if (l < r) 
        { 
            // Find the middle point 
            int m = (l+r)/2; 
  
            // Sort first and second halves 
            sort(arr, l, m); 
            sort(arr , m+1, r); 
  
            // Merge the sorted halves 
            merge(arr, l, m, r); 
        } 
        return arr;
    } 
  
    
  
}
