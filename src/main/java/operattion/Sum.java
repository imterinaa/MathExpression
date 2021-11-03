package operattion;

 class Sum implements Ioperation{

     @Override
     public int init() {
         return 0;
     }

     @Override
     public int op(int a, int b) {
         System.out.println(a+"+"+b+" ="+ (a+b));
         return a+b;
     }


     /*public int op(int a, int b) {
         System.out.println(a+"+"+b+" ="+ (a+b));
         return a+b;
     }*/

     @Override
     public Rational op(int a, Rational b) {
         Rational _a;
         _a = new Rational(a,1);
         System.out.println(a+"+"+b+" ="+ (_a.plus(b)));
         return _a.plus(b);
     }

     @Override
     public Rational op(Rational a, int b) {
         Rational _b;
         _b = new Rational(b,1);
         System.out.println(a+"+"+b+" ="+ (a.plus(_b)));
         return a.plus(_b);
     }

     @Override
     public Rational op(Rational a, Rational b) {
         return a.plus(b);
     }
 }
