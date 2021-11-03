import operattion.Ioperation;
import operattion.Boperation;
import operattion.Rational;
import operattion.TypeOperation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Ioperation op = Boperation.build();
        Algorithm alg_mult = new Algorithm(Boperation.build(TypeOperation.mult));
        Algorithm alg_sum = new Algorithm(Boperation.build(TypeOperation.sum));
        Algorithm alg_div = new Algorithm(Boperation.build(TypeOperation.div));

        System.out.println("Результат вычисления  "+alg_mult.calc(alg_div.calc(new Rational(8,1)
                ,new Rational(3,1)), alg_mult.calc(new Rational(9,1),new Rational(4,1))));

        //String expressionText = "22 + 3 - 2 * (2 * 5 + 2) * 4";
        //List<Lexeme> lexemes = lexAnalyze(expressionText);
        //LexemeBuffer lexemeBuffer = new LexemeBuffer(lexemes);
        //System.out.println(expr(lexemeBuffer));
    }

  /*  public enum LexemeType {
        Left_br, Right_br, Op_plus, Op_Mul,Op_minus, Op_Div, Number, EOF;
    }

    public static class Lexeme {
        LexemeType type;
        String value;

        public Lexeme(LexemeType type, String value) {
            this.type = type;
            this.value = value;
        }

        public Lexeme(LexemeType type, Character value) {
            this.type = type;
            this.value = value.toString();
        }

        public String toString() {
            return "Lexeme{" +
                    "type" + type +
                    ",value='" + value + '\'' + '}';
        }
    }
    public static class LexemeBuffer{
        private int pos;
        public List<Lexeme> lexemes;
        public  LexemeBuffer(List<Lexeme> lexemes){
            this.lexemes = lexemes;
        }
        public Lexeme next(){
            return lexemes.get(pos++);
        }
        public void back(){
           pos--;
        }
        public int getPos(){
            return pos;
        }
    }
        public  static List<Lexeme> lexAnalyze(String expText) {
            ArrayList<Lexeme> lexemes = new ArrayList<>();
            int pos = 0;
            while (pos < expText.length()) {
                char c = expText.charAt(pos);
                switch (c) {
                    case '(':
                        lexemes.add(new Lexeme(LexemeType.Left_br, c));
                        pos++;
                        continue;
                    case ')':
                        lexemes.add(new Lexeme(LexemeType.Right_br, c));
                        pos++;
                        continue;
                    case '+':
                        lexemes.add(new Lexeme(LexemeType.Op_plus, c));
                        pos++;
                        continue;
                    case '*':
                        lexemes.add(new Lexeme(LexemeType.Op_Mul, c));
                        pos++;
                        continue;
                    case '/':
                        lexemes.add(new Lexeme(LexemeType.Op_Div, c));
                        pos++;
                        continue;
                    case '-':
                        lexemes.add(new Lexeme(LexemeType.Op_minus, c));
                        pos++;
                        continue;

                    default:
                        if (c <= '9' && c >= '0') {
                            StringBuilder sb = new StringBuilder();
                            do {
                                sb.append(c);
                                pos++;
                                if (pos >= expText.length()) {
                                    break;
                                }
                                c = expText.charAt(pos);
                            } while (c <= '9' && c >= '0');
                            lexemes.add(new Lexeme(LexemeType.Number, sb.toString()));
                        } else {
                            if (c != ' ') {
                                throw new RuntimeException("Проблема " + c);
                            }
                            pos++;
                        }
                }
            }
            lexemes.add(new Lexeme(LexemeType.EOF, " "));
            return lexemes;

        }
    public static int expr(LexemeBuffer lexemes){
        Lexeme lexeme=lexemes.next();
        if(lexeme.type==LexemeType.EOF){
            return 0;
        }
        else {
            lexemes.back();
            return plusminus(lexemes);
        }

    }
    public static int plusminus(LexemeBuffer lexemes){
        int value = multdiv(lexemes);

        while(true){

            Lexeme lexeme = lexemes.next();
            switch (lexeme.type){
                case Op_plus:
                    value += multdiv(lexemes);
                    break;
                case Op_minus:
                    value -= multdiv(lexemes);
                    break;
                default:
                    lexemes.back();
                    return value;
            }
        }
    }
    public static int multdiv(LexemeBuffer lexemes){
        int value = factor(lexemes);

        while(true){

            Lexeme lexeme = lexemes.next();
            switch (lexeme.type){
                case Op_Mul:
                    value *= factor(lexemes);
                    break;
                case Op_Div:
                    value /= factor(lexemes);
                    break;
                default:
                    lexemes.back();
                    return value;
            }
        }

    }
        public static int factor(LexemeBuffer lexemes){
        Lexeme lexeme = lexemes.next();

        switch (lexeme.type){
            case Number:
                return Integer.parseInt(lexeme.value);

            case Left_br:
                int value = expr(lexemes);
                lexeme = lexemes.next();
                if(lexeme.type != LexemeType.Right_br){
                    throw new RuntimeException("нет правой скобки"+lexeme.value);

                }

                return value;
            default:
                throw new RuntimeException("Пролемы с синтаксисом");
        }

        }

*/
    }
