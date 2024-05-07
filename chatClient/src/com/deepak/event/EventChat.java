package com.deepak.event;

import com.deepak.model.Model_Receive_Message;
import com.deepak.model.Model_Send_Message;

public interface EventChat {

    public void sendMessage(Model_Send_Message data);

    public void receiveMessage(Model_Receive_Message data);
}
