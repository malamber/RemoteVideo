package org.malamber.remotevideo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import java.net.ServerSocket;
import java.net.Socket;

public class VideoListenerService extends Service {
    ServerSocket socket;
    public VideoListenerService() {
        try {
            socket=new ServerSocket(9000);
        }
        catch (Exception e){

        }
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }


}
