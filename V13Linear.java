//search in the array:return the index if item found else return -1

import java.util.*;
public class V13Linear {




    void main(String[] args){
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
        
        int ans=linearsearch2(num,target);//function call(1,2,3).
        System.out.println("Index of the target element " + target + " is: " + ans);
    }



// function-3
       static int linearsearch3(int[]arr,int target){
        if(arr.length==0){
            return false;
        }
        for(int elements:arr){
            if(elements==target){
                return true;
            }
        }
        return false;
    }
//function-2
    static int linearsearch2(int[]arr,int target){
        if(arr.length==0){
            return Integer.MAX_VALUE;
        }
        for(int elements:arr){
            if(elements==target){
                return elements;
            }
        }
        return Integer.MAX_VALUE;
    }
// function-1
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