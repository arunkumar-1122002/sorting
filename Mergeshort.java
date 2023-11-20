public class Mergeshort {
    public static void main(String[] args) {
       
        int[] arr={1,3,7,9,6,4,7,99,101,155,1661,11,2,32,1,0,99};
        arr=mergesort(arr,0,arr.length-1);
    for(int i:arr)
            System.out.println(i);
    }
    static int[] mergesort(int[] arr,int first,int last)
    {
    if(first==last)
    {
    return new int[]{arr[first]};
    }
        int m=(last+first)/2;
        int[] left=mergesort(arr,first,m);
        int[] right=mergesort(arr,m+1,last);
        return merge(left,right);
    }
    static int[] merge(int[] left,int[] right)
    {
        int i=0,j=0,k=0;
        int mix[]=new int[left.length+right.length];
        while(i<left.length && j<right.length)
        {
            if(left[i]<right[j])
            {
                mix[k]=left[i];
                i++;
            }
            else
            {
                mix[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length)
        {
            mix[k]=left[i];
            i++;k++;
        }
        while(j<right.length)
        {
            mix[k]=right[j];
            j++;k++;
        }
        return mix;
    }
    
}
