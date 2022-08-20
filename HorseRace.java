import java.util.logging.*;
import javax.swing.*;


public class HorseRace extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	public HorseRace() {
        initComponents();
    }
                    
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        labelBoldPilot = new javax.swing.JPanel();
        buttonBahisVer = new javax.swing.JButton();
        button50 = new javax.swing.JButton();
        button500 = new javax.swing.JButton();
        button5000 = new javax.swing.JButton();
        button100 = new javax.swing.JButton();
        button1000 = new javax.swing.JButton();
        button10000 = new javax.swing.JButton();
        barByerly = new javax.swing.JProgressBar();
        barKarayel = new javax.swing.JProgressBar();
        barBoldPilot = new javax.swing.JProgressBar();
        barTrapper = new javax.swing.JProgressBar();
        barTurbo = new javax.swing.JProgressBar();
        barSahBatur = new javax.swing.JProgressBar();
        buttonKarayel = new javax.swing.JButton();
        buttonByerly = new javax.swing.JButton();
        buttonBoldPilot = new javax.swing.JButton();
        buttonTrapper = new javax.swing.JButton();
        buttonTurbo = new javax.swing.JButton();
        buttonSahBatur = new javax.swing.JButton();
        pictureByerly = new javax.swing.JLabel();
        pictureKarayel = new javax.swing.JLabel();
        pictureBoldPilot = new javax.swing.JLabel();
        pictureTrapper = new javax.swing.JLabel();
        pictureTurbo = new javax.swing.JLabel();
        pictureSahBatur = new javax.swing.JLabel();
        labelBetAmount = new javax.swing.JLabel();
        labelMoney = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
     
			private static final long serialVersionUID = 1L;
			String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);
        
        
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        buttonBahisVer.setText("BET!");
        buttonBahisVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					buttonBahisVerActionPerformed(evt);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
            }
        });

        button50.setText("50$");
        button50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button50ActionPerformed(evt);
            }
        });

        button500.setText("500$");
        button500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button500ActionPerformed(evt);
            }
        });

        button5000.setText("5000$");
        button5000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5000ActionPerformed(evt);
            }
        });

        button100.setText("100$");
        button100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button100ActionPerformed(evt);
            }
        });

        button1000.setText("1000$");
        button1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1000ActionPerformed(evt);
            }
        });

        button10000.setText("10000$");
        button10000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button10000ActionPerformed(evt);
            }
        });

        buttonKarayel.setText("KARAYEL");
        buttonKarayel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKarayelActionPerformed(evt);
            }
        });

        buttonByerly.setText("BYERLY");
        buttonByerly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonByerlyActionPerformed(evt);
            }
        });

        buttonBoldPilot.setText("BOLD PILOT");
        buttonBoldPilot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBoldPilotActionPerformed(evt);
            }
        });

        buttonTrapper.setText("TRAPPER");
        buttonTrapper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTrapperActionPerformed(evt);
            }
        });

        buttonTurbo.setText("TURBO");
        buttonTurbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTurboActionPerformed(evt);
            }
        });

        buttonSahBatur.setText("SAH BATUR");
        buttonSahBatur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSahBaturActionPerformed(evt);
            }
        });

        pictureByerly.setIcon(new ImageIcon("C:\\Users\\deniz\\OneDrive\\Masaüstü\\mini games\\horse racing\\byerly.png"));

        pictureKarayel.setIcon(new ImageIcon("C:\\Users\\deniz\\OneDrive\\Masaüstü\\mini games\\horse racing\\Karayel.png"));

        pictureBoldPilot.setIcon(new ImageIcon("C:\\Users\\deniz\\OneDrive\\Masaüstü\\mini games\\horse racing\\bold pilot.png"));

        pictureTrapper.setIcon(new ImageIcon("C:\\Users\\deniz\\OneDrive\\Masaüstü\\mini games\\horse racing\\trapper.png"));

        pictureTurbo.setIcon(new ImageIcon("C:\\Users\\deniz\\OneDrive\\Masaüstü\\mini games\\horse racing\\turbo.png"));

        pictureSahBatur.setIcon(new ImageIcon("C:\\Users\\deniz\\OneDrive\\Masaüstü\\mini games\\horse racing\\ƒah batur.png"));

        labelBetAmount.setText("Bet");
        labelBetAmount.setToolTipText("");

        labelMoney.setText("Money");

        javax.swing.GroupLayout labelBoldPilotLayout = new javax.swing.GroupLayout(labelBoldPilot);
        labelBoldPilot.setLayout(labelBoldPilotLayout);
        labelBoldPilotLayout.setHorizontalGroup(
            labelBoldPilotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labelBoldPilotLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(labelBoldPilotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(barByerly, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(buttonByerly, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(pictureByerly, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(labelBoldPilotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelMoney, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonKarayel, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(pictureKarayel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(barKarayel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(button100, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button500, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(labelBoldPilotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(labelBoldPilotLayout.createSequentialGroup()
                        .addComponent(pictureBoldPilot, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pictureTrapper, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pictureTurbo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pictureSahBatur, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(labelBoldPilotLayout.createSequentialGroup()
                        .addGroup(labelBoldPilotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(labelBoldPilotLayout.createSequentialGroup()
                                .addGroup(labelBoldPilotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(button1000, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(button5000, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button10000, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelBetAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonBahisVer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, labelBoldPilotLayout.createSequentialGroup()
                                .addGroup(labelBoldPilotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(barBoldPilot, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonBoldPilot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(labelBoldPilotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(buttonTrapper, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(barTrapper, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(labelBoldPilotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonTurbo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(barTurbo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(labelBoldPilotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonSahBatur, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(barSahBatur, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        labelBoldPilotLayout.setVerticalGroup(
            labelBoldPilotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, labelBoldPilotLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(labelBoldPilotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pictureSahBatur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, labelBoldPilotLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pictureBoldPilot, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pictureByerly, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pictureTrapper, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pictureTurbo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pictureKarayel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(labelBoldPilotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonBoldPilot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonKarayel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonByerly, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTrapper, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTurbo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSahBatur, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(labelBoldPilotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barByerly, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(labelBoldPilotLayout.createSequentialGroup()
                        .addGroup(labelBoldPilotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(labelBoldPilotLayout.createSequentialGroup()
                                .addGroup(labelBoldPilotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(barTrapper, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(barTurbo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(barSahBatur, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(barBoldPilot, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonBahisVer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(labelBoldPilotLayout.createSequentialGroup()
                                .addComponent(barKarayel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(labelBoldPilotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(button50)
                                    .addComponent(button1000))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(labelBoldPilotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(button100)
                                    .addComponent(button5000))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(labelBoldPilotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(button500)
                                    .addComponent(button10000))))
                        .addGap(18, 18, 18)
                        .addGroup(labelBoldPilotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelBetAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelBoldPilot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelBoldPilot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }                       

    private void buttonSahBaturActionPerformed(java.awt.event.ActionEvent evt) {                                               

        tahmin [count] =  "SAHBATUR";
        count++;
        buttonSahBatur.setEnabled(false);
    }                                              

    private void buttonTurboActionPerformed(java.awt.event.ActionEvent evt) {                                            

        tahmin [count] =  "TURBO";
        count++;
        buttonTurbo.setEnabled(false);
    }                                           

    private void buttonTrapperActionPerformed(java.awt.event.ActionEvent evt) {                                              

        tahmin [count] =  "TRAPPER";
        count++;
        buttonTrapper.setEnabled(false);
    }                                             

    private void buttonBoldPilotActionPerformed(java.awt.event.ActionEvent evt) {                                                

        tahmin [count] =  "BOLDPILOT";
        count++;
        buttonBoldPilot.setEnabled(false);
    }                                               

    private void buttonByerlyActionPerformed(java.awt.event.ActionEvent evt) {                                             

        tahmin [count] =  "BYERLY";
        count++;
        buttonByerly.setEnabled(false);
    }                                            

    private void buttonKarayelActionPerformed(java.awt.event.ActionEvent evt) {                                              

        tahmin [count] =  "KARAYEL";
        count++;
        buttonKarayel.setEnabled(false);
    }                                             

    private void button10000ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
        if( money >= 100000 ){

            money = money-100000;
            betAmount = betAmount+100000;
            labelMoney.setText("Money: " + String.valueOf(money));
            labelBetAmount.setText("Bet: " + String.valueOf(betAmount));
        }
        else if (money < 100000)

        JOptionPane.showMessageDialog(null, "You don't have enough money!!! \n You need at least $100000.", "ALERT", JOptionPane.PLAIN_MESSAGE);
    }                                           

    private void button1000ActionPerformed(java.awt.event.ActionEvent evt) {                                           

        if( money >= 1000 ){

            money = money-1000;
            betAmount = betAmount+1000;
            labelMoney.setText("Money: " + String.valueOf(money));
            labelBetAmount.setText("Bet: " + String.valueOf(betAmount));
        }
        else if (money < 1000)

        JOptionPane.showMessageDialog(null, "You don't have enough money!!! \n You need at least $1000.", "ALERT", JOptionPane.PLAIN_MESSAGE);
    }                                          

    private void button100ActionPerformed(java.awt.event.ActionEvent evt) {                                          

        if( money >= 100 ){

            money = money-100;
            betAmount = betAmount+100;
            labelMoney.setText("Money: " + String.valueOf(money));
            labelBetAmount.setText("Bet: " + String.valueOf(betAmount));
        }
        else if (money < 100)

        JOptionPane.showMessageDialog(null, "You don't have enough money!!! \n You need at least $100.", "ALERT", JOptionPane.PLAIN_MESSAGE);
    }                                         

    private void button5000ActionPerformed(java.awt.event.ActionEvent evt) {                                           

        if( money >= 5000 ){

            money = money-5000;
            betAmount = betAmount+5000;
            labelMoney.setText("Money: " + String.valueOf(money));
            labelBetAmount.setText("Bet: " + String.valueOf(betAmount));
        }
        else if (money < 5000)

        JOptionPane.showMessageDialog(null, "You don't have enough money!!! \n You need at least $5000.", "ALERT", JOptionPane.PLAIN_MESSAGE);
    }                                          

    private void button500ActionPerformed(java.awt.event.ActionEvent evt) {                                          

        if( money >= 500 ){

            money = money-500;
            betAmount = betAmount+500;
            labelMoney.setText("Money: " + String.valueOf(money));
            labelBetAmount.setText("Bet: " + String.valueOf(betAmount));
        }
        else if (money < 500)

        JOptionPane.showMessageDialog(null, "You don't have enough money!!! \n You need at least $500.", "ALERT", JOptionPane.PLAIN_MESSAGE);
    }                                         

    private void button50ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        if( money >= 50 ){

            money = money-50;
            betAmount = betAmount+50;
            labelMoney.setText("Money: " + String.valueOf(money));
            labelBetAmount.setText("Bet: " + String.valueOf(betAmount));
        }
        else if (money < 50)

        JOptionPane.showMessageDialog(null, "You don't have enough money!!! \n You need at least $50.", "ALERT", JOptionPane.PLAIN_MESSAGE);
    }                                        
  
    private void buttonBahisVerActionPerformed(java.awt.event.ActionEvent evt) throws InterruptedException {                                               
        
        if(betAmount < 50 ){

            JOptionPane.showMessageDialog(null, "Your bet must be greater than $50.", "ALERT", JOptionPane.PLAIN_MESSAGE);
        }
        else if (tahmin[0] == null || tahmin[1] == null || tahmin[2] == null || tahmin[3] == null || tahmin[4] == null || tahmin[5] == null){

            JOptionPane.showMessageDialog(null, "You have to make guess!", "ALERT", JOptionPane.PLAIN_MESSAGE);
        }
        else{
            
            labelMoney.setText("Money: " + String.valueOf(money));
            buttonBahisVer.setEnabled(false);
            
            while(yolByerly < 100 || yolKarayel < 100 || yolBoldPilot < 100 || yolTrapper < 100 || yolTurbo < 100 || yolSahBatur < 100){
                
                if(yolByerly >= 100 && kazananlar[0] != "BYERLY" && kazananlar[1] != "BYERLY" && kazananlar[2] != "BYERLY" && kazananlar[3] != "BYERLY" && kazananlar[4] != "BYERLY" && kazananlar[5] != "BYERLY"){
                    
                    kazananlar[countForGuesses++] = "BYERLY";
                }
                else if(yolKarayel >= 100 && kazananlar[0] != "KARAYEL" && kazananlar[1] != "KARAYEL" && kazananlar[2] != "KARAYEL" && kazananlar[3] != "KARAYEL" && kazananlar[4] != "KARAYEL" && kazananlar[5] != "KARAYEL"){
                    
                    kazananlar[countForGuesses++] = "KARAYEL";
                }
                else if(yolBoldPilot >= 100 && kazananlar[0] != "BOLDPILOT" && kazananlar[1] != "BOLDPILOT" && kazananlar[2] != "BOLDPILOT" && kazananlar[3] != "BOLDPILOT" && kazananlar[4] != "BOLDPILOT" && kazananlar[5] != "BOLDPILOT"){
                    
                    kazananlar[countForGuesses++] = "BOLDPILOT";
                }
                else if(yolTrapper >= 100 && kazananlar[0] != "TRAPPER" && kazananlar[1] != "TRAPPER" && kazananlar[2] != "TRAPPER" && kazananlar[3] != "TRAPPER" && kazananlar[4] != "TRAPPER" && kazananlar[5] != "TRAPPER"){
                    
                    kazananlar[countForGuesses++] = "TRAPPER";
                }
                else if(yolTurbo >= 100 && kazananlar[0] != "TURBO" && kazananlar[1] != "TURBO" && kazananlar[2] != "TURBO" && kazananlar[3] != "TURBO" && kazananlar[4] != "TURBO" && kazananlar[5] != "TURBO"){
                    
                    kazananlar[countForGuesses++] = "TURBO";
                }
                else if(yolSahBatur >= 100 && kazananlar[0] != "SAHBATUR" && kazananlar[1] != "SAHBATUR" && kazananlar[2] != "SAHBATUR" && kazananlar[3] != "SAHBATUR" && kazananlar[4] != "SAHBATUR" && kazananlar[5] !="SAHBATUR"){
                    
                    kazananlar[countForGuesses++] = "SAHBATUR";
                }
                
                yolByerly = yolByerly + (int)(Math.random()*atOran[0]);
                barByerly.setValue(yolByerly);
                barByerly.setStringPainted(true);
                
                yolKarayel = yolKarayel + (int)(Math.random()*atOran[1]);
                barKarayel.setValue(yolKarayel);
                barKarayel.setStringPainted(true);
                
                yolBoldPilot = yolBoldPilot + (int)(Math.random()*atOran[2]);
                barBoldPilot.setValue(yolBoldPilot);
                barBoldPilot.setStringPainted(true);
                
                yolTrapper = yolTrapper + (int)(Math.random()*atOran[3]);
                barTrapper.setValue(yolTrapper);
                barTrapper.setStringPainted(true);
                
                yolTurbo = yolTurbo + (int)(Math.random()*atOran[4]);
                barTurbo.setValue(yolTurbo);
                barTurbo.setStringPainted(true);
                
                yolSahBatur = yolSahBatur + (int)(Math.random()*atOran[5]);
                barSahBatur.setValue(yolSahBatur);
                barSahBatur.setStringPainted(true); 
                
                try 
                {
                    Thread.sleep(100);
                } 
                catch (InterruptedException ex) 
                {
                    Logger.getLogger(HorseRace.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                barByerly.update(barByerly.getGraphics());
                barByerly.setIndeterminate(true);
                barKarayel.update(barKarayel.getGraphics());
                barKarayel.setIndeterminate(true);
                barBoldPilot.update(barBoldPilot.getGraphics());
                barBoldPilot.setIndeterminate(true);
                barTrapper.update(barTrapper.getGraphics());
                barTrapper.setIndeterminate(true);
                barTurbo.update(barTurbo.getGraphics());
                barTurbo.setIndeterminate(true);
                barSahBatur.update(barSahBatur.getGraphics());
                barSahBatur.setIndeterminate(true);
            }
            
            if(tahmin[0] == kazananlar [0] && tahmin[1] == kazananlar [1] && tahmin[2] == kazananlar [2] && tahmin[3] == kazananlar [3] && tahmin[4] == kazananlar [4]){
                
                money = money + betAmount * 16;
                JOptionPane.showMessageDialog(null, "YOU WIN!" + betAmount * 16 + "\n ALL THE GUESSES ARE CORRECT! CONGRATULATIONS!!!", "ALERT", JOptionPane.PLAIN_MESSAGE);
                labelMoney.setText("Money: " + String.valueOf(money));
            }
            
            else if (tahmin[0] == kazananlar [0] && tahmin[1] == kazananlar [1] && tahmin[2] == kazananlar [2] && tahmin[3] == kazananlar [3]){
                
                money = money + betAmount * 9;
                JOptionPane.showMessageDialog(null, "YOU WIN!" + betAmount * 9 + "\n 4 GUESS IS CORRECT! WELL DONE!", "ALERT", JOptionPane.PLAIN_MESSAGE);
                labelMoney.setText("Money: " + String.valueOf(money));
            }
            
            else if (tahmin[0] == kazananlar [0] && tahmin[1] == kazananlar [1] && tahmin[2] == kazananlar [2]){
                
                money = money + betAmount * 4;
                JOptionPane.showMessageDialog(null,  "YOU WIN!" + betAmount * 9 + "\n 3 GUESS IS CORRECT! WELL DONE!", "ALERT", JOptionPane.PLAIN_MESSAGE);
                labelMoney.setText("Money: " + String.valueOf(money));
            }
            
            else if (tahmin[0] == kazananlar [0] && tahmin[1] == kazananlar [1]){
                
                money = money + betAmount * 2;
                JOptionPane.showMessageDialog(null,  "YOU WIN!" + betAmount * 2 + "\n JUST 2 GUESS IS CORRECT", "ALERT", JOptionPane.PLAIN_MESSAGE);
                labelMoney.setText("Money: " + String.valueOf(money));
            }
            
            else{
                
                JOptionPane.showMessageDialog(null, "YOU LOSE! \n ALL THE GUESSES ARE WRONG", "ALERT", JOptionPane.PLAIN_MESSAGE);
            }
        }
        
        buttonBoldPilot.setEnabled(true);
        buttonByerly.setEnabled(true);
        buttonKarayel.setEnabled(true);
        buttonSahBatur.setEnabled(true);
        buttonTrapper.setEnabled(true);
        buttonTurbo.setEnabled(true);
        buttonBahisVer.setEnabled(true);
        betAmount = 0;
        count = 0;
        countForGuesses = 0;
        yolByerly = 0; yolKarayel = 0;
        yolBoldPilot = 0;
        yolTrapper = 0;
        yolTurbo = 0;
        yolSahBatur = 0;
        labelBetAmount.setText("BET: " + betAmount);
        labelMoney.setText("MONEY: " + money);
        
        kazananlar = new String [6];
        tahmin = new String [6];
        barBoldPilot.setValue(0);
        barBoldPilot.setStringPainted(true);
        barByerly.setValue(0);
        barByerly.setStringPainted(true);
        barKarayel.setValue(0);
        barKarayel.setStringPainted(true);
        barSahBatur.setValue(0);
        barSahBatur.setStringPainted(true);
        barTrapper.setValue(0);
        barTrapper.setStringPainted(true);
        barTurbo.setValue(0);
        barTurbo.setStringPainted(true);
        
        barBoldPilot.updateUI();
        barByerly.updateUI();
        barKarayel.updateUI();
        barSahBatur.updateUI();
        barTrapper.updateUI();
        barTurbo.updateUI();
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
            java.util.logging.Logger.getLogger(HorseRace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HorseRace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HorseRace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HorseRace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HorseRace().setVisible(true);
            }
        });
    }
                    
    private javax.swing.JProgressBar barBoldPilot;
    private javax.swing.JProgressBar barByerly;
    private javax.swing.JProgressBar barKarayel;
    private javax.swing.JProgressBar barSahBatur;
    private javax.swing.JProgressBar barTrapper;
    private javax.swing.JProgressBar barTurbo;
    private javax.swing.JButton button100;
    private javax.swing.JButton button1000;
    private javax.swing.JButton button10000;
    private javax.swing.JButton button50;
    private javax.swing.JButton button500;
    private javax.swing.JButton button5000;
    private javax.swing.JButton buttonBahisVer;
    private javax.swing.JButton buttonBoldPilot;
    private javax.swing.JButton buttonByerly;
    private javax.swing.JButton buttonKarayel;
    private javax.swing.JButton buttonSahBatur;
    private javax.swing.JButton buttonTrapper;
    private javax.swing.JButton buttonTurbo;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBetAmount;
    private javax.swing.JPanel labelBoldPilot;
    private javax.swing.JLabel labelMoney;
    private javax.swing.JLabel pictureBoldPilot;
    private javax.swing.JLabel pictureByerly;
    private javax.swing.JLabel pictureKarayel;
    private javax.swing.JLabel pictureSahBatur;
    private javax.swing.JLabel pictureTrapper;
    private javax.swing.JLabel pictureTurbo;
 
    int betAmount = 0,count = 0,countForGuesses = 0,yolByerly = 0, yolKarayel = 0, yolBoldPilot = 0, yolTrapper = 0, yolTurbo = 0,yolSahBatur = 0;
    String [] kazananlar = new String [6];
    String [] tahmin = new String [6];
    int [] atOran = {10,12,14,16,18,20};
    private static int money;
}