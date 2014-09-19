import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class main extends Applet implements ActionListener {
        Button check;
        TextField height,weight,result;
        Label l1,l2,l3,not;
        public void init()
        {
            setLayout(new GridLayout(4,4));
            check = new Button("Check");
            height = new TextField();
            weight = new TextField();
            result = new TextField();
            l1 = new Label("Height in Centimeters ");
            l2 = new Label("Weight in Kilogram");
            l3 = new Label("Index Value");
            not=new Label("Status");
            not.setBackground(Color.black);
            Font notf = new Font("Arial",Font.BOLD,30);
            not.setFont(notf);
            add(l1);
            add(height);
            add(l2);
            add(weight);
            add(l3);
            add(result);
            add(check);
            add(not);
            check.addActionListener(this);
        }
        public void actionPerformed(ActionEvent ae)
        {
            String s=ae.getActionCommand();
            double we,h;
            double r;
            we=Integer.parseInt(weight.getText());
            h=Integer.parseInt(height.getText());
            h=(h/100);h=h*h;
            r = we/h;
            result.setText(String.valueOf(r));
            if(r<18.5)
            {
                not.setForeground(Color.YELLOW);
                not.setText(String.valueOf("UnderWeight"));
            }
            if(r>=18.5&&r<24.9)
            {
                 not.setForeground(Color.GREEN);
                not.setText(String.valueOf("Normal"));
            }
            if(r>25&&r<29.9)
            {
                not.setForeground(Color.ORANGE);
                not.setText(String.valueOf("Overweight"));
            }
            if(r>=30)
            {
                not.setForeground(Color.RED);
                not.setText(String.valueOf("Obese"));
            }
            repaint();
        }
        public void paint(Graphics g)
        {
            
        }
}
