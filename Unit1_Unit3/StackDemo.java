import java.util.Stack;
public class StackDemo {
    public static void main(String[] args) {
        Stack stack=new Stack();
        //1.empty()栈是否为空
        System.out.println(stack.empty());
        //2.peek()栈顶值    3.进栈push()
        stack.push(1);
        stack.push("b");

        //4.pop()出栈
        System.out.println(stack.peek());
        System.out.println(stack.empty());
        stack.pop();
        // 显示栈顶元素，栈顶元素还在栈里面
        System.out.println(stack.peek()); 
        //清除栈顶元素，栈顶元素已经出栈了
        stack.pop();
        System.out.println(stack.empty());
        
    }
}