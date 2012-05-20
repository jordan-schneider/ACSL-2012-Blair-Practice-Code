package Intermediate;
import java.util.Scanner;

public class SquarePoint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String point1;
        String point2;
        double px;
        double py;
        double pointx1;
        double pointx2;
        double pointy1;
        double pointy2;
        double distance;
        double boundlowx;
        double temp;
        double boundupx;
        double boundlowy;
        double boundupy;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Please enter a letter for one point: ");
            point1 = sc.nextLine();
            System.out.println("Please enter a letter for a second point: ");
            point2 = sc.nextLine();
            System.out.println("Please enter the x coordinate of a point: ");           
            px = sc.nextDouble();
            sc.nextLine();
            System.out.println("Please enter the y coordinate of a point: ");
            py = sc.nextDouble();
            sc.nextLine();
            if (point1.equals("A")) {
                pointx1 = 2;
                pointy1 = 3;
            } else if (point1.equals("B")) {
                pointx1 = 11;
                pointy1 = 6;
            } else if (point1.equals("C")) {
                pointx1 = 7;
                pointy1 = 11;
            } else if (point1.equals("D")) {
                pointx1 = 1;
                pointy1 = 10;
            } else if (point1.equals("E")) {
                pointx1 = 5;
                pointy1 = 16;
            } else if (point1.equals("F")) {
                pointx1 = 5;
                pointy1 = 6;
            } else if (point1.equals("G")) {
                pointx1 = 0;
                pointy1 = 40;
            } else if (point1.equals("H")) {
                pointx1 = 9;
                pointy1 = 9;
            } else {
                pointx1 = 7;
                pointy1 = 0;
            }

            if (point2.equals("A")) {
                pointx2 = 2;
                pointy2 = 3;
            } else if (point2.equals("B")) {
                pointx2 = 11;
                pointy2 = 6;
            } else if (point2.equals("C")) {
                pointx2 = 7;
                pointy2 = 11;
            } else if (point2.equals("D")) {
                pointx2 = 1;
                pointy2 = 10;
            } else if (point2.equals("E")) {
                pointx2 = 5;
                pointy2 = 16;
            } else if (point2.equals("F")) {
                pointx2 = 5;
                pointy2 = 6;
            } else if (point2.equals("G")) {
                pointx2 = 0;
                pointy2 = 40;
            } else if (point2.equals("H")) {
                pointx2 = 9;
                pointy2 = 9;
            } else {
                pointx2 = 7;
                pointy2 = 0;
            }
            
            if (pointx2<pointx1){
            	temp=pointx2;
            	pointx2=pointx1;
            	pointx1=temp;
            	
            	temp=pointy2;
            	pointy2=pointy1;
            	pointy1=temp;
            }
            
            if (pointx1<pointx2 && pointy1<pointy2){
                boundlowx=pointx1; boundlowy=pointy1;
                boundupx=pointx2; boundupy=pointy2;
            }
            else{
                boundupx=pointx2; boundlowy=pointy2;
                boundlowx=pointx1; boundupy=pointy1;
            }

            if ((px<boundlowx && py>boundupy)){
                distance=Math.sqrt(Math.pow((px-boundlowx),2)+Math.pow((py-boundupy),2));
            }
            else if ((px>boundupx && py>boundupy)){
                distance=Math.sqrt(Math.pow((px-boundupx),2)+Math.pow((py-boundupy),2));                
            }
            else if ((py<boundlowy && px<boundlowx)){
                distance=Math.sqrt(Math.pow((px-boundlowx),2)+Math.pow((py-boundlowy),2)); 
            }
            else if ((py<boundlowy && px>boundupx)){
                distance=Math.sqrt(Math.pow((px-boundupx),2)+Math.pow((py-boundlowy),2));                 
            }
            else if ((py>=boundupy)){
                distance=py-boundupy;
            }
            else if ((py<=boundlowy)){
                distance=boundupy-py;}
            else if ((px<=boundlowx)){
                distance=boundlowx-px;}
            else if ((px>=boundupx)){
                distance=px-boundupx;}
            else{
                distance=Math.min(Math.abs(px-boundlowx), Math.min(Math.abs(py-boundlowy), Math.min(Math.abs(boundupx-px), Math.abs(boundupy-py))));
            }
            
            System.out.println(distance);
        }
    }
}