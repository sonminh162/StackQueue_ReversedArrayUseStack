public class MyStack {
    private int size;
    private int[] array;
    private int index = 0;
    public MyStack(int size){
        this.size = size;
        array = new int[this.size];
    }
    public int[] getArray(){
        return array;
    }
    public void push(int element){
        if(isFull()) System.out.println("OverFlow! Unable to add elements:"+element);
        else{
            array[index]=element;
            index++;
        }
    }
    public int[] popAndReserve(){
        if(isEmpty()) System.out.println("\nUnderFlow! Unable to remove elements from stack");
        int[] newArray = new int[this.size];
        int i = 0;
        while(!isEmpty()){
            int result = array[--index];
            newArray[i] = result;
            i++;
        }
        return newArray;
    }
    public void displayNewArray(){
        System.out.println("");
        for(int i : popAndReserve()){
            System.out.printf(i+"\t");
        }
    }
    public boolean isEmpty(){
        return index==0;
    }
    public boolean isFull(){
        if(index >= size) return true;
        return false;
    }
}
