import javax.swing.*;

public class Test {
    public static void main(String args[]){
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
        }


        Login f=new Login();
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setVisible(true);
    }
}
