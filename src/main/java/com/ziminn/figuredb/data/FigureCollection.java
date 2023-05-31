package com.ziminn.figuredb.data;

import java.util.ArrayList;
import java.util.List;

public class FigureCollection {
    private List<Figure> collection = new ArrayList<>();

    public FigureCollection() {
    }

    public FigureCollection(List<Figure> collection) {this.collection = collection;}
    private Figure getFigure(int id) { return collection.get(id);}
    private void addFigure(Figure figure) { collection.add(figure);}

    public String getFigureName(int id) {
        return collection.get(id).getName();
    }

    public void setFigureName(int id, String name) {
        collection.get(id).setName(name);
    }

    public String getFigureType(int id) {
        return collection.get(id).getFigureType();
    }

    public void setFigureType(int id, String figureType) {
        collection.get(id).setFigureType(figureType);
    }

    public String getFigureMaterial(int id) {
        return collection.get(id).getMaterial();
    }

    public void setFigureMaterial(int id, String material) {
        collection.get(id).setMaterial(material);
    }

    public String getFigureCondition(int id) {
        return collection.get(id).getCondition();
    }

    public void setFigureCondition(int id, String condition) {
        collection.get(id).setCondition(condition);
    }

    public float getFigureSize(int id) {
        return collection.get(id).getSize();
    }

    public void setFigureSize(int id, float size) {
        collection.get(id).setSize(size);
    }

    public String getFigureScale(int id) {
        return collection.get(id).getScale();
    }

    public void setFigureScale(int id, String scale) {
        collection.get(id).setScale(scale);
    }

    public String getFigureManufacturer(int id) {
        return collection.get(id).getScale();
    }

    public void setFigureManufacturer(int id, String manufacturer) {
        collection.get(id).setManufacturer(manufacturer);
    }

    public String getFigureDescription(int id) {
        return collection.get(id).getDescription();
    }

    public void setFigureDescription(int id, String description) {
        collection.get(id).setDescription(description);
    }

    public String getFigureImageName(int id) {
        return collection.get(id).getImageName();
    }

    public void setFigureImageName(int id, String imageName) {
        collection.get(id).setImageName(imageName);
    }

    public boolean isFigureBarterPossibility(int id) {
        return collection.get(id).isBarterPossibility();
    }

    public void setFigureBarterPossibility(int id, boolean barter) {
        collection.get(id).setBarterPossibility(barter);
    }
}
