import java.util.*;
public class Report
{
        public static void main(String args[])
       {
        int id,Physics,Chemistry,English,Maths,total;
     float per;
     String name;
     Scanner in=new Scanner(System.in);
     System.out.print("Enter student id :");
     id=in.nextInt();

    Scanner ob=new Scanner(System.in);
   System.out.print("Enter student name :");
   name=ob.next();

   System.out.print("\nEnter each subject marks out of 100");

   Scanner od=new Scanner(System.in);
   System.out.print("\nEnter marks for Physics:");
  Physics=od.nextInt();

   System.out.print("\nEnter marks for Chemistry:");
   Chemistry=od.nextInt();

    System.out.print("\nEnter marks for English:");
   English=od.nextInt();

    System.out.print("\nEnter marks for Maths:");
  Maths=od.nextInt();

  total=Physics+Chemistry+English+Maths;
  System.out.println("\nTotal is :"+total);

   per=total/4;
  System.out.println("\nPercentage is :"+per);
 if(per>=80)
{
         System.out.println("A+ Grade");
}
else if(per>=75)
{
        System.out.println("A Grade");
}
else if(per>=60)
{
      System.out.println("B Grade");
}
else if(per>=45)
{
      System.out.println("C Grade");
}
else if(per>=35)
{
       System.out.println("D Grade");
}
else
{
     System.out.println("Fail");
}
}
}

