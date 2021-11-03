package operattion;

public class Mult implements Ioperation {


    @Override
    public int init() {
        return 1;
    }

    @Override
    public int op(int a, int b) {
        Rational _a,_b;
        _a= new Rational(a,1);
        _b=new Rational(b,1);
        System.out.println(a+"*"+b+" ="+ (a*b));
       return a*b;
    }

    @Override
    public Rational op(int a, Rational b) {
        Rational c;
        c = new Rational(a,1);
        System.out.println(a+"*"+b+" ="+ (c.Mult(b)));
        return c.Mult(b);
    }

    @Override
    public Rational op(Rational a, int b) {
        Rational _b;
        _b = new Rational( b,1);
        System.out.println(a+"*"+b+" ="+ (a.Mult(_b)));
        return a.Mult(_b);
    }

    @Override
    public Rational op(Rational a, Rational b) {
        System.out.println(a+"*"+b+" ="+ (a.Mult(b)));
        return a.Mult(b);
    }
}
