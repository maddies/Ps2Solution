package base;

public class MyInteger {
	private int iValue;

	public MyInteger() {
	}
	public MyInteger(int iValue) {
		this.iValue = iValue;
	}
	public int getiValue() { 
		return iValue;
	}

	
// isEven
	public boolean isEven() {
		return (iValue % 2 == 0 ? true : false);
	}
	
	public static boolean isEven(int n) {
		MyInteger myInt = new MyInteger(n);
		return myInt.isEven();
	}
	
	public static boolean isEven(MyInteger myInt2) {
		return myInt2.isEven();
	}
	
// isOdd
	public boolean isOdd() {
		return !isEven();
	}
	public static boolean isOdd(int n) {
		MyInteger myInt = new MyInteger(n);
		return myInt.isOdd();	 
	}
	public static boolean isOdd(MyInteger myInt2) {
			return myInt2.isOdd();	
	}
	
// isEquals
	public boolean isEquals(int n) {
		return (this.iValue == n);
	}
	
	public static boolean isEquals(MyInteger myInt2) {
		return myInt2.equals(myInt2.getiValue());
	}
	
// isPrime
	public boolean isPrime() {
		for (int i = 2; i <= iValue / 2; i++) {
			if (iValue % i == 0) {
				return false; }
			}
		return true;
		}
	public static boolean isPrime(int n) {
		MyInteger myInt = new MyInteger(n);
		return myInt.isPrime();
		}
	public static boolean isPrime(MyInteger myInt2) {
		return myInt2.isPrime();	
	}
}

