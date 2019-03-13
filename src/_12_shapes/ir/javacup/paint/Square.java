package _12_shapes.ir.javacup.paint;

/**
 * Created by sinet on 3/13/2019.
 */
public class Square extends Shape {

    Integer length;

    public Square(Color c, Pattern p, int length) {
        super(c, p);
        this.length = length; // autoboxing

    }

    @Override
    public String toString() {
        return "Square[color:"+this.color.toString()+", pattern:"+this.pattern.toString()+", length:"+length+"]";
    }

    public boolean equals(Square obj) {
        if (obj == null)
            return false;
        if(obj.color.equals(this.color) && obj.pattern.equals(this.pattern) && obj.length.equals(this.length)){
            return true;
        }else{
            return false;
        }
    }


}