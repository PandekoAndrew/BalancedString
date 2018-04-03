package by.vsu;

public class Runner {

	public static void main(String[] args) {
		System.out.printf("String %s is %s",
				args[0],
				StringChecker.checkBalance(args[0]) ? "balanced" : "unbalanced");
	}

}
