import java.util.*;

public class CheckSocialDistance {

    class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    int[] dx = {0, 1, 0, -1};
    int[] dy = {-1, 0, 1, 0};

    public int[] solution(String[][] places) {
        int[] result = new int[places.length];

        for (int i = 0; i < places.length; i++) {
            result[i] = isCorrect(places[i]);
        }

        return result;
    }

    /**
     * 응시자가 앉아있는 위치 찾기
     * @param board
     * @return
     */
    public int isCorrect(String[] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length(); j++) {
                if (board[i].charAt(j) == 'P') {
                    if (!bfs(board, i, j)) {
                        return 0;
                    }
                }
            }
        }
        return 1;
    }

    /**
     * 응시자의 위치부터 탐색을 해서 맨해튼 거리가 2인 곳만 방문하도록 탐색
     * @param board
     * @param x
     * @param y
     * @return
     */
    public boolean bfs(String[] board, int x, int y) {
        Queue<Node> q = new LinkedList<>();
        boolean[][] visited = new boolean[board.length][board.length];

        q.offer(new Node(x, y));

        visited[x][y] = true;

        while (!q.isEmpty()) {
            Node current = q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];
                int manhattan = Math.abs(x - nx) + Math.abs(y - ny);

                if (nx < 0 || ny < 0 || nx >= board.length || ny >= board.length) {
                    continue;
                }
                if (visited[nx][ny] || manhattan > 2) {
                    continue;
                }

                visited[nx][ny] = true;
                if (board[nx].charAt(ny) == 'X') {
                    continue;
                } else if (board[nx].charAt(ny) == 'P') {
                    return false;
                } else {
                    q.offer(new Node(nx, ny));
                }
            }
        }
        return true;
    }
}
