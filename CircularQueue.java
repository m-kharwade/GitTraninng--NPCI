package LinearDS;

public class CircularQueue {
	
	int size=0;
	int [] items;
	int front,rear;
	
	public CircularQueue(int size)
	{
		this.size=size;
		items=new int[size];
		front=-1;
		rear=-1;
	}
	
	private void enQueue(int element)
	{

		if(isFull())
		{
			System.out.println("Queue is Full");
		}
		else
		{
			if(front== -1) {
				front=0;
				rear=0;
			}
			else if(rear==size-1 && front!=0)
			{
				rear=0;
			}
			rear++;
			items[rear]=element;
		}
	}
	
	
	int deQueue()
	{
		int element = 0;
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		else
		{
			element=items[front];
			if(front>=rear)
			{
				front=-1;
				rear=-1;
			}
			else
			{
				front++;
			}
		}
			
		return element;
	
	}
	
	boolean isFull()
	{
		if(front==0 && rear==size-1  || (rear==(front-1) % (size -1)))
			return true;
		return false;
		
	}
	
	boolean isEmpty()
	{
		if(front==-1 ||rear ==-1)
			return true;
		return false;
		
	}
	
	private void printQueue() 
	{
		int i;
        if(!isEmpty()){
            for (i=front; i<=rear;i++){
                System.out.println(items[i]);
            }
        }
		
	}
	
	 public static void main(String[] args) {
		
		CircularQueue circularQueue=new CircularQueue(5);
		
		circularQueue.enQueue(13);
		circularQueue.enQueue(23);
		circularQueue.enQueue(33);
		circularQueue.enQueue(44);
		
		circularQueue.deQueue();
		
		circularQueue.printQueue();
		
	}

	

}
