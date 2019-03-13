package _12_shapes.ir.javacup.paint;

/**
 * Created by sinet on 3/13/2019.
 */
public class Circle extends Shape {
    Double radius;

    public Circle(Color c, Pattern p, double r) {
        super(c, p);
        this.radius = r;
    }

    @Override
    public String toString() {
        return "Circle[color:"+this.color.toString()+", pattern:"+this.pattern.toString()+", radius:"+radius.intValue()+"]";
    }


    public boolean equals(Circle obj) {
        if (obj == null)
            return false;
        if(obj.color.equals(this.color) && obj.pattern.equals(this.pattern) && obj.radius.equals(this.radius)){
            return true;
        }else{
            return false;
        }
    }

}