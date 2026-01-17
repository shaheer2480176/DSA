package Array;

public class stack {
    int[] stack;
    int top;

    public stack(int length) {
        stack=new int[length];
        top=-1;
    }
    public void push(int value){
        if (top==stack.length-1){
            resize();
        }
        top++;
        stack[top]=value;

    }
    public int pop(){
        if (isempty()){
            return -1;
        }
        int remove=stack[top];
        top--;
        return remove;
    }
    public int peek(){
        return stack[top];
    }
    public void resize(){
        int[]newstack=new int[stack.length*2];
        for (int i = 0; i < stack.length; i++) {
            newstack[i]=stack[i];
        }
        stack=newstack;
    }
    public boolean isempty(){
        return top==-1;
    }
}
