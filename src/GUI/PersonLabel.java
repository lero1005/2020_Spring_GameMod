package GUI;

import factory.IconCreator;
import object.Cell;

import javax.swing.*;
import java.awt.*;

/**
 * Created by lero on 2020/6/30.
 */
public class PersonLabel extends JLabel{
    private Cell cell;
    private Icon icon;
    public PersonLabel(Cell cell) {
        this.cell = cell;
        int num = cell.getNum();
        Color color;
        if(num == 0) {
            color = new Color(255, 93, 100);
        }
        else if(num == 1) {
            color = new Color(255, 230, 121);
        }
        else if(num>=2 && num<=5) {
            color = new Color(255, 145, 178);
        }
        else {
            color = new Color(255, 230, 121);
        }
        icon = new IconCreator(cell.getX(), cell.getY(),
                cell.getWidth(), cell.getHeight(), color);
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public int getRow() {
        return cell.getRow();
    }

    public void setRow(int row) {
        cell.setRow(row);
    }

    public int getColumn() {
        return cell.getColumn();
    }

    public void setColumn(int column) {
        cell.setColumn(column);
    }

    public int getX() {
        return cell.getX();
    }

    public void setX(int x) {
        cell.setX(x);
    }

    public int getY() {
        return cell.getY();
    }

    public void setY(int y) {
        cell.setY(y);
    }

    public int getHeight() {
        return cell.getHeight();
    }

    public void setHeight(int height) {
        cell.setHeight(height);
    }

    public int getWidth() {
        return cell.getWidth();
    }

    public void setWidth(int width) {
        cell.setWidth(width);
    }

    public int getNum() {
        return cell.getNum();
    }

    public void setNum(int num) {
        cell.setNum(num);
    }

    public int getLength() {
        return cell.getLength();
    }

    public void setLength(int length) {
        cell.setLength(length);
    }


    @Override
    public Icon getIcon() {
        return icon;
    }

    @Override
    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public boolean isIntercted(PersonLabel personLabel) {
        return cell.isIntersected(personLabel.getCell());
    }

    public void moveX(int d) {
        cell.moveX(d);
    }

    public void moveY(int d) {
        cell.moveY(d);
    }

    @Override
    public String toString() {
        return cell.toString();
    }
}
