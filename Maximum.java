public  class Maximum{


    int n=5;
    int[] arr={10,20,30,40,50};
    int max=arr[0];

    void function()
    {
        for (int i = 0; i < arr.length;i++){
            
        
        if(arr[i]>max)
        {
         max=arr[i];
        }
      
   
    }
    System.out.println("max elements are :" +max);
     

}
public static void main(String args[])
{
  Maximum m=new Maximum();
  m.function();

    

}
}