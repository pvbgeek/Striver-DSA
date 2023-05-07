public class MyFile
{
    static void rrotate(int[] arr)
    {
        int temp = arr[arr.length-1];
        for(int i=arr.length-2 ; i>=0; i--)
        {
            arr[i+1] = arr[i];
        }
        arr[0]=temp;
    }
    public static void main(String[] args) 
    {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("Original Array");
        for(int x : arr)
        {System.out.print(x + " ");}
        System.out.println();
        rrotate(arr);
        System.out.println("After Rotation");
        for(int x : arr)
        {System.out.print(x + " ");}
        System.out.println();    
    }
}