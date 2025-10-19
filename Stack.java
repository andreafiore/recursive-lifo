

public class Stack {
    
    int item;
    Stack previous;
    Stack last;
    Stack first;
    
    public Stack(int item) {
        this.item = item;
        first = this;
        last = first;
    }
    
    public void push(int item) {
        Stack newStack = new Stack(item);
        if (first == last) {
            last = newStack;
            newStack.previous = this;
        } else last.push(item);
    }
    
    public Integer pop() {
        Integer item = last != null ? last.item : null;
        this.last = last != null ? last.previous : null;
        return item;
    }
}