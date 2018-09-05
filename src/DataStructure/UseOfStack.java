package DataStructure;

import java.util.Stack;

public class UseOfStack {
    public static void main(String[] args) {


    Stack<String> stk = new Stack();
    stk.push("Subhra");
    stk.push("Tanu");
    stk.push("Roy");

while(!stk.empty()){
    System.out.println(stk.pop());
}
    }
}
