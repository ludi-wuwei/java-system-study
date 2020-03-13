package com.ludi.study.designpattern.facade;

/**
 * @author 陆迪
 * @date 2020/3/13 21:08
 */
public class HomeTheaterFacade {

    private final TheaterLight theaterLight;
    private final Popcorn popcorn;
    private final DvdPlayer dvdPlayer;
    private final Projector projector;
    private final Screen screen;

    public HomeTheaterFacade() {
        this.theaterLight = TheaterLight.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.dvdPlayer = DvdPlayer.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.stereo = Stereo.getInstance();
    }

    private final Stereo stereo;

    public void ready() {
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        theaterLight.dim();
    }
    
    public void play() {
        dvdPlayer.play();               
    }
    
    public void pause() {
        dvdPlayer.pause();               
    }
    
    public void end() {
        popcorn.off();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.off();
        theaterLight.off();
    }
    
    public static void main(String[] args) {

    }
}
