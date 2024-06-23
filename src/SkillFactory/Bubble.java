package SkillFactory;

class Bubble {
    public static void main(String[] args) {
        int[] data = new int[]{11, 5, 96, 14, 12};
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                }
            }
        }
        //System.out.println(Arrays.toString(data));
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
}

