package imageviewer.model;

public interface Image {
    
    Image next();
    Image prev();
    byte[] bitmap();
    
}
