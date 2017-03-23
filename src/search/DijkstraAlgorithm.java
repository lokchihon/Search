package search;
/**
 * Lok Chi Hon
 * AP Computer Science A
 * Mr. Levin
 * Lab 5.1
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class DijkstraAlgorithm extends AbstractClass
{
	private int[][]adjMatrix;
	
	public DijkstraAlgorithm(Node startNode, Node goalNode, int[][] adjMat)
	{
		super(startNode, goalNode);
		this.adjMatrix = adjMat;
	}
	
	/**
	 * Searches for the designated city
	 * @return true if path found; false if path is not found
	 */
	public boolean search()
	{
		this.startNode.setDistance(0);
		if(this.startNode.equals(goalNode))
		{
			System.out.println("Goal Node Found!");
			System.out.println(startNode);
		}
		
		PriorityQueue<Node> queue  = new PriorityQueue<>();
		queue.add(this.startNode);
		ArrayList<Node> explored = new ArrayList<>();
		
		while (!queue.isEmpty())
		{
			Node current = queue.remove();
			System.out.println(current + " " + current.getDistance());
			if (current.equals(this.goalNode))
			{
				explored.add(current);
				printPath(current);
				return true;
			}
			
			else
			{
				for (Node x : current.getChildren())
				{
					if (!explored.contains(x) && !queue.contains(x))
					{
						x.setDistance(current.getDistance() + this.adjMatrix[current.index][x.index]);
						x.setParent(current);
						queue.add(x);
					}
					else if (x.getDistance() > current.getDistance() + this.adjMatrix[current.index][x.index])
					{
						x.setDistance(current.getDistance() + this.adjMatrix[current.index][x.index]);
						x.setParent(current);
					}
				}
				explored.add(current);
			}
		}
		return false;
	}
	
	public void printPath(Node goal)
	{
		while(goal.getParent() != null)
		{
			System.out.print(goal+ "<-- ");
			goal = goal.getParent();
		}
		System.out.println(goal);
	}
}