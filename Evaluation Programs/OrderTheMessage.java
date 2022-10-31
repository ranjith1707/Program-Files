package evaluation;

import java.util.*;

public class OrderTheMessage {
	public static void main(String[] args) {
		OrderTheMessage orderaMessage = new OrderTheMessage();
		orderaMessage.toOrder();
	}

	private void toOrder() {
		int max=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enetr the Number Of Pakkets");
		int size = scanner.nextInt();
		scanner.nextLine();
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		String message;
		for (int i = 0; i < size; i++) {
			message = scanner.nextLine();
			max=Math.max(max,message.length());
			String[] messageArray = message.split("-");
			try {
				map.put(messageArray[0], messageArray[1]);
			} catch (Exception e) {
				map.put(messageArray[0], " ");
			}
		}

		String ricivedMessage = "";
		for (int i = 1; i <= map.size(); i++) {
			String key = String.valueOf(i);
			ricivedMessage += map.get(key);
			ricivedMessage += " ";
		}
		System.out.println("Message : "+ricivedMessage);
		System.out.println("Maximum Length : "+max);
	}
}
