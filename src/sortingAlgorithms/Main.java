package sortingAlgorithms;



public class Main {
    public static void main(String[] args) {
    	 	
    	//Take input from user for length of the array
    	int lengthofarray = CommonFunctions.userInput();
    	
    	//Generate array of 
    	System.out.println("Original Array");
    	final int[] randomArray =  CommonFunctions.RandomNumbers(lengthofarray);
    	CommonFunctions.printNumbers(randomArray); 
    	
    	//Create copy of the input random array to pass into Sorting Algorithms
    	int[] InputArray_InsertionSort = CommonFunctions.DuplicateArray(randomArray);
    	int[] inputArray_MergeSort = CommonFunctions.DuplicateArray(randomArray);
    	int[] inputArray_InPlaceQuickSort = CommonFunctions.DuplicateArray(randomArray);
    	int[] inputArray_ModifiedQuickSort = CommonFunctions.DuplicateArray(randomArray);
    	   	

    	//Sorting using Insertion Sort
    	long startTime_insertionSort = System.currentTimeMillis();
    	
    	System.out.println("Array after insertion sort");   	
        int[] arrayAfterInsertionSort = InsertionSort.insertionSort(InputArray_InsertionSort);
        CommonFunctions.printNumbers(arrayAfterInsertionSort);
        
        long stopTime_insertionSort = System.currentTimeMillis();
        long elapsedTime_insertionSOrt = stopTime_insertionSort - startTime_insertionSort;
         
        System.out.println("Time taken to sort " +lengthofarray +" arrays in insertion Sort is:" +elapsedTime_insertionSOrt+" ms\n");
       
        //Calculating time taken for sorting a sorted array
        long startTime_SortedinsertionSort = System.currentTimeMillis();
        InsertionSort.insertionSort(arrayAfterInsertionSort);
        
        long stopTime_SortedinsertionSort = System.currentTimeMillis();
        long elapsedTime_SortedinsertionSOrt = stopTime_SortedinsertionSort - startTime_SortedinsertionSort;  
        System.out.println("Time taken to sort a Sorted array of " +lengthofarray +" using insertion Sort is:" +elapsedTime_SortedinsertionSOrt+" ms\n");
        
        //Calculating time taken for sorting a reverse sorted array
        CommonFunctions.reverseArray(arrayAfterInsertionSort);
        CommonFunctions.printNumbers(arrayAfterInsertionSort);
        
        long startTime_inverseSortedinsertionSort = System.currentTimeMillis();
        
        InsertionSort.insertionSort(arrayAfterInsertionSort);
        
        long stopTime_inverseSortedinsertionSort = System.currentTimeMillis();
        long elapsedTime_inverseSortedinsertionSOrt = stopTime_inverseSortedinsertionSort - startTime_inverseSortedinsertionSort;
        System.out.println("Time taken to sort a reverse sorted array of length " +lengthofarray +" using insertion Sort is:" +elapsedTime_inverseSortedinsertionSOrt+" ms\n");
        
        /*---------------------------------------------------------------------*/
        
        //Sorting using Merge Sort
        long startTime_MergeSort = System.currentTimeMillis();
        
        MergeSort.sort(inputArray_MergeSort, 0, inputArray_MergeSort.length-1);
        
        long stopTime_MergeSort = System.currentTimeMillis();
        long elapsedTime_MergeSort = stopTime_MergeSort - startTime_MergeSort;
        
        System.out.println("Array after merge sort");
        CommonFunctions.printNumbers(inputArray_MergeSort);
        System.out.println("Time taken to sort " +lengthofarray +" arrays in Merge Sort is:" +elapsedTime_MergeSort+" ms\n");
        
        // Calculating time taken for sorting a sorted array
        
        long startTime_sortedMergeSort = System.currentTimeMillis();
        
        MergeSort.sort(inputArray_MergeSort, 0, inputArray_MergeSort.length-1);
        
        long stopTime_sortedMergeSort = System.currentTimeMillis();
        long elapsedTime_sortedMergeSort = stopTime_sortedMergeSort - startTime_sortedMergeSort;
        
        System.out.println("Time taken to sort a sorted array of length " +lengthofarray +" using Merge Sort is:" +elapsedTime_sortedMergeSort+" ms\n");
        
        // Calculating time taken for sorting a reverse sorted array
        
        CommonFunctions.reverseArray(inputArray_MergeSort);
        CommonFunctions.printNumbers(inputArray_MergeSort);
        
        long startTime_ReverseSortedMergeSort = System.currentTimeMillis();
        
        MergeSort.sort(inputArray_MergeSort, 0, inputArray_MergeSort.length-1);
        
        long stopTime_ReverseSortedMergeSort = System.currentTimeMillis();
        long elapsedTime_ReverseSrtedMergeSort = stopTime_ReverseSortedMergeSort - startTime_ReverseSortedMergeSort;
        
        System.out.println("Time taken to sort a reverse sorted array of length " +lengthofarray +" using Merge Sort is:" +elapsedTime_ReverseSrtedMergeSort+" ms\n");
        
        /*---------------------------------------------------------------------*/
      
        //Sorting using In Place Quick Sort
        
        long startTime_InPlaceQuickSort = System.currentTimeMillis();
        
        QuickSort.sort(inputArray_InPlaceQuickSort);
        
        long stopTime_InPlaceQuickSort = System.currentTimeMillis();
        long elapsedTime_InPlaceQuickSort = stopTime_InPlaceQuickSort - startTime_InPlaceQuickSort;
        
        System.out.println("Array after quick sort");
        CommonFunctions.printNumbers(inputArray_InPlaceQuickSort);
        System.out.println("Time taken to sort " +lengthofarray +" arrays in In Place Quick Sort is:" +elapsedTime_InPlaceQuickSort+" ms\n");
        
        // Calculating time for Already Sorted Array
        
        long startTime_SortedInPlaceQuickSort = System.currentTimeMillis();
        
        QuickSort.sort(inputArray_InPlaceQuickSort);
        
        long stopTime_SortedInPlaceQuickSort = System.currentTimeMillis();
        long elapsedTime_SortedInPlaceQuickSort = stopTime_SortedInPlaceQuickSort - startTime_SortedInPlaceQuickSort;
        
        System.out.println("Time taken to sort a sorted array of length " +lengthofarray +" using In Place Quick Sort is:" +elapsedTime_SortedInPlaceQuickSort+" ms\n");
        
        // Calculating time for Reverse Sorted Array
        
        CommonFunctions.reverseArray(inputArray_InPlaceQuickSort);
        CommonFunctions.printNumbers(inputArray_InPlaceQuickSort);
        
        long startTime_reverseSortedInPlaceQuickSort = System.currentTimeMillis();
        
        QuickSort.sort(inputArray_InPlaceQuickSort);
        
        long stopTime_reverseSortedInPlaceQuickSort = System.currentTimeMillis();
        long elapsedTime_reverseSortedInPlaceQuickSort = stopTime_reverseSortedInPlaceQuickSort - startTime_reverseSortedInPlaceQuickSort;
        
        System.out.println("Time taken to sort a reverse sorted array of length " +elapsedTime_reverseSortedInPlaceQuickSort +" using In Place Quick Sort is:" +elapsedTime_SortedInPlaceQuickSort+" ms\n");
        
        
        /*---------------------------------------------------------------------*/
        
        //Sorting using modified quick sort
       
        long startTime_modQuickSort = System.currentTimeMillis();
                            
        System.out.println("Array after modified quick sort");
        ModifiedQuicksort.sort(inputArray_ModifiedQuickSort);
        
        long stopTime_modQuickSort = System.currentTimeMillis();
        long elapsedTime_modQuickSort = stopTime_modQuickSort - startTime_modQuickSort;
        
        
        CommonFunctions.printNumbers(inputArray_ModifiedQuickSort);
        System.out.println("Time taken to sort " +lengthofarray +" arrays in Modified Quick Sort is:" +elapsedTime_modQuickSort+" ms\n");
        
        // Calculating time for already Sorted Array
        long startTime_sortedmodQuickSort = System.currentTimeMillis();
        
        ModifiedQuicksort.sort(inputArray_ModifiedQuickSort);
        
        long stopTime_sortedmodQuickSort = System.currentTimeMillis();
        long elapsedTime_sortedmodQuickSort = stopTime_sortedmodQuickSort - startTime_sortedmodQuickSort;
        
        System.out.println("Time taken to sort a sorted array of length " +lengthofarray +" using Modified Quick Sort is:" +elapsedTime_sortedmodQuickSort+" ms\n");
        
        // Calculating time for reverse Sorted Array
        CommonFunctions.reverseArray(inputArray_ModifiedQuickSort);
        CommonFunctions.printNumbers(inputArray_ModifiedQuickSort);
        long startTime_ReverseSortedmodQuickSort = System.currentTimeMillis();
        
        ModifiedQuicksort.sort(inputArray_ModifiedQuickSort);
        
        long stopTime_ReverseSortedmodQuickSort = System.currentTimeMillis();
        long elapsedTime_ReverseSortedmodQuickSort = stopTime_ReverseSortedmodQuickSort - startTime_ReverseSortedmodQuickSort;
        
        System.out.println("Time taken to sort a reverse sorted array of length " +lengthofarray +" using Modified Quick Sort is:" +elapsedTime_ReverseSortedmodQuickSort+" ms\n");
        

        
        /*---------------------------------------------------------------------*/
        System.exit(0);
       
    }
    }


   
   



 
    
    