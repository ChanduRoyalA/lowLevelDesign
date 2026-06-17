package pattern.structural.Composite.ifc;

import java.util.Date;
import java.util.List;

public interface Item {
    int getSize();

    Date createdAt();

    String getName();

    void getChildName();
}
