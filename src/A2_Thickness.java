public class A2_Thickness extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        System.out.println("This message will be printed to the window below.");
        System.out.println("A2 Thickness");
        plane.startingAngle(45);
        plane.isTrail = true;
        plane.setColor(200, 225, 250);
        plane.trailWidth = 35;
        plane.move(150);

        plane.isTrail = false;
        plane.trailWidth = 35;
        plane.move(150);

        plane.isTrail = true;
        plane.turn(90);
        plane.setColor(200, 100, 250);
        plane.trailWidth = 35;
        plane.move(150);

        plane.isTrail = false;
        plane.trailWidth = 35;
        plane.move(150);

        plane.isTrail = true;
        plane.turn(-90);
        plane.setColor(200, 0, 140);
        plane.trailWidth = 35;
        plane.move(150);

    }

}

/*

Methods:
- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.
   
- int trailWidth
   trailWidth controls the width of the trail left by the plane.
   plane.trailWidth = 10; sets the width of the trail to 10.

*/