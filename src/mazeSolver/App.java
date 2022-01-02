package mazeSolver;

public class App {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader("C:\\SEMICOLON\\SpringBoot\\Data Structures and Algorithms\\src\\mazeSolver\\map.txt", 7, 7);
        fileReader.parseFile();
        MazeSolver mazeSolver = new MazeSolver(fileReader.getMap(), fileReader.getStartPositionCol(), fileReader.getStartPositionRow());
        mazeSolver.findWayOut();
    }
}
