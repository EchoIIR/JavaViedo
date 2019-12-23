class StringTest{
	public static void main(String[] args) {
		String[] arr = {"nba","abc","cba","zz","qq","haha"};
		System.out.println("Begin print Orign String:");
		printArray(arr);
		sortString(arr);
		System.out.println("\nBegin print Sorted String:");
		printArray(arr);
	}

	public static void sortString(String[] arr){
		System.out.println("\n\nBegin sorting.....\n");
		for(int i = 0; i<arr.length-1; i++){
			for(int j = i + 1; j< arr.length; j++){
				if ((arr[i].compareTo(arr[j])) > 0){
					// arr[i]>arr[j],交换
					arr = swap(arr,i,j);
				}
			}
		}
	}

	public static String[] swap(String[] arr, int i, int j){
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}

	public static void printArray(String[] arr){
		System.out.print("[");
		for (int i = 0; i <arr.length; i++){
			if(i != arr.length-1){
				System.out.print(arr[i] + ",");
			}
			else{
				System.out.print(arr[i] + "]");
			}
		}
		System.out.print("\n");
	}





}