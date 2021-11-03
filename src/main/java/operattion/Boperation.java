package operattion;

public class Boperation {

    static public Ioperation build(TypeOperation type)
    {
        if(type==TypeOperation.sum)

            return new Sum();
        if(type==TypeOperation.mult)

            return new Mult();
        if(type==TypeOperation.div)

            return new Div();
        return null;
    }
    static public Ioperation build(){
        return new Sum();
    }
}
