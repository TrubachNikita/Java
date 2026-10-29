package org.example;

class Planet implements Orbitable,Explorable,Testing{
    private String name;
    private double orbitTime;
    private String resources;
    public Planet(String name,double orbitTime, String resources){
        this.name=name;
        this.orbitTime=orbitTime;
        this.resources=resources;
    }

    @Override
    public void test() {
        System.out.println("Тест");
    }


    @Override
    public void orbit() {
        System.out.println("Планета "+ name+"Период "+orbitTime);
    }

    @Override
    public double getOrbitTime() {
        return orbitTime;
    }

    @Override
    public void explore() {
        System.out.println("Изучение "+name+"Рессурсы "+ resources);
    }

    @Override
    public String getResources() {
        return resources;
    }
}