import java.awt.Font;
import java.awt.Graphics;
import java.awt.FontMetrics;

public class Centered extends java.applet.Applet {

public void paint(Graphics g) {
Font f = new Font("TimesRoman", Font.PLAIN, 36);
FontMetrics fm = getFontMetrics(f);
g.setFont(f);

String s = "This is how the world ends.";
int xstart = (this.size().width - fm.stringWidth(s)) / 2;
int ystart = (this.size().height - fm.getHeight()) / 2;

 g.drawString(s, xstart, ystart);
 }
}