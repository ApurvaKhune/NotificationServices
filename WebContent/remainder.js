
var socket = new WebSocket("ws://localhost:9090/NotificationServices/notifications");
socket.onmessage = onMessage;

function onMessage(event) {
    var notification = JSON.parse(event.data);
    if (notification.action === "notify") {
        notify(notification);
    }
}

function notify(notification){
	document.getElementById("msg").innerHTML=notification.msg;
}

function remindMsg(timeInMillis, msg) {
    var remindMsgObj = {
        time: timeInMillis,
        action: "add",
        msg: msg
    };
    socket.send(JSON.stringify(remindMsgObj));
}


function formSubmit() {
	var form = document.getElementById("remainderForm");
    var time = form.elements["time"].value;
    var msg = form.elements["msg"].value;
    document.getElementById("remainderForm").reset();
    remindMsg(time, msg);
}
