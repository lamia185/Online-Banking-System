package Login;

import static java.awt.image.ImageObserver.WIDTH;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class User implements Serializable {
    public String name;
    public String contact;
    public String email;
    public String password;
    private double balance = 0.0;
    private double loan = 0.0;
    public String lastDr;
    public String lastCr;
    public String lastLo;
    public int accNum;
    public User(String n,String c,String e, String p,int acc){
        this.name = n;
        this.contact = c;
        this.email = c;
        this.password = p;
        this.accNum = acc;
    }
    public void debit(double n){
        this.balance+=n;
        lastDr = Double.toString(n);
    }
    public void loan(double n){
        this.loan+=n;
        lastLo = Double.toString(n);
    }
    public boolean topUpcr(double n){
        if(n<=this.balance){
            this.balance-=n;
            lastCr = Double.toString(n);
            return true;
        }
        return false;
    }
    ImageIcon nw2 = new ImageIcon("Minus_icon1.png");
    public void credit(double n){
        if(n<=this.balance){
            this.balance-=n;
            lastCr = Double.toString(n);
            try {
                Variable.save();
            } catch (IOException ex) {
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            }
            String s = Double.toString(n);
            JOptionPane.showMessageDialog(null, "You Withdraw: "+s+"$", "Done", WIDTH, nw2);
        }
        else{
            JOptionPane.showMessageDialog(null, "Insufficient balance");
        }
    }
    public double balCh(){
        return this.balance;
    }
}

class A extends User{
    public A (String n,String c,String e, String p,int acc){
        super(n,c,e,p,acc);
    }
}
