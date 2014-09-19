import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class main extends Applet implements ActionListener {
        Button check;
        TextField height,weight,result;
        Label l1,l2,l3;
        public void init()
        {
            setLayout(new GridLayout(4,4));
            check = new Button("Check");
            height = new TextField();
            weight = new TextField();
            result = new TextField();
            l1 = new Label("Height in Centimeters ");
            l2 = new Label("Weight in Kilogram");
            l3 = new Label("Result");
            add(l1);
            add(height);
                     add(l2);
                     add(weight);
                        add(l3);
add(result);
               add(check);

            check.addActionListener(this);
        }
        public void actionPerformed(ActionEvent ae)
        {
            String s=ae.getActionCommand();
            int w,h,r;
            h=Integer.parseInt(height.getText());
            w=Integer.parseInt(weight.getText());
            h=h/100;
            r = (w/h);
            result.setText(String.valueOf(r));
            repaint();
        }
        public void paint(Graphics g)
        {
            
        }
}
