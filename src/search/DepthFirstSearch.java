package search;
/**
 * Lok Chi Hon
 * AP Computer Science A
 * Mr. Levin
 * Lab 5.1
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DepthFirstSearch extends AbstractClass
{
	public DepthFirstSearch(Node startNode, Node goalNode)
	{
		super(startNode, goalNode);
	}
	
	/**
	 * Searches for the designated city
	 * @return true if path found; false if path is not found
	 */
	public boolean search()
	{
		if(this.startNode.equals(goalNode))
		{
			System.out.println("Goal Node Found!");
			System.out.println(startNode);
		}
		
		Stack<Node> stack  = new Stack<>();
		ArrayList<Node> explored = new ArrayList<>();
		stack.add(this.startNode);
		
		while (!stack.isEmpty())
		{
			Node current = stack.pop();
			if (current.equals(this.goalNode))
			{
				explored.add(current);
				System.out.println(explored);
				return true;
			}
			
			else
			{
				explored.add(current);
				for (Node x : current.getChildren())
				{
					if (!explored.contains(x) && !stack.contains(x))
					{
						stack.add(x);
					}
				}
			}
		}
		return false;
	}
}
