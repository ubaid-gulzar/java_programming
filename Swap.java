public class Swap {
    public static void main(String[] args){
        //swap with the help of third variable
        int a =6;
        int b = 8;
        System.out.println("The value of a and b before swaping are:"+ a +" and "+b);
        int c = a;
        a = b;
        b = c;
        System.out.println("The value of a and b after swaping are:"+ a +" and "+b);

        //swap without third variable
        int d = 3;
        int e = 4;
        System.out.println("The value of d and e before swaping are:"+ d +" and "+ e);
        d = d + e;
        e = d - e;
        d = d - e;
        System.out.println("The value of d and e before swaping are:"+ d +" and "+ e);
    }
}
