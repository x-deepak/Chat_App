
package com.cmr.event;

/**
 *
 * @author Deepak
 */
public class PublicEvent {

    private static PublicEvent instance;
    private EventImageView eventImageView;

    public static PublicEvent getInstance() {
        if (instance == null) {
            instance = new PublicEvent();
        }
        return instance;
    }

    private PublicEvent() {

    }

    public void addEventImageView(EventImageView event) {
        this.eventImageView = event;
    }

    public EventImageView getEventImageView() {
        return eventImageView;
    }
}
