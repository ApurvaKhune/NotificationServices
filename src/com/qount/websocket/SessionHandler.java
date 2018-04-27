package com.qount.websocket;

import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.json.JsonObject;
import javax.json.spi.JsonProvider;
import javax.websocket.Session;

import com.qount.model.Notification;

@ApplicationScoped
public class SessionHandler {

	private SessionHandler() {
	}

	private static final SessionHandler instance = new SessionHandler();

	public static SessionHandler getInstance() {
		return instance;
	}

	public void registerNotification(Session session, Notification notification) {
		try {
			Thread.sleep(notification.getTime());
			sendToSession(session, notification.getMessage());
		} catch (InterruptedException ex) {
			Logger.getLogger(SessionHandler.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	private void sendToSession(Session session, String message) {
		try {
			JsonProvider provider = JsonProvider.provider();
			JsonObject jsonMessage = provider.createObjectBuilder().add("action", "notify")
					.add("msg", message).add("date", new Date().toString()).build();
			session.getBasicRemote().sendText(jsonMessage.toString());
		} catch (IOException ex) {
			Logger.getLogger(SessionHandler.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
}