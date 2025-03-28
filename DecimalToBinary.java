import java.util.*;

class DecimalToBinary {

public static int binaryvalue (String str){

int sum =  0 ;

int power = 1 ;

for (int i = str.length()-1;i>=0;i--){

int ch = str.charAt(i)-'0';

int result = ch*power;

sum = sum+result;

power = power*2;

//loop ends 
}

return sum;}

public static void main (String args[]){

Scanner scanner = new Scanner (System.in);

System.out.print("Enter a  binary number :  ");

String binary = scanner.nextLine();

int value = binaryvalue(binary);

System.out.print(value);


//main ends here
}
}