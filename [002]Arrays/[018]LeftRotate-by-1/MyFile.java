public class MyFile
{
    static void lrotate(int[] arr)
    {
        int temp = arr[0];
        for(int i=1; i<arr.length; i++)
        {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }
    public static void main(String[] args) 
    {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("Original Array:");
        for(int x : arr)
        {System.out.print(x + " ");}
        System.out.println();
        lrotate(arr);
        System.out.println("After Rotation");
        for(int x : arr)
        {System.out.print(x + " ");}
        System.out.println();    
    }
}