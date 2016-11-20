public class Score4 {
    private int[][] board = new int[6][7];
    private int turn = -1;
    private final int R = -1;
    private final int Y = 1;

    public void setBoard(int x, int y) {
        if (this.turn == -1) {
            this.board[x][y] = -1;
        }
        if (this.turn == 1) {
            this.board[x][y] = 1;
        }
    }

    public int check_winner() {
        int verSearch = this.verticalSearch();
        if (verSearch != -2) {
            return verSearch;
        }
        int horSearch = this.horizontalSearch();
        if (horSearch != -2) {
            return horSearch;
        }
        int rightWinner = this.RightCrossWinner();
        if (rightWinner != -2) {
            return rightWinner;
        }
        int leftWinner = this.LeftCrossWinner();
        if (leftWinner != -2) {
            return leftWinner;
        }
        return -2;
    }

    public int verticalSearch() {
        int row;
        int col = 0;
        while (col < 7) {
            row = 5;
            while (row > 2) {
                if (this.board[row][col] == 1 && this.board[row - 1][col] == 1 && this.board[row - 2][col] == 1 && this.board[row - 3][col] == 1) {
                    return 1;
                }
                --row;
            }
            ++col;
        }
        col = 0;
        while (col < 7) {
            row = 5;
            while (row > 2) {
                if (this.board[row][col] == -1 && this.board[row - 1][col] == -1 && this.board[row - 2][col] == -1 && this.board[row - 3][col] == -1) {
                    return -1;
                }
                --row;
            }
            ++col;
        }
        return -2;
    }

    public int horizontalSearch() {
        int row = 5;
        while (row > -1) {
            int col = 0;
            while (col < 4) {
                if (this.board[row][col] == -1 && this.board[row][col + 1] == -1 && this.board[row][col + 2] == -1 && this.board[row][col + 3] == -1) {
                    return -1;
                }
                if (this.board[row][col] == 1 && this.board[row][col + 1] == 1 && this.board[row][col + 2] == 1 && this.board[row][col + 3] == 1) {
                    return 1;
                }
                ++col;
            }
            --row;
        }
        return -2;
    }

    public int RightCrossWinner() {
        int col = 0;
        while (col < 4) {
            int row = 5;
            while (row > 3) {
                if (row - 3 >= 0 && col + 3 <= 6 && this.board[row][col] == this.board[row - 1][col + 1] && this.board[row - 1][col + 1] == this.board[row - 2][col + 2] && this.board[row - 2][col + 2] == this.board[row - 3][col + 3]) {
                    if (this.board[row][col] == 1) {
                        return 1;
                    }
                    if (this.board[row][col] == -1) {
                        return -1;
                    }
                }
                --row;
            }
            ++col;
        }
        return -2;
    }

    public int LeftCrossWinner() {
        int col = 6;
        while (col > -1) {
            int row = 5;
            while (row > -1) {
                if (row - 3 >= 0 && col - 3 >= 0 && this.board[row][col] == this.board[row - 1][col - 1] && this.board[row - 1][col - 1] == this.board[row - 2][col - 2] && this.board[row - 2][col - 2] == this.board[row - 3][col - 3]) {
                    if (this.board[row][col] == 1) {
                        return 1;
                    }
                    if (this.board[row][col] == -1) {
                        return -1;
                    }
                }
                --row;
            }
            --col;
        }
        return -2;
    }

    public int getTurn() {
        return this.turn;
    }

    public void changeTurn() {
        this.turn = this.turn == -1 ? 1 : -1;
    }

    public void printboard() {
        int i = 0;
        while (i < 6) {
            int j = 0;
            while (j < 7) {
                System.out.print(this.board[i][j]);
                ++j;
            }
            System.out.println("");
            ++i;
        }
        System.out.println("");
    }

    public int[][] getBoard() {
        return this.board;
    }
}

