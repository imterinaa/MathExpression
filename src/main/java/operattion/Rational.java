package operattion;

public class Rational {
    private int num = 1;   //числитель
    private int den = 1;//знаменатель


    public Rational(int _num, int _den) {
        if (_den == 0) {
            System.out.println("Ошибка знаменатель =" + _den);
            return;
        }
        int nod = NOD(_num, _den);
        num = _num / nod;
        den = _den / nod;

    }


    public Rational Mult(Rational c) {
        Rational multiplication = new Rational(this.num * c.num, this.den * c.den);
        return multiplication;
    }


    //     x/a+f/b=(xb+fa)/ab
    public Rational plus(Rational c) {
        Rational sum = new Rational((this.num * c.den) + (this.den * c.num), this.den * c.den);
        return sum;
    }

    public Rational division(Rational c) {
        Rational div = new Rational(this.num * c.den, this.den * c.num);
        return div;
    }

    //НОД
    private static int NOD(int m, int n) {
        while (m != 0 && n != 0) {
            if (m > n)
                m = m % n;
            else
                n = n % m;
        }
        return (m + n);
    }

    public String toString() {
        if (den == 1) return num + "";
        else return num + "/" + den;

    }


}