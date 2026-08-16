class SumDemo
{
    int n=5;
    int[] arr={10,20,30,40,50};
    int sum=0; //declare the sum as 0
    void method()
    {
         for(int i =0;i<n;i++)
         {
           sum=sum + arr[i];  //assign the sum of elements 10 20 30 40 50
         }
         System.out.println("sum of the elemnt" +sum);
    }
    public static void main(String args[]) //main method
    {
        SumDemo r=new SumDemo();  //new keyword used to allocate new memory
        r.method(); //call to method
    }
}