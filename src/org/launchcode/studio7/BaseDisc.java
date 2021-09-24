
package org.launchcode.studio7;

public  abstract class BaseDisc {

    private String name;
    private double storageSize;
    private String  content;
    private String discType;
    private int speed;
    private String readwritetype;

    public BaseDisc(String name, double storageSize, String content, String discType) {
        this.name = name;
        this.storageSize = storageSize;
        this.content = content;
        this.discType = discType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(double storageSize) {
        this.storageSize = storageSize;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getReadwritetype() {
        return readwritetype;
    }

    public void setReadwritetype(String readwritetype) {
        this.readwritetype = readwritetype;
    }

    @Override
    public String toString() {
        return  '{'+"Name:'" + name + '\'' +
                ", StorageSize:'" + storageSize +
                ", Content:'" + content + '\'' +
                ", DiscType:'" + discType + '\'' +'}'
                ;
    }
}

