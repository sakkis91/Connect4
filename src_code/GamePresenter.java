public class GamePresenter {
    private int i0;
    private int i1;
    private int i2;
    private int i3;
    private int i4;
    private int i5;
    private int i6;
    private int[] max;
    private int mdepth = 0;
    private int pcscore;
    private int userscore;
    GameView view;
    Score4 sc;
    Min_max mm;

    public GamePresenter(GameView view) {
        this.view = view;
        this.initializeLevel();
        this.max = new int[7];
        this.initializeLevel();
        this.sc = new Score4();
        this.pcscore = 0;
        this.userscore = 0;
    }

    public void start() {
        this.view.setPresenter(this);
        this.view.open();
    }

    public void cancel() {
        this.view.close();
    }

    public void newGame() {
        this.sc = new Score4();
        this.initializeLevel();
        this.max = new int[7];
    }

    public void setDepth(int mdepth) {
        this.mdepth = mdepth;
    }

    public boolean checkIfFull(int j) {
        if (this.sc.getBoard()[0][j] != 0) {
            return true;
        }
        return false;
    }

    public void initializeLevel() {
        this.i0 = 5;
        this.i1 = 5;
        this.i2 = 5;
        this.i3 = 5;
        this.i4 = 5;
        this.i5 = 5;
        this.i6 = 5;
    }

    public void pcScorePlus() {
        ++this.pcscore;
    }

    public void userScorePlus() {
        ++this.userscore;
    }

    public void decreaseLevel(int i) {
        if (i == 0) {
            if (this.i0 == 0) {
                return;
            }
            --this.i0;
        }
        if (i == 1) {
            if (this.i1 == 0) {
                return;
            }
            --this.i1;
        }
        if (i == 2) {
            if (this.i2 == 0) {
                return;
            }
            --this.i2;
        }
        if (i == 3) {
            if (this.i3 == 0) {
                return;
            }
            --this.i3;
        }
        if (i == 4) {
            if (this.i4 == 0) {
                return;
            }
            --this.i4;
        }
        if (i == 5) {
            if (this.i5 == 0) {
                return;
            }
            --this.i5;
        }
        if (i == 6) {
            if (this.i6 == 0) {
                return;
            }
            --this.i6;
        }
    }

    public int getLevel(int i) {
        if (i == 0) {
            return this.i0;
        }
        if (i == 1) {
            return this.i1;
        }
        if (i == 2) {
            return this.i2;
        }
        if (i == 3) {
            return this.i3;
        }
        if (i == 4) {
            return this.i4;
        }
        if (i == 5) {
            return this.i5;
        }
        return this.i6;
    }

    public void resetScore() {
        this.pcscore = 0;
        this.userscore = 0;
    }

    public int[] findMax() {
        this.max[0] = this.i0;
        this.max[1] = this.i1;
        this.max[2] = this.i2;
        this.max[3] = this.i3;
        this.max[4] = this.i4;
        this.max[5] = this.i5;
        this.max[6] = this.i6;
        return this.max;
    }

    public int[] getMax() {
        return this.max;
    }

    public void setBoard(int x, int y) {
        this.sc.setBoard(x, y);
    }

    public int getTurn() {
        return this.sc.getTurn();
    }

    public int check_winner() {
        return this.sc.check_winner();
    }

    public void changeTurn() {
        this.sc.changeTurn();
    }

    public int Move() {
        this.mm = new Min_max(this.sc, this.mdepth);
        State st = this.mm.Move();
        return st.getCol();
    }

    public int getPcScore() {
        return this.pcscore;
    }

    public int getUserScore() {
        return this.userscore;
    }
}

