package Principal;

import View.TelaInicial;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JOptionPane;


public class Principal {
    public static void main(String[] args) {
        try{
            FlatLightLaf.setup();
        }catch(Exception e){
        }
        
        String option[] = {"Dark mode", "Light mode"};
        
        int n = JOptionPane.showOptionDialog(null, "Escolha um tema", "Calculadora", JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, null, option, option[0]);
        
        switch(n){
            case 0:
                java.awt.EventQueue.invokeLater(() -> {
                    try{
                        FlatDarkLaf.setup();
                    }catch(Exception e){
                    }
                    new TelaInicial().setVisible(true);
                });
                break;
                
            case 1:
                java.awt.EventQueue.invokeLater(() -> {
                    try{
                        FlatLightLaf.setup();
                    }catch(Exception e){
                    }
                    new TelaInicial().setVisible(true);
                });
                    break;
        }
    }  
}

