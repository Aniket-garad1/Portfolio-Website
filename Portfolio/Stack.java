public class Stack
{
    int size;
    int top;
    
    public Stack(int size)
    {
        int arr[] = new int[size];
        top = 0;
    }
    
    private boolean push(int x)
    {
        top++;
        arr[top++] = x;
        return true;
    }
    private int pop()
    {
        int delete = arr[top--];
        return delete;
    }
    private int peek()
    {
        return arr[top];
    }
    private Boolean isEmpty()
    {
        if(top == 0)
        {
            return true;
        }
        else
            return false;
    }
    private Boolean isFull()
    {
        if(top == size-1)
        {
            return true;
        }
        else
            return false;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    int n = sc.nextInt();
	    Stack stack = new Stack(n);
	    for(int i = 0 ; i < n ; i++)
	    {
	        stack.push(sc.nextInt());
	    }
	    stack.isEmpty();
	    stack.isFull();
	    System.out.println(stack.peek());
	}
}