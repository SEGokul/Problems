import java.util.*;

class Butterfly {

public static void butterfly (int num){

int space = 0;

int pyramid = num*2;

for (int i = 1; i<=num;i++){

for (int j = 1 ; j<=i;j++){
System.out.print("*");
//j loop ends
}

for (int k =1;k<=pyramid-2;k++){
System.out.print(" ");
//k ends
}pyramid = pyramid - 2;

for (int m = 1;m<=i;m++){
System.out.print("*");
//m ends 
}System.out.println();


//i loop ends 
}

for (int i = 1;i<=num;i++){

for (int j = i; j<=num;j++){
System.out.print("*");
//j loop ends
}

for (int l = 1;l<=space;l++){
System.out.print(" ");
//l loop end
}space=space+2;

for (int k = i; k<=num;k++){
System.out.print("*");
//k loop ends
}System.out.println();



//2 i loop ends
}

//function ends here 
}

public static void main(String args[]){

Scanner scanner = new Scanner (System.in);

System.out.print("Enter a  number :  ");

int num = scanner.nextInt();

butterfly(num);
//main ends
}

//class ends here 
}