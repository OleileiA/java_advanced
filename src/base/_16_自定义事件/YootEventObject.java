package base._16_自定义事件;

import java.util.EventObject;

/*
* EventObject是事件对象，它是所有事件类的父类，它封装了事件源对象和一些与事件相关的方法。
* */

public class YootEventObject extends EventObject {

    private Object source;

    public YootEventObject(Object source) {
        super(source);
        this.source = source;
    }

    @Override
    public Object getSource() {
        return super.getSource();
    }

    public void setSource(Object source) {
        this.source = source;
    }
}
