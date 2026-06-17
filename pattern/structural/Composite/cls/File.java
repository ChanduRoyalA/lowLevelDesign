package pattern.structural.Composite.cls;

import pattern.structural.Composite.ifc.Item;

import java.util.Date;
import java.util.List;

public class File implements Item {
    private int size;
    private Date createdAt;
    private String name;

    public File(String name, int size, Date createdAt) {
        this.size = size;
        this.createdAt = createdAt;
        this.name = name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Date createdAt() {
        return createdAt;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void getChildName() {
        System.out.println("This is a File");
    }
}
