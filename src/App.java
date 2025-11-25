import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) throws Exception {

        JFrame fenetre = new JFrame("Calculatrice");
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setSize(300,390);
        fenetre.setLocationRelativeTo(null);

        JMenuBar barreMenu = new JMenuBar();
        JMenu mAffichage = new JMenu("Affichage");
        JMenu mEdition = new JMenu("Edition");
        JMenu mAide = new JMenu("?");

        barreMenu.add(mAffichage);
        barreMenu.add(mEdition);
        barreMenu.add(mAide);

        fenetre.setJMenuBar(barreMenu);

        JPanel panneau = new JPanel();
        panneau.setLayout(new BoxLayout(panneau, BoxLayout.PAGE_AXIS));
        fenetre.setContentPane(panneau);

        
        JPanel pEcran = new JPanel(new BorderLayout());
        pEcran.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); 
        

        JTextField ecran = new JTextField("0");
        ecran.setHorizontalAlignment(JTextField.RIGHT);
        ecran.setEditable(false);
        ecran.setPreferredSize(new Dimension(250, 50));   

        pEcran.add(ecran, BorderLayout.CENTER);
        panneau.add(pEcran);

        JPanel pBoutons = new JPanel();
        pBoutons.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        pBoutons.setLayout(new BoxLayout(pBoutons, BoxLayout.PAGE_AXIS));
        panneau.add(pBoutons);

        int hGep = 3, vGep = 3;

        JPanel l1 = new JPanel(new GridLayout(1,5,hGep,vGep));
        l1.add(new JButton("MC"));
        l1.add(new JButton("MR"));  
        l1.add(new JButton("MS"));
        l1.add(new JButton("M+"));
        l1.add(new JButton("M-"));
        pBoutons.add(l1);
        pBoutons.add(Box.createRigidArea(new Dimension(0, vGep)));

        JPanel l2 = new JPanel(new GridLayout(1,5,hGep,vGep));
        l2.add(new JButton("←"));
        l2.add(new JButton("CE"));
        l2.add(new JButton("C"));   
        l2.add(new JButton("±"));
        l2.add(new JButton("√"));
        pBoutons.add(l2);
        pBoutons.add(Box.createRigidArea(new Dimension(0, vGep)));

        JPanel l3 = new JPanel(new GridLayout(1,5,hGep,vGep));
        l3.add(new JButton("7"));
        l3.add(new JButton("8"));
        l3.add(new JButton("9"));
        l3.add(new JButton("/"));
        l3.add(new JButton("%"));
        pBoutons.add(l3);
        pBoutons.add(Box.createRigidArea(new Dimension(0, vGep)));

        JPanel l4 = new JPanel(new GridLayout(1,5,hGep,vGep));
        l4.add(new JButton("4"));
        l4.add(new JButton("5"));
        l4.add(new JButton("6"));
        l4.add(new JButton("*"));
        l4.add(new JButton("1/x"));
        pBoutons.add(l4);
        pBoutons.add(Box.createRigidArea(new Dimension(0, vGep)));

        JPanel blockBas = new JPanel();
        blockBas.setLayout(new BoxLayout(blockBas, BoxLayout.LINE_AXIS));
        pBoutons.add(blockBas);

        JPanel blockGauche = new JPanel();
        blockGauche.setLayout(new BoxLayout(blockGauche, BoxLayout.PAGE_AXIS));
        blockBas.add(blockGauche);

        JPanel hautGauche = new JPanel();
        hautGauche.setLayout(new GridLayout(1,2,hGep,vGep));    
        hautGauche.add(new JButton("1"));
        hautGauche.add(new JButton("2"));
        blockGauche.add(hautGauche);
        blockGauche.add(Box.createRigidArea(new Dimension(0, vGep)));

        JPanel basGauche = new JPanel(new GridLayout(1,1,hGep,vGep));
        basGauche.add(new JButton("0"));
        blockGauche.add(basGauche);

        blockBas.add(Box.createRigidArea(new Dimension(hGep,0)));

        JPanel blockMilieu = new JPanel(new GridLayout(2,2,hGep,vGep));
        blockMilieu.add(new JButton("3"));
        blockMilieu.add(new JButton("-"));
        blockMilieu.add(new JButton(","));
        blockMilieu.add(new JButton("+"));
        blockBas.add(blockMilieu);

        blockBas.add(Box.createRigidArea(new Dimension(hGep,0)));

        JPanel blockDroite = new JPanel(new GridLayout());
        JButton boutonEgal = new JButton("=");
        blockDroite.add(boutonEgal);
        blockBas.add(blockDroite);

        fenetre.setVisible(true);

    }
}
