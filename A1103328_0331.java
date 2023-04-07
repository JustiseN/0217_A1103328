import java.util.Scanner;

class animal{
    String name;
    double height;
    int weight;
    int speed;

    public animal(String name,double height,int weight,int speed){
        this.name=name;
        this.height=height;
        this.weight=weight;
        this.speed=speed;
    }

    public void show(){
        System.out.println("姓名: " + name);
        System.out.println("身高(公尺): " + height + "公尺");
        System.out.println("體重(公斤): " + weight + "公斤");
        System.out.println("速度(公尺/分鐘): " + speed + "公尺/分鐘");
        System.out.println();
    }

    public double distance(int x, double y) {
        return x * y * speed;
    }

    public double distance(int x) {
        return x * speed;
    }

    public static void showinfo(){
        System.out.println("歡迎來到冰雪奇緣系統");
    }

}

class human extends animal{
    String gender;

    public human(String name,double height,int weight,int speed,String gender){
        super(name,height,weight,speed);
        this.gender=gender;
    }

    @Override
    public void show(){
        System.out.println("姓名: " + name);
        System.out.println("性別: " + gender);
        System.out.println("身高(公尺): " + height + "公尺");
        System.out.println("體重(公斤): " + weight + "公斤");
        System.out.println("速度(公尺/分鐘): " + speed + "公尺/分鐘");
        System.out.println();
    }
}

class snow extends human{
    String freeze;
    public snow(String name,double height,int weight,int speed,String gender){
        super(name,height,weight,speed,gender);
        this.freeze="Yes";
    }

    @Override
    public void show(){
        System.out.println("姓名: " + name);
        System.out.println("性別: " + gender);
        System.out.println("身高(公尺): " + height + "公尺");
        System.out.println("體重(公斤): " + weight + "公斤");
        System.out.println("速度(公尺/分鐘): " + speed + "公尺/分鐘");
        System.out.println("冰凍技能:"+ freeze);
        System.out.println();
    }

    @Override
    public double distance(int x, double y) {
        return x * y * speed * 2;
    }
    @Override
    public double distance(int x) {
        return x * speed * 2;
    }
}

public class A1103328_0331{
    public static void main(String[] args){
        animal.showinfo();

        animal[] animals=new animal[2];
        animals[0]= new animal("雪寶",1.1,52,100);
        animals[1]= new animal("驢子",1.5,99,200);
        human[] humans=new human[3];
        humans[0]= new human("阿克", 1.9, 80, 150, "男");
        humans[1]= new human("漢斯",1.8,78,130,"男");
        humans[2]= new human("安那",1.7,48,120,"女");
        snow elsa=new snow("愛沙",1.7,50,120,"女");

        for (animal animal : animals) {
            animal.show();
            System.out.println();
        }
        for (human human : humans) {
            human.show();
            System.out.println();
        }
        elsa.show();
        double distances;
        Scanner scanner = new Scanner(System.in);
        for (animal animal : animals) {
            System.out.println("姓名:"+animal.name);
            System.out.println("輸入時間(分鐘):");
            int x = scanner.nextInt();
            System.out.println("輸入加速度(輸入0可略過):");
            double y = scanner.nextDouble();
            if(y==0){
                distances = animal.distance(x);
            }
            else{
                distances = animal.distance(x, y);
            }
            System.out.println(animal.name + "的距離是" + distances + "米。");
            System.out.println();
        }

        for (human human : humans) {
            System.out.println("姓名:"+human.name);
            System.out.println("輸入時間(分鐘):");
            int x = scanner.nextInt();
            System.out.println("輸入加速度(輸入0可略過):");
            double y = scanner.nextDouble();
            if(y==0){
                distances = human.distance(x);
            }
            else{
                distances = human.distance(x, y);
            }
            System.out.println(human.name + "的距離是" + distances + "米。");
            System.out.println();
        }

        System.out.println("姓名:"+elsa.name);
        System.out.println("輸入時間(分鐘):");
        int x = scanner.nextInt();
        System.out.println("輸入加速度(輸入0可略過):");
        double y = scanner.nextDouble();
        if(y==0){
            distances = elsa.distance(x);
        }
        else{
            distances = elsa.distance(x, y);
        }
        System.out.println(elsa.name + "的距離是" + distances + "米。");
        System.out.println();
    }
}