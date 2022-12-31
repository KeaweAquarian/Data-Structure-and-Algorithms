import org.w3c.dom.ls.LSOutput;

import java.sql.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class MazeSolver {

    int[][] maze = {
            {2, 0, 1, 1},
            {1, 1, 1, 0},
            {0, 0 , 0, 1}
    };


    public static void main(String[] args) {
        MazeSolver maze = new MazeSolver();
        System.out.print(Arrays.deepToString(maze.maze).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));

        LinkedList<Point> path = new LinkedList<>();

        Point point = new Point(0, 2);
        path.push(point);
        maze.maze[path.peek().x][path.peek().y] = 0;
        System.out.print(Arrays.deepToString(maze.maze).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));

    }
}
