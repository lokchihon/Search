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

public class BreadthFirstSearch extends AbstractClass
{
	public BreadthFirstSearch(Node startNode, Node goalNode)
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
		
		Queue<Node> queue  = new LinkedList<>();
		ArrayList<Node> explored = new ArrayList<>();
		queue.add(this.startNode);
		
		while (!queue.isEmpty())
		{
			Node current = queue.remove();
			if (current.equals(this.goalNode))
			{
				explored.add(current);
				System.out.println(explored);
				return true;
			}
			
			else
			{
				for (Node x : current.getChildren())
				{
					if (!explored.contains(x) && !queue.contains(x))
					{
						queue.add(x);
					}
				}
				explored.add(current);
			}
		}
		return false;
	}
}
