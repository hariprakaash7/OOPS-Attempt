import processing.core.PApplet;

class Shapes extends PApplet {
    private int xaxis;
    private int yaxis;
    private int height;
    private int width;
    Shapes(int xaxis,int yaxis,int height,int width) {
        this.xaxis = xaxis;
        this.yaxis=yaxis;
        this.height=height;
        this.width=width;
    }
    public int getXaxis() {
        return xaxis;
    }

    public int getYaxis() {
        return yaxis;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setXaxis(int xaxis) {
        this.xaxis = xaxis;
    }

    public void setYaxis(int yaxis) {
        this.yaxis = yaxis;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}

