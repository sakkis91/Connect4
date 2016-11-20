/*
 * Decompiled with CFR 0_114.
 */
import java.util.ArrayList;

public class State {
    private int value;
    private int[][] board;
    private int[] levels;
    int[] move;

    public State(int value) {
        this.value = value;
        this.move = new int[2];
    }

    public State(int[][] board2, int x, int y, int value) {
        this.board = this.createBoardCopy(board2);
        this.value = value;
        this.move = new int[2];
        this.move[0] = x;
        this.move[1] = y;
        this.levels = new int[7];
        this.findLevels(board2);
    }

    public State(int[][] board2, int x, int y, int color, int value) {
        this.board = this.createBoardCopy(board2);
        this.value = value;
        this.board[x][y] = color;
        this.move = new int[2];
        this.move[0] = x;
        this.move[1] = y;
        this.levels = new int[7];
        this.findLevels(this.board);
    }

    public int[][] createBoardCopy(int[][] board2) {
        int[][] boardcopy = new int[6][7];
        int i = 0;
        while (i < 6) {
            int j = 0;
            while (j < 7) {
                boardcopy[i][j] = board2[i][j];
                ++j;
            }
            ++i;
        }
        return boardcopy;
    }

    public ArrayList<State> getChildren(int color) {
        ArrayList<State> children = new ArrayList<State>();
        int j = 0;
        while (j < 7) {
            int[][] boardcopy = this.createBoardCopy(this.board);
            if (boardcopy[0][j] == 0) {
                State child = new State(boardcopy, this.levels[j], j, color, 0);
                children.add(child);
            }
            ++j;
        }
        return children;
    }

    public void findLevels(int[][] board) {
        int j = 0;
        while (j < 7) {
            int lvl = 5;
            int i = 5;
            while (i > -1) {
                if (board[i][j] == 0) {
                    this.levels[j] = lvl;
                    break;
                }
                --lvl;
                --i;
            }
            ++j;
        }
    }

    public int[][] getBoard() {
        return this.board;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public int getRow() {
        return this.move[0];
    }

    public int getCol() {
        return this.move[1];
    }

    public void setMove(int[] i) {
        this.move = i;
    }

    public int[] getMove() {
        return this.move;
    }

    public int evaluate() {
        int eval = this.FourInAColumnAttack(1) + this.FourInARowAttack(1) + this.threeInAColAttack(1) + this.threeInARowAttack(1) + this.FourInAColumnAttack(-1) + this.FourInARowAttack(-1) + this.threeInAColAttack(-1) + this.threeInARowAttack(-1) + this.ThreeInARowAlone(1) + this.ThreeInARowAlone(-1) + this.RightCrossWinner(1) + this.RightCrossWinner(-1) + this.LeftCrossWinner(1) + this.LeftCrossWinner(-1);
        return eval;
    }

    public int threeInARowAttack(int color) {
        int threecounter = 0;
        boolean win = false;
        int i = 5;
        while (i > -1) {
            if (this.board[i][0] == color && this.board[i][0] == this.board[i][1] && this.board[i][1] == this.board[i][2] && this.board[i][3] == 0) {
                threecounter += 20;
            }
            if (this.board[i][6] == color && this.board[i][6] == this.board[i][5] && this.board[i][5] == this.board[i][4] && this.board[i][3] == 0) {
                threecounter += 20;
            }
            int ii = 1;
            while (ii < 4) {
                if (this.board[i][ii] == color && this.board[i][ii] == this.board[i][ii + 1] && this.board[i][ii + 1] == this.board[i][ii + 2] && this.board[i][ii - 1] == 0 && this.board[i][ii + 3] == 0) {
                    if (i != 5) {
                        if (this.board[i + 1][ii - 1] != 0 && this.board[i + 1][ii + 3] != 0) {
                            threecounter += 50;
                            win = true;
                        } else {
                            threecounter += 20;
                        }
                    } else if (this.board[i][ii - 1] == 0 && this.board[i][ii + 3] == - color) {
                        ++threecounter;
                    } else if (this.board[i][ii - 1] == - color && this.board[i][ii + 3] == 0) {
                        ++threecounter;
                    }
                }
                ++ii;
            }
            --i;
        }
        if (threecounter > 0) {
            int value;
            if (win) {
                value = 3000 + threecounter;
                if (color == -1) {
                    value = - value;
                }
                return value;
            }
            value = 1500 + threecounter;
            if (color == -1) {
                value = - value;
            }
            return value;
        }
        return 0;
    }

    public int threeInAColAttack(int color) {
        int threecounter = 0;
        int i = 0;
        while (i < 7) {
            if (this.board[5][i] == color && this.board[5][i] == this.board[4][i] && this.board[4][i] == this.board[3][i] && this.board[2][i] == 0) {
                threecounter += 20;
            }
            if (this.board[4][i] == color && this.board[4][i] == this.board[3][i] && this.board[3][i] == this.board[2][i] && this.board[1][i] == 0) {
                threecounter += 20;
            }
            if (this.board[3][i] == color && this.board[3][i] == this.board[2][i] && this.board[2][i] == this.board[1][i] && this.board[0][i] == 0) {
                threecounter += 20;
            }
            ++i;
        }
        if (threecounter > 0) {
            int value = 1500 + threecounter;
            if (color == -1) {
                value = - value;
            }
            return value;
        }
        return 0;
    }

    public int FourInARowAttack(int color) {
        int fourcounter = 0;
        int i = 5;
        while (i > -1) {
            if (this.board[i][0] == color && this.board[i][0] == this.board[i][1] && this.board[i][1] == this.board[i][2] && this.board[i][2] == this.board[i][3]) {
                fourcounter += 100;
            }
            if (this.board[i][1] == color && this.board[i][1] == this.board[i][2] && this.board[i][2] == this.board[i][3] && this.board[i][3] == this.board[i][4]) {
                fourcounter += 100;
            }
            if (this.board[i][2] == color && this.board[i][2] == this.board[i][3] && this.board[i][3] == this.board[i][4] && this.board[i][4] == this.board[i][5]) {
                fourcounter += 100;
            }
            if (this.board[i][3] == color && this.board[i][3] == this.board[i][4] && this.board[i][4] == this.board[i][5] && this.board[i][5] == this.board[i][6]) {
                fourcounter += 100;
            }
            --i;
        }
        if (fourcounter > 0) {
            int value = 100000;
            if (color == -1) {
                return - value;
            }
            return value;
        }
        return 0;
    }

    public int FourInAColumnAttack(int color) {
        int fourcounter = 0;
        int i = 0;
        while (i < 7) {
            if (this.board[0][i] == color && this.board[0][i] == this.board[1][i] && this.board[1][i] == this.board[2][i] && this.board[2][i] == this.board[3][i]) {
                fourcounter += 100;
            }
            if (this.board[1][i] == color && this.board[1][i] == this.board[2][i] && this.board[2][i] == this.board[3][i] && this.board[3][i] == this.board[4][i]) {
                fourcounter += 100;
            }
            if (this.board[2][i] == color && this.board[2][i] == this.board[3][i] && this.board[3][i] == this.board[4][i] && this.board[4][i] == this.board[5][i]) {
                fourcounter += 100;
            }
            ++i;
        }
        if (fourcounter > 0) {
            int value = 100000;
            if (color == -1) {
                return - value;
            }
            return value;
        }
        return 0;
    }

    public int ThreeInARowAlone(int color) {
        int counter = 0;
        int i = 5;
        while (i > -1) {
            int col = 0;
            while (col < 3) {
                if (this.board[i][col] == 0 && this.board[i][col + 4] == 0 && this.board[i][col + 1] == color && this.board[i][col + 2] == color && this.board[i][col + 3] == color) {
                    counter += 500;
                }
                ++col;
            }
            --i;
        }
        if (counter > 0) {
            int value = 5000 + counter;
            if (color == -1) {
                return - value;
            }
            return value;
        }
        return 0;
    }

    public boolean isTerminal(int color) {
        int row;
        boolean win = false;
        int i = 5;
        while (i > -1) {
            if (this.board[i][0] == color && this.board[i][0] == this.board[i][1] && this.board[i][1] == this.board[i][2] && this.board[i][2] == this.board[i][3]) {
                win = true;
            }
            if (this.board[i][1] == color && this.board[i][1] == this.board[i][2] && this.board[i][2] == this.board[i][3] && this.board[i][3] == this.board[i][4]) {
                win = true;
            }
            if (this.board[i][2] == color && this.board[i][2] == this.board[i][3] && this.board[i][3] == this.board[i][4] && this.board[i][4] == this.board[i][5]) {
                win = true;
            }
            if (this.board[i][3] == color && this.board[i][3] == this.board[i][4] && this.board[i][4] == this.board[i][5] && this.board[i][5] == this.board[i][6]) {
                win = true;
            }
            --i;
        }
        if (win) {
            return win;
        }
        i = 0;
        while (i < 7) {
            if (this.board[0][i] == color && this.board[0][i] == this.board[1][i] && this.board[1][i] == this.board[2][i] && this.board[2][i] == this.board[3][i]) {
                win = true;
            }
            if (this.board[1][i] == color && this.board[1][i] == this.board[2][i] && this.board[2][i] == this.board[3][i] && this.board[3][i] == this.board[4][i]) {
                win = true;
            }
            if (this.board[2][i] == color && this.board[2][i] == this.board[3][i] && this.board[3][i] == this.board[4][i] && this.board[4][i] == this.board[5][i]) {
                win = true;
            }
            ++i;
        }
        int col = 0;
        while (col < 7) {
            row = 5;
            while (row > -1) {
                if (row - 3 >= 0 && col + 3 <= 6 && this.board[row][col] == color && this.board[row - 1][col + 1] == color && this.board[row - 2][col + 2] == color && this.board[row - 3][col + 3] == color) {
                    win = true;
                }
                --row;
            }
            ++col;
        }
        if (win) {
            return true;
        }
        col = 6;
        while (col > -1) {
            row = 5;
            while (row > -1) {
                if (row - 3 >= 0 && col - 3 >= 0 && this.board[row][col] == color && this.board[row - 1][col - 1] == color && this.board[row - 2][col - 2] == color && this.board[row - 3][col - 3] == color) {
                    win = true;
                }
                --row;
            }
            --col;
        }
        return win;
    }

    public int RightCrossWinner(int color) {
        boolean win = false;
        int counter = 0;
        int col = 0;
        while (col < 7) {
            int row = 5;
            while (row > -1) {
                if (row - 3 >= 0 && col + 3 <= 6 && this.board[row][col] == color && this.board[row - 1][col + 1] == color && this.board[row - 2][col + 2] == color && this.board[row - 3][col + 3] == color) {
                    win = true;
                    counter += 100;
                }
                --row;
            }
            ++col;
        }
        if (counter > 0) {
            int value = 100000 + counter;
            if (color == -1) {
                return - value;
            }
            return value;
        }
        return 0;
    }

    public int LeftCrossWinner(int color) {
        boolean win = false;
        int counter = 0;
        int col = 6;
        while (col > -1) {
            int row = 5;
            while (row > -1) {
                if (row - 3 >= 0 && col - 3 >= 0 && this.board[row][col] == color && this.board[row - 1][col - 1] == color && this.board[row - 2][col - 2] == color && this.board[row - 3][col - 3] == color) {
                    win = true;
                    counter += 100;
                }
                --row;
            }
            --col;
        }
        if (counter > 0) {
            int value = 100000 + counter;
            if (color == -1) {
                return - value;
            }
            return value;
        }
        return 0;
    }
}

