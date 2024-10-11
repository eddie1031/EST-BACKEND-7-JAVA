package generic.limit.example.S1.box;

import generic.limit.example.S1.Installable;
import generic.limit.example.S1.Tool;

public class InstallableToolBox<T extends Tool & Installable> extends Box<T> {

    public InstallableToolBox(T content) {
        super(content);
    }

    @Override
    public void open() {
        System.out.println("저는 " + content.getName() + " 을/를 가지고 있습니다!");
        content.installable();
    }

}
