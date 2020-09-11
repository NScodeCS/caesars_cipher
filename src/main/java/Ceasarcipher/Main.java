package Ceasarcipher;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		String message ;
		int offset;
		Scanner input = new Scanner(System.in);

		System.out.println("enter the offset and your line");
		offset = input.nextInt();	
     	message = input.nextLine();
		input.close();
		
		
	//create a way to access the class caesarscipherclass	
CaesarsCipher caesarscipher = new CaesarsCipher();
//accessing the method and provide the message and offset
caesarscipher.cipher(message, offset);

System.out.println("Message "+message);
System.out.println("Offset "+offset);
System.out.println("Ciphered message is "+caesarscipher.cipher(message, offset));
		
	}

}
