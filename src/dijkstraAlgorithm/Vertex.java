package dijkstraAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex>{

    private String name;
    private List<Edge> adjacencyEdges;
    private boolean visited;
    private Vertex predecessor;
    private double distance = Double.MAX_VALUE;

    public Vertex(String name) {
        this.name = name;
        adjacencyEdges = new ArrayList<>();
    }

    public void addNeighbour(Edge edge){
        adjacencyEdges.add(edge);
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Edge> getAdjacencyEdges() {
        return adjacencyEdges;
    }

    public void setAdjacencyEdges(List<Edge> adjacencyEdges) {
        this.adjacencyEdges = adjacencyEdges;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public int compareTo(Vertex v) {
        return Double.compare(distance, v.distance);
    }
}
