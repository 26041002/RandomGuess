package k.randomguess;
 import javax.swing.JOptionPane;
public class RandomGuess{
    public static void main(String[] args){
        
        JOptionPane.showInputDialog(null,"Think of a number between 1 and 10");
        int randomnumber= 1+(int)(Math.random()* 10);
        JOptionPane.showMessageDialog(null,"The number is "+randomnumber);
        
        
        
    }
}
