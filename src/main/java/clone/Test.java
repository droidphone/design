package clone;

/**
 * @Package: clone
 * @Description: 通过接口缓存
 * @author: liuxin
 * @date: 17/3/24 下午7:14
 */
public class Test {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
