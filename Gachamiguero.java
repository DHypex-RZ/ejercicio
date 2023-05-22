public class Gachamiguero {
    public static void main(String[] args) {
        Gachamiguero program = new Gachamiguero();
        program.start();
    }

    public void start() {
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 5 == 0)
                System.out.println("Gachamiga\t");
            else if(i%3==0)
                System.out.print("Gacha\t");
            else if(i%5==0)
                System.out.print("Miga\t");
            else System.out.print(i + "\t");
        }
    }
}
