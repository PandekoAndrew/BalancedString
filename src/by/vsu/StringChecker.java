package by.vsu;

public class StringChecker {
	public static boolean checkBalance(String str){
		int balanceCounter = 0;
		for(char ch : str.toCharArray()){
			if(ch == '('){
				balanceCounter++;
			}
			if(ch == ')'){
				balanceCounter--;
			}
			if(balanceCounter < 0){
				return false;
			}
		}
		if(balanceCounter != 0)return false;
		return true;
	}
}
