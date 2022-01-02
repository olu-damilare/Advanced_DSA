package cycledetectionDFS;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String name;
    private boolean isVisited;
    private boolean isBeingVisited;
    private List<Vertex> adjacenciesList;

    public Vertex(String name){
        this.name = name;
        adjacenciesList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return name;
    }

    public void addNeighbour(Vertex vertex){
        adjacenciesList.add(vertex);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public boolean isBeingVisited() {
        return isBeingVisited;
    }

    public void setBeingVisited(boolean beingVisited) {
        isBeingVisited = beingVisited;
    }

    public List<Vertex> getAdjacenciesList() {
        return adjacenciesList;
    }

    public void setAdjacenciesList(List<Vertex> adjacenciesList) {
        this.adjacenciesList = adjacenciesList;
    }
}
