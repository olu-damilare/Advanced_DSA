package mazeSolver;

import java.io.File;
import java.util.Scanner;

public class FileReader {

    private int[][] map;
    private String fileName;
    private int numOfRows;
    private int numOfColumns;
    private int startPositionCol;
    private int startPositionRow;

    public FileReader(String fileName, int numOfRows, int numOfColumns){
        this.fileName = fileName;
        this.numOfColumns = numOfColumns;
        this.numOfRows = numOfRows;
        map = new int[numOfRows][numOfColumns];
    }

    public int[][] getMap() {
        return map;
    }

    public String getFileName() {
        return fileName;
    }

    public int getNumOfRows() {
        return numOfRows;
    }

    public int getNumOfColumns() {
        return numOfColumns;
    }

    public int getStartPositionCol() {
        return startPositionCol;
    }

    public int getStartPositionRow() {
        return startPositionRow;
    }

    public void parseFile(){
        try{
            Scanner scanner = new Scanner(new File(fileName));
            for (int i = 0; i < numOfRows; i++) {
                for (int j = 0; j < numOfColumns; j++) {
                    map[i][j] = scanner.nextInt();

                    if(map[i][j] == 2){
                        startPositionCol = j;
                        startPositionRow = i;

                    }
                }
            }
            scanner.close();
        }catch(Exception e){
            e.printStackTrace();

        }
    }
}
