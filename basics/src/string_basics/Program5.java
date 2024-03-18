package string_basics;

public class Program5 {
	public static void main(String[] args) {
		String string = "Wel719~  &c@m!";
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			char check = string.charAt(i);
			if ((check <= 65 && check >= 90) || (check >= 97 && check <= 122) ||( check <= 57 && check >= 48)) {

			} else {
				System.out.println("Special characters are " + string.charAt(i));
				count++;
			}
		}
		System.out.println("Count for special characters : " + count);
	}
}
