package org.example.collections.stackt;

public class Test {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(5);
        stack.push(5);


        System.out.println(stack.getStack());
        stack.isEmpty();

        System.out.println(stack.getStack());

        //stack.pop();

        stack.push(4);
        stack.push(5);
        stack.push(3);
        stack.push(7);
        System.out.println(stack.getStack());

        stack.pop();
        System.out.println(stack.getStack());
        stack.isEmpty();


        Stack<String> stack1 = new Stack<>();
        stack1.push("aro");
        stack1.push("ani");
        stack1.push("vacho");
        stack1.push("tatev");
        System.out.println(stack1.getStack());

        stack1.isEmpty();



    }

}
