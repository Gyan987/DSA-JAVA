//search in the array:return the index if item found else return -1

import java.util.*;
public class V13Linear {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] num;
        System.out.print("Enter the size of the array :");
        int size =sc.nextInt();
        num=new int[size];
        System.out.println("Enter the array ELements :");
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }

        int target;
        System.out.print("Enter the target element :");
        target=sc.nextInt();
        int ans=linearsearch(num,target);//function call .
        System.out.println("Index of the target element " + target + " is: " + ans);
    }

    static int linearsearch(int[]arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            int elements = arr[i];
            if(elements==target){
                return i;
            }
        }
        return -1;
    }
}