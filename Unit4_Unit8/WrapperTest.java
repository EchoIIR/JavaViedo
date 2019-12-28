import java.util.Arrays;


class WrapperTest{
	public static void main(String[] args) {
		String numStr = "20 78 9 -7 88 36 29";
		System.out.println("Before sort:" + numStr);
		numStr = sortStringNumber(numStr);
		System.out.println("After sort:" + numStr);
	}

	public static String sortStringNumber(String numStr) {
				
		// 1、字符串分割为字符数组
		// String [] str_arr = numStr.split(" ");
		String [] str_arr = strToArr(numStr);

		// 2、将字符数组转换为int
		int [] int_arr = str_arrToint_arr(str_arr);
		// 3、将转换后的int数组排序
	    mySortArray(int_arr);
		// 4、将排序后的int数组转为字符型
		String temp = int_arrToString(int_arr);
		return temp;
	}

	private static String int_arrToString(int[] int_arr) {
		StringBuilder sb = new StringBuilder();
		for (int x=0; x<int_arr.length; x++){
			if(x!=int_arr.length-1){
				sb.append(int_arr[x]+ " ");
			} 
			else{
				sb.append(int_arr[x]);
			}
		}
		return sb.toString();
	}

	public static void mySortArray(int[] int_arr) {
		Arrays.sort(int_arr);
	}

	private static String[] strToArr(String numStr) {
		String [] str_arr = numStr.split(" ");
		return str_arr;
	}

	public static int[] str_arrToint_arr(String[] str_arr) {
		int [] int_arr = new int[str_arr.length];
		for(int i =0; i<str_arr.length; i++){
			int_arr[i] = Integer.parseInt(str_arr[i]); // 将字符型转化为int型
		}
		return int_arr;
	}
}