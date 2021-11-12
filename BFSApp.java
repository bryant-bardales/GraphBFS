package GraphBFS;

class BFSApp
{
	public static void main(String[] args)
	{
		Graph theGraph = new Graph();
		theGraph.addVertex('0');    // 0  (start for dfs)
		theGraph.addVertex('1');    // 1
		theGraph.addVertex('2');    // 2
		theGraph.addVertex('3');    // 3
		theGraph.addVertex('4');    // 4
		theGraph.addVertex('5');    // 5
		theGraph.addVertex('6');    // 6
		theGraph.addVertex('7');    // 7
		theGraph.addVertex('8');    // 8
		theGraph.addVertex('9');    // 9
		theGraph.addVertex('A');    // 10
		

		theGraph.addEdge(0, 1);     // AB
		theGraph.addEdge(0, 2);     // BC
		theGraph.addEdge(0, 3);     // AD
		theGraph.addEdge(1, 4);     // DE
		theGraph.addEdge(1, 5);
		theGraph.addEdge(2, 6);
		theGraph.addEdge(2, 7);
		theGraph.addEdge(3, 7);
		theGraph.addEdge(3, 8);
		theGraph.addEdge(7, 9);
		theGraph.addEdge(8, 10);
	
		

		System.out.print("Visits: ");
		theGraph.bfs();             // breadth-first search
		System.out.println();
	}  // end main()
}  // end class BFSApp