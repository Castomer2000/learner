package SkillFactory.PracticeWeek;

public class ToTable {
    int[] data;
    int x;
    int y;

    public ToTable(int[] data, int x, int y) {
        this.data = data;
        this.x = x;
        this.y = y;
    }

    int[][] resize() {
        int[][] res = new int[x][y];
        int c = 0;
        for (int i = 0; i < x; i++) {
            for (int j = c; j < c + y; j++) {
                res[i][j - c] = data[j];
            }
            c += y;
        }
        return res;
    }
}
