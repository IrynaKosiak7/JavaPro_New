package de.telran.lesson0320.Homework;

import de.telran.lesson0318.Book;

import java.util.*;

public class Point implements Comparable<Point> {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public int compareTo(Point o) {
        int result = Double.compare(x, o.x);
        if (result == 0) result = Double.compare(y,o.y);
        return result;
    }

    public static class ComparotorByY implements Comparator<Point> {
        @Override
        public int compare(Point objekt1, Point objekt2) {

            int result = (int) (objekt1.y - objekt2.y);
            return result;
        }
    }


        public static void main(String[] args) {
            Point point1 = new Point(11.5, 12);
            Point point2 = new Point(33, 74.5);
            Point point3 = new Point(120.1, 27.3);
            Point point4 = new Point(81.5, 19.6);
            Point point5 = new Point(70.9, 0);
            Point point6 = new Point(70.9, 0);
            List<Point> pointList = new ArrayList<>(Arrays.asList(point1, point2, point3, point4, point5,point6));

            Collections.sort(pointList, new Point.ComparotorByY());
            for (Point p : pointList) {
                System.out.println(p);
            }

            TreeSet<Point> pointTreeSet = new TreeSet<>(pointList);
            System.out.println(pointTreeSet);


        }


    }
