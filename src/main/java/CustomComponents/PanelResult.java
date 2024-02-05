package CustomComponents;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PanelResult extends JPanel {

    private String pathImage;
    private Color bgColor;
    private String opName;
    private String result;
    private PanelRound pnlMain;

    public void setData(String pathImage, Color bgColor, String opName, String result) {
        this.pathImage = pathImage;
        this.bgColor = bgColor;
        this.opName = opName;
        this.result = result;

        initComponents();
    }

    private void initComponents() {
        this.removeAll();
        this.setLayout(new GridLayout(1, 1));
        this.setOpaque(false);
        pnlMain = new PanelRound();
        pnlMain.setBorder(new EmptyBorder(5, 5, 5, 5));
        pnlMain.setRoundBottomLeft(15);
        pnlMain.setRoundBottomRight(15);
        pnlMain.setRoundTopLeft(15);
        pnlMain.setRoundTopRight(15);

        pnlMain.setLayout(new BorderLayout(5, 0));
        pnlMain.add(new JLabel(new ImageIcon(pathImage)), BorderLayout.WEST);
        pnlMain.setBackground(bgColor);

        JPanel pnl = new JPanel();
        pnl.setOpaque(false);
        pnl.setLayout(new BorderLayout(10, 10));

        JLabel lblOperation = new JLabel();
        lblOperation.setFont(new Font("Roboto Mono", Font.BOLD, 18));
        lblOperation.setText(opName);

        JLabel lblResult = new JLabel();
        lblResult.setFont(new Font("Roboto Mono", Font.PLAIN, 16));
        lblResult.setText(result);

        pnl.add(lblOperation, BorderLayout.NORTH);
        pnl.add(lblResult, BorderLayout.CENTER);
        pnlMain.add(pnl, BorderLayout.CENTER);

        this.add(pnlMain);

    }
}
