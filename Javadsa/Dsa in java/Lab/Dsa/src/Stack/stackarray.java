package Stack;

class StackArray {
    private int[] stack;
    private int top;

    // constructor
    public StackArray(int size) {
        stack = new int[size];
        top = -1;
    }

    // push
    public void push(int value) {
        if (top == stack.length - 1) {
            resize();
        }
        top++;
        stack[top] = value;

        System.out.println(value + " pushed to stack");                           // stack[++top] =value;
    }

    // pop
    public int pop(){

        if(isEmpty()){
            return -1;
        }
        int removed= stack[top];
        top--;
        return removed;
    }


    // peek
    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return stack[top];
    }

    // resize function
    private void resize() {
        int newSize = stack.length * 2;
        int[] newStack = new int[newSize];
        for (int i = 0; i < stack.length; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
        System.out.println("Stack size doubled to " + newSize);
    }

    // check empty
    public boolean isEmpty() {
        return top == -1;
    }

    // print stack
    public void printStack() {
        System.out.print("Stack elements: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}