package problems;

import java.util.*;

public class BufferMessagePrinting {
	public static void main(String[] args) {
		BufferMessagePrinting print = new BufferMessagePrinting();
		print.method();
	}

	private void method() {
		Scanner scanner = new Scanner(System.in);
		String givenMessage;
		ArrayList<String> messages = new ArrayList();
		ArrayList<String> buffer = new ArrayList();
		System.out.println("Enter The Number Of Message");
		int numberOfMessage = scanner.nextInt();
		char align = '1';
		scanner.nextLine();
		for (int i = 0; i < numberOfMessage; i++) {
			givenMessage = scanner.nextLine();
			if (givenMessage.charAt(0) == align) {
				String[] temp = givenMessage.split("-");
				if (temp.length > 1)
					messages.add(temp[1]);
				align++;

			} else {
				buffer.add(givenMessage);
			}
		}
		int max = 0;
		if (!buffer.isEmpty()) {
			for (int i = 0; i < buffer.size(); i++) {
				for (String msg : buffer) {
					if (msg.charAt(0) == align) {
						String[] temp = msg.split("-");
						if (temp.length > 1) {
							messages.add(temp[1]);
							max = Math.max(max, temp[1].length());
						}
						align++;
					}
				}
			}
		}

		System.out.println("Message : " + messages);
		System.out.println(buffer);
		System.out.println(" Max Length of Message : " + max);
	}

}
