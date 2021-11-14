import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Football extends JFrame {

    int score1 = 0, score2 = 0;
    JButton button1 = new JButton("AC Milan");
    JButton button2 = new JButton("Real Madrid");
    JLabel lbl1 = new JLabel("Result : 0 x 0");
    JLabel lbl2 = new JLabel("Last Scorer: N/A");
    JLabel lbl3 = new JLabel("Winner: DRAW");
    JPanel[] pn1 = new JPanel[3];

    Football(){
        super("Football");
        setSize(300, 200);
        setResizable(false);

        setLayout(new GridLayout(3, 0));

        for (int i = 0; i < pn1.length; i++){
            pn1[i] = new JPanel();
            add(pn1[i]);
        }

        pn1[0].add(button1);
        pn1[0].add(new JLabel("VC"));
        pn1[0].add(button2);
        pn1[1].add(lbl1);
        pn1[2].add(lbl2);
        pn1[2].add(lbl3);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                score1++;
                lbl1.setText("Result : " + score1 + " x " + score2);
                lbl2.setText("Last Scorer: " + button1.getText());
                if(score1 > score2) lbl3.setText("Winner: " + button1.getText());
                if (score1 == score2) lbl3.setText("Winner: DRAW");
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                score2++;
                lbl1.setText("Result : " + score1 + " x " + score2);
                lbl2.setText("Last Scorer: " + button2.getText());
                if(score1 < score2) lbl3.setText("Winner: " + button2.getText());
                if (score1 == score2) lbl3.setText("Winner: DRAW");
            }
        });

    }

    public static void main(String[] args) {
        new Football().setVisible(true);
    }
}