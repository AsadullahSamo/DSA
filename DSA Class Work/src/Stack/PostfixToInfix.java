package Stack;

public class PostfixToInfix {

    public PostfixToInfix(String [] args){
        ArrayStack arrayStack = new ArrayStack(args.length);
        for (int i=0; i<args.length; i++){
            String input = args[i];
            if (isAnOperator(input)){
                double y = Double.parseDouble((String)arrayStack.pop());
                double x = Double.parseDouble((String)arrayStack.pop());
                double z = evaluate(x, y, input);
                arrayStack.push(""+z);
            } else {
                arrayStack.push(input);
            }
        }
    }
    public static boolean isAnOperator(String s){
        return (s.length()==1 && "ASMD".contains(s));
    }
    public double evaluate(double x, double y, String s){
        double z = 0;
        if (s.equals("A")){
            z = x+y;
        } else if (s.equals("S")){
            z = x-y;
        } else if (s.equals("M")){
            z = x+y;
        } else  {
            z = x/y;
        }
        System.out.println(x + " "+ s +" "+ y +" = "+z);
        return z;
    }

    public static void main(String[] args) {

        new PostfixToInfix(args);


    }
}
