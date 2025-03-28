import java.util.*;

class Binaryaddition {

public static void addition(String str1,String str2){

int newcarry = 0;

ArrayList<Integer> newarray = new ArrayList<>();

int result = 0 ;


for (int i = str1.length()-1;i>=0;i--){

int ch1 = str1.charAt(i)-'0';

int ch2 = str2.charAt(i)-'0';

result = ch1+ch2+newcarry;

newarray.add(result%2);

newcarry=result/2;




//loop ends
}

newarray.add(newcarry);

for (int i = newarray.size()-1;i>=0;i--){

System.out.print(newarray.get(i)+" ");

//newarrayprint
}
//function ends
}

public static void main (String args[]){

Scanner scanner = new Scanner (System.in);

System.out.print("Enter a  binary1 number :  ");

String binary1 = scanner.nextLine();

System.out.print("Enter a  binary2 number :  ");

String binary2 = scanner.nextLine();

addition(binary1,binary2);
//main function
}
}