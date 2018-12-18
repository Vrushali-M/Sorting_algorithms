package sortingAlgorithms;

public class ModifiedQuicksort {
	
			//A function that gets length to determine which sort to use	 
		  public static void sort(int[] inputArray_ModifiedQuickSort){
			  
			  //Verifies that the input array is more than 10
			  if (inputArray_ModifiedQuickSort.length<= 10) {
				 InsertionSort.insertionSort(inputArray_ModifiedQuickSort);
			  }
			  
			  else {
				  ModifiedQuicksort.quickSort(inputArray_ModifiedQuickSort);
			  }
			  
		  }
		  
		 		  
		  public static void quickSort(int[] inputArray_ModifiedQuickSort) {
		    modQuickSort(inputArray_ModifiedQuickSort, 0, inputArray_ModifiedQuickSort.length - 1);
		  }
		  
		  
		  public static void modQuickSort(int[] inputArray_ModifiedQuickSort, int left, int right) {
		    int size = right - left + 1;
		    if (size <= 10){
		    InsertionSort.insertionSort(inputArray_ModifiedQuickSort);
		    }
		    
		    else {
		      double median = medianOf3(inputArray_ModifiedQuickSort, left, right);
		      int partition = partition(inputArray_ModifiedQuickSort, left, right, median);
		      modQuickSort(inputArray_ModifiedQuickSort, left, partition - 1);
		      modQuickSort(inputArray_ModifiedQuickSort, partition + 1, right);
		    }
		  }
		  
		  //A function that gets the 3 numbers and swaps if necessary
		  public static int medianOf3(int[] inputArray_ModifiedQuickSort, int left, int right) {
		    int center = (left + right) / 2;

		    if (inputArray_ModifiedQuickSort[left] > inputArray_ModifiedQuickSort[center])
		      swap(inputArray_ModifiedQuickSort, left, center);

		    if (inputArray_ModifiedQuickSort[left] > inputArray_ModifiedQuickSort[right])
		      swap(inputArray_ModifiedQuickSort, left, right);

		    if (inputArray_ModifiedQuickSort[center] > inputArray_ModifiedQuickSort[right])
		      swap(inputArray_ModifiedQuickSort, center, right);

		      swap(inputArray_ModifiedQuickSort, center, right - 1);
		    
		    return inputArray_ModifiedQuickSort[right - 1];
		  }

		  //Swaps elements of the array
		  public static void swap(int[] inputArray_ModifiedQuickSort, int dex1, int dex2) {
		    int temp = inputArray_ModifiedQuickSort[dex1];
		    inputArray_ModifiedQuickSort[dex1] = inputArray_ModifiedQuickSort[dex2];
		    inputArray_ModifiedQuickSort[dex2] = temp;
		  }

		  public static int partition(int[] inputArray_ModifiedQuickSort, int left, int right, double pivot) {
		    int leftPtr = left;
		    int rightPtr = right - 1;

		    while (true) {
		      while (inputArray_ModifiedQuickSort[++leftPtr] < pivot);
		      	while (inputArray_ModifiedQuickSort[--rightPtr] > pivot);
		      		if (leftPtr >= rightPtr)
		      			break;
		      		else
		      			swap(inputArray_ModifiedQuickSort, leftPtr, rightPtr);
		    }
		    swap(inputArray_ModifiedQuickSort, leftPtr, right - 1);
		    return leftPtr;
		  }

		

}
