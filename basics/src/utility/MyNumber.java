package utility;

public class MyNumber implements IntOperations {
	private int num;

	public MyNumber(int num) {
		super();
		this.num = num;
	}

	@Override
	public boolean isOdd(int num) {
		if (num % 2 == 1) {
			return true;
		} else {
			return false;

		}
	}

	@Override
	public boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;
		} else {
			return false;

		}
	}

	@Override
	public boolean isPrime(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num %i == 0) {
				count++;
			}
		}
		if (count == 2) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public double callFactorial(int num) {
		double factor = 1;
		for (int i = 1; i<=num; i++) {
			
			factor *= i;
			
		}
		return factor;
	}

}
