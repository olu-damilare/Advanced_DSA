package dijkstraAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {


    public void computePaths(Vertex v){
        v.setDistance(0);
        PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(v);

        while(!priorityQueue.isEmpty()){
            Vertex actualVertex = priorityQueue.poll();

            for(Edge edge: actualVertex.getAdjacencyEdges()){
                Vertex vertex = edge.getTargetVertex();

                double newDistance = actualVertex.getDistance() + edge.getWeight();

                if(newDistance < vertex.getDistance()){
                    priorityQueue.remove(vertex);
                    vertex.setDistance(newDistance);
                    vertex.setPredecessor(actualVertex);

                    priorityQueue.add(vertex);
                }
            }
        }
    }

    public List<Vertex> getShortestPath(Vertex targetVertex){
        List<Vertex> shortestPathToTarget = new ArrayList<>();
        for(Vertex vertex = targetVertex; vertex != null; vertex = vertex.getPredecessor()){
            shortestPathToTarget.add(vertex);
        }

        Collections.reverse(shortestPathToTarget);

        return shortestPathToTarget;
    }

}
