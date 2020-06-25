package main.java.com.hwnumber3.classcount;

public class ClassCounter {
    private static int count;

    public ClassCounter() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public void generationCounter() {
        int rand = (int) (Math.random() * 15);
        for (int i = 0; i < rand; i++) {
            ClassCounter classCounter = new ClassCounter();
        }
    }
}
