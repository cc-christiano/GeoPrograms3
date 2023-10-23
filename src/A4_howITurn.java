

public class A4_howITurn extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(0, 0, 255);
        plane.move(100);
        plane.turn(90);
        plane.setColor(20, 150, 200);
        plane.move(100);
        plane.turn(90);
        plane.trailWidth = 10;
        plane.setColor(75, 100, 150);
        plane.move(100);
        plane.turn(90);
        plane.setColor(100, 150, 150);
        plane.move(100);
    }


}
