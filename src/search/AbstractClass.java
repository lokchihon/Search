package search;
/**
 * Lok Chi Hon
 * AP Computer Science A
 * Mr. Levin
 * Lab 5.1
 */

public abstract class AbstractClass
{
	Node startNode;
	Node goalNode;
	
	//Constructor
	public AbstractClass(Node start, Node goal)
	{
		this.startNode = start;
		this.goalNode = goal;
	}
	
	//Abstract method
	abstract public boolean search();
}