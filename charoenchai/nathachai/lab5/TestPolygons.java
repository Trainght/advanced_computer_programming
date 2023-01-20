package charoenchai.nathachai.lab5;

public class TestPolygons {
    public static void main(String[] args) {
        Polygon polygon1 = new Polygon();
        polygon1.width = 2 ;
        polygon1.height = 3 ;
        polygon1.type = PolygonType.RECTANGLE;
        Polygon.setNumPolygons(1);
        Polygon.setSumPolygonsArea(polygon1.getArea());
        Polygon polygon2 = new Polygon();
        polygon2.width = 3;
        polygon2.height = 4;
        polygon2.type = PolygonType.TRIANGLE;
        Polygon.setNumPolygons(1);
        Polygon.setSumPolygonsArea(polygon2.getArea());
        System.out.println("The number of polygons is " + Polygon.numPolygons + " or " + polygon1.numPolygons + " or " + polygon2.numPolygons);
        System.out.println("The width of polygon1 is " + polygon1.width + " the width of polygon2 is " + polygon2.width);
        System.out.println("The sum of polygons area is " + Polygon.sumPolygonsArea);
    }
}

class Polygon{
    double height;
    double width;
    PolygonType type;

    static int numPolygons;
    static double sumPolygonsArea;

    double getArea(){
        switch (type) {
            case RECTANGLE :
                return width*height;
            case TRIANGLE :
                return 0.5*width*height;
            default:
                return 0 ;
        }
    }
    static int setNumPolygons(int numNewPolygons){
        return numPolygons += numNewPolygons ;
    }
    static double setSumPolygonsArea(double newPolygonsArea){
        return sumPolygonsArea += newPolygonsArea ;
    }
}

enum PolygonType{
    RECTANGLE,TRIANGLE
}