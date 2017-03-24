package clone;

/**
 * @Package: clone
 * @Description: ${todo}
 * @author: liuxin
 * @date: 17/3/24 下午7:12
 */
public class Square extends Shape {
    public Square(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
