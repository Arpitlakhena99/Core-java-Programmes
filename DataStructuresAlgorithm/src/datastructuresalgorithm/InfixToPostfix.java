package datastructuresalgorithm;
import java.util.Stack;
public class InfixToPostfix{
	
    public static boolean isBalanced(String str){
      Stack<Character> stack= new Stack<>();
        for (char c: str.toCharArray()) {
         if (c == '('||c=='['||c=='{'){
           stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c ==']'&& !stack.isEmpty()&&stack.peek()=='['){
                stack.pop();
            } else if (c == '}'&&!stack.isEmpty()&&stack.peek()=='{'){
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty(); 
    }
    public static void main(String[] args)
    {
        String i1 = "}[()]}";
        String i2 = "{()}";
        String i3 = "{[()]}(";
        System.out.println("Is input1 balanced? " + isBalanced(i1));
        System.out.println("Is input2 balanced? " + isBalanced(i2));;
        System.out.println("Is input3 balanced? " + isBalanced(i3));;
}
}