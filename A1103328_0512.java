import java.util.*;

class Dumpling {
    private String name;
    private int count;

    public Dumpling(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public synchronized boolean sell(String type, int num,int id) {
        if (count >= num) {
            count -= num;
            System.out.println("客人"+id+ "買了" + num + "個" + type + "水餃。");
            return true;
        } else {
            System.out.println("對不起，"+"客人"+id + type + "水餃已售完。");
            return false;
        }
    }
}

class Customer extends Thread {

    private Dumpling dumpling;
    private int id;

    public Customer(Dumpling dumpling, int id) {
        this.dumpling = dumpling;
        this.id = id;
    }

    public void run() {
        Random rand = new Random();
        int num = rand.nextInt(41) + 10;
        String[] dumplingTypes = { "豬肉", "牛肉", "蔬菜" };
        String dumplingType = dumplingTypes[rand.nextInt(dumplingTypes.length)];
        boolean sold = false;
        while (!sold) {
            synchronized (dumpling) {
                sold = dumpling.sell(dumplingType, num,id);
                if (!sold) {
                    break;
                }
            }
        }

    }
}

public class A1103328_0512 {
    public static void main(String[] args) throws Exception {
        Dumpling[] dumplings = { new Dumpling("豬肉", 5000), new Dumpling("牛肉", 3000), new Dumpling("蔬菜", 1000) };
        Scanner input = new Scanner(System.in);
        Random rand= new Random();
        int numCustomers = 0;
        try {
            System.out.print("請輸入有多少位客人:");
            numCustomers = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("非法輸入，客人數目將設定成1。");
            numCustomers = 1;
        }
        for (int i = 1; i <= numCustomers; i++) {
            int dumplingIndex = rand.nextInt(3);
            Customer customer = new Customer(dumplings[dumplingIndex], i);
            customer.start();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}