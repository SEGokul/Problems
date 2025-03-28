import java.util.*;
class DecimalToOctal {

public static int octal (int num){

int reverse = 0 ;

ArrayList<Integer> arr = new ArrayList<>();

while (num>0){
arr.add(num%8);
num=num/8;
//while ends 
}

for (int i = arr.size()-1;i>=0;i--){
reverse = reverse*10+arr.get(i);
//for loop end
}

//function ends 
return reverse;}

public static void main (String args[]){

Scanner scanner = new Scanner (System.in);

 System.out.print("Enter a number: ");

 int num = scanner.nextInt();

int value = octal(num);
 System.out.print(value);

//main ends here
}
}