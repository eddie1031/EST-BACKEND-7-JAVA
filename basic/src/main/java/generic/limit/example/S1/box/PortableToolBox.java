package generic.limit.example.S1.box;

import generic.limit.example.S1.Portable;
import generic.limit.example.S1.Tool;

// 도구상자를 Tool을 상속받음과 동시에 Portable을 구현해야 한다는 제한을 부여
public class PortableToolBox<T extends Tool & Portable> extends Box<T> {

    public PortableToolBox(T content) {
        super(content);
    }

    @Override
    public void open() {
        System.out.println("저는 " + content.getName() + " 을/를 가지고 있습니다!");
        content.portable();
    }

}
