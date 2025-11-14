public class operators {
    void opfun(int a,int b,int c){
        //arithmetic operators (+,-,*,/,%)
        System.out.println("the addition is:"+(a+b)+"\nthe subtraction is:"+(a-b)+"\nthe multiplication is:"+(a*b)+"\nthe division is:"+(a/b)+"\nthe modulo division is:"+(a%b));
        //unary operator (++a,a++,--a,a--)
        System.out.println("\nthe pre increment is:"+(++c));
        System.out.println("\nthe post increment is:"+(c++));
        System.out.println("\nthe pre decrement is:"+(--c));
        System.out.println("\nthe post decrement is:"+(c--));
        //Bitwise operators (&,|,^)
        System.out.println("\nthe AND operation of a b is:"+(a&b));
        System.out.println("\nthe OR operation of a b is:"+(a|b));
        System.out.println("\nthe XOR operation of a b is:"+(a^b));
        //assignment operators(=,+=,-=,*=,/=,etc.)
        int p=0;
        while(p<=10){
            p+=1;
        }
        System.out.println("\nvalue of p after assignment loop:"+p);
        //Relational operators (==,!=,>,<,>=,<=) 
        int q=20,r=23,s=21;
        if((q>=r)&&(q>=s)){//logical operator (&&,||,!)
            System.out.println("\nmax number is:"+q);
        }
        else if((r>=q)&&(r>=s)){
            System.out.println("\nmax number is:"+r);
        }
        else{
            System.out.println("\nmax number is:"+s);
        }
        //ternary operator (:?)
        boolean ternaryres= (a>=b) ? true:false;
        System.out.println("\nthe ternary result is:"+ternaryres);
    } 
    public static void main(String[] args) {
        operators objs=new operators();
        objs.opfun(2,4,7);
    }
    
}
