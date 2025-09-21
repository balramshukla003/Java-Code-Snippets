import java.awt.*;
import java.applet.*;
//<applet code="MyApplet" width=200 height=300> </applet>
public class MyApplet extends Applet {

    public void init() {
        System.out.println("Init Initiliazed");
        setBackground(Color.pink);
        //setForeground(Color.black);
    }

    public void start() {
        System.out.println("Applet Started");
    }

    public void paint(Graphics g) {
        System.out.println("Paint Initiiazed");

        g.setColor(Color.red);
        g.fillRect(50, 170, 480, 80);
        g.setColor(Color.BLACK);
        g.drawRect(50, 170, 480, 80);

        g.setColor(Color.WHITE);
        g.fillRect(50, 250, 480, 80);
        g.setColor(Color.BLACK);
        g.drawRect(50, 250, 480, 80);
        g.setColor(Color.blue);
        g.drawOval(250, 250, 80, 80);
        {
            //first line
            g.drawLine(290, 290, 290, 250);
            g.drawLine(290, 290, 296, 256);
            g.drawLine(290, 290, 306, 266);
            g.drawLine(290, 290, 314, 274);
            g.drawLine(290, 290, 322, 282);

            //second line
            g.drawLine(290, 290, 330, 290);

            //third line
            g.drawLine(290, 290, 290, 330);

            //fourth line
            g.drawLine(290, 290, 250, 290);
        }
        g.setColor(Color.green);
        g.fillRect(50, 330, 480, 80);
        g.setColor(Color.BLACK);
        g.drawRect(50, 330, 480, 80);

        g.setColor(Color.black);
        g.fillRect(45, 162, 5, 700);

        g.fillOval(39, 145, 15, 18);

        g.setColor(Color.gray);
        g.fillOval(0, 860, 100, 20);


        //g.drawLine(290,290,345,305);

       /* int a1=290;
        int a2=290;
        int b1=250;
        int b2=330;
        for(int i=0;i<24;i++) {
            g.drawLine(a1,b1,a2,b2);
            a1+=2;
            a2+=2;

        }*/
    }

    public void stop() {
        System.out.println("Applet Stopped");
    }

    public void destroy() {
        System.out.println("Applet Destroyed");
    }

    public static void main(String[] args) {
        MyApplet MA = new MyApplet();
    }

}
