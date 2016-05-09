
package hms;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


/* @author Shankaja
 */
public class CommonLoginPage {
    private static Font normalFont = new Font("Canadra", Font.BOLD, 22);
    private static Font topicFont = new Font("Gulim", Font.BOLD, 50);
    private static final ImageIcon loginPgImg = new ImageIcon("C:\\Users\\Admin\\Desktop\\Login.png");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //JFrame
        final JFrame jf = CommonLoginPage.buildWindow(0.5F);
        
        //Topic
        buildLabel(jf,"iFine Hospital Management System",jf.getWidth()/4,jf.getHeight()/20,1000,70,topicFont);
        
        //user name label
        buildLabel(jf,"User Name",2*jf.getWidth()/3,jf.getHeight()/2-jf.getHeight()/6,115,50,normalFont);
        ////password label
        buildLabel(jf,"Password",2*jf.getWidth()/3,jf.getHeight()/2-jf.getHeight()/10,110,50,normalFont);
        
        //username txt field
        final JTextField userName = buildTxtField(jf,3*jf.getWidth()/4,jf.getHeight()/2-jf.getHeight()/6,300,50);
        
        //password field
        final JPasswordField password = buildPwdField(jf,3*jf.getWidth()/4,jf.getHeight()/2-jf.getHeight()/10,300,50);
        
        //login button
        JButton loginBtn = buildButton("Login", jf, jf.getWidth()-300,jf.getHeight()/2, 120, 60);
        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //data in two text fields should go here
                String uName = userName.getText();
                String pWord = password.getText();
                        System.out.print(uName+" "+pWord);              //Checking case
                        jf.dispose();
                ;}});
        
        //Exit button
        JButton closeBtn = buildButton("Exit", jf, jf.getWidth()-140,jf.getHeight()-80, 120, 60);
        closeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {jf.dispose();}});
      
        //picture
        JLabel pic = buildLabel(jf,"",0,0,jf.getWidth(),jf.getHeight(),topicFont);
        pic.setIcon(loginPgImg);
        pic.setOpaque(false);
       
    }
    
    
    private static JPasswordField buildPwdField(JFrame frame,int x, int y,int w, int h){ //JPassword
        JPasswordField txt = new JPasswordField(20);
        txt.setLayout(null);
        txt.setBounds(x, y, w, h);
        txt.setFont(new Font("Calibri", Font.PLAIN, 24));
        txt.setForeground(Color.blue);
        txt.setBackground(Color.LIGHT_GRAY);
        txt.setOpaque(true);
        txt.setLayout(null);
        frame.add(txt);
        //adding key listner
        txt.addKeyListener(new KeyListener(){
            private Object loginBtn;
            @Override
            public void keyTyped(KeyEvent e) {
                if(e.getKeyChar()==KeyEvent.VK_ENTER){
                    //The same logic of logic button
                    System.exit(0);
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //Do Nothing
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //Do Nothing
            }

    });
        return txt;
    }
   
    private static JTextField buildTxtField(JFrame frame,int x, int y,int w, int h){ //JTxt
        JTextField txt = new JTextField();
        txt.setLayout(null);
        txt.setBounds(x, y, w, h);
        txt.setFont(new Font("Calibri", Font.BOLD, 20));
        txt.setForeground(Color.blue);
        txt.setBackground(Color.LIGHT_GRAY);
        txt.setOpaque(true);
        txt.setLayout(null);
        frame.add(txt);
        return txt;
    }
    
    
    private static JLabel buildLabel(JFrame frame,String txt,int x, int y,int w, int h,Font f){ //JLabel
        JLabel lbl = new JLabel();
        lbl.setText(txt);
        lbl.setBounds(x, y, w, h);
        lbl.setForeground(Color.cyan);
        lbl.setFont(f);
        lbl.setOpaque(false);
        frame.add(lbl);
        return lbl;
    }
    
    
    private static JButton buildButton(String btnName,JFrame frame,int x, int y,int w, int h){ //placing buttons
        JButton btn = new JButton(btnName);
        btn.setLayout(null);
        btn.setBorderPainted(true);
        frame.add(btn);
        btn.setLocation(x, y);
        btn.setSize(w,h);
        btn.setOpaque(true);
        btn.setBackground(Color.black);
        btn.setForeground(Color.gray);
        btn.setFont(new Font("Canadra", Font.ROMAN_BASELINE, 25));
       return btn;
    }
    
   
    
    
    private static JFrame buildWindow(Float opacity){                                          //building the JFrame
        JFrame frame = new JFrame();
        frame.setUndecorated(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.black);   
        frame.setLayout(null);
        frame.setOpacity(opacity);
        frame.setVisible(true);
        return frame;
    }
}
