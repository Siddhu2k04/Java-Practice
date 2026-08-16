public class Minimum {
    
    int n=5;
    int[] arr={10,20,30,40,50};
    int min=arr[0]; //declare the min as 0
    
    void method()
    {
         for(int i =0;i<n;i++)
         {
           if(arr[i]<min) //if the element is less than the min then assign the value to min
           {
               min=arr[i];
           }
         }
         System.out.println("minimum of the elemnt" +min);
    }
    public static void main(String args[]) //main method
    {
        Minimum f=new Minimum();

        f.method(); //call to method
    }
}
