package loops;
public class Loops {

        public static void main(String[] args) {
                int[] array = {6,7,6,37,23,5,4};
        int max = array[0]; 
        int min = array[0]; 

        for (int i = 1; i < array.length; i++)
        {
            if (array[i] > max) {
                max = array[i]; 
            }

            if (array[i] < min) {
                min = array[i]; 
            }
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}


        
    
}
