import java.util.*;

class Animal {
    private String name;
    private double height;
    private double weight;
    private double speed;

    public Animal(String name, double height, double weight, double speed) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void show() {
        System.out.println("姓名: " + name);
        System.out.println("身高(公尺): " + height + "公尺");
        System.out.println("體重(公斤): " + weight + "公斤");
        System.out.println("速度(公尺/分鐘): " + speed + "公尺/分鐘");
    }

    public double distance(int x, double y) {
        return x * y * speed;
    }

    public double distance(int x) {
        return x * speed;
    }
}

public class A1103328_0324_1 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Animal("雪寶", 1.1, 52, 100);
        animals[1] = new Animal("驢子", 1.5, 99, 200);
        animals[2] = new Animal("安那", 1.7, 48, 120);
        animals[3] = new Animal("愛沙", 1.7, 50, 120);

        // show method
        for (Animal animal : animals) {
            animal.show();
            System.out.println();
        }

        // distance method
        Scanner scanner = new Scanner(System.in);
        for (Animal animal : animals) {
            System.out.println("姓名:"+animal.getName());
            System.out.println("輸入時間(分鐘):");
            int x = scanner.nextInt();
            double y = 1.0;
            System.out.println("輸入加速度(按Enter可略過輸入):");
            scanner.nextLine();
            String input = scanner.nextLine();
            if (!input.isEmpty()) {
                y = Double.parseDouble(input);
            }
            double distance = animal.distance(x, y);
            System.out.println(animal.getName() + "'s distance is " + distance + "m.");
            System.out.println();
        }
    }
}