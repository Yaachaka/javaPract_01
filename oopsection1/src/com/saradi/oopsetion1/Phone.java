package com.saradi.oopsetion1;

public class Phone {
    private String name;
    int screenSize;
    int memorySize;
    int camera;

    public void playMusic (String trackName)
    {
        System.out.println("Playing "+trackName);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public Phone(String name, int screenSize, int memorySize, int camera) {
        this.name = name;
        this.screenSize = screenSize;
        this.memorySize = memorySize;
        this.camera = camera;
    }

    public Phone(String name, int memorySize) {
        this.name = name;
        this.memorySize = memorySize;
    }
}
