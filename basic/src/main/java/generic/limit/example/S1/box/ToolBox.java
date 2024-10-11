package generic.limit.example.S1.box;

import generic.limit.example.S1.Tool;

// extends
public class ToolBox<T extends Tool> extends Box<T>{

    public ToolBox(T content) {
        super(content);
    }

    @Override
    public void open() {
//       content.getName()
        System.out.println("저는 " + content.getName() + " 을/를 가지고 있습니다.");
    }

}
