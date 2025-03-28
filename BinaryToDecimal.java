import java.util.*;

class BinaryToDecimal{

public static void binary (int num){

ArrayList<Integer> arr = new ArrayList<>();

while (num>0){
int lastdigit = num%2;
arr.add(lastdigit);
num=num/2;
}

for (int i = arr.size()-1;i>=0;i--){
System.out.print(arr.get(i)+" ");
}

}

public static void main (String args[]){

Scanner scanner = new Scanner (System.in);

System.out.print("Enter a number to convert to binary :  ");

int num = scanner.nextInt();

binary(num);

}
}