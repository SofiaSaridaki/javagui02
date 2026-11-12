package javaappgui02;


public class JavaAppGUI02 {
    
    public static void main(String[] args) {
        MainFrame mf = new MainFrame("Η Εφαρμογή μου!");
        mf.setVisible(true);
        mf.setResizable(false);
        
        PictureFrame pf = new PictureFrame("Το γουρούνι!");
        pf.setVisible(true);
        pf.setResizable(false);
        
        
        System.out.println(System.getProperty("user.dir"));
    
    }
    
}
