package exceptions;

public class NestedDemo {
    public static void main(String args[]){
        //main try-block
        try{
            //try-block2
            try{
                //try-block3
                try{
               // Code change starts
                    int arr[]= {0,1,2,3,4};
  
                    System.out.println(arr[1] / arr[0]);
               //  Code change ends 
                    
                }catch(ArithmeticException e1){
                    System.out.print("Arithmetic Exception");
                    System.out.println(" handled in try-block3");
                }
            }           catch(ArithmeticException e2){
                System.out.print("Arithmetic Exception");
                System.out.println(" handled in try-block2");
            }
        }
        catch(ArithmeticException e3){
            System.out.print("Arithmetic Exception");
            System.out.println(" handled in main try-block");
        }
        catch(ArrayIndexOutOfBoundsException e4){
            System.out.print("ArrayIndexOutOfBoundsException");
            System.out.println(" handled in main try-block");
        }
        catch(Exception e5){
            System.out.print("Exception");
            System.out.println(" handled in main try-block");
        }
    }
 }
