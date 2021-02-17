package lg22;

public class Ex3 {
	public static int FatorialNaoRecursivo (int num) {
		if (num == 0) {
		return 1;
		}
		total int = 1;
		para (int g = num; g> 1; g -) {
		total * = g;
		}
		return total;
		}
		public static int Fatorial (int num) {
		if (num == 0) {
		return 1;
		}
		return num * Fatorial (num-1);
		}
}
