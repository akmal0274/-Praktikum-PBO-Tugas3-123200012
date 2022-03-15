/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

import javax.swing.*;

/**
 *
 * @author user
 */
public class GUI extends JFrame{
    JLabel luname = new JLabel("Username: "); 
    JTextField funame = new JTextField (15);
    JLabel lpass = new JLabel("Password: ");
    JPasswordField fpass = new JPasswordField(15);
    JButton blogin = new JButton("Login");
    JButton bcancel = new JButton("Cancel");
    
    public GUI() {
       setTitle("Login");
       setSize(200, 150);
       
       setLayout(null);
       
       add(luname);
       add(funame);
       add(lpass);
       add(fpass);
       add(blogin);
       add(bcancel);
       
       luname.setBounds(10, 10, 80, 20);
       funame.setBounds(90, 10, 90, 20);
       lpass.setBounds(10, 40, 80, 20);
       fpass.setBounds(90, 40, 90, 20);
       blogin.setBounds(10, 70, 80, 20);
       bcancel.setBounds(100, 70, 80, 20);
       
       setVisible(true);
    }
    
}
