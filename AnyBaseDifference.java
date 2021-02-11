import java.util.*;
public class AnyBaseDifference
{
 public static void main(String[]args){
     Scanner s=new Scanner(System.in);
     int b=s.nextInt();
     int n1=s.nextInt();
     int n2=s.nextInt();
     int d=getdiffernce(b,n1,n2);
     System.out.println(d);
 }
 public static int getdiffernce(int b,int n1,int n2){
     int rv=0;
     int power=1;
     int carry=0;
     while(n2>0){
         int d1=n1%10;
         n1=n1/10;
         int d2=n2%10;
         n2=n2/10;
         int d=0;
         d2=d2+carry;
         if(d2>=d1){
             carry=0;
             d=d2-d1;
         }
         else{
             carry=-1;
             d=d2+b-d1;
         }
         rv+=d*power;
         power=power*10;
     }
     return rv;
 }
}
