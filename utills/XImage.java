
package com.mycompany.utills;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;


public class XImage {
    public static Image getAppIcon() {
        URL url = XImage.class.getResource("/com/mycompany/icon/bieutuong.jpg");
        return new ImageIcon(url).getImage();
    }
}
