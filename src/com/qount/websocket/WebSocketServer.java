package com.qount.websocket;

import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import com.qount.model.Notification;

@ApplicationScoped
@ServerEndpoint("/notifications")
public class WebSocketServer {

	private SessionHandler sessionHandler = SessionHandler.getInstance();

	@OnOpen
	public void open(Session session) {
		// sessionHandler.addSession(session);
	}

	@OnClose
	public void close(Session session) {
		// sessionHandler.removeSession(session);
	}

	@OnError
	public void onError(Throwable error) {
		Logger.getLogger(WebSocketServer.class.getName()).log(Level.SEVERE, null, error);

	}

	@OnMessage
	public void handleMessage(String message, Session session) {
		try (JsonReader reader = Json.createReader(new StringReader(message))) {
			JsonObject jsonMessage = reader.readObject();

			if ("add".equals(jsonMessage.getString("action"))) {
				Notification notification = new Notification();
				notification.setMessage(jsonMessage.getString("msg"));
				notification.setTime(Long.parseLong(jsonMessage.getString("time")));
				sessionHandler.registerNotification(session, notification);
			}

		}
	}
}