package ch11_proxy.ex03_virtual_proxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageProxy implements Icon {
    final URL url;

    volatile ImageIcon imageIcon;
    Thread thread;
    boolean retrieving = false;

    public ImageProxy(URL url) {
        this.url = url;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if (imageIcon != null) {
            imageIcon.paintIcon(c, g, x, y);
        } else {
            g.drawString("Loading Album Cover, Please Wait...", x + 300, y + 190);

            if (!retrieving) {
                retrieving = true;

                thread = new Thread(() -> {
                    try {
                        setImageIcon(new ImageIcon(url, "Album Cover"));
                        c.repaint();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });

                thread.start();
            }
        }
    }

    @Override
    public int getIconWidth() {
        if (imageIcon != null)
            return imageIcon.getIconWidth();
        else
            return 600;
    }

    @Override
    public int getIconHeight() {
        if (imageIcon != null)
            return imageIcon.getIconHeight();
        else
            return 600;
    }

    synchronized void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }
}
