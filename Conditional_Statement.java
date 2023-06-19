import java.util.Scanner;

//import java.util.Objects;
public class Conditional_Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * // Checking The Entered year is Leap year or Not
         * System.out.println("Enter the Year:");
         * int year = sc.nextInt();
         * if ( year % 4 == 0)
         * {
         * System.out.println("Year is Leap Year");
         * }
         * else{
         * System.out.println("Year is not Leap Year");
         * }
         * 
         * //Checking the entered number is Even Or Odd
         * System.out.println("Enter the Number:");
         * int number = sc.nextInt();
         * if(number % 2==0){
         * System.out.println("Entered number is Even!");
         * }
         * else{
         * System.out.println("Entered number is Odd!");
         * 
         * 
         * 
         * 
         * 
         * //Program to check the which number is greater form the input ones.
         * System.out.print("Enter the Three Numbers To check the Greater Number:");
         * int a,b,c;
         * a=sc.nextInt();
         * b=sc.nextInt();
         * c=sc.nextInt();
         * if(a>b){
         * System.out.println("Greater Number :"+a);
         * }
         * else if(b>c){
         * System.out.println("Greater Number :"+b);
         * }
         * else{
         * System.out.println("Greater Number:"+c);
         * }
         * 
         * //Program to check the which number is greater form the input ones using the
         * Math.max function.
         * System.out.print("Enter the Three Numbers to check which one is greater:");
         * int a1,b1,c1;
         * a1=sc.nextInt();
         * b1=sc.nextInt();
         * c1=sc.nextInt();
         * int max=Math.max(c1,Math.max(a1,b1));
         * System.out.println("Greater Number is:"+max);
         * 
         */
        // Program to check the case of input charcter.
        System.out.println("Enter the Charcter to check the LowerCase or UpperCase:");
        char c = sc.next().trim().charAt(0);
        if (c >= 'a' && c <= 'z') {
            System.out.println(c + " is LowerCase");
        } else {
            System.out.println(c + " is UpperCase");
        }

        /*
         * //if Statement
         * System.out.println("Enter your age between 1 to 10:");
         * int age = sc.nextInt();
         * if(age >=4){
         * System.out.println("Your are able to Go School!");
         * }
         * 
         * //if else Statement
         * System.out.println("Enter Your Age:");
         * int Age = sc.nextInt();
         * 
         * if(Age >= 18){
         * System.out.println("Your are Eligible to Vote!");
         * }
         * else{
         * System.out.println("Your are Not Eligible to Vote!");
         * }
         * 
         * 
         * // if else if Statement
         * System.out.println("Enter your Age:");
         * int Age1 = sc.nextInt();
         * 
         * if(Age1 >= 18 && Age1 <= 60){
         * System.out.println("You are Eligible To Vote!");
         * }
         * else if(Age1 >= 12 && Age1 <=18){
         * System.out.println("You are Eligible to Vote For Teenagers!");
         * }
         * else if(Age1 >= 5 && Age1 <=12){
         * System.out.println("You are Eligible to Vote For Childrens!");
         * }
         * else if(Age1 >=60){
         * System.out.println("You are Eligible to Vote For Senior Citizens!");
         * }
         * else{
         * System.out.println("You are Not Eliglble To Vote!");
         * }
         */
        /*
         * // Nested if else Statement
         * System.out.println("Enter Your Nationality from India Or American:");
         * String Nationality = sc.next();
         * 
         * if(Objects.equals(Nationality,"Indian"))
         * {
         * System.out.println("Enter your Age:");
         * int Age = sc.nextInt();
         * if(Age >= 18)
         * {
         * System.out.println("You are Eligible to Vote!");
         * }
         * else
         * {
         * System.out.println("You are Not Eligible To Vote!");
         * }
         * }
         * else
         * {
         * if (Objects.equals(Nationality , "American"))
         * {
         * System.out.println("You are Eligible To Vote In USA!");
         * }
         * else
         * {
         * System.out.println("You are Not Eligible to Vote!");
         * }
         * }
         * 
         * //Switch Statement
         * System.out.println("Enter the Choice about your Smartphone Brand:");
         * String Choice = sc.next();
         * 
         * switch(Choice){
         * case "Apple":
         * System.out.println("Your Choice is Apple!");
         * break;
         * case "Samsung":
         * System.out.println("Your Choice is Samsung!");
         * break;
         * case "Oppo":
         * System.out.println("Your Choice Is Oppo!");
         * break;
         * case "Vivo":
         * System.out.println("Your Chioce is Vivo!");
         * break;
         * default:
         * System.out.println("Your Choice is Not Valid!");
         * }
         */

        // switch Statement with to print the days of week.
        System.out.println("Enter the Number from 1 to 7 to print the days of week: ");
        int day = sc.nextInt();

        switch (day) {
            case 1: {
                System.out.println("Day is Monday.");
                break;
            }
            case 2: {
                System.out.println("Day is Tuesday.");
                break;
            }
            case 3: {
                System.out.println("Day is Wednesday.");
                break;
            }
            case 4: {
                System.out.println("Day is Thursday.");
                break;
            }
            case 5: {
                System.out.println("Day is Friday.");
                break;
            }
            case 6: {
                System.out.println("Day is Saturday.");
                break;
            }
            case 7: {
                System.out.println("Day is Sunday.");
                break;
            }
            default: {
                System.out.println("Please Enter Valis Number.");
            }
        }

        sc.close();
    }
}
