import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        // Array, which is used to store the similar datatype such int,string,char,etc.
        // It is use to store the location of an element in contgious memory.
        // Accessing the element is easy in array.,,,,,,,,,,,,,,,,,,,,,,,

        // Methods Of Unstalliazation of array.
/* 
        //1.Declare and then intialize.
        int Marks[];
        int m;
        Marks=new int[5];
        Marks[0]=66;
        Marks[1]=68;
        Marks[2]=78;
        Marks[3]=99;
        Marks[4]=100;
        System.out.println("Length of Array:"+Marks.length);
        for(m=0;m<Marks.length;m++)
        {
            System.out.println("Elements Of Array:"+Marks[m]);
        }
System.out.println("*******//******");

        // 2.Decleration of array and then Intialiazation in one line.
        int marks[]=new int[5];
        int i;
        System.out.println("Length of Second Array is:"+ marks.length);
        marks[0] = 11;
        marks[1] = 99;
        marks[2] = 77;
        marks[3] = 88;
        marks[4] = 66;
        System.out.println("Element at 3rd location: "+marks[3]);
        for(i=0;i<marks.length;i++)
        { 
            System.out.println("Elemnts of array:"+marks[i]);
        }
System.out.println("*******//*******");

        //3.Declaration ,instatiation and initialization of Array 
        int a[] = {77,88,66,99,33,93,22};
        System.out.println("Length of Third Array is: "+ a.length);
        
        for(int j=0;j<a.length;j++)
        {
            System.out.println("Elements of array:"+a[j]);
        }
        System.out.println("Element at Location 4:"+a[4]);

System.out.println("********//*******");

        //4.Printing the Array in the reverse order.
        int b[]={77,79,66,86,94,78};
        System.out.println("Printing the 4th array in Reverse Order(For loop).");
        for(int c=b.length-1;c>=0;c--)
        {
            System.out.println("Elements of 4th array:"+b[c]);
        }

System.out.println("******//*******");

        //5.Printing The Array Using The For-each Loop.
        String Name[]={"Apple","Samsung","Vivo","Oppo","Xiaomi"};
        System.out.println("Printing the Array using the For-each loop:");
        for( String elements:Name)
        {
            System.out.println("Elements of array: "+elements);
        }
        System.out.println("Length of 5th Array:"+ Name.length);

System.out.println("*****//*******");

        //6.Two dimensional Array.
        int num[][]=new int[2][2];
        num[0][0]=8;
        num[0][1]=3;
        num[1][0]=4;
        num[1][1]=5;
        System.out.println("Printing the two dimensional Array:");
        for(int e=0;e<2;e++) 
        {
            for(int f=0;f<2;f++){
                System.out.print(num[e][f]);
                System.out.print(" ");
            }
            System.out.println("");
        }

System.out.println("*********//********");
        //7.Largest and Smallest Array element.
        int numbers[]=new int[]{1,2,3,5,68,99,34};
        int smallest=numbers[0];
        int Largest=numbers[0];

        for(int n=1;n<numbers.length;n++)
        {
            if(numbers[n]>Largest)
            {
                Largest=numbers[n];
            }
            else if(numbers[n]<smallest)
            {
                smallest=numbers[n];
            }
        }
        System.out.println("Largest number is:"+Largest);
        System.out.println("Smallest numbers is:"+smallest);

System.out.println(("*******//********"));
        //8.Sum of Array elements.
        int number[]=new int[]{1,33,244,24,56,78,76};
        int sum=0;
        for(int p=0;p<number.length;p++)
        {
            sum=sum+number[p];
        }
        System.out.println("Sum Of Array element is:"+sum);

System.out.println("*******//*******");
*/
Scanner Sc=new Scanner(System.in);
        //9.Addition of two 2d array.
        int p,q,m,n;
        System.out.println("Enter row of First Matrix:");
        p=Sc.nextInt();
        System.out.println("Enter column of First Matrix:");
        q=Sc.nextInt();
        System.out.println("Enter row of Second Matrix:");
        m=Sc.nextInt();
        System.out.println("Enter Column of second Matrix:");
        n=Sc.nextInt();
        //checking the Addition is possible or not.
        if(p==m&&q==n){

        int A[][]=new int[p][q];
        int B[][]=new int[m][n];
        int C[][]=new int[m][n];

        //Taking input of elements for First matrix.
        System.out.println("Enter all Element of First Matrix:");
        for(int i=0;i<p;i++)
        {
            for(int j=0;j<q;j++)
            {
                A[i][j]=Sc.nextInt();
            }
            
        }

        //Taking input of elements for Second matrix.
        System.out.println("Enter all Element of Second Matrix:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                B[i][j]=Sc.nextInt();           
            }
        }
        //printing the First Matrix.
        System.out.println("First Matrix:");
        for(int i=0;i<p;i++)
        {
            for(int j=0;j<q;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }

        //printing the second matrix.
        System.out.println("Second Matrix:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(B[i][j]+" ");
            }
            System.out.println("");
        }

        for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    for (int k = 0; k < q; k++) 
                    {
                        C[i][j]=A[i][j]+B[i][j];
                    }
                }
            }

        //Addition of Two Matrix.
        System.out.println("Sum of two Matrix:");
        for(int i=0;i<p;i++)
        {    
            for(int j=0;j<n;j++)
            {
                System.out.print(C[i][j]+" ");
            }
            System.out.println("");
        }
    }
    else
    {
        System.out.println("Addition would not be possible.");
        System.out.println("Try again.");
    }
        Sc.close();
    }
}
