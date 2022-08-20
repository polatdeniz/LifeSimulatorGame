import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class BlackJack extends javax.swing.JFrame{
    
	private static final long serialVersionUID = 1L;
	MainFrame mf = new MainFrame();
    
    
    public BlackJack() {
        initComponents();
    }
                       
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        kullanıcıKart5 = new javax.swing.JLabel();
        kullanıcıKart4 = new javax.swing.JLabel();
        kullanıcıKart1 = new javax.swing.JLabel();
        kullanıcıKart2 = new javax.swing.JLabel();
        kullanıcıKart3 = new javax.swing.JLabel();
        kartÇek = new javax.swing.JButton();
        kal = new javax.swing.JButton();
        bilgisayarKartı5 = new javax.swing.JLabel();
        bilgisayarKartı1 = new javax.swing.JLabel();
        bilgisayarKartı4 = new javax.swing.JLabel();
        bilgisayarKartı2 = new javax.swing.JLabel();
        bilgisayarKartı3 = new javax.swing.JLabel();
        playButton = new javax.swing.JButton();
        paraMiktarıGöstergesi = new javax.swing.JLabel();
        dollar50 = new javax.swing.JButton();
        dollar100 = new javax.swing.JButton();
        dollar500 = new javax.swing.JButton();
        dollar1000 = new javax.swing.JButton();
        dollar10000 = new javax.swing.JButton();
        bahisMiktarıGöstergesi = new javax.swing.JLabel();
        kullanıcıPuanGöstergesi = new javax.swing.JLabel();
        bilgisayarPuanGöstergesi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        kartÇek.setText("HIT!");
        kartÇek.setEnabled(false);
        kartÇek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	kartÇekActionPerformed(evt);
            }
        });

        kal.setText("STAND!");
        kal.setEnabled(false);
        kal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kalActionPerformed(evt);
            }
        });

        playButton.setText("DEAL!");
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        dollar50.setText("$50");
        dollar50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dollar50ActionPerformed(evt);
            }
        });

        dollar100.setText("$100");
        dollar100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dollar100ActionPerformed(evt);
            }
        });

        dollar500.setText("$500");
        dollar500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dollar500ActionPerformed(evt);
            }
        });

        dollar1000.setText("$1000");
        dollar1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dollar1000ActionPerformed(evt);
            }
        });

        dollar10000.setText("$10000");
        dollar10000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dollar10000ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(kullanıcıKart5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(kartÇek, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                    .addComponent(kullanıcıKart4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(kullanıcıKart1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(kullanıcıKart2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(kullanıcıKart3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(kal, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bilgisayarKartı5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bilgisayarKartı4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bilgisayarKartı1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bilgisayarKartı2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bilgisayarKartı3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(playButton, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                .addComponent(paraMiktarıGöstergesi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dollar10000, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bahisMiktarıGöstergesi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dollar500, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dollar1000, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dollar50, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dollar100, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bilgisayarPuanGöstergesi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kullanıcıPuanGöstergesi, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bilgisayarKartı5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bilgisayarKartı4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bilgisayarKartı1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bilgisayarKartı2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bilgisayarKartı3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(paraMiktarıGöstergesi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bahisMiktarıGöstergesi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(playButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dollar50)
                            .addComponent(dollar100)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bilgisayarPuanGöstergesi, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dollar500)
                            .addComponent(dollar1000))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dollar10000)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(kullanıcıPuanGöstergesi, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kullanıcıKart3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kullanıcıKart2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kullanıcıKart1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kullanıcıKart4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kullanıcıKart5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kal, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kartÇek, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }                    

    private void restartGame(){
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(BlackJack.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        bilgisayarPuanGöstergesi.setText("Puan: " + String.valueOf(bilgisayarPuan));
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(BlackJack.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            bahisMiktarı = 0;kullanıcıPuan = 0;x = 0;kartNo = 0;bilgisayarPuan = 0;
            
            paraMiktarıGöstergesi.setText("Money: " + String.valueOf(money));
            
            bahisMiktarıGöstergesi.setText("Bet: " + String.valueOf(bahisMiktarı));
            
            kal.setEnabled(false);
            kartÇek.setEnabled(false);
            
            dollar100.setEnabled(true);
            dollar100.setVisible(true);
            
            dollar1000.setEnabled(true);
            dollar1000.setVisible(true);
            
            dollar10000.setEnabled(true);
            dollar10000.setVisible(true);
            
            dollar50.setEnabled(true);
            dollar50.setVisible(true);
            
            dollar500.setEnabled(true);
            dollar500.setVisible(true);
            
            playButton.setEnabled(true);
            playButton.setVisible(true);
            
            kullanıcıPuanGöstergesi.setText(null);
            bilgisayarPuanGöstergesi.setText(null);
            bahisMiktarıGöstergesi.setText(null);
            
            kullanıcıKart1.setIcon(new ImageIcon());
            kullanıcıKart2.setIcon(new ImageIcon());
            kullanıcıKart3.setIcon(new ImageIcon());
            kullanıcıKart4.setIcon(new ImageIcon());
            kullanıcıKart5.setIcon(new ImageIcon());
            bilgisayarKartı1.setIcon(new ImageIcon());
            bilgisayarKartı2.setIcon(new ImageIcon());
            bilgisayarKartı3.setIcon(new ImageIcon());
            bilgisayarKartı4.setIcon(new ImageIcon());
            bilgisayarKartı5.setIcon(new ImageIcon());
    }
    
    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
        if(bahisMiktarı < 50)
            
            JOptionPane.showMessageDialog(null, "Your bet must be greater than $50.", "ALERT", JOptionPane.PLAIN_MESSAGE);
        
        else{
            kal.setEnabled(true);
            kartÇek.setEnabled(true);
            
            dollar100.setEnabled(false);
            dollar100.setVisible(false);
            
            dollar1000.setEnabled(false);
            dollar1000.setVisible(false);
            
            dollar10000.setEnabled(false);
            dollar10000.setVisible(false);
            
            dollar50.setEnabled(false);
            dollar50.setVisible(false);
            
            dollar500.setEnabled(false);
            dollar500.setVisible(false);
            
            playButton.setEnabled(false);
            playButton.setVisible(false);
            
            kartNo = (int)((Math.random()*52)+1);
            
            
            if (kartNo%13 == 0 || kartNo%13 == 11 || kartNo%13 == 12) {
                    
                    kullanıcıPuan = kullanıcıPuan + 10;
                    kullanıcıPuanGöstergesi.setText("Puan: " + String.valueOf(kullanıcıPuan));
                        
            }
                
            else if (kartNo%13 == 1){
            	if(kullanıcıPuan > 10) {
                		
            		kullanıcıPuan = kullanıcıPuan + 1;
            		kullanıcıPuanGöstergesi.setText("Puan: " + String.valueOf(kullanıcıPuan));
            	}
            	else {
            		kullanıcıPuan = kullanıcıPuan + 11;
            		kullanıcıPuanGöstergesi.setText("Puan: " + String.valueOf(kullanıcıPuan));
            	}
                
            }
                
            else{
                kullanıcıPuan = kullanıcıPuan + kartNo%13;
                kullanıcıPuanGöstergesi.setText("Puan: " + String.valueOf(kullanıcıPuan));
                        
            }
             	kullanıcıKart1.setIcon(new ImageIcon(("C:\\Users\\deniz\\eclipse-workspace\\Project\\src\\mini games\\blackjack\\cards\\"+kartNo+".png")));
                
            kartNo = (int)((Math.random()*52)+1);
            
                if (kartNo%13 == 0 || kartNo%13 == 11 || kartNo%13 == 12) {
                    
                        kullanıcıPuan = kullanıcıPuan + 10;
                        kullanıcıPuanGöstergesi.setText("Puan: " + String.valueOf(kullanıcıPuan));
                        
                }
                
                else if (kartNo%13 == 1){
                	
                	if(kullanıcıPuan > 10) {
                		
                		 kullanıcıPuan = kullanıcıPuan + 1;
                         kullanıcıPuanGöstergesi.setText("Puan: " + String.valueOf(kullanıcıPuan));
                	}
                	else {
                		kullanıcıPuan = kullanıcıPuan + 11;
                        kullanıcıPuanGöstergesi.setText("Puan: " + String.valueOf(kullanıcıPuan));
                	}
                
                }
                
                else{
                        kullanıcıPuan = kullanıcıPuan + kartNo%13;
                        kullanıcıPuanGöstergesi.setText("Puan: " + String.valueOf(kullanıcıPuan));
                        
                }
                kullanıcıKart2.setIcon(new ImageIcon(("C:\\Users\\deniz\\eclipse-workspace\\Project\\src\\mini games\\blackjack\\cards\\"+kartNo+".png")));
                
                kartNo = (int)((Math.random()*52)+1);
            
                if (kartNo%13 == 0 || kartNo%13 == 11 || kartNo%13 == 12) {
                    
                        bilgisayarPuan = bilgisayarPuan + 10;
                        bilgisayarPuanGöstergesi.setText("Puan: " + String.valueOf(bilgisayarPuan));
                        
                }
                
                else if (kartNo%13 == 1){
                	if(bilgisayarPuan > 10) {
                		
                		bilgisayarPuan = bilgisayarPuan + 1;
                		bilgisayarPuanGöstergesi.setText("Puan: " + String.valueOf(bilgisayarPuan));
                	}
                	else {
                		bilgisayarPuan = bilgisayarPuan + 11;
                		bilgisayarPuanGöstergesi.setText("Puan: " + String.valueOf(bilgisayarPuan));
                	}
                
                }
                
                else{
                        bilgisayarPuan = bilgisayarPuan + kartNo%13;
                        bilgisayarPuanGöstergesi.setText("Puan: " + String.valueOf(bilgisayarPuan));
                        
                }
                bilgisayarKartı1.setIcon(new ImageIcon(("C:\\Users\\deniz\\eclipse-workspace\\Project\\src\\mini games\\blackjack\\cards\\"+kartNo+".png")));
                bilgisayarKartı2.setIcon(new ImageIcon(("C:\\Users\\deniz\\eclipse-workspace\\Project\\src\\mini games\\blackjack\\cards\\0.png")));
                 
        }
    }                                          

    private void dollar100ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
        if( money >= 100 ){
            
            money = money-100;
            bahisMiktarı = bahisMiktarı+100;
            paraMiktarıGöstergesi.setText("Money: " + String.valueOf(money));
            bahisMiktarıGöstergesi.setText("Bet: " + String.valueOf(bahisMiktarı));
        }
        else if (money < 100)
            
            JOptionPane.showMessageDialog(null, "You don't have enough money!!! \n You need at least $100.", "ALERT", JOptionPane.PLAIN_MESSAGE);
    }                                         

    private void dollar50ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        if( money >= 50 ){
            
            money = money-50;
            bahisMiktarı = bahisMiktarı+50;
            paraMiktarıGöstergesi.setText("Money: " + String.valueOf(money));
            bahisMiktarıGöstergesi.setText("Bet: " + String.valueOf(bahisMiktarı));
        }
        else if (money < 50)
            
            JOptionPane.showMessageDialog(null, "You don't have enough money!!! \n You need at least $50.", "ALERT", JOptionPane.PLAIN_MESSAGE);
    }                                        

    private void dollar500ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
        if( money >= 500 ){
            
            money = money-500;
            bahisMiktarı = bahisMiktarı+500;
            paraMiktarıGöstergesi.setText("Money: " + String.valueOf(money));
            bahisMiktarıGöstergesi.setText("Bet: " + String.valueOf(bahisMiktarı));
        }
        else if (money < 500)
            
            JOptionPane.showMessageDialog(null, "You don't have enough money!!! \n You need at least $500.", "ALERT", JOptionPane.PLAIN_MESSAGE);
    }                                         

    private void dollar1000ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
        if( money >= 1000 ){
            
            money = money-1000;
            bahisMiktarı = bahisMiktarı+1000;
            paraMiktarıGöstergesi.setText("Money: " + String.valueOf(money));
            bahisMiktarıGöstergesi.setText("Bet: " + String.valueOf(bahisMiktarı));
        }
        else if (money < 1000)
            
            JOptionPane.showMessageDialog(null, "You don't have enough money!!! \n You need at least $1000.", "ALERT", JOptionPane.PLAIN_MESSAGE);
    }                                          

    private void dollar10000ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
        if( money >= 10000 ){
            
            money = money-10000;
            bahisMiktarı = bahisMiktarı+10000;
            paraMiktarıGöstergesi.setText("Money: " + String.valueOf(money));
            bahisMiktarıGöstergesi.setText("Bet: " + String.valueOf(bahisMiktarı));
        }
        else if (money < 10000)
            
            JOptionPane.showMessageDialog(null, "You don't have enough money!!! \n You need at least $10000.", "ALERT", JOptionPane.PLAIN_MESSAGE);
    }                                           

    private void kartÇekActionPerformed(java.awt.event.ActionEvent evt) {                                        
        
        if(x == 0) {
            
            kartNo = (int)((Math.random()*52)+1);
            
            if(kartNo%13 == 0 || kartNo%13 == 11 || kartNo%13 == 12){
                
                        kullanıcıPuan = kullanıcıPuan + 10;
                        kullanıcıPuanGöstergesi.setText("Puan: " + String.valueOf(kullanıcıPuan));
            }
                        
            else if(kartNo%13 == 1){
                        
            	if(kullanıcıPuan > 10) {
            		
           		 	kullanıcıPuan = kullanıcıPuan + 1;
                    kullanıcıPuanGöstergesi.setText("Puan: " + String.valueOf(kullanıcıPuan));
            	}
            	else if(kullanıcıPuan <= 10){
           		kullanıcıPuan = kullanıcıPuan + 11;
                   kullanıcıPuanGöstergesi.setText("Puan: " + String.valueOf(kullanıcıPuan));
            	}
            	
            	else {
            		kullanıcıPuan = kullanıcıPuan + 1;
                kullanıcıPuanGöstergesi.setText("Puan: " + String.valueOf(kullanıcıPuan));
            	}
            }
            
            else{
                
                kullanıcıPuan = kullanıcıPuan + kartNo%13;
                kullanıcıPuanGöstergesi.setText("Puan: " + String.valueOf(kullanıcıPuan));

                }
            x++;    
            kullanıcıKart3.setIcon(new ImageIcon(("C:\\Users\\deniz\\eclipse-workspace\\Project\\src\\mini games\\blackjack\\cards\\"+kartNo+".png")));
                
            }

        
        else if(x == 1) {
            
            kartNo = (int)((Math.random()*52)+1);
            
            if(kartNo%13 == 0 || kartNo%13 == 11 || kartNo%13 == 12){
                
                        kullanıcıPuan = kullanıcıPuan + 10;
                        kullanıcıPuanGöstergesi.setText("Puan: " + String.valueOf(kullanıcıPuan));
            }
                        
            else if(kartNo%13 == 1){
                        
            	if(kullanıcıPuan > 10) {
            		
           		 kullanıcıPuan = kullanıcıPuan + 1;
                    kullanıcıPuanGöstergesi.setText("Puan: " + String.valueOf(kullanıcıPuan));
           	}
           	else {
           		kullanıcıPuan = kullanıcıPuan + 11;
                   kullanıcıPuanGöstergesi.setText("Puan: " + String.valueOf(kullanıcıPuan));
           	}
                
            }
            
            else{
                
                kullanıcıPuan = kullanıcıPuan + kartNo%13;
                kullanıcıPuanGöstergesi.setText("Puan: " + String.valueOf(kullanıcıPuan));

                }
            x++;
            kullanıcıKart4.setIcon(new ImageIcon(("C:\\Users\\deniz\\eclipse-workspace\\Project\\src\\mini games\\blackjack\\cards\\"+kartNo+".png")));
            
            }
            
        else if(x == 2) {
            
            kartNo = (int)((Math.random()*52)+1);
            
            if(kartNo%13 == 0 || kartNo%13 == 11 || kartNo%13 == 12){
                
                        kullanıcıPuan = kullanıcıPuan + 10;
                        kullanıcıPuanGöstergesi.setText("Puan: " + String.valueOf(kullanıcıPuan));
            }
                        
            else if(kartNo%13 == 1){
                        
            	if(kullanıcıPuan > 10) {
            		
           		 kullanıcıPuan = kullanıcıPuan + 1;
                    kullanıcıPuanGöstergesi.setText("Puan: " + String.valueOf(kullanıcıPuan));
           	}
           	else {
           		kullanıcıPuan = kullanıcıPuan + 11;
                   kullanıcıPuanGöstergesi.setText("Puan: " + String.valueOf(kullanıcıPuan));
           	}
                
            }
            
            else{
                
                kullanıcıPuan = kullanıcıPuan + kartNo%13;
                kullanıcıPuanGöstergesi.setText("Puan: " + String.valueOf(kullanıcıPuan));

                }
            x++;
            kullanıcıKart5.setIcon(new ImageIcon(("C:\\Users\\deniz\\eclipse-workspace\\Project\\src\\mini games\\blackjack\\cards\\"+kartNo+".png")));
            
            }
        
        else
           JOptionPane.showMessageDialog(null, "You cannot take any card! \n Every player take maximum 5 card!", "ALERT", JOptionPane.PLAIN_MESSAGE); 

        if(kullanıcıPuan > 21){
        
            JOptionPane.showMessageDialog(null, "Game Over!", "ALERT", JOptionPane.PLAIN_MESSAGE);
            
            bahisMiktarı = 0;kullanıcıPuan = 0;x = 0;kartNo = 0;bilgisayarPuan = 0;
            
            kal.setEnabled(false);
            kartÇek.setEnabled(false);
            
            dollar100.setEnabled(true);
            dollar100.setVisible(true);
            
            dollar1000.setEnabled(true);
            dollar1000.setVisible(true);
            
            dollar10000.setEnabled(true);
            dollar10000.setVisible(true);
            
            dollar50.setEnabled(true);
            dollar50.setVisible(true);
            
            dollar500.setEnabled(true);
            dollar500.setVisible(true);
            
            playButton.setEnabled(true);
            playButton.setVisible(true);
            
            kullanıcıPuanGöstergesi.setText(null);
            bilgisayarPuanGöstergesi.setText(null);
            bahisMiktarıGöstergesi.setText(null);
            
            kullanıcıKart1.setIcon(new ImageIcon());
            kullanıcıKart2.setIcon(new ImageIcon());
            kullanıcıKart3.setIcon(new ImageIcon());
            kullanıcıKart4.setIcon(new ImageIcon());
            kullanıcıKart5.setIcon(new ImageIcon());
            bilgisayarKartı1.setIcon(new ImageIcon());
            bilgisayarKartı2.setIcon(new ImageIcon());
            bilgisayarKartı3.setIcon(new ImageIcon());
            bilgisayarKartı4.setIcon(new ImageIcon());
            bilgisayarKartı5.setIcon(new ImageIcon());
            
        }
    }                                       

    private void kalActionPerformed(java.awt.event.ActionEvent evt) {                                    
        
        kartÇek.setEnabled(false);
        
      
        
        
        
        kartNo = (int)((Math.random()*52)+1);
        
        if (kartNo%13 == 0 || kartNo%13 == 11 || kartNo%13 == 12) {
            
                bilgisayarPuan = bilgisayarPuan + 10;
                
        }
        
        else if (kartNo%13 == 1){
        	if(kullanıcıPuan > 10) {
        		
       		 	kullanıcıPuan = kullanıcıPuan + 1;
          
        	}
        	else if(kullanıcıPuan <=10){
       			kullanıcıPuan = kullanıcıPuan + 11;
             
        	}
        	
        	else
        		kullanıcıPuan = kullanıcıPuan + 1;
        
        }
        
        else{
                bilgisayarPuan = bilgisayarPuan + kartNo%13;
              
                
        }
        
        bilgisayarKartı2.setIcon(new ImageIcon(("C:\\Users\\deniz\\eclipse-workspace\\Project\\src\\mini games\\blackjack\\cards\\"+kartNo+".png")));
        
        if(bilgisayarPuan < 17){
            
                kartNo = (int)((Math.random()*52)+1);
                if (kartNo%13 == 0 || kartNo%13 == 11 || kartNo%13 == 12) {
                    
                        bilgisayarPuan = bilgisayarPuan + 10;
                        bilgisayarPuanGöstergesi.setText("Puan: " + String.valueOf(bilgisayarPuan));
                        
                }
                
                else if (kartNo%13 == 1){
                	if(kullanıcıPuan > 10) {
                		
               		 kullanıcıPuan = kullanıcıPuan + 1;
                        kullanıcıPuanGöstergesi.setText("Puan: " + String.valueOf(kullanıcıPuan));
               	}
               	else {
               		kullanıcıPuan = kullanıcıPuan + 11;
                       kullanıcıPuanGöstergesi.setText("Puan: " + String.valueOf(kullanıcıPuan));
               	}
                
                }
                
                else{
                        bilgisayarPuan = bilgisayarPuan + kartNo%13;
                        bilgisayarPuanGöstergesi.setText("Puan: " + String.valueOf(bilgisayarPuan));
                        
                }
                bilgisayarKartı3.setIcon(new ImageIcon(("C:\\Users\\deniz\\eclipse-workspace\\Project\\src\\mini games\\blackjack\\cards\\"+kartNo+".png")));
                
                
        }
                if(bilgisayarPuan < 17){
                	try {
        				Thread.sleep(2000);
        			} catch (InterruptedException e) {
        				
        				e.printStackTrace();
        			}
                kartNo = (int)((Math.random()*52)+1);
                
                if (kartNo%13 == 0 || kartNo%13 == 11 || kartNo%13 == 12) {
                    
                        bilgisayarPuan = bilgisayarPuan + 10;
                        bilgisayarPuanGöstergesi.setText("Puan: " + String.valueOf(bilgisayarPuan));
                        
                }
                
                else if (kartNo%13 == 1){
                	if(kullanıcıPuan > 10) {
                		
               		 kullanıcıPuan = kullanıcıPuan + 1;
                        kullanıcıPuanGöstergesi.setText("Puan: " + String.valueOf(kullanıcıPuan));
               	}
               	else {
               		kullanıcıPuan = kullanıcıPuan + 11;
                       kullanıcıPuanGöstergesi.setText("Puan: " + String.valueOf(kullanıcıPuan));
               	}
                
                }
                
                else{
                        bilgisayarPuan = bilgisayarPuan + kartNo%13;
                        bilgisayarPuanGöstergesi.setText("Puan: " + String.valueOf(bilgisayarPuan));
                        
                }
                bilgisayarKartı4.setIcon(new ImageIcon(("C:\\Users\\deniz\\eclipse-workspace\\Project\\src\\mini games\\blackjack\\cards\\"+kartNo+".png")));
                }
                
                if(bilgisayarPuan < 17){
                	try {
        				Thread.sleep(2000);
        			} catch (InterruptedException e) {
        				
        				e.printStackTrace();
        			}
                kartNo = (int)((Math.random()*52)+1);
                
                if (kartNo%13 == 0 || kartNo%13 == 11 || kartNo%13 == 12) {
                    
                        bilgisayarPuan = bilgisayarPuan + 10;
                        bilgisayarPuanGöstergesi.setText("Puan: " + String.valueOf(bilgisayarPuan));
                        
                }
                
                else if (kartNo%13 == 1){
                	if(kullanıcıPuan > 10) {
                		
               		kullanıcıPuan = kullanıcıPuan + 1;
                    kullanıcıPuanGöstergesi.setText("Puan: " + String.valueOf(kullanıcıPuan));
                	}
                	else {
               		kullanıcıPuan = kullanıcıPuan + 11;
               		kullanıcıPuanGöstergesi.setText("Puan: " + String.valueOf(kullanıcıPuan));
                	}
                }
                
                else{
                        bilgisayarPuan = bilgisayarPuan + kartNo%13;
                        bilgisayarPuanGöstergesi.setText("Puan: " + String.valueOf(bilgisayarPuan));
                        
                }
                bilgisayarKartı5.setIcon(new ImageIcon(("C:\\Users\\deniz\\eclipse-workspace\\Project\\src\\mini games\\blackjack\\cards\\"+kartNo+".png")));
                }
        
        if(bilgisayarPuan > 21){
            bilgisayarPuanGöstergesi.setText("Puan: " + String.valueOf(bilgisayarPuan));
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(BlackJack.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            JOptionPane.showMessageDialog(null, "You Won!", "ALERT", JOptionPane.PLAIN_MESSAGE);
 
            money = money + 2*bahisMiktarı;
            paraMiktarıGöstergesi.setText("Money: " + String.valueOf(money));
            
           
           
            
            bahisMiktarıGöstergesi.setText("Bet: " + String.valueOf(bahisMiktarı));
            
            restartGame();
        }
        
        else if(bilgisayarPuan < kullanıcıPuan){
            bilgisayarPuanGöstergesi.setText("Puan: " + String.valueOf(bilgisayarPuan));
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(BlackJack.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            JOptionPane.showMessageDialog(null, "You Won!", "ALERT", JOptionPane.PLAIN_MESSAGE);
 
            money = money + 2*bahisMiktarı;
            paraMiktarıGöstergesi.setText("Money: " + String.valueOf(money));
            
            bahisMiktarıGöstergesi.setText("Bet: " + String.valueOf(bahisMiktarı));
            
            restartGame();
        }
        
        else if(kullanıcıPuan > 21){
            bilgisayarPuanGöstergesi.setText("Puan: " + String.valueOf(bilgisayarPuan));
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(BlackJack.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            JOptionPane.showMessageDialog(null, "Game Over!", "ALERT", JOptionPane.PLAIN_MESSAGE);
 
            paraMiktarıGöstergesi.setText("Money: " + String.valueOf(money));
            
           
            bahisMiktarıGöstergesi.setText("Bet: " + String.valueOf(bahisMiktarı));
            
            restartGame();
        }
        
        else if (bilgisayarPuan > kullanıcıPuan){
            
            bilgisayarPuanGöstergesi.setText("Puan: " + String.valueOf(bilgisayarPuan));
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(BlackJack.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            JOptionPane.showMessageDialog(null, "Game Over!", "ALERT", JOptionPane.PLAIN_MESSAGE);
 
            paraMiktarıGöstergesi.setText("Money: " + String.valueOf(money));
            
            
            bahisMiktarıGöstergesi.setText("Bet: " + String.valueOf(bahisMiktarı));
            
            restartGame();
        }
        
        else{
            bilgisayarPuanGöstergesi.setText("Puan: " + String.valueOf(bilgisayarPuan));
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(BlackJack.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            JOptionPane.showMessageDialog(null, "Draw!", "ALERT", JOptionPane.PLAIN_MESSAGE);
 
            money = money + bahisMiktarı;
            
            paraMiktarıGöstergesi.setText("Money: " + String.valueOf(money));
           
            bahisMiktarıGöstergesi.setText("Bet: " + String.valueOf(bahisMiktarı));
            
            restartGame();
        }
        
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
            java.util.logging.Logger.getLogger(BlackJack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BlackJack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BlackJack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BlackJack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BlackJack().setVisible(true);
            }
        });
        
        
    }
                    
    private javax.swing.JLabel bahisMiktarıGöstergesi;
    private javax.swing.JLabel bilgisayarKartı1;
    private javax.swing.JLabel bilgisayarKartı2;
    private javax.swing.JLabel bilgisayarKartı3;
    private javax.swing.JLabel bilgisayarKartı4;
    private javax.swing.JLabel bilgisayarKartı5;
    private javax.swing.JLabel bilgisayarPuanGöstergesi;
    private javax.swing.JButton dollar100;
    private javax.swing.JButton dollar1000;
    private javax.swing.JButton dollar10000;
    private javax.swing.JButton dollar50;
    private javax.swing.JButton dollar500;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton kal;
    private javax.swing.JButton kartÇek;
    private javax.swing.JLabel kullanıcıKart1;
    private javax.swing.JLabel kullanıcıKart2;
    private javax.swing.JLabel kullanıcıKart3;
    private javax.swing.JLabel kullanıcıKart4;
    private javax.swing.JLabel kullanıcıKart5;
    private javax.swing.JLabel kullanıcıPuanGöstergesi;
    private javax.swing.JLabel paraMiktarıGöstergesi;
    private javax.swing.JButton playButton;
                 
    int bahisMiktarı, kartNo, bilgisayarPuan = 0, kullanıcıPuan = 0, x = 0;
    private static int money;
}