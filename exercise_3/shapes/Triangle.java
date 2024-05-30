package pl_java.abstract_class.exercise_3.shapes;

public class Triangle extends Shape {

    private double height;
    private double base;

    // Constructor 
    public Triangle(double height,double base){
        this.height=height;
        this.base=base;
    }

    // getter

    public double getHeight(){
        return height;
    }
    public double getBase(){
        return base;
    }

    // Setter 
    public void setHeight(double height){
        this.height=height;
    }
    public void setBase(double base){
        this.base=base;
    }

    @Override
    public double calculateArea(){
        return (base*height)/2;
    }

    @Override
    public double calculateCircumference(){
        return  base+base+height;
    }
}
