package javaappgui02;

import java.awt.*;
import javax.swing.*;


public class MainFrame extends JFrame{
   
    JLabel jl1, jl2;
    JTextField tf1, tf2;
    JList listSports;
    JRadioButton jrb1, jrb2;
    JLabel jl3, jl4;
    JCheckBox cb1, cb2, cb3, cb4;
    JButton b1, b2, b3;
    
    
    
    MainFrame(){
        super();
        
        createGUI();    // Καλω αυτη την μεθοδο.
    }
    
    MainFrame(String t){
        super(t);
        
        createGUI();
    }
    
    private void createGUI(){
        setSize(500, 300);
        // Με αυτο \/ οταν παταω το x για να κλεισει το παραθυρο της εφαρμογης, κλεινει πραγματικα και σταματα να τρεχει.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        // Δημιουργώ τα αντικείμενα που θα προσθέσω στο Frame.
        JPanel upLeftP = new JPanel();
        upLeftP.setLayout(new GridLayout(2,2));
        
        jl1 = new JLabel("Ετικέτα 1");
        jl2 = new JLabel("Ετικέτα 2");
        tf1 = new JTextField(12);
        tf2 = new JTextField(12);
        
        upLeftP.add(jl1);
        upLeftP.add(tf1);
        upLeftP.add(jl2);
        upLeftP.add(tf2);
        
/**************/
        
        // με το string ειναι λαθος τροπος δημιοουργιας λιστας
        //String[] dm = {"Τρέξιμο", "Τρέξιμο", "Τρέξιμο", "Ποδηλασία"};
        DefaultListModel dlm = new DefaultListModel();
        dlm.addElement("Κολύμβηση");
        dlm.addElement("Άλμα εις μήκος");
        dlm.addElement("Ποδηλασία");
        dlm.addElement("Τρέξιμο");
        dlm.addElement("Πιλατες");
        dlm.addElement("Μπαλετο");
        dlm.addElement("Αναρηχηση");
        dlm.addElement("Παλη");
        dlm.addElement("Break-dance");
        dlm.addElement("Kick-box");
        dlm.addElement("Rollerblades");
        dlm.addElement("Καρατε");
        dlm.addElement("Car racing");
        listSports = new JList(dlm);
        listSports.setLayoutOrientation(JList.VERTICAL);
        listSports.setVisibleRowCount(4);
        ScrollPane sp = new ScrollPane();
        sp.add(listSports);
        
/**************/
        
        JPanel fyloP = new JPanel();
        fyloP.setLayout(new GridLayout(2,2));
        
        jl3 = new JLabel("Φύλο");
        jrb1 = new JRadioButton("Άντρας");
        jrb2 = new JRadioButton("Γυναίκα");
        
        // Δημιουργο ενα ButtonGroup κια προσθετω σε αυτο τα δυο JRadioButton
        // ωστε οταν παταω το ενα το αλλο παβει να ειναι επιλεγμενο. Αρα μπορω ναδιαλεξω μονο ενα.
        ButtonGroup bg = new ButtonGroup();
        bg.add(jrb1);
        bg.add(jrb2);
        jrb2.setSelected(true);
        
        fyloP.add(jl3);
        fyloP.add(jrb1);
        fyloP.add(new JLabel(""));
        fyloP.add(jrb2);
        
/**************/
        JPanel glwssaP = new JPanel();
        glwssaP.setLayout(new GridLayout(4,2));
        
        jl4 = new JLabel("Γλώσσα Πρ/σμού: ");
        
        cb1 = new JCheckBox("Java");
        cb2 = new JCheckBox("Python");
        cb3 = new JCheckBox("C++");
        cb4 = new JCheckBox("PHP");
        
        
        glwssaP.add(jl4);
        glwssaP.add(cb1);
        glwssaP.add(new JLabel(""));
        glwssaP.add(cb2);
        glwssaP.add(new JLabel(""));
        glwssaP.add(cb3);
        glwssaP.add(new JLabel(""));
        glwssaP.add(cb4);
        
/**************/        
        //Δημιουργησε ενα JPanel και εφαρμοσε του gridLayout με
        // 3ις στηλες κια βαλε οανω του κουμπια.
        JPanel downButtonP = new JPanel();
        downButtonP.setLayout(new GridLayout(1,3));
        
        b1 = new JButton("Φύλο");
        b2 = new JButton("Γλώσσα");
        b3 = new JButton("Κλείσιμο");
        downButtonP.add(b1);
        downButtonP.add(b2);
        downButtonP.add(b3);

        
        
/***********************************/
                
        // Τα προσθέτω.
        c.insets = new Insets(5, 5, 5, 5);  // Αφηνει αποσταση 5 pixels γυρο του (πανω, αριστερα, κατω, δεξια).
        c.anchor = GridBagConstraints.LINE_START;
        c.fill = GridBagConstraints.BOTH;

        // panel for textfield
        c.gridx = 0;
        c.gridy = 0;
        c.gridheight = 2;
        add(upLeftP, c);
        
        // panel for list
        c.gridx = 1;
        c.gridy = 0;
        c.gridheight = 2;
        add(sp, c);
        
        // panel for radio-buttons
        c.gridx = 0;
        c.gridy = 2;
        c.gridheight = 2;
        add(fyloP, c);
        
        // panel for checkbox
        c.gridx = 1;
        c.gridy = 2;
        c.gridheight = 2;
        add(glwssaP, c);

        // panel for buttons (we added it on top of the frame basically)
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 3;
        c.gridheight = 2;
        add(downButtonP, c);
        
        //pack();
    }
    
    
    
/********************************************************************************/    
/*************  Η αρχικη GUI που φτιαξαμε   ****************************************************/    
/************************************************************************************/
    
    private void createGUIOld(){
        setSize(300, 300);
        // Με αυτο \/ οταν παταω το x για να κλεισει το παραθυρο της εφαρμογης, κλεινει πραγματικα και σταματα να τρεχει.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        // Δημιουργώ τα αντικείμενα που θα προσθέσω στο Frame.
        jl1 = new JLabel("Ετικέτα 1");
        jl2 = new JLabel("Ετικέτα 2");
        tf1 = new JTextField(12);
        tf2 = new JTextField(12);
        
/**************/
        
        String[] dm = {"Κολύμβηση", "Τρέξιμο", "Άλμα εις μήκος", "Ποδηλασία"};
        listSports = new JList(dm);
        
/**************/
        
        jl3 = new JLabel("Φύλο");
        jrb1 = new JRadioButton("Άντρας");
        jrb2 = new JRadioButton("Γυναίκα");
        // Δημιουργο ενα ButtonGroup κια προσθετω σε αυτο τα δυο JRadioButton
        // ωστε οταν παταω το ενα το αλλο παβει να ειναι επιλεγμενο. Αρα μπορω ναδιαλεξω μονο ενα.
        ButtonGroup bg = new ButtonGroup();
        bg.add(jrb1);
        bg.add(jrb2);
        jrb2.setSelected(true);
        
/**************/
        
        jl4 = new JLabel("Γλώσσα Πρ/σμού: ");
        
        cb1 = new JCheckBox("Java");
        cb2 = new JCheckBox("Python");
        cb3 = new JCheckBox("C++");
        
        //Δημιουργησε ενα JPanel και εφαρμοσε του gridLayout με
        // 3ις στηλες κια βαλε οανω του κουμπια.
        JPanel downButtonP = new JPanel();
        downButtonP.setLayout(new GridLayout(1,3));
        b1 = new JButton("Φύλο");
        b2 = new JButton("Γλώσσα");
        b3 = new JButton("Κλείσιμο");
        downButtonP.add(b1);
        downButtonP.add(b2);
        downButtonP.add(b3);

        
/***********************************/
                
        // Τα προσθέτω.
        c.insets = new Insets(5, 5, 5, 5);  // Αφηνει αποσταση 5 pixels γυρο του (πανω, αριστερα, κατω, δεξια).
        c.anchor = GridBagConstraints.LINE_START;
        
        //textfield
        c.gridx = 0;
        c.gridy = 0;
        add(jl1, c);
        
        c.gridx = 0;
        c.gridy = 1;
        add(jl2, c);
        
        c.gridx = 1;
        c.gridy = 0;
        add(tf1, c);
        
        c.gridx = 1;
        c.gridy = 1;
        add(tf2, c);

        //list
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 2;
        c.gridheight = 3;
        c.fill = GridBagConstraints.BOTH;
        add(listSports, c);
        
        //radio-button
        c.gridx = 0;
        c.gridy = 5;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.fill = GridBagConstraints.BOTH;
        add(jl3, c);

        c.gridx = 1;
        c.gridy = 5;
        add(jrb1, c);
        
        c.gridx = 1;
        c.gridy = 6;
        add(jrb2, c);
        
        //checkbox
        c.gridx = 0;
        c.gridy = 7;
        add(jl4, c);
        
        c.gridx = 1;
        c.gridy = 7;
        add(cb1, c);
                
        c.gridx = 1;
        c.gridy = 8;
        add(cb2, c);
                
        c.gridx = 1;
        c.gridy = 9;
        add(cb3, c);

        //panel (we added it on topof the frame basically)
        c.gridx = 0;
        c.gridy = 10;
        c.gridwidth = 2;
        add(downButtonP, c);
        
    }
    
}
