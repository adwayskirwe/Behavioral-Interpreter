
public class TerminalExpression implements Expression {
    String data;
    TerminalExpression(String data){
        this.data=data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
