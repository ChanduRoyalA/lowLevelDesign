package pattern.structural.Composite.cls;

import pattern.structural.Composite.ifc.Item;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Folder implements Item {
    private int size;
    private Date createdAt;
    private String name;
    private ArrayList<File> files;

    public Folder(String name, Date createdAt, ArrayList<File> files) {
        this.createdAt = createdAt;
        this.name = name;
        this.files = files;
        for (File file : files) {
            this.size = this.size + file.getSize();
        }
    }

    public void addFile(File file) {
        this.files.add(file);
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
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
