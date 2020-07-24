class Stack{
    int stk[] = new int[10];
    int tos;
    Stack(){
        tos = -1;
    }
    void push(int item){
        if(tos==9)
           System.out.println("Stack overflow");
        else stk[++tos] = item;
    }
    int pop() {
        if (tos < -1) {
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            return stk[tos--];
        }
    }
}

public class StackClass {
    public static void main(String args[]){
        Stack myStack = new Stack();
        // push it
        for(int i=0; i<10; i++)
            myStack.push(i);
        // pop it
        for (int j=0; j<10; j++){
            System.out.println("The "+j+"th element is:"+myStack.pop());
        }
    }
}
