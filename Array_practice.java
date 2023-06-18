
import java.util.Scanner;
public class Array_practice {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
/* 
        //Addition of Two 2d Array.
        int Num[][]={{1,2,3},{4,5,6},{7,8,9}};
        int num[][]={{1,2,3},{4,5,6},{7,8,9}};
        int Sum[][]=new int[3][3];

        System.out.println("Sum of Two 2D Array:");

        for(int i=0;i<Num.length;i++)
        {
            for(int j=0;j<num.length;j++)
            {
                Sum[i][j]=Num[i][j]+num[i][j];
                System.out.print(Sum[i][j]+" ");
                System.out.print(" ");
            }
            System.out.println("");
        }

        //Suntraction of Two 2d Array.
        int Num1[][]={{11,22,33},{22,43,44},{44,22,66}};
        int num1[][]={{10,21,22},{21,33,42},{33,45,53}};
        int Sub[][]=new int[3][3];
        
        System.out.println("Subtraction of two 2d Array:");
        for(int a=0;a<Num1.length;a++)
        {
            for(int b=0;b<num1.length;b++)
            {
                Sub[a][b]=Num1[a][b]-num1[a][b];
                System.out.print(Sub[a][b]+" ");
                System.out.print(" ");
            }
            System.out.println("");
        }

        //Addition of Two 2d Array by taking user input.
        int Num2[][]=new int[2][2];
        int num2[][]=new int[2][2];
        int Sum1[][]=new int[2][2];

        //Taking input for First array.
        System.out.println("Enter the Elements of first Array:");
        for(int c=0;c<Num2.length;c++)
        {
            for( int d=0;d<Num2.length;d++)
            {
                Num2[c][d]=s.nextInt();
            }
        }

        //Taking input for Second array.
        System.out.println("Enter the Elements of Second Array:");
        for(int e=0;e<num2.length;e++)
        {
            for( int f=0;f<num2.length;f++)
            {
                num2[e][f]=s.nextInt();
            }
        }

        //Displaying the First Array.
        System.out.println("First Array:");
        for(int g=0;g<Num2.length;g++)
        {
            for( int h=0;h<Num2.length;h++)
            {
                System.out.print(Num2[g][h]);
                System.out.print(" ");
            }
            System.out.println("");
        }

        //Displaying the Second Array.
        System.out.println("Second Array:");
        for(int k=0;k<num2.length;k++)
        {
            for( int l=0;l<num2.length;l++)
            {
                System.out.print(num2[k][l]);
                System.out.print(" ");
            }
            System.out.println("");
        }

        //Addition of two array.
        System.out.println("Sum of Two 2d array by taking user input:");
        for(int m=0;m<Num2.length;m++)
        {
            for(int n=0;n<num2.length;n++)
            {
                Sum1[m][n]=Num2[m][n]+num2[m][n];
                System.out.print(Sum1[m][n]);
                System.out.print(" ");
            }
            System.out.println("");
        }

System.out.println("******//*****");
        //Subtractio of Two 2d array by Taking user input.
        int Num3[][]=new int[2][2];
        int num3[][]=new int[2][2];
        int Sum2[][]=new int[2][2];

        //Taking input for First array.
        System.out.println("Enter the Elements of first Array:");
        for(int c=0;c<Num3.length;c++)
        {
            for( int d=0;d<Num3.length;d++)
            {
                Num3[c][d]=s.nextInt();
            }
        }

        //Taking input for Second array.
        System.out.println("Enter the Elements of Second Array:");
        for(int e=0;e<num3.length;e++)
        {
            for( int f=0;f<num3.length;f++)
            {
                num3[e][f]=s.nextInt();
            }
        }

        //Displaying the First Array.
        System.out.println("First Array:");
        for(int g=0;g<Num3.length;g++)
        {
            for( int h=0;h<Num3.length;h++)
            {
                System.out.print(Num3[g][h]);
                System.out.print(" ");
            }
            System.out.println("");
        }

        //Displaying the Second Array.
        System.out.println("Second Array:");
        for(int k=0;k<num3.length;k++)
        {
            for( int l=0;l<num3.length;l++)
            {
                System.out.print(num3[k][l]);
                System.out.print(" ");
            }
            System.out.println("");
        }

        //Subtraction of two array.
        System.out.println("Subtraction of Two 2d array by taking user input:");
        for(int m=0;m<Num3.length;m++)
        {
            for(int n=0;n<num3.length;n++)
            {
                Sum2[m][n]=Num3[m][n]-num3[m][n];
                System.out.print(Sum2[m][n]);
                System.out.print(" ");
            }
            System.out.println("");
        }


        System.out.println("*******//*******");
        //Multiplication of 2X2 2D Array.
        int Num4[][]={{1,2,3},{4,5,6},{7,8,9}};
        int num4[][]={{1,2,3},{4,5,6},{7,8,9}};
        int Mul[][]=new int[3][3];

        //Multiple of Two Matrix.
        System.out.println("Multiple of  Two matrix:");
        for(int i=0;i<Num4.length;i++){
            for(int j=0;j<num4.length;j++){
                Mul[i][j]=0;
                for(int k=0;k<3;k++){
                    Mul[i][j]+=Num4[i][k]*num4[k][j];
                }
                System.out.print(Mul[i][j]+" ");
            }
            System.out.println("");
        }


        int a[]={1,22,3,24,5,6,47,83};
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        

        int a=7;
        String result;
        System.out.println("value of a:"+a);
        result=(a==10)?"a is equal":"a is not equal";
        System.out.println(result);
        

        int sum=0;
        int n=1000;
        for(int i=n;i>=1;--i){
            sum+=i;
        }
        System.out.println("sum is:"+sum);
        

        int i=0;
        while(i<10){
            System.out.println(i);
            i++;
        }

        int i=0,n=10;
        do{
            System.out.println(i);
            i++;
        }
        while(i<=n);
        */
        s.close();
        
    }
}
