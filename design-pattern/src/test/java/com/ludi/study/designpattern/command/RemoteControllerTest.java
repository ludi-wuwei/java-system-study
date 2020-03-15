package com.ludi.study.designpattern.command;

import org.junit.Test;


public class RemoteControllerTest {


    @Test
    public void onButtonPushed() {

        LightReceiver lightReceiver = new LightReceiver();
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);

        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);
        remoteController.onButtonPushed(0);

        remoteController.offButtonPushed(0);
    }
}
