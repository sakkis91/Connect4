/*
 * Decompiled with CFR 0_114.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Min_max {
    private Score4 sc;
    private int maxDepth;

    public Min_max(Score4 sc, int maxDepth) {
        this.maxDepth = maxDepth;
        this.sc = sc;
    }

    public State Move() {
        State initialState = new State(this.sc.getBoard(), -1, -1, 0);
        State st = this.max(initialState, 0);
        return st;
    }

    public State max(State state, int depth) {
        Random r = new Random();
        if (depth == this.maxDepth || state.isTerminal(1) || state.isTerminal(-1)) {
            State lastMove = new State(state.getBoard(), state.getRow(), state.getCol(), state.evaluate());
            return lastMove;
        }
        ArrayList<State> children = new ArrayList<State>(state.getChildren(1));
        State maxMove = new State(Integer.MIN_VALUE);
        for (State child : children) {
            State move = this.min(child, depth + 1);
            if (move.getValue() < maxMove.getValue()) continue;
            if (move.getValue() == maxMove.getValue()) {
                if (r.nextInt(2) != 0) continue;
                maxMove = move;
                maxMove.setMove(child.getMove());
                continue;
            }
            maxMove = move;
            maxMove.setMove(child.getMove());
        }
        return maxMove;
    }

    public State min(State state, int depth) {
        Random r = new Random();
        if (depth == this.maxDepth || state.isTerminal(-1) || state.isTerminal(1)) {
            State lastMove = new State(state.getBoard(), state.getRow(), state.getCol(), state.evaluate());
            return lastMove;
        }
        ArrayList<State> children = new ArrayList<State>(state.getChildren(-1));
        State minMove = new State(Integer.MAX_VALUE);
        for (State child : children) {
            State move = this.max(child, depth + 1);
            if (move.getValue() > minMove.getValue()) continue;
            if (move.getValue() == minMove.getValue()) {
                if (r.nextInt(2) != 0) continue;
                minMove = move;
                minMove.setMove(child.getMove());
                continue;
            }
            minMove = move;
            minMove.setMove(child.getMove());
        }
        return minMove;
    }

    public int[][] createBoardCopy(int[][] board) {
        int[][] newboard = new int[6][7];
        int i = 0;
        while (i < board.length) {
            int j = 0;
            while (j < board[i].length) {
                newboard[i][j] = board[i][j];
                ++j;
            }
            ++i;
        }
        return newboard;
    }
}

