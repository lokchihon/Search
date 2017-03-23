package search;
/**
 * Lok Chi Hon
 * AP Computer Science A
 * Mr. Levin
 * Lab 5.1


public class AdjacencyMatrix 
{
	private final int vertices;
	private int adjacencyMatrix[][];
	
	public AdjacencyMatrix(int numVertices)
	{
		vertices = numVertices;
		adjacencyMatrix = new int[vertices][vertices];
	}
	
	public void setEdge(int from, int to, int weight)
	{
		adjacencyMatrix[from][to] = weight;
	}
	
	public int getEdge(int from, int to)
	{
		return adjacencyMatrix[from][to];
	}
}
 */