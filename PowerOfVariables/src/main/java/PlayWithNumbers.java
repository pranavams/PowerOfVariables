import java.util.stream.LongStream;

public class PlayWithNumbers {

	/* Java 8 Functional Style */
	
	public Long _____(int __) {
		return LongStream.rangeClosed(1, __)
				.reduce(1, (___, ____) -> ___ * ____);
	}

	/* Java <=8 Imperative Style */

	public Long ____(int __) {
		Long ___ = 1L;
		for (int ____ = 1; ____ <= __ ; ____ ++){
			___  = ___ * ____;
		}
		return ___;
	}
	
	/* Java 8+ Functional Style */
	
	public Long computeFactorialFunctional(int number) {
		return LongStream.rangeClosed(1, number)
				.reduce(1, (a, b) -> a * b);
	}

	/* Java <=8 Imperative Style */
	
	public Long computeFactorialImperative(int number) {
		Long factorial = 1L;
		for (int counter = 1; counter <= number ; counter ++){
			factorial  = factorial * counter;
		}
		return factorial;
	}


}
