package pruebadesktop;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class PruebaDesktop {

    public static void main(String[] args) {
        try {
            URI uri = new URI("http://www.java2s.com");
            Desktop desktop = null;
            if (Desktop.isDesktopSupported()) {
                desktop = Desktop.getDesktop();
            }

            if (desktop != null) {
                desktop.browse(uri);
            }
            
        } catch (IOException | URISyntaxException ioe) {
        }
    }   
    
}
    
