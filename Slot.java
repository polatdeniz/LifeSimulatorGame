import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Slot extends javax.swing.JFrame {

  
	private static final long serialVersionUID = 1L;

    public Slot() {
        initComponents();
    }
                       
    private void initComponents() {

        SlotFirstImageLabel = new javax.swing.JLabel();
        SlotSecondImageLabel = new javax.swing.JLabel();
        SlotThirdImageLabel = new javax.swing.JLabel();
        SlotMoneyAmountLabel = new javax.swing.JLabel();
        SlotRollButton = new javax.swing.JButton();
        SlotRollPriceLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        
        SlotFirstImageLabel.setBorder(new javax.swing.border.MatteBorder(null));

        
        SlotSecondImageLabel.setBorder(new javax.swing.border.MatteBorder(null));

        
        SlotThirdImageLabel.setBorder(new javax.swing.border.MatteBorder(null));

        SlotMoneyAmountLabel.setText("Money: " + money + "$");

        SlotRollButton.setText("ROLL");
        SlotRollButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SlotRollButtonActionPerformed(evt);
            }
        });

        SlotRollPriceLabel.setText("Roll Price 500$");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SlotMoneyAmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SlotRollPriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(SlotFirstImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SlotSecondImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SlotThirdImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(SlotRollButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SlotFirstImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SlotSecondImageLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SlotThirdImageLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SlotRollButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SlotMoneyAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SlotRollPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 256, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        pack();
    }                     

    private void SlotRollButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        
    	if(money >= 500) {
    	
	        money -= 500;
	        
	        int firstLabelRandom = (int) (Math.random()*11+1);
	        
	        SlotFirstImageLabel.setIcon(new ImageIcon(("C:\\Users\\deniz\\OneDrive\\Masaüstü\\mini games\\slot\\"+firstLabelRandom+".png")));
	        
	        
	        
	        int secondLabelRandom = (int) (Math.random()*11+1);
	        
	        SlotSecondImageLabel.setIcon(new ImageIcon(("C:\\Users\\deniz\\OneDrive\\Masaüstü\\mini games\\slot\\"+secondLabelRandom+".png")));
	        
	        
	        
	        int thirdLabelRandom = (int) (Math.random()*11+1);
	        
	        SlotThirdImageLabel.setIcon(new ImageIcon(("C:\\Users\\deniz\\OneDrive\\Masaüstü\\mini games\\slot\\"+thirdLabelRandom+".png")));
	        
	        if(thirdLabelRandom ==  1 && firstLabelRandom ==  1 && secondLabelRandom ==  1 && firstLabelRandom == 1){
	        
	            JOptionPane.showMessageDialog(null, "You Won!", "ALERT", JOptionPane.PLAIN_MESSAGE);
	            
	            money = money + rollPrice * 12*12*12; 
	        
	        }
	        
	        else if((thirdLabelRandom <=6 && thirdLabelRandom >=5) && (firstLabelRandom <=6 && firstLabelRandom >=5) && (secondLabelRandom <=6 && secondLabelRandom >=5) ){
	        
	            JOptionPane.showMessageDialog(null, "You Won!", "ALERT", JOptionPane.PLAIN_MESSAGE);
	            
	            money = money + rollPrice * 36*6; 
	        
	        }
	        
	        else if((thirdLabelRandom <=4 && thirdLabelRandom >=2) && (secondLabelRandom <=4 && secondLabelRandom >=2) && (firstLabelRandom <=4 && firstLabelRandom >=2)){
	        
	            JOptionPane.showMessageDialog(null, "You Won!", "ALERT", JOptionPane.PLAIN_MESSAGE);
	            
	            money = money + rollPrice * 4*4*4; 
	        
	        }
	        
	        else if((thirdLabelRandom <=12 && thirdLabelRandom >=7) && (secondLabelRandom <=12 && secondLabelRandom >=7) && (firstLabelRandom <=12 && firstLabelRandom >=7)){
	        
	            JOptionPane.showMessageDialog(null, "You Won!", "ALERT", JOptionPane.PLAIN_MESSAGE);
	            
	            money = money + rollPrice * 4; 
	        
	        }
	        
	        else{
	        
	            JOptionPane.showMessageDialog(null, "You Lose!", "ALERT", JOptionPane.PLAIN_MESSAGE);
	        
	        }
        
    	}
    	
    	else {
    		
    		JOptionPane.showMessageDialog(null, "You Need at Least 500 $ to Roll the Slot Machine!!!!", "ALERT", JOptionPane.PLAIN_MESSAGE);
    		
    	}
        
        SlotMoneyAmountLabel.setText("Money: " + money + "$");
        
    }                                              

    public static void main(int _money) {
    	
    	money = _money;
  
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Slot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Slot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Slot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Slot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Slot().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel SlotFirstImageLabel;
    private javax.swing.JLabel SlotMoneyAmountLabel;
    private javax.swing.JButton SlotRollButton;
    private javax.swing.JLabel SlotRollPriceLabel;
    private javax.swing.JLabel SlotSecondImageLabel;
    private javax.swing.JLabel SlotThirdImageLabel;
    
    private static int money;
    int rollPrice = 500;
}