
import java.util.*;
public class BinarySearch {
    static int binarySearch(int arr[],int l, int r,int target){
        while(l<=r)
        {
            int mid = (l+r)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid] < target)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }
    public static void main(String []str)
    {
        int arr[] = {11,22,33,44,55,66,77,88,99};
        int l = 0,r = arr.length - 1;
        Scanner sc = new Scanner(System.in);
        System.err.print("Target: ");
        int target = sc.nextInt();
        int bs = binarySearch(arr,l,r,target);
        System.out.println("index: "+bs);
        sc.close();
    }
}
