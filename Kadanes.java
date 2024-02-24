import java.util.*;
import java.lang.Math;
public class Kadanes 
{
    public static void Kadaness(int a[])
    {
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0; i<a.length; i++)
        {
            cs=cs+a[i];
            if(cs<0)
            {
                cs=0;
            }
            ms= Math.max(cs,ms);
        }
        System.out.println("Maximum subarray sum:" + ms);
    }
    public static void main(String args[])
   {
    int a[]= {-2,-3,4,-1,-2,1,5,-3};
    Kadaness(a);
   }
}


