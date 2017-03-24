package clone;

/**
 * @Package: clone
 * @Description: ${todo}
 * @author: liuxin
 * @date: 17/3/24 下午7:10
 */
public class Rectangle extends Shape {
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
