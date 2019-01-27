package chatbot;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ChatBotWindow extends javax.swing.JFrame implements KeyListener {

    private final Logic logic = new Logic();
    private final JPanel p=new JPanel();
    private final JTextArea dialog=new JTextArea(25,33);
    private final JTextArea input=new JTextArea(1,34);
    private final JScrollPane scroll=new JScrollPane(
        dialog,
        JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
        JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
    );
    private String quote;
    
    public ChatBotWindow() {
        //Tytuł okna.
        super("Jędrzej - pomocnik przy rezerwacji!");
        //Rozmiar okna.
        setSize(450,550);
        //Blokada zmiany rozmiaru okna.
        setResizable(false);
        //Domyślna akcja zamknięcia okna.
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Zablokowanie edycji pola tekstowego, w którym wyświetlany będzie
        //dialog.
        dialog.setEditable(false);
        //Dodanie nasłuchiwacza klawiatury.
        input.addKeyListener(this);
        addText("Witaj! Jeżeli będziesz miał jakieś pytania to zapraszam.\n");
        addText("Chętnie udzielę Ci informacji na temat rezerwacji online.\n\n");
        //Utworzenie animacji chatbota w postaci etykiety z przypisaną ikoną.
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass()
                        .getResource("/chatbot/emotions/1.png")));
        
        //Dodanie elementów chatbota do okna dialogowego.
        p.add(jLabel1);
        p.add(scroll);
        p.add(input);
        //Zmiana koloru tła okna.
        p.setBackground(new Color(255,200,0));
        add(p);

        //Ustawienie flagi widoczności okna chatbota.
        setVisible(true);
    }
    
    @Override
    public void keyPressed(KeyEvent e)
    {
        //Zmiana animacji chatbota w trakcie, gdy użytkownik coś wpisuje.
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass()
                        .getResource("/chatbot/emotions/2.png")));
        //Oczekiwanie na wciśnięcie klawisza ENTER.
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
        {
            //Zablokowanie flagi edycji, w trakcie, gdy zostaje pobrana fraza
            //wpisana przez użytkownika.
            input.setEditable(false);
            //Pobranie wpisanej frazy przez użytkownika i przypisanie jej do
            //zmiennej quote.
            quote = input.getText();
            //Wyczyszczenie miejsca wpisywania tekstu przez użytkownika.
            input.setText("");
            //Dodanie tekstu do okna dialogowego, z formatowaniem.
            addText("-->Ty:\t"+quote);
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass()
                        .getResource("/chatbot/emotions/1.png")));
        }
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        //Oczekiwanie na wciśnięcie klawisza ENTER.
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
        {
            //Dodanie odpowiedzi 
            addText(logic.Answer(quote));
            //Odczekanie 2 sekund, efekt myślenia nad odpowiedzią
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ChatBotWindow.class.getName()).
                                    log(Level.SEVERE, null, ex);
            }
            addText("\n");
            //Zmiana animacji chatbota, w zależności od odpowiedzi chatbota.
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass()
                        .getResource("/chatbot/emotions/"
                                + logic.getResponse() + ".png")));
            //Odblokowanie flagi edycji, gdy klawisz ENTER został pu 
            input.setEditable(true);
        }
    }
    
    @Override
    public void keyTyped(KeyEvent e)
    {
    }

    //Metoda realizująca dodanie tekstu do okna dialogowego.
    public void addText(String str)
    {
        dialog.setText(dialog.getText()+str);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(240, 240, 0));
        setMaximumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chatbot/emotions/2.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(480, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(364, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(116, 116, 116))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatBotWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ChatBotWindow().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
