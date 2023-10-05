public class Ascending {

    public static void main(String[] args) {
        int[]a={27,14,23,18};
               for(int i =0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                int t;
                
                if(a[i]>a[j]){
                 t=a[i];
                a[i]=a[j];
                a[j]=t;
            }               
            }
        }
               String out="[";
               for(int val:a)
               out+=val+",";
            
               out+="]";
               System.out.println(out);
                   }
    
}


