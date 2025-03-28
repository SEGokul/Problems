import java.util.*;

class DecimalToHexadecimal {

public static void hexa (int num){

int reverse = 0 ;

ArrayList<Integer> arr = new ArrayList<>();

while (num>0){
arr.add(num%16);
num=num/16;
//while ends 
}

for (int i = arr.size()-1;i>=0;i--){
int ch=arr.get(i);

if (ch>=10){
String charac=character(ch);
System.out.print(charac);
}else {System.out.print(ch);}

//for loop end
}

//function ends 

}

public static String character (int num){

switch (num){
case 10:
return"A";
case 11:
return"B";
case 12:
return"C";
case 13:
return"D";
case 14:
return"E";
case 15:
return"F";
default:
return "Invalid";
//switch ends
}

//fucntion ends
}

public static void main (String args[]){

Scanner scanner = new Scanner (System.in);

 System.out.print("Enter a number: ");

 int num = scanner.nextInt();

hexa(num);

//main ends here
}
}