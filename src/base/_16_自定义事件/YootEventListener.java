package base._16_自定义事件;

import java.util.EventListener;

public class YootEventListener implements EventListener {

    /*
    * 事件处理方法，用于处理事件
    * */
    public void fire(YootEventObject event) {
        System.out.println("事件源：" + event.getSource());
//        System.out.println("事件类型：" + event.getId());
//        System.out.println("事件发生时间：" + event.getWhen());
        System.out.println("事件对象：" + event);
    }
}
