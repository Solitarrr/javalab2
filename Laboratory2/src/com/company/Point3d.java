package com.company;
//Трехмерный класс точки
public class Point3d{
    private double xCoord; //Координаты Х
    private double yCoord; //Координаты Y
    private double zCoord; //Координаты Z
    //Конструктор инициализации
    public Point3d (double x, double y, double z){
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    //Конструктор по умолчанию
    public Point3d(){
        //Вызов конструктора с тремя параметрами и определение источника
        this(0.0, 0.0, 0.0);
    }
    //Тут берутся значения
    //Возвращение координаты X
    public double getX(){
        return xCoord;
    }
    //Возвращение координаты Y
    public double getY(){
        return yCoord;
    }
    //Возвращение координаты Z
    public double getZ(){
        return zCoord;
    }
    //Тут отдаются значения
    //Установка значения координаты Х
    public void setX(double val){
        xCoord = val;
    }
    //Установка значения координаты Y
    public void setY(double val){
        yCoord = val;
    }
    //Установка значения координаты Z
    public void setZ(double val){
        zCoord = val;
    }
    //Расстояние между двумя точками
    public double distanceTo (Point3d p){
        double x2 = p.getX();
        double y2 = p.getY();
        double z2 = p.getZ();

        double x = this.xCoord;
        double y = this.yCoord;
        double z = this.zCoord;

        double eq = Math.sqrt(Math.pow((x2-x), 2) + Math.pow((y2-y), 2) + Math.pow((z2-z), 2));
        return eq;
    }
    //Метод проверки значений на равенство
    public static boolean equalsPoints (Point3d p, Point3d p2){
        double x = p.getX();
        double y = p.getY();
        double z = p.getZ();

        double x2 = p2.getX();
        double y2 = p2.getY();
        double z2 = p2.getZ();

        if ((x == x2) && (y == y2) && (z == z2))
            return true;
        else return false;

    }

}