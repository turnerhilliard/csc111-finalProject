import java.awt.*;

public class Paint {
    public static void main(String[] args) {
        Color color;
        int thickness=1;
        double x,y;
        String shape = "point";
        Pen pen = new Pen();
        StdDraw.setCanvasSize(700,575);
        makeCanvas();
        while (true) {
            if (StdDraw.isMousePressed()) {
                x = StdDraw.mouseX();
                y = StdDraw.mouseY();
                System.out.println(x + " " + y);
                if (y <= 1 && x <= 0.1) { // of in button area
                    if (y <= 0.1) {
                        pen.setColor(StdDraw.RED);
                    } else if (y <= 0.2) {
                        pen.setColor(StdDraw.GREEN);
                    } else if (y <= 0.3) {
                        pen.setColor(StdDraw.BLUE);
                    } else if (y <= 0.4) {
                        pen.setShape("circle");
                    } else if (y <= 0.5) {
                        pen.setShape("line");
                    } else if (y <= 0.6) {
                        pen.setShape("square");
                    } else if (y <= 0.7) {
                        pen.setShape("eraser");

                    } else if (y <= 0.8) {
                        pen.setShape("freedraw");
                    } else if (y <= 0.9) {
                        StdDraw.clear();
                        makeCanvas();
                    } else {
                        System.out.println(pen.getThick());
                        if (thickness <= 2) {
                            thickness = thickness + 1;
                        } else {
                            thickness = 1;
                        }
                        pen.setThick(thickness);
                    }
                } else {
                    pen.draw(x, y);
                    if(pen.getPause()==true) {
                        System.out.println("here");
                        //StdDraw.pause(300);
                    }
                }

                //StdDraw.pause(300);
            }
        }
    }

    public static void makeCanvas(){
        Button red = new Button(0,0,0.05,StdDraw.RED);
        red.drawColorButton();
        Button green = new Button(0,0.1,0.05,StdDraw.GREEN);
        green.drawColorButton();
        Button blue = new Button(0,0.2,0.05,StdDraw.BLUE);
        blue.drawColorButton();
        Button circle = new Button(0,0.3,0.05,"circle");
        circle.drawTextButton();
        Button line = new Button(0,0.4,0.05,"line");
        line.drawTextButton();
        Button square = new Button(0,0.5,0.05,"square");
        square.drawTextButton();
        Button eraser = new Button(0,0.6,0.05,"eraser");
        eraser.drawTextButton();
        Button freedraw = new Button(0,0.7,0.05,"free draw");
        freedraw.drawTextButton();
        Button clear = new Button(0,0.8,0.05,"clear");
        clear.drawTextButton();
        Button thickness = new Button(0,0.9,0.05,"thickness");
        thickness.drawTextButton();


    }

}
