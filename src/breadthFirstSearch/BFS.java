package breadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public void bfs(Vertex startVertex){
        Queue<Vertex> queue = new LinkedList<>();

        startVertex.setVisited(true);
        queue.add(startVertex);

        while(!queue.isEmpty()){
            Vertex nextVertex = queue.remove();
            System.out.println(nextVertex);

            for(Vertex vertex: nextVertex.getNeighbours()){
                if(!vertex.isVisited()){
                    vertex.setVisited(true);
                    queue.add(vertex);
                }
            }
        }
    }
}
