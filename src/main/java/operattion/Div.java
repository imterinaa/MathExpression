package operattion;

public class Div implements Ioperation {
    @Override
    public int init() {
        return 1;
    }

    @Override
    public int op(int a, int b)  {
        if (b==0){
            throw new RuntimeException("Деление на 0");
        }
        System.out.println(a+":"+b+" ="+ ((a/b)));

        return a/b;
    }

    @Override
    public Rational op(int a, Rational b) {
        Rational _a,_b;
        _a= new Rational(a,1);
        System.out.println(a+":"+b+" ="+ (_a.division(b)));
        return _a.division(b);
    }

    @Override
    public Rational op(Rational a, int b) {
        Rational _b;
        _b=new Rational(b,1);
        System.out.println(a+":"+b+" ="+ (a.division(_b)));
        return a.division(_b);
    }

    @Override
    public Rational op(Rational a, Rational b)  {
        System.out.println(a+":"+b+" ="+ ((a.division(b))));
        return a.division(b);
    }


}
