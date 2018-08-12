package Login;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Variable{
       static public Object curr;
       static public Object prev;
       static public ArrayList<A> data = new ArrayList<>();
       static public int accN = 1000;
       
       static public A check(int acc,String p){
           System.out.println(acc + " " + p);
           A temp;
           for(int i = 0;i<data.size();i++){
               temp = data.get(i);
               System.out.println(temp.accNum+" "+temp.password);
               if(temp.accNum==acc){
                   if(temp.password.matches(p)){
                       return temp;
                   }
               }
           }
           return null;
       }
       
       static public void save() throws FileNotFoundException, IOException{
           FileOutputStream nw = new FileOutputStream("Database.txt");
           ObjectOutputStream onw = new ObjectOutputStream(nw);
           onw.writeObject(data);
           onw.writeObject(Variable.accN);
           nw.close();
       } 
       static public void read() throws FileNotFoundException, IOException, ClassNotFoundException{
           FileInputStream nw = new FileInputStream("Database.txt");
           ObjectInputStream onw = new ObjectInputStream(nw);
           data = (ArrayList<A>) onw.readObject();
           System.out.println(data.size());
           Variable.accN = (int)onw.readObject();
           nw.close();
       } 
}
