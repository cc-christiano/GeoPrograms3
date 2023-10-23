public class FinalProject extends World{
    public int red;
    public int blue;
    public int green;
    public void go() {
        plane.isTrail = true;
        plane.trailWidth = 2;
        plane.pausetime = 1;

        plane.showBackGround();

        for (int row = 0; row < 634; row = row + 1) {
            for (int col = 0; col < 625; col++) { //must be one double for loop for EVERY thing ur filtering
                plane.teleport(col, row);
                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
//                plane.teleport(col, 488 - row);
                if (red < 155 && blue < 155 && green > 145) {
                    plane.setPixelColor(149, 213, 252);


                }
            }
        }


        plane.teleport(175, 150);
        sparkle();

        plane.teleport(450, 300);
        sparkle();

        for (int row = 341; row < 392; row = row + 1) {
            for (int col = 286; col < 325; col++) { //must be one double for loop for EVERY thing ur filtering
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
//                plane.teleport(col, 488 - row);
                if (red >= 230 && blue < 100 && green < 95) {
                    plane.setPixelColor(219, 171, 255);
                }
            }
        }

        for (int row = 163; row < 247; row = row + 1) {
            for (int col = 235; col < 360; col++) { //must be one double for loop for EVERY thing ur filtering
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
//                plane.teleport(col, 488 - row);
                if (red >= 230 && blue < 40 && green < 55) {
                    plane.setPixelColor(219, 171, 255);
                }
            }
        }

       plane.teleport(50,75);
        plane.setColor(250, 235, 22);
        plane.trailWidth = 2;
        circle(20);

        sunrays();


        plane.teleport(0,500);
        plane.startingAngle(0);
        plane.trailWidth = 150;
        plane.setColor(50, 168, 82);
        plane.move(475);

        for (int row = 230; row < 417; row = row + 1) {
            for (int col = 231; col < 362; col++) { //must be one double for loop for EVERY thing ur filtering
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
//                plane.teleport(col, 488 - row);
                if (red >= 225 && blue < 70 && green > 140) {
                    plane.setPixelColor(107, 44, 30);
                }
            }
        }
    }


    public void circle(int n){
        for(int x = 0; x < n; x = x +1){
            plane.move(10);
            plane.turn(360/n);
        }
    }



    public void nGon(int n){
        for(int x = 0; x < n/4; x = x +1){
            plane.move(10);
            plane.turn(360/n);
        }
    }


    public void sparkle(){
        for(int x = 0; x < 4; x = x + 1){
            plane.setColor(255,plane.random(0,255),255);
            nGon(20);
            plane.turn(180);

        }

    }

    public void sunrays() {
        plane.teleport(50,75);
        plane.trailWidth = 2;
        plane.turn(300);
        plane.move(20);
        plane.turn(130);
        plane.move(20);
        plane.teleport(60,55);
        plane.startingAngle(190);
        plane.move(20);
        plane.turn(130);
        plane.move(20);
        plane.teleport(77,45);
        plane.startingAngle(210);
        plane.move(20);
        plane.turn(130);
        plane.move(20);
        plane.teleport(98,48);
        plane.startingAngle(250);
        plane.move(20);
        plane.turn(130);
        plane.move(20);
        plane.teleport(113,61);
        plane.startingAngle(295);
        plane.move(20);
        plane.turn(130);
        plane.move(20);
        plane.teleport(120,81);
        plane.startingAngle(320);
        plane.move(20);
        plane.turn(130);
        plane.move(20);
        plane.teleport(114,101);
        plane.startingAngle(350);
        plane.move(20);
        plane.turn(130);
        plane.move(20);
        plane.teleport(98,114);
        plane.startingAngle(20);
        plane.move(20);
        plane.turn(130);
        plane.move(20);
        plane.teleport(78,117);
        plane.startingAngle(50);
        plane.move(20);
        plane.turn(130);
        plane.move(20);
        plane.teleport(61,108);
        plane.startingAngle(80);
        plane.move(20);
        plane.turn(130);
        plane.move(20);
        plane.teleport(52,95);
        plane.startingAngle(110);
        plane.move(20);
        plane.turn(130);
        plane.move(20);
    }


}
