package org.example;
class Editor extends Software {
    private String editorType;
    public Editor(String name, String version,double price, String editorType){
        super(name, version, price);
        this.editorType=editorType;
    }

    @Override
    public String getRequirements() {
        return "Достаточно";
    }
}
