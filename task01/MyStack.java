package task01;

public class MyStack {
    private int index;
    private Object[] elements;

    public MyStack(){
        //obj = new Object[10];
        //this.obj = obj;
        index = -1;
        this.elements = new Object[5];
    }

    public MyStack(int index) {
        this.index = index;
    }

    public MyStack(Object[] elements){
        this.elements = elements;
    }

    public void setIndex(int index){
        this.index = index;
    }

    public int getIndex(){
        return index;
    }

    public void setElements(Object[] elements){
        this.elements = elements;
    }

    public Object[] getElements(){
        return elements;
    }

    public void push(Object obj){
        if (index >= elements.length-1 ){
            System.out.println("the stack is full and push failed");
            return;
        }
        //Object obj = new Object();
        elements[++index]=obj;
        System.out.println("push "+obj+" successfully and the pointer is pointing "+index);
    }

    public void pop(){
        if(index < 0){
            System.out.println("the stack is empty and pop failed");
            return;
        }
        System.out.println("pop "+elements[elements.length-1-index]+" successfully,and the pointer is pointing "+index);
        index--;
    }
}
