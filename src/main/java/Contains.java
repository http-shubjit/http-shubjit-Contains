

public class Contains {

    /**
     * This method should search an array to see if that array contains some value.
     * You will need to use a for loop to check every value of the array to see if it matches the target value.
     *
     * @param arr array to be manipulated.
     * @param target the value that the method should be searching for.
     * @return true if arr contains target, false otherwise.
     */
    public boolean arrayContains(int[] arr, int target) {
for(int i=0;i<arr.length;i++){
    for(int j=i;j<arr.length;j++){
        if(arr[i]>arr[j]){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

        }
    }
}

        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target)
                return true;
            else if (target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid])
                start = mid + 1;
        }
        return false;

    }
}