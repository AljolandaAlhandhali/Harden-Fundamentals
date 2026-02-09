public class Loops {
    public static void main(String[] args) throws InterruptedException {
        for(int count = 0; count < 10; count++){
            System.out.println(count);
            Thread.sleep(1000);
        }
        System.out.println("Finally, we are here!");
    }
}
