public class NumberUtils {

    public static boolean isNarcissistic(int number) {
        int noofdigits = String.valueOf(number).length();
		int temp=number;
		int sum=0;
		while(temp!=0) {
			int s = temp%10;
			sum += Math.pow(s,noofdigits);
			temp /=10;
		}
		if(sum == number)
			return true;
		else
			return false;
    }