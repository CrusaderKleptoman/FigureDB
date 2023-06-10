package com.ziminn.figuredb.data;

import java.util.ArrayList;
import java.util.List;

public class FigureCollection {
    private List<Figure> collection = new ArrayList<>();

    public FigureCollection() {
    }

    public FigureCollection(List<Figure> collection) {this.collection = collection;}
    public Figure getFigure(int id) { return collection.get(id);}
    public void addFigure(Figure figure) { collection.add(figure);}
    public String getFigureName(int id) {
        return collection.get(id).getName();
    }
    public int getSize() {return collection.size();}

}
