import java.awt.*;

public class Pen {
    private Color color = StdDraw.BLACK;
    private int thick = 1;
    private String shape = "circle";
    Boolean pause;

    public Pen(){
     /*   color = StdDraw.BLACK;
        thick = 1;
        shape = "circle";*/
    }

    public Color getColor() {
        return color;
    }

    public int getThick() {
        return thick;
    }

    public Boolean getPause() {
        return pause;
    }

    public String getShape() {
        return shape;
    }

    public void setThick(int thickness) {
        this.thick = thickness;
        if (thick == 1) {
            StdDraw.setPenRadius(0.01);
        }
        else if (thick == 2){
            StdDraw.setPenRadius(0.015);
        }
        else{
            StdDraw.setPenRadius(0.02);
        }
    }

    public void setColor(Color color) {
        this.color = color;
        StdDraw.setPenColor(color);
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void draw(double cx, double cy){
        pause=true;
        if (shape.equals("freedraw")){
            StdDraw.point (cx,cy);
            pause=false;
        }
        else if (shape.equals("erase")){
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.point(cx,cy);
            pause=false;
        }
        else {
            //StdDraw.pause(300);
            while (true) {
                if (StdDraw.isMousePressed()) {
                    double x2 = StdDraw.mouseX();
                    double y2 = StdDraw.mouseY();
                    double distance = Math.abs(Math.sqrt(Math.pow((cx-x2),2)+Math.pow((cy-y2),2)));
                    if(shape.equals("circle")){
                        StdDraw.circle(cx,cy,distance);
                    }
                    else if (shape.equals("line")){
                        System.out.println("line");
                        StdDraw.line(cx,cy,x2,y2);
                        return;
                    }
                    else{
                        StdDraw.square(cx,cy,distance);
                    }
                    //StdDraw.pause(300);
                    return;
                }
            }
        }
        return;
    }

}
