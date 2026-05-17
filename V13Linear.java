//search in the array:return the index if item found else return -1


public class V13Linear {
    public static void main(String[] args){
        int[] num = {2,3,4,5,1,2,8,19,-3,16,-11,28};

        int target =19;
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