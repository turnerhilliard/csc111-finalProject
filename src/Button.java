import java.awt.*;

public class Button {
    private double x1;
    private double y1;
    private double halfHeight;
    private Color color=Color.BLACK;
    private String text;

    public Button(double x1, double y1, double halfHeight, Color color){
        this.x1 = x1;
        this.y1 = y1;
        this.color = color;
        this.halfHeight = halfHeight;
    }
    public Button(double x1, double y1, double halfHeight, String text){
        this.x1 = x1;
        this.y1 = y1;
        this.halfHeight = halfHeight;
        this.text = text;
    }

    public void drawTextButton(){
        StdDraw.setPenColor(StdDraw.BLACK);
        double x = x1+halfHeight;
        double y = y1+halfHeight;
        StdDraw.square(x,y,halfHeight);
        StdDraw.text(x,y, text);

    }
    public void drawColorButton(){
        StdDraw.setPenColor(this.color);
        double x = x1+halfHeight;
        double y = y1+halfHeight;
        StdDraw.filledSquare(x,y,halfHeight);
    }



}
