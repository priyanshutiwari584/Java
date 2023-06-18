import java.util.Scanner;
public class Array2
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        /* 
        int p, q, m, n;
        System.out.print("Enter number of rows in first matrix:");
        p = s.nextInt();
        System.out.print("Enter number of columns in first matrix:");
        q = s.nextInt();
        System.out.print("Enter number of rows in second matrix:");
        m = s.nextInt();
        System.out.print("Enter number of columns in second matrix:");
        n = s.nextInt();
        if (p == m && q == n) 
        {
            int a[][] = new int[p][q];
            int b[][] = new int[m][n];
            int c[][] = new int[m][n];
            System.out.println("Enter all the elements of first matrix:");
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < q; j++) 
                {
                    a[i][j] = s.nextInt();
                }
            }
            System.out.println("Enter all the elements of second matrix:");
            for (int i = 0; i < m; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    b[i][j] = s.nextInt();
                }
            }
            System.out.println("First Matrix:");
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < q; j++) 
                {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println("");
            }
            System.out.println("Second Matrix:");
            for (int i = 0; i < m; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    System.out.print(b[i][j]+" ");
                }
                System.out.println("");
            }
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    for (int k = 0; k < q; k++) 
                    {
                        c[i][j] = a[i][j] + b[i][j];
                    }
                }
            }
            System.out.println("Matrix after addition:");
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println("");
            }
        }
        else
        {
            System.out.println("Addition would not be possible");
        }

        //Multiple of 2X2 2d array by taking user input.
        int A[][]=new int[2][3];
        int B[][]=new int[2][3];
        int mul[][]=new int [2][3];

        System.out.println("Enter all elements of first Array:");
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A.length;j++)
            {
                A[i][j]=s.nextInt();
            }
        }

        System.out.println("Enter all elements of Second Array:");
        for(int i=0;i<B.length;i++)
        {
            for(int j=0;j<B.length;j++)
            {
                B[i][j]=s.nextInt();
            }
        }

        System.out.println("First matrix:");
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A.length;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("Second Matrix:");
        for(int i=0;i<B.length;i++)
        {
            for(int j=0;j<B.length;j++)
            {
                System.out.print(B[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("Matrix After Multiplication:");
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<B.length;j++)
            {
                mul[i][j]=0;
                for(int k=0;k<3;k++)
                {
                    mul[i][j]+=A[i][k]*B[k][j];
                }
                System.out.print(mul[i][j]+" ");
            }
            System.out.println("");
        }
*/
        //Multiple of 2X2 2d array by taking user input.
        int p,q,m,n;
        System.out.println("Enter the row of first Array:");
        p=s.nextInt();
        System.out.println("Enter the column of First Array:");
        q=s.nextInt();
        System.out.println("Enter the row of Second Array:");
        m=s.nextInt();
        System.out.println("Enter the Column of Second Array:");
        n=s.nextInt();

        int A[][]=new int[p][q];
        int B[][]=new int[m][n];
        int mul[][]=new int [p][n];

        System.out.println("Enter all elements of first Array:");
        for(int i=0;i<p;i++)
        {
            for(int j=0;j<q;j++)
            {
                A[i][j]=s.nextInt();
            }
        }

        System.out.println("Enter all elements of Second Array:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                B[i][j]=s.nextInt();
            }
        }

        System.out.println("First matrix:");
        for(int i=0;i<p;i++)
        {
            for(int j=0;j<q;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("Second Matrix:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(B[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("Matrix After Multiplication:");
        for(int i=0;i<p;i++)
        {
            for(int j=0;j<n;j++)
            {
                mul[i][j]=0;
                for(int k=0;k<2;k++)
                {
                    mul[i][j]=A[i][k]*B[j][k];
                }
                System.out.print(mul[i][j]+" ");
            }
            System.out.println("");
        }


        s.close();
    }
}