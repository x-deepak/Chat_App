
package com.cmr.event;

/**
 *
 * @author Deepak
 */
public class PublicEvent {

    private static PublicEvent instance;
    private EventImageView eventImageView;
    private EventMain eventMain;
    private EventChat eventChat;
    private EventLogin eventLogin;

    public static PublicEvent getInstance() {
        if (instance == null) {
            instance = new PublicEvent();
        }
        return instance;
    }

    private PublicEvent() {

    }
    
    public void addEventMain(EventMain event) {
        this.eventMain = event;
    }
    public void addEventImageView(EventImageView event) {
        this.eventImageView = event;
    }

    public void addEventChat(EventChat event) {
        this.eventChat = event;
    }

    public void addEventLogin(EventLogin event) {
        this.eventLogin = event;
    }

    public EventMain getEventMain() {
        return eventMain;
    }

    public EventImageView getEventImageView() {
        return eventImageView;
    }

    public EventChat getEventChat() {
        return eventChat;
    }

    public EventLogin getEventLogin() {
        return eventLogin;
    }
}
