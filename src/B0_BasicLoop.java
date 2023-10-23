public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.isTrail=true;
        plane.pausetime=0;
        plane.startingAngle(0);
        plane.trailWidth = 2;


//        for (int h = 0; h < 800; h = h + 10){
//            System.out.println(h);
//            rowOfSquares(h);
//        }

        practiceLoops();


    } //end of go method

    public void practiceLoops(){

        for(int x = 2; x < 33; x = x*2)
        {
            System.out.println(x);
        }

    }


    public void rowOfSquares(int yCoordinate){
        int squareSize = 10;

//        for(int x = 0; x <= 1000/squareSize;x = x + 1)
//        {
//            System.out.println(x);
//            plane.teleport(x*squareSize,yCoordinate);
//            plane.setColor(plane.random(0,255), plane.random(0,255), plane.random(0,255));
//            plane.square(squareSize);
//
//
//        }
    } //end of rowOfSquares

} //end of class

//for(start;condition;increment)
