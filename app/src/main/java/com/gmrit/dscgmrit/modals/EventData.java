package com.gmrit.dscgmrit.modals;

public class EventData {
    private String eventName;
    private Integer images;

    public EventData() {
    }

    public EventData(String eventName, Integer images) {
        this.eventName = eventName;
        this.images = images;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Integer getImages() {
        return images;
    }

    public void setImages(Integer images) {
        this.images = images;
    }

}
