public class ArraySum {
	int sum = 0;
	int index = 0;
	int stop = 0; 
	Integer[] array;

	public int sumOfArray () {
		if (index > stop) {
			return sum;
		}
		sum += array[index];
		index++;
		return sumOfArray();

	}
	public int sumOfArray (Integer[] a,int index) {
		array = a;
		stop = index;
		return sumOfArray();
	}
}
