package LinearDS;



public class StackToQueue {
	
	
	int []stack1;
	int []stack2;
	int top1,top2;
	int size;
	int count=0;
	
	public StackToQueue(int size) {
		this.size=size;
		top1=-1;
		top2=-1;
		stack1=new int[size];
		stack2=new int[size];
	}
	
	void push1(int data)
	{
		if(top1==size-1)
			System.out.println("Stack overflow");
		else
		{
			top1++;
			stack1[top1]=data;
		}
	}
	
	
	public int pop1()
	{
		if(top1==-1)
			System.out.println("Stack is empty");
		return stack1[top1-1];
				
	}
	void push2(int data)
	{
		if(top1==size-1)
			System.out.println("Stack overflow");
		else
		{
			top1++;
			stack2[top2]=data;
		}
	}
	
	
	public int pop2()
	{
		if(top2==-1)
			System.out.println("Stack is empty");
		return stack1[top2-1];
				
	}
	
	void enQueue(int element)
	{
		push1(element);
		count++;
		
	}
	
	
	void deQueue()
	{
		if((top1==-1) &&(top2==-1))
			System.out.println("Queue is empty");
		else
		{
			for(int i=0;i<count;i++)
			{
				int element=pop1();
				push2(element);
			}
			int b=pop2();
			System.out.println("Deteleted element is " +b);
			count--;
			for(int i=0;i<count;i++)
			{
				int element1=pop2();
				push1(element1);
			}
			
		}
	}
	
	void dispayElements()
	{
		for(int i=0;i<top1;i++)
		{
			System.out.println(stack1[i]);
		}
	}
	
	public static void main(String[] args) {
		
		StackToQueue stackToQueue=new StackToQueue(8);
		
		
		int[] items= new int[] {6,12,2,15,17,3,9};
		int temp=0;
		
		for(int i=0;i<=items.length-1;i++)
		{
			for(int j=i+1;j<=items.length-1;j++)
			{
				if(items[i]>items[j])
				{
					temp=items[i];
					items[i]=items[j];
					items[j]=temp;
					
				}
			}
			
		}
		
		/*
		 * for(int i=0;i<=items.length-1;i++) { System.out.println(items[i]); }
		 */
		
		int low1=items[0];
		int low2=items[1];
		
		for(int i=0;i<=items.length-1;i++)
		{
			if(low1>low2)
			{
				if(items[0]%items[i]==0)
				{
					stackToQueue.enQueue(items[i]);
				}else 
				{
					if(items[1]%items[i]==0)
					{
						stackToQueue.enQueue(items[i]);
					}

				}
			}
			
		}
		
		stackToQueue.dispayElements();

	}

	   
}
