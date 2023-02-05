package Stack.LinkedStacks;
import Stack.ArrayStacks.ArrayStack;

public class Implementation {

    public static void main(String[] args) {

        LinkedStack linkedStack = new LinkedStack();
        linkedStack.push(3);
        linkedStack.push(4);
        linkedStack.push(5);
        System.out.println(linkedStack.size());

        ArrayStack arrayStack = new ArrayStack(3);
        arrayStack.push(3);
        arrayStack.push(4);
        arrayStack.push(5);
        System.out.println(arrayStack.size());

        System.out.println(linkedStack.equals(linkedStack, arrayStack));
        System.out.println(linkedStack);

    }
}
