public class Client {
    public static void displayArray(int[] array){
        for(int i : array){
            System.out.printf(i+"\t");
        }
    }
    public static void main(String[] args) {
        MyStack stack = new MyStack(4);
        stack.push(2);
        stack.push(4);
        stack.push(6);
        stack.push(8);
        displayArray(stack.getArray());
//        stack.popAndReserve(); lưu ý lỗi này: trong dòng code tiếp theo đã gọi phương thức này rồi... nếu để dòng này gọi 2 lần báo lỗi
        stack.displayNewArray();
    }
}
