package com.company.objects;

import java.awt.*;

public class House {
    private Color colorOfRoof;
    private static final Color COLOR_OF_LINES = new Color(0, 0, 0);
    private int length;
    private int width;

    public House(Color colorOfRoof, int length, int width) {
        this.colorOfRoof = colorOfRoof;
        this.length = length;
        this.width = width;
    }

    public void draw(Graphics2D g2d, boolean isVertical, Point point) {
        if (isVertical) {
            verticalHouse(g2d, point);
        } else {
            horizontalHouse(g2d, point);
        }
    }

    public void verticalHouse(Graphics2D g2d, Point point) {
        g2d.setColor(colorOfRoof);
        g2d.fillRect(point.getX(), point.getY(), width, length);

        g2d.setColor(COLOR_OF_LINES);
        g2d.setStroke(new BasicStroke(5.0f));
        g2d.drawLine(point.getX() + width / 2, point.getY() + length / 3, point.getX() + width / 2, point.getY() + length * 2 / 3);

        g2d.drawLine(point.getX() + width / 2, point.getY() + length / 3, point.getX() + width / 8, point.getY() + length / 16);
        g2d.drawLine(point.getX() + width / 2, point.getY() + length / 3, point.getX() + width * 7 / 8, point.getY() + length / 16);
        g2d.drawLine(point.getX() + width / 2, point.getY() + length * 2 / 3, point.getX() + width / 8, point.getY() + length * 15 / 16);
        g2d.drawLine(point.getX() + width / 2, point.getY() + length * 2 / 3, point.getX() + width * 7 / 8, point.getY() + length * 15 / 16);
    }

    public void horizontalHouse(Graphics2D g2d, Point point) {
        g2d.setColor(colorOfRoof);
        g2d.fillRect(point.getX(), point.getY(), length, width);

        g2d.setColor(COLOR_OF_LINES);
        g2d.setStroke(new BasicStroke(5.0f));
        g2d.drawLine(point.getX() + length / 3,point.getY() + width / 2, point.getX() + length * 2 / 3, point.getY() + width / 2);

        g2d.drawLine(point.getX() + length / 3, point.getY() + width / 2, point.getX() + length / 16, point.getY() + width / 8);
        g2d.drawLine(point.getX() + length / 3, point.getY() + width / 2, point.getX() + length / 16, point.getY() + width * 7 / 8);
        g2d.drawLine(point.getX() + length * 2 / 3, point.getY() + width / 2, point.getX() + length * 15 / 16, point.getY() + width / 8);
        g2d.drawLine(point.getX() + length * 2 / 3, point.getY() + width / 2, point.getX() + length * 15 / 16, point.getY() + width * 7 / 8);
    }

}
