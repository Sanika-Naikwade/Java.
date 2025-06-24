public class ThreadExample {
    public static void main(String[] args) {

        Thread avg = new Thread(()->{
            int sum = 0;
            for(int i =0 ; i<=10 ; i++){
                sum = sum  + i;

            }
            double average = sum / 10.0;
            System.out.println("Average of first 10 numbers :" + average);
        });

        Thread Square = new Thread(() -> {
            int x= 5;
            System.out.println("Square of number : " + x*x);
        });

        try{
            avg.start();
            avg.join();

            Square.start();
            Square.join();
        }catch(InterruptedException e){
            e.getMessage();
        }

    }
    
}
