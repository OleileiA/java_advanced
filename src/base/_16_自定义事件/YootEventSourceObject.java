package base._16_自定义事件;

/*
* 事件源
* */
public class YootEventSourceObject {

    private String message; // 消息内容

    private YootEventListener[] listener; // 监听器

    private int foot = 0; // 监听器的索引

    public YootEventSourceObject(String message) {
        this.listener = new YootEventListener[5];
        this.message = message;
    }

    /*
    * 调用触发
    * */
    public void notifyInvoke() {
        for (YootEventListener yootEventListener : listener) {
            if (yootEventListener != null) {
                yootEventListener.fire(new YootEventObject(this));
            }
        }
    }

    public String getMessage() {
        return message;
    }

    /*
    * 事件触发模拟器
    * */
    public void setMessage(String message) {
        if (!this.message.equals(message)) {
            this.message = message;
            notifyInvoke();
        }
    }

}
