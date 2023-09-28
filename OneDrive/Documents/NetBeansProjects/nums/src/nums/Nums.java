package nums;


public class Nums {

    
    public static void main(String[] args) {
        int []c ={1,2,3,4,5,6,7,8,9};
String odd="[";
String even="[";
for(int val: c)
{
    if(val%2==0)
    {
        even+=String.valueOf(val)+" ";
    }
    else{
       odd+=String.valueOf(val)+" ";
    }
}
odd +="]";
even+="]";
        System.out.println("odd:"+odd);
        System.out.println("even:"+even);
    }
}
            
    

