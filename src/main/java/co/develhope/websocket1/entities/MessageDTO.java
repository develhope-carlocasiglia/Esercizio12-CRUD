package co.develhope.websocket1.entities;

public class MessageDTO {

    private String type;
    private String message;
    private String topic;

    public MessageDTO(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}