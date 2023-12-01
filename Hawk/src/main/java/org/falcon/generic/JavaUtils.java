package org.falcon.generic;

import java.time.LocalDateTime;
import java.util.Random;

public class JavaUtils {
	public String getLocalDateTime() {
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		return timeStamp;
	}

	public int getRandomNumber() {
		Random random = new Random();
		int randomNumber = random.nextInt(10, 99);
		return randomNumber;
	}
}