public class App {
    public static void main(String[] args) throws Exception {
        //Data types
        int x = 5;
        char c = 'c'; //initatilization
        double d = 5.5;
        boolean b = false;
        int w ; //declarion
        w =66;
        int infractedStudents;//camelCasing
        final int CONNY =5; //constants are all caps
        w-=3 ; 
        System.out.println(w);

        //comparisions
        boolean boo = false;
        System.out.println(!boo !=false);

        //conditonal
        if(!boo) System.out.println("boo passed");
        // == is a boolean = is and assignment

        // SHORTCIRCUT
        int divisor = 0;
       // if( !=0 && 5/divisor >1 || 0) System.out.println("omg");
        
        //ARRAYS
        int n, m, u,i = 0; // mulitm delclaration
        n=0;
        m=0;
        u=0;

        int [] arr = {n,m,u,i}; //copies, not l;inks to the values
        n=5;
        System.out.println(arr[0]);// previously copied value
        System.out.println(n);//updated value
        arr[0]=5;// Id have to do that to change the arrays value
        System.out.println ("Th3e array is "+ arr.length + " idems long");//because of quotes it doesnt do math

        //FUNCTIONS / METHODS
        //otballPlayer jim = new FootballPlayer();
        //m.block // example of a method, a cuntion inside the player class
        // method goes inside of a class - every function is technically a method

        System.out.println(addYaBoi("I do my homework"));

    }//closes main method
    public static String addYaBoi(String str){

                // public =acess level
        //static = objecr or file
        //String = what does it return
        // str = params (ingredients)
        // addYaBo name of this " magic spell" = function
        return str +"ya boi";
    }




        
    
}//closes the app class
