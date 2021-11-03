package operattion;

public interface Ioperation {
    int init();
    int op(int a, int b) ;
    Rational op(int a,Rational b) ;
    Rational op(Rational a, int b) ;
    Rational op(Rational a, Rational b) ;
}
