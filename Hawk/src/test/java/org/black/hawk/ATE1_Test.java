package org.black.hawk;

import org.falcon.generic.JavaUtils;

public class ATE1_Test 
{
	public static void main(String[] args) {
		JavaUtils jutil=new JavaUtils();
		System.out.println(jutil.getRandomNumber()+ " is generated at "+jutil.getLocalDateTime());
	}
}
