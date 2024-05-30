package pl_java.abstract_class.exercise_3.shapes;

public class Rectangle extends Shape{

    private double height;
    private double width;

    // Constructor
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    // Getter
    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }

    // Setter 
    public void setHeight(double height){
        this.height=height;
    }
    public void setWidth(double width){
        this.width=width;
    }

    @Override
    public double calculateArea(){
        return (this.height*this.width);
    }
    @Override
    public double calculateCircumference(){
        return ((2*this.height)+(2*this.width));
    }


}
