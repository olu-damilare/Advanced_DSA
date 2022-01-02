package topologicalOrdering;

import java.util.Stack;

public class TopologicalOrdering {

    private Stack<Vertex> stack;

    public TopologicalOrdering() {
        this.stack = new Stack<>();
    }

    public void dfs(Vertex vertex){
        vertex.setVisited(true);
        for (Vertex v: vertex.getNeighbours()){
            if(!v.isVisited()){
                dfs(v);
            }
        }
        stack.push(vertex);
    }

    public Stack<Vertex> getStack(){
        return stack;
    }
}
