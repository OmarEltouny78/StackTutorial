public class Main {
    public static void main(String[] args) {
        String exp1 = " )(( )){([( )])}";
        String exp2 = "()";
        String expr = "{";
         isMatched(exp2);
    }

    public static boolean isMatched(String expression) {
    final String opening = "({[";
    final String closing = ")}]";
    Stack<Character> buffer=new ArrayStack<>(1000);
    for (char c:expression.toCharArray()
         ) {
        if(opening.indexOf(c)!=-1){
            buffer.push(c);
        }
        else if(closing.indexOf(c)!=-1){
            if(buffer.isEmpty()){
                return false;
            }
            if (closing.indexOf(c)!=opening.indexOf(buffer.pop())){
                return false;
            }
        }
    }
    return buffer.isEmpty( );


    }
}
