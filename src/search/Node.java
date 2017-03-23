package search;
/**
 * Lok Chi Hon
 * AP Computer Science A
 * Mr. Levin
 * Lab 5.1
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Represents a city
 * Will have an ArrayList of cities that will store all the children
 *
 */
public class Node implements Comparable<Node>
{
	public String cityName;
	
	private ArrayList<Node> children;
	
	private Node parent;
	
	public int minDistance = Integer.MAX_VALUE;
	
	int index;

	/**
	 * Constructor for a Node
	 * @param cityName
	 */
	public Node(String cityName, ArrayList<Node> children2)
	{
		this.cityName = cityName;
		children = new ArrayList<>();
	}
	
	public Node(String cityName, ArrayList<Node> children, int index)
	{
		this.cityName = cityName;
		this.children = children;
		this.index = index;
	}
	
	/**
	 * Sets ArrayList<Node> children to list of connected cities
	 * @param children2
	 */
	public void setChildren(ArrayList<Node> children2)
	{
		children = children2;
	}
	
	public ArrayList<Node> getChildren()
	{
		return children;
	}
	
	public void setDistance(int distance)
	{
		this.minDistance = distance;
	}
	
	public int getDistance() {
		return this.minDistance;
	}
	
	public void setParent(Node par)
	{
		this.parent = par;
	}
	
	public Node getParent()
	{
		return this.parent;
	}

	public String toString()
	{
		return cityName;
	}

	public int compareTo(Node other) {
		return this.minDistance - other.getDistance();
	}


}
