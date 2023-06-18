// class Even extends Thread{
//     public void run()
//     {
//     try{
//         for(int i=0;i<=10;i+=2)
//         {
//             System.out.println(getName()+i);
//         }
//     }
//     catch(Exception e){
//         System.out.println("");
//     }
//     }
// }
// class Odd extends Thread{
//     public void run()
//     {
//     try{
//         for(int i=1;i<=10;i+=2)
//         {
//             System.out.println(getName()+i);
//             Thread.yield();;
//         }
//     }
//     catch(Exception e){
//         System.out.println("");
//     }
//     }
// } 
// public class Threads {
//     public static void main(String[] args) {
//         Even obj=new Even();
//         Odd obj1=new Odd();
//         Even obj2=new Even();
        
//         obj.setName("Even :");
//         obj1.setName("Odd :");
//         obj2.setName("1121 :");

//         obj.start();
//         obj1.start();
//         obj2.start();

//         System.out.println("1121 Priyanshu");

//     }
// }

// class Even extends Thread
// {
//     public void run()
//     {
//         for(int i=0;i<=10;i+=2)
//         {
//             System.out.println(getName()+i);
//         }
//     }
// }
// class Odd extends Thread
// {
//     public void run()
//     {
//         for(int i=1;i<=10;i+=2)
//         {
//             System.out.println(getName()+i);
//         } 
//     }
// }
// class Threads
// {
//     public static void main(String args[])
//         {
//             Even obj=new Even();
//             Odd obj1=new Odd();
//             Even obj2=new Even();

//             obj.setName("Priyanshu Tiwari :");
//             obj1.setName("1121 :");
//             obj2.setName("Even :");

//             obj1.setPriority(7);
//             obj2.setPriority(3);

//             obj.start();
//             obj1.start();
//             obj2.start();

//             System.out.println("1121 Priyanshu");
//         }
// }

// class hi extends Thread
// {
//     public void run()
//     {
//         for(int i=0;i<=5;i++)
//         {
//             System.out.println(getName()+"hii");
            
//         }
//     }
// }
// class hello extends Thread
// {
//     public void run()
//     {
//         for(int i=0;i<=5;i++)
//         {
//             System.out.println(getName()+"hello");
            
//         }
//     }
// }
// public class Threads
// {
//     public static void main(String[] args) {
//         hi ob=new hi();
//         hello ob1=new hello();
//         hi ob2=new hi();
//         ob.setName("Hii: ");
//         ob1.setName("Hello: ");
//         ob2.setName("1121: ");
//         ob.start();
//         ob1.start();
//         ob2.start();

//         ob2.suspend();
//         System.out.println(ob2.getName()+"suspended");
//         ob2.resume();
//         System.out.println(ob2.getName()+"Resume");
//     }
// }

class msg
{
    int a;
    msg()
    {
        a=0;
    }
synchronized void show()
{
    ++a;
    try{
        Thread.sleep(10);
    }
    catch(Exception e)
    {}
    System.out.println(a);
}
}
class first extends Thread
{
    msg kk;
    first(msg t)
    {
        kk=t;
    }
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            kk.show();
        }
    }
}
class second extends Thread
{
    msg kk;
    second(msg t)
    {
        kk=t;
    }
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            kk.show();
        }
    }
}
public class Threads
{
    public static void main(String[] args) {
        msg k= new msg();
        first ob=new first(k);
        second ob1=new second(k);

        ob.start();
        ob1.start();
    }
}