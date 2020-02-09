public class Main {
    public static void main(String[] args) {
        Robot r1 = new Robot();
        Robot r2 = new CoffeeRobot();
        Robot r3 = new RobotDancer();
        Robot r4 = new RobotCooker();

        r1.work();
        r2.work();
        r3.work();
        r4.work();

        System.out.println("------");

        Robot[] robots = {
                new RobotCooker(),
                new Robot(),
                new RobotDancer(),
                new CoffeeRobot(),
                new RobotCooker()
        };

        for(Robot r : robots){
            r.work();
        }
    }
}
