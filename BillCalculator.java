//Christian Agape B. Bayno (cbayno1@toromail.csudh.edu)
import java.util.Scanner;
public class BillCalculator {
	public static void main(String args[])
	{

int voiceCall=0;
int textMessage=0;
int dataUsed=0;
int pcode=0;

double subtotal=0;
double voiceCharge=0;
double textCharge=0;
double dataCharge=0;
double stateTax=0;
double equalTax=0;
double totalDue=0;

int minutev;
int textv;
int datav;

Scanner keyboard = new Scanner(System.in);

System.out.print("Voice call minutes: ");
voiceCall = keyboard.nextInt();
if(voiceCall < 0){
	System.out.println("Invalid input.");
	System.exit(0);
}

System.out.print("Text messages sent: ");
textMessage = keyboard.nextInt();
if(textMessage < 0){
	System.out.println("Invalid input.");
	System.exit(0);
}


System.out.print("MBs of data used: ");
dataUsed = keyboard.nextInt();
if(dataUsed < 0){
	System.out.println("Invalid input.");
	System.exit(0);
}


System.out.print("Package Code [1-3]: ");
pcode = keyboard.nextInt();
if(pcode < 1 || pcode > 3){
	System.out.println("Invalid input.");
	System.exit(0);
}


if(pcode==1) {
	System.out.println("Summary of Usage: ");
	if(voiceCall > 100){
		System.out.println(" You used " +voiceCall+ " /100 minutes, you exceeded your monthly limit.");
	}
	else{
		System.out.println(" You used " +voiceCall+ " /100 minutes, you are within your monthly limit.");
	}
	if(textMessage > 150){
		System.out.println(" You used " +textMessage+ " /150 SMS messages, you exceeded your monthly limit.");
	}
	else{
		System.out.println(" You used " +textMessage+ " /150 SMS messages, you are within your monthly limit.");
	}
	if(dataUsed > 1024){
		System.out.println(" You used " +dataUsed+ " /1024 SMS messages, you exceeded your monthly limit.");
	}
	else{
		System.out.println(" You used " +dataUsed+ " /1024 SMS messages, you are within your monthly limit.");
	}
	System.out.println("Charges: ");
	System.out.println("Package code\t\t\t\t\t\t\t : " +pcode);
	System.out.println("Monthly charges\t\t\t\t\t\t\t : 20.00");

		if(voiceCall > 100){
			voiceCharge = (voiceCall%100)*0.20;
			minutev = voiceCall%100;
			System.out.println("Additional voice charges (" +minutev+ " minute(s) @ 0.20 per minute)\t : " + String.format("%.2f",voiceCharge));
			}
			else{
				System.out.println("Additional voice charges (0 minute(s) @ 0.20 per minute)\t : 0.00");
			}

		
		if (textMessage > 150){
			textCharge = (textMessage%150)*0.20;
			textv = textMessage%150;
			System.out.println("Additional voice charges (" +textv+ " minute(s) @ 0.20 per minute)\t : " + String.format("%.2f",textCharge));
			}
			else{
				System.out.println("Additional voice charges (0 minute(s) @ 0.20 per minute)\t : 0.00");
			}


		if (dataUsed > 1024){
			dataCharge = (dataUsed%1024)*0.25;
			datav = dataUsed%1024;
			System.out.println("Additional voice charges (" +datav+ " minute(s) @ 0.25 per minute)\t : " + String.format("%.2f",dataCharge));
			}
			else{
				System.out.println("Additional voice charges (0 minute(s) @ 0.25 per minute)\t : 0.00");
			}

			subtotal = voiceCharge + textCharge + dataCharge; 
			System.out.println("Sub Total\t\t\t\t\t\t\t : "+subtotal);

		
			if(subtotal==0){
				stateTax = 0;
				System.out.println("State Tax(6.5%)\t\t\t\t\t\t\t : "+ String.format("%.2f",stateTax));
			}
				else{
					stateTax = 20*0.065;
					System.out.println("State Tax(6.5%)\t\t\t\t\t\t\t : "+ String.format("%.2f",stateTax));

				}
			
			totalDue = stateTax + subtotal;
			System.out.println("Total due\t\t\t\t\t\t\t : "+ String.format("%.2f",totalDue));
}



if(pcode==2) {
	System.out.println("Summary of Usage: ");
	if(voiceCall > 200){
		System.out.println(" You used " +voiceCall+ " /200 minutes, you exceeded your monthly limit.");
	}
	else{
		System.out.println(" You used " +voiceCall+ " /200 minutes, you are within your monthly limit.");
	}
	if(textMessage > 300){
		System.out.println(" You used " +textMessage+ " /300 SMS messages, you exceeded your monthly limit.");
	}
	else{
		System.out.println(" You used " +textMessage+ " /300 SMS messages, you are within your monthly limit.");
	}
	if(dataUsed > 2048){
		System.out.println(" You used " +dataUsed+ " /2048 SMS messages, you exceeded your monthly limit.");
	}
	else{
		System.out.println(" You used " +dataUsed+ " /2048 SMS messages, you are within your monthly limit.");
	}
	System.out.println("Charges: ");
	System.out.println("Package code\t\t\t\t\t\t\t : " +pcode);
	System.out.println("Monthly charges\t\t\t\t\t\t\t : 30.00");
		if(voiceCall > 200){
			voiceCharge = (voiceCall%200)*0.13;
			minutev = voiceCall%200;
			System.out.println("Additional voice charges (" +minutev+ " minute(s) @ 0.13 per minute)\t : " + String.format("%.2f",voiceCharge));
			}
			else{
				System.out.println("Additional voice charges (0 minute(s) @ 0.13 per minute)\t : 0.00");
			}

		
		if (textMessage > 300){
			textCharge = (textMessage%300)*0.10;
			textv = textMessage%300;
			System.out.println("Additional voice charges (" +textv+ " minute(s) @ 0.10 per minute)\t : " + String.format("%.2f",textCharge));
			}
			else{
				System.out.println("Additional voice charges (0 minute(s) @ 0.10 per minute)\t : 0.00");
			}


		if (dataUsed > 2048){
			dataCharge = (dataUsed%2048)*0.20;
			datav = dataUsed%2048;
			System.out.println("Additional voice charges (" +datav+ " minute(s) @ 0.20 per minute)\t : " + String.format("%.2f",dataCharge));
			}
			else{
				System.out.println("Additional voice charges (0 minute(s) @ 0.20 per minute)\t : 0.00");
			}

			subtotal = voiceCharge + textCharge + dataCharge; 
			System.out.println("Sub Total\t\t\t\t\t\t\t : "+subtotal);

		
			if(subtotal==0){
				stateTax = 0;
				System.out.println("State Tax(6.5%)\t\t\t\t\t\t\t : "+ String.format("%.2f",stateTax));
			}
				else{
					stateTax = 30*0.065;
					System.out.println("State Tax(6.5%)\t\t\t\t\t\t\t : "+ String.format("%.2f",stateTax));

				}
			
			totalDue = stateTax + subtotal;
			System.out.println("Total due\t\t\t\t\t\t\t : "+ String.format("%.2f",totalDue));
}



if(pcode==3) {
	System.out.println("Summary of Usage: ");
	if(voiceCall > 400){
		System.out.println(" You used " +voiceCall+ " /400 minutes, you exceeded your monthly limit.");
	}
	else{
		System.out.println(" You used " +voiceCall+ " /400 minutes, you are within your monthly limit.");
	}
	if(textMessage > 600){
		System.out.println(" You used " +textMessage+ " /600 SMS messages, you exceeded your monthly limit.");
	}
	else{
		System.out.println(" You used " +textMessage+ " /600 SMS messages, you are within your monthly limit.");
	}
	if(dataUsed > 4096){
		System.out.println(" You used " +dataUsed+ " /4096 SMS messages, you exceeded your monthly limit.");
	}
	else{
		System.out.println(" You used " +dataUsed+ " /4096 SMS messages, you are within your monthly limit.");
	}
	System.out.println("Charges: ");
	System.out.println("Package code\t\t\t\t\t\t\t : " +pcode);
	System.out.println("Monthly charges\t\t\t\t\t\t\t : 40.00");
		if(voiceCall > 400){
			voiceCharge = (voiceCall%400)*0.8;
			minutev = voiceCall%400;
			System.out.println("Additional voice charges (" +minutev+ " minute(s) @ 0.8 per minute)\t : " + String.format("%.2f",voiceCharge));
			}
			else{
				System.out.println("Additional voice charges (0 minute(s) @ 0.8 per minute)\t : 0.00");
			}

		
		if (textMessage > 600){
			textCharge = (textMessage%600)*0.8;
			textv = textMessage%600;
			System.out.println("Additional voice charges (" +textv+ " minute(s) @ 0.8 per minute)\t : " + String.format("%.2f",textCharge));
			}
			else{
				System.out.println("Additional voice charges (0 minute(s) @ 0.8 per minute)\t : 0.00");
			}


		if (dataUsed > 4096){
			dataCharge = (dataUsed%4096)*0.13;
			datav = dataUsed%4096;
			System.out.println("Additional voice charges (" +datav+ " minute(s) @ 0.13 per minute)\t : " + String.format("%.2f",dataCharge));
			}
			else{
				System.out.println("Additional voice charges (0 minute(s) @ 0.13 per minute)\t : 0.00");
			}

			subtotal = voiceCharge + textCharge + dataCharge; 
			System.out.println("Sub Total\t\t\t\t\t\t\t : "+subtotal);

		
			if(subtotal==0){
				stateTax = 0;
				System.out.println("State Tax(6.5%)\t\t\t\t\t\t\t : "+ String.format("%.2f",stateTax));
			}
				else{
					stateTax = 40*0.065;
					System.out.println("State Tax(6.5%)\t\t\t\t\t\t\t : "+ String.format("%.2f",stateTax));

				}
			
			totalDue = stateTax + subtotal;
			System.out.println("Total due\t\t\t\t\t\t\t : "+ String.format("%.2f",totalDue));
		}



		
	}

}

	

