

public class Person<E>
{
	
	private String name;
	private String gender;
	private Age age;
	private Weight weight;
	private Height height;
	
	
	private static class Node<E>
	{
		private E element;
		private Node<E> next;
		
		public Node(E e, Node<E> n)
		{
			element = e;
			next = n;
		}
		
		public E getElement()
		{
			return element;
		}
		
		public Node<E> getNext()
		{
			return next;
		}
		
		public void setNext(Node<E> n)
		{
			next = n;
		}
	}
	
	private Node<E> head = null;
	private Node<E> tail = null;
	
	private int size = 0;
	
	public int size()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return size == 0;
	}
	
	public E first()
	{
		if(isEmpty())
		{
			return null;
		}
		
		else
		{
			return head.getElement();
		}
	}
	
	public E last()
	{
		if(isEmpty())
		{
			return null;
		}
		
		
		return tail.getElement();
		
	}
	
	public void addFirst(E e)
	{
		head = new Node <>(e,head);
		if(size == 0)
		{
			tail = head;
		}
		size++;
	}
	
	
	public E removeFirst()
	{
		if(isEmpty())
		{
			return null;
		}
		E answer = head.getElement();
		head = head.getNext();
		size--;
		if(size == 0)
		{
			tail = null;

		}
		
			return answer;

	}
	
	public Person(String n, String g, Height h, Weight w, Age a)
	{
		name = n;
		height = h;
		weight = w;
		age = a;
	}
	
	public String toString()
	{

		return name;
		
	}
	
	public static void main(String[] args)
	{
		Height height = new Height(2000, "cm");
		Weight weight = new Weight(1, "ton");
		Age age = new Age(15, "yrs");
		Person<Person> man = new Person("Gary", "male", height, weight, age);
		
		Person<Person> linkedlist = new Person("Janice", "female", height, weight, age);
		linkedlist.addFirst(man);
				
		System.out.println(linkedlist.first());
		linkedlist.removeFirst();
		System.out.println(linkedlist.first());
			
		

	}
}
