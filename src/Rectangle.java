public class Rectangle {
    protected double x;
    protected double y;
    static private int createdRectangles = 0;
    private final static String RUSSIAN_CLASS_NAME = "Прямоугольник";
    private final static String ENGLISH_CLASS_NAME = "Rectangle";

    Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
        createdRectangles++;
    }

    Rectangle(int x) {
        this.x= x;
        this.y = x;
        createdRectangles++;

    }

    public double getX() {

        return x;
    }

    public double getY() {

        return y;
    }

    public void setX(double x) {

        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calculateArea() {
        return (x * y);
    }

    public void printArea() {
        System.out.println("Площадь = " + calculateArea());
    }

    public void printRectangleKind(){

        if(x==y){
            System.out.println("Это квадрат ");}
        else{
            System.out.println("Это прямоугольник");
        }
    }
    public void  printRectanglesCount(){


        System.out.println("Всего было создано " + createdRectangles + " прямоугольников");
    }



    public boolean isTheSameRectangle(Rectangle r) {
        return (x == r.x && y == r.y);
    }

    public static void   printClassName(boolean printInRussian){



    }
}



