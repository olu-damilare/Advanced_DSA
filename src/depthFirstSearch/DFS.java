package depthFirstSearch;

import java.util.List;
import java.util.Stack;

public class DFS {

    private Stack<Vertex> stack;

    public DFS() {
        this.stack = new Stack<>();
    }

    public void dfs(List<Vertex> vertexList){
        for(Vertex v: vertexList){
            if(!v.isVisited()){
                v.setVisited(true);
                dfsRecursive(v);
            }
        }
    }

    private void dfsWithStack(Vertex rootVertex) {
        stack.add(rootVertex);
        rootVertex.setVisited(true);

        while(!stack.isEmpty()){
            Vertex actualVertex = stack.pop();
            System.out.println(actualVertex + " ");

            for(Vertex v: actualVertex.getNeighbours()){
                if(!v.isVisited()){
                    v.setVisited(true);
                    stack.push(v);
                }
            }
        }
    }

    private void dfsRecursive(Vertex vertex){
        System.out.println(vertex);

        for (Vertex v: vertex.getNeighbours()) {
            if(!v.isVisited()){
                v.setVisited(true);
                dfsRecursive(v);
            }
        }
    }
}
