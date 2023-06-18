import java.util.Scanner;


public class Looping_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * // For Loop
         * // sum of all number to that given number
         * System.out.println("Print the sum of all number to that given numnber:");
         * System.out.println("Enter the number to print sum to that numner:");
         * int p1 = sc.nextInt();
         * int sum = 1;
         * for (int i = 0; i <= p1; i++) {
         * sum += i;
         * System.out.println("sum of all number to that given Number:" + sum);
         * }
         * 
         * // printing incrementing star Pattern
         * System.out.println("Printing incrementing Star Pattern:");
         * System.out.print("Enter the Number to Incrementing print the Star Pattern:");
         * int l = sc.nextInt();
         * for (int f = 0; f < l; f++) {
         * for (int r = 0; r <= f; r++) {
         * System.out.print("*");
         * }
         * System.out.print("\n");
         * }
         * 
         * // Printing decrementing Star Pattern
         * System.out.println("Printing decrementing Star Pattern:");
         * System.out.println("Enter the Number to print decremnting star pattern:");
         * int l1 = sc.nextInt();
         * for (int f1 = l1 - 1; f1 >= 0; f1--) {
         * for (int r1 = 0; r1 <= f1; r1++) {
         * System.out.print("*");
         * }
         * System.out.print("\n");
         * }
         * 
         * // Printing Left Angled Star pattern
         * System.out.println("Printing Left Angled Star pattern:");
         * int i, j;
         * System.out.println("Enter the number to print Left angled star pattern: ");
         * int row = sc.nextInt();
         * // Outer loop work for rows
         * for (i = 0; i < row; i++) {
         * // inner loop work for space
         * for (j = 2 * (row - i); j >= 0; j--) {
         * // prints space between two stars
         * System.out.print(" ");
         * }
         * // inner loop for columns
         * for (j = 0; j <= i; j++) {
         * // prints star
         * System.out.print("* ");
         * }
         * // throws the cursor in a new line after printing each line
         * System.out.println();
         * }
         * 
         * // Natural numbers from 1 to 10
         * int v = 0;
         * System.out.println("Natural Numbers From 1 to 10:");
         * for (v = 0; v <= 10; v++) {
         * System.out.println(v);
         * }
         * 
         * // Decrementing Natural numbers from 20 to 0:
         * int w;
         * System.out.println("Decrementing Natural Numbers from 20 to 0:");
         * for (w = 20; w >= 0; w--) {
         * System.out.println(w);
         * }
         * 
         * // First Even Numbers upto where i<=10
         * int s = 0;
         * System.out.println("First even Numbers Upto where i<=10: ");
         * for (s = 0; s <= 10; s++) {
         * System.out.println(2 * s);
         * }
         * 
         * // First Odd Numbers upto where i<=10
         * int r = 1;
         * System.out.println("First Odd Numbers Upto where i<=10: ");
         * for (r = 1; r <= 10; r++) {
         * System.out.println(2 * r - 1);
         * }
         * 
         * // Even Numbers upto n using For Loop
         * System.out.println("Enter the value to print even Numbers upto n:");
         * int i, n;
         * n = sc.nextInt();
         * System.out.println("Even Numbers :");
         * 
         * for (i = 0; i <= n; i = i + 2) {
         * System.out.println(i);
         * }
         * 
         * // Odd Numbers upto n using For Loop
         * System.out.println("Enter the value to print odd Numbers upto m:");
         * int m = sc.nextInt();
         * System.out.println("Odd Numbers :");
         * 
         * for (int j = 1; j <= m; j = j + 2) {
         * System.out.println(j);
         * }
         * 
         * //Program to print the Factorial of Number.
         * int i;
         * System.out.println("Enter the Number to print the Factorial of Number:");
         * int factNum=sc.nextInt();
         * int fact=1;
         * for(i=1;i<=factNum;i++){
         * fact=fact*i;
         * }
         * System.out.println("factorial is:"+fact);
         * 
         * 
         * 
         * // Checking the Entered number is Prime or not.
         * int num, m = 0, flag = 0;
         * System.out.println("Enter the Number to check the prime or not: ");
         * int n = sc.nextInt();
         * m = n / 2;
         * if (n == 0 || n == 1) {
         * System.out.println(n + " " + "is Not prime number");
         * } else {
         * for (num = 2; num <= m; num++) {
         * if (n % num == 0) {
         * System.out.println(n + " " + "is Not prime number");
         * flag = 1;
         * break;
         * }
         * }
         * if (flag == 0) {
         * System.out.println(n + " " + "is prime Number");
         * }
         * }
         * 
         * // Program to print the Multipliation Table of number.
         * 
         * System.out.
         * println("Enter the Number to print the Multiplication table of that number:"
         * );
         * int num1 = sc.nextInt();
         * System.out.println("Multiplication Table of Numaber:");
         * for (int i = 1; i <= 10; i++) {
         * System.out.println(num1 + "*" + i + ":" + num1 * i);
         * }
         * 
         * 
         * // Program to take user input until the user press the x:
         * while (true) {
         * System.out.println("Enter the value(or 'x' to exit): ");
         * String userInput = sc.nextLine();
         * 
         * if (userInput.equalsIgnoreCase("x")) {
         * break;
         * } else {
         * System.out.println("you Entered:" + userInput);
         * }
         * }
        
        // Calculator Program to take the user input till the user press'x'.
        int ans = 0;
        while (true) {
            System.out.print("Enter the operator or('x' to quit):");
            char op = sc.next().trim().charAt(0);
            if (op == '*' || op == '+' || op == '-' || op == '/' || op == '%') {
                System.out.print("Enter the first number:");
                int a = sc.nextInt();
                System.out.print("Enter the Second input:");
                int b = sc.nextInt();
                if (op == '*') {
                    ans = a * b;
                }
                if (op == '+') {
                    ans = a + b;
                }
                if (op == '-') {
                    ans = a - b;
                }
                if (op == '/') 
                {
                    if (b != 0)
                    {
                        ans = a / b;
                    }
                }
                if(op=='%'){
                    ans=a%b;
                }
            }
            else if(op=='x'||op=='X')
            {
                System.out.println("Program is terminated !");
                break;
            }
            else{
                System.out.println("Invalid operator input !");
            }
            System.out.println("Answer is: "+ans);
        }

        //Program to take the input numbers and print the sum of all number the till 'x' is pressed.
        int sum1=0;
        while(true){
            //Taking the uesr ipnut.
            System.out.print("Enter the Number or('0' to exit): ");
            int sNum=sc.nextInt();
            if(sNum==0){
                System.out.println("Program is terminated !");
                break;
            }
            else{
            //Add the value of sNum into the sum1 to print the sum of numbers.
            sum1+=sNum;
            }
            System.out.println("Sum is :"+sum1);
        }

        //Take integer inputs till the user enters 0 and print the largest number from all.
        int large=0;
        System.out.println("Enter the Number or('0' ot exit): ");
        while(true){
            int m=sc.nextInt();
            if(m==0){
                System.out.println("Program is terminated !");
                break;
            }
            else if(m>large){
                large=m;
            }
        }
        System.out.println("largest value: "+large);
*/
        //Subtract the Product and Sum of Digits of an Integer
        int Num22=234;
        int ans1=0,prod=1,sum2=0;
        while(Num22>0){
            int rem = Num22%10;
            //get the rem to the last digit
            Num22/=10;
            //multiply the rem with prod and store the value in prod.
            prod=prod*rem;
            //add the rem with sum and store the value in sum.
            sum2=sum2+rem;
            //subtract th prod and sum ,store the value in ans.
            ans1=prod-sum2;
        }
        System.out.println("Answer is:"+ans1);
        /*
         * //Program to count the digit occurrence of given integer value.
         * System.out.print("Enter the Integer Value:");
         * int N=sc.nextInt();
         * System.out.print("Enter the digit to count the occurrence: ");
         * int i=sc.nextInt();
         * int count=0;
         * while(N>0){
         * int rem=N%10;
         * if(rem==i){
         * count++;
         * }
         * N=N/10;
         * }
         * System.out.println("No of Occurenceo of "+i+":"+count);
         * 
         * //Program to Reverse the Integer Value.
         * System.out.println("Enter the Integer Vlaue to Reverse the Integer value:");
         * int Num=sc.nextInt();
         * int ans=0;
         * while(Num>0){
         * int rem=Num%10;
         * Num=Num/10;
         * ans=ans*10+rem;
         * }
         * System.out.println(ans);
         * 
         * 
         * //Program to print the nth Fibonacci Number.
         * System.out.println("Enter the Nth value to print the fibonacci Number:");
         * int N1=sc.nextInt();
         * int num1=0,num2=1;
         * int counter=2;
         * while(counter<=N1){
         * int num3=num2;
         * num2=num2+num1;
         * num1=num3;
         * counter++;
         * }
         * System.out.println("Fibonacci series :"+num2);
         * 
         * //Program to print the Fibonacci series to the nth value.
         * System.out.println("Enter the nth Value to print the fibonacci series:");
         * int N2=sc.nextInt();
         * int n1=0,n2=1;
         * int counter1=0;
         * System.out.println("Fibonacci series:");
         * while(counter1<N2){
         * System.out.println(n1+" ");
         * //swap the numbers
         * int n3=n2+n1;
         * n1=n2;
         * n2=n3;
         * counter1=counter1+1;
         * 
         * }
         * 
         */
        /*
         * //While Loop
         * //Natural numbers from 1 to 10 using while loop
         * int f=0;
         * System.out.println("Natural Number From 1 to 10:");
         * while (f<=10){
         * System.out.println(f);
         * f++;
         * }
         * 
         * //Decrementing Natural numbers From 20 to 0 using while Loop
         * int g=20;
         * System.out.println("Decrementing Natural Number From 20 To 0:");
         * while (g>=0) {
         * System.out.println(g);
         * g--;
         * }
         *
         * //Printing the Natural numbers upto m using while Loop
         * int b=0,m;
         * System.out.println("Enter the Value to print the Natural numbers till m:");
         * m=sc.nextInt();
         * System.out.println("Natural Numbers from 1 to m using while Loop:");
         * 
         * while (b<=m) {
         * System.out.println(b);
         * b++;
         * }
         * 
         * //Printing Even Numbers upto n using While Loop
         * int c=0,number;
         * System.out.println("Enter the limit to print Even Numbers:");
         * number=sc.nextInt();
         * System.out.println("Even Numbers :");
         * 
         * while (c<=number) {
         * System.out.println(c+"");
         * c=c+2;
         * }
         * 
         * //Printing Odd Numbers upto n using While Loop
         * int d=1,number1;
         * System.out.println("Enter the limit to print odd Numbers:");
         * number1=sc.nextInt();
         * System.out.println("Odd Numbers :");
         * 
         * while (d<=number1) {
         * System.out.println(d+"");
         * d=d+2;
         * }
         * 
         * //Printing the submation of Natural numbers from 1 to 100 using while Loop
         * int a=1 ,sum = 0;
         * System.out.println("Numbers from 1 to 100 using while loop:");
         * 
         * while (a<=100) {
         * sum = sum + a;
         * a++;
         * }
         * System.out.println("submation: "+ sum);
         * 
         * 
         * 
         * //do while Loop
         * //Natural Numbers upto 10 using do-while Loop:
         * int h=0;
         * System.out.println("Natural Numbers upto 10 using do-while Loop:");
         * do {
         * System.out.println(h);
         * h++;
         * } while (h<=10);
         * 
         * //Natural Numbers upto n using do-while Loop:
         * int p=0,q;
         * System.out.println("Enter the value of limit to print the Natuaral Number :"
         * );
         * q=sc.nextInt();
         * System.out.println("Natural Numbers upto p:");
         * do {
         * System.out.println(p);
         * p++;
         * } while (p<=q);
         * 
         * //Even Numbers upto n using do-while Loop:
         * int x=0,w;
         * System.out.println("Enter the limit to print the Even Numbers:");
         * w=sc.nextInt();
         * System.out.println("Even Numbers :");
         * do {
         * System.out.println(x);
         * x=x+2;
         * } while (x<=w);
         * 
         * //Odd Numbers upto n Using do-while Loop:
         * int y=1,z;
         * System.out.println("Enter the limit to print the Odd Numbers:");
         * z=sc.nextInt();
         * System.out.println("Odd Numbers :");
         * do {
         * System.out.println(y);
         * y=y+2;
         * } while (y<=z);
         */
        sc.close();
    }
}