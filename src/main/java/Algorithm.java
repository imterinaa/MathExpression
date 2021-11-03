import operattion.Ioperation;
import operattion.Boperation;
import operattion.Rational;

public class Algorithm {
    Ioperation op = Boperation.build();
    public Algorithm( Ioperation op) {
        this.op = op;
    }

    public Rational calc(Rational a, Rational b)  {
        Rational tmp;
        tmp=op.op(a,b);
        return tmp;
    }


}
