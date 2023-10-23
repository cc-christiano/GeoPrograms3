public class A7_PracticeMethods extends World{

    public void go(){
        plane.isTrail = true;
        plane.teleport(200,plane.random(0,500));
        drawC();
        plane.teleport(400,plane.random(0,500));
        drawC2();
        plane.teleport(265,plane.random(0,500));
        drawN();
    }

    public void drawC(){

        plane.startingAngle(180);
        plane.trailWidth = 4;
        plane.setColor(plane.random(0,255), 194, 228);
        plane.move(40);
        plane.turn(90);
        plane.setColor(250, 145, 206);
        plane.move(70);
        plane.turn(90);
        plane.setColor(plane.random(0,255), 55, 168); //plane.random(0,255)
        plane.move(40);


    }

    public void drawC2(){
        plane.startingAngle(180);
        plane.trailWidth = 4;
        plane.setColor(plane.random(0,255), 194, 228);
        plane.move(40);
        plane.turn(90);
        plane.setColor(250, 145, 206);
        plane.move(70);
        plane.turn(90);
        plane.setColor(250, 55, 168); //plane.random(0,255)
        plane.move(40);
    }

    public void drawN(){
        plane.setColor(plane.random(0,255), 145,206);
        plane.startingAngle(-90);
        plane.move(70);
        plane.turn(-155);
        plane.setColor(plane.random(0,255), 55, 175);
        plane.move(75);
        plane.turn(155);
        plane.setColor(plane.random(0,255), 33, 127);
        plane.move(70);
    }

}
