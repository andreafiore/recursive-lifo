

public class Stack {
    
    int item;
    Stack previous;
    Stack last;
    
    public Stack(int item) {
        this.item = item;
        last = this;
    }
    
    public void push(int item) {
        Stack newStack = new Stack(item);
        newStack.previous = last;
        last = newStack;
    }
    
    public Integer pop() {
        Integer item = last != null ? last.item : null;
        this.last = last.previous;
        return item;
    }
}