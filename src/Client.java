
public class Client {
    public static void main(String[]args){
        Expression isMale=getMaleExpression();
        Expression isMarried=getMarriedExpression();
        System.out.println("John is a male: "+isMale.interpret("John"));
        System.out.println("Julie is a married: "+isMarried.interpret("Julie Marrie"));
    }


    public static Expression getMaleExpression() {
        Expression john = new TerminalExpression("John");
        Expression robert = new TerminalExpression("Robert");
        return new OrExpression(john, robert);
    }

    public static Expression getMarriedExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie,married);
    }

}
