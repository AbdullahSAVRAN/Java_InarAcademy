package chapters.chapter13;

public class Exercise13_08 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //Revise the MyStack class


        MyStack stack1 = new MyStack();

        stack1.push(new Integer(7));
        stack1.push(new Integer(11));
        stack1.push(new Integer(35));

        MyStack stack2 = (MyStack) stack1.clone();

        stack1.pop();

        System.out.print("1st ");
        System.out.println(stack1);
        System.out.print("2nd ");
        System.out.println(stack2);
        System.out.println("IS THE 1st STACK EQUAL TO THE 2nd ?  " + (stack1 == stack2));
    }

}
