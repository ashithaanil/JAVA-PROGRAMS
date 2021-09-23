import java.awt.*;
import java.applet.*;
/*
<applet code="appletskel" width=300 height=100>
</applet>
*/
public class appletskel extends Applet
{
public void init()
{
setBackground(Color.yellow);
setForeground(Color.red);
}
public void start()
{
}
public void stop()
{
}
public void destroy()
{
}
public void paint(Graphics g)
{
g.drawString("hello world",100,200);
}
}