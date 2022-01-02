package breadthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private int data;
    private boolean visited;
    private List<Vertex> neighbours;

    public Vertex(int data) {
        this.data = data;
        this.neighbours = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "" + this.data;
    }

    public int getData() {
        return data;
    }

    public void addNeighbourVertex(Vertex vertex){
        neighbours.add(vertex);
    }

    public void setData(int data) {
        this.data = data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(List<Vertex> neighbours) {
        this.neighbours = neighbours;
    }
}
