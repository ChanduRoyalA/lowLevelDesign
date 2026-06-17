package pattern.structural.Composite.cls;

import java.util.ArrayList;
import java.util.Date;

public class CompositeMain {
    public static void main(String[] args) {
        File doc1 = new File("doc1", 10, new Date());
        File doc2 = new File("doc2", 20, new Date());
        File doc3 = new File("doc3", 30, new Date());
        File doc4 = new File("doc4", 40, new Date());

        ArrayList<File> folderFiles = new ArrayList<>();
        folderFiles.add(doc1);
        folderFiles.add(doc2);
        folderFiles.add(doc3);

        Folder folder01 = new Folder("Folder01",new Date(), folderFiles);

        System.out.println(folder01.getName());
        System.out.println(folder01.getSize());
        folder01.getChildName();

        System.out.println();

        System.out.println(doc4.getName());
        System.out.println(doc4.getSize());
        doc4.getChildName();
    }
}
