import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;

    public MainFrame() {
        initComponents();
    }
                        
    private void initComponents() {

        PanelHolderJTabbedPane = new javax.swing.JTabbedPane();
        MainMenuPanel = new javax.swing.JPanel();
        MainMenuMoneyPicLabel = new javax.swing.JLabel();
        MainMenuLodgingPicLabel = new javax.swing.JLabel();
        MainMenuTransportPicLabel = new javax.swing.JLabel();
        MainMenuEducationPicLabel = new javax.swing.JLabel();
        MainMenuHealthPicLabel = new javax.swing.JLabel();
        MainMenuFoodPicLabel = new javax.swing.JLabel();
        MainMenuMoneyWriteLabel = new javax.swing.JLabel();
        MainMenuLodgingWriteLabel = new javax.swing.JLabel();
        MainMenuTransportWriteLabel = new javax.swing.JLabel();
        MainMenuEducationWriteLabel = new javax.swing.JLabel();
        MainMenuHealthWriteLabel = new javax.swing.JLabel();
        MainMenuFoodWriteLabel = new javax.swing.JLabel();
        MainMenuMoneyAmountLabel = new javax.swing.JLabel();
        MainMenuLodgingAmountLabel = new javax.swing.JLabel();
        MainMenuTransportAmountLabel = new javax.swing.JLabel();
        MainMenuEducationAmountLabel = new javax.swing.JLabel();
        MainMenuHealthAmountLabel = new javax.swing.JLabel();
        MainMenuFoodAmountLabel = new javax.swing.JLabel();
        JobsPanel = new javax.swing.JPanel();
        JobsWashCarsButton = new javax.swing.JButton();
        JobsBartenderButton = new javax.swing.JButton();
        JobsPostmanButton = new javax.swing.JButton();
        JobsDriverButton = new javax.swing.JButton();
        JobsFactoryWorkerButton = new javax.swing.JButton();
        JobsBankClerkButton = new javax.swing.JButton();
        JobsOfficeManagerButton = new javax.swing.JButton();
        JobsRumShopOwnerButton = new javax.swing.JButton();
        JobsSupermarketOwnerButton = new javax.swing.JButton();
        JobsEcommersWebsiteButton = new javax.swing.JButton();
        JobsBusinessmanButton = new javax.swing.JButton();
        JobsMoneyAmountLabel = new javax.swing.JLabel();
        JobsHealthAmountLabel = new javax.swing.JLabel();
        JobsFoodAmountLabel = new javax.swing.JLabel();
        JobsBegButton = new javax.swing.JButton();
        MarketPanel = new javax.swing.JPanel();
        MarketFoodLabel = new javax.swing.JLabel();
        MarketEatTrashButton = new javax.swing.JButton();
        MarketEatOatsButton = new javax.swing.JButton();
        MarketEatCupcakeButton = new javax.swing.JButton();
        MarketEatBurgerButton = new javax.swing.JButton();
        MarketOrganicFoodButton = new javax.swing.JButton();
        MarketEatInRestaurantButton = new javax.swing.JButton();
        MarketEatInternationalMealsButton = new javax.swing.JButton();
        MarketHealthLabel = new javax.swing.JLabel();
        MarketHealthSleepOnTheRoadButton = new javax.swing.JButton();
        MarketGeneralPillButton = new javax.swing.JButton();
        MarketSmallClinicButton = new javax.swing.JButton();
        MarketPolyClinicButton = new javax.swing.JButton();
        MarketLocalDoctorButton = new javax.swing.JButton();
        MarketHospitalButton = new javax.swing.JButton();
        MarketWorldClassHospitalButton = new javax.swing.JButton();
        MarketFoodAmountLabel = new javax.swing.JLabel();
        MarketHealthAmountLabel = new javax.swing.JLabel();
        MarketMoneyAmountLabel = new javax.swing.JLabel();
        MarketLodgingLabel = new javax.swing.JLabel();
        MarketRentBasementButton = new javax.swing.JButton();
        MarketRentApartmentButton = new javax.swing.JButton();
        MarketBuyApartmentButton = new javax.swing.JButton();
        MarketBuyPenthouseButton = new javax.swing.JButton();
        MarketBuyMansionButton = new javax.swing.JButton();
        MarketLodgingRemainingTimeLabel = new javax.swing.JLabel();
        MarketTransportLabel = new javax.swing.JLabel();
        MarketShoesButton = new javax.swing.JButton();
        MarketBicycleButton = new javax.swing.JButton();
        MarketCarButton = new javax.swing.JButton();
        MarketLargeTruckButton = new javax.swing.JButton();
        MarketLimoButton = new javax.swing.JButton();
        MarketHelicopterButton = new javax.swing.JButton();
        EducationPanel = new javax.swing.JPanel();
        EducationEducationLabel = new javax.swing.JLabel();
        EducationSpecialSkillsLabel = new javax.swing.JLabel();
        EducationSecondarySchoolPicLabel = new javax.swing.JLabel();
        EducationHighSchoolPicLabel = new javax.swing.JLabel();
        EducationGeneralTrainingPicLabel = new javax.swing.JLabel();
        EducationCollagePicLabel = new javax.swing.JLabel();
        EducationMasterDegreePicLabel = new javax.swing.JLabel();
        EducationDrivingLicencePicLabel = new javax.swing.JLabel();
        EducationLiquorPermitPicLabel = new javax.swing.JLabel();
        EducationLearnBusinessPicLabel = new javax.swing.JLabel();
        EducationLearnLawsPicLabel = new javax.swing.JLabel();
        EducationLearnAccountPicLabel = new javax.swing.JLabel();
        EducationLearnManagementPicLabel = new javax.swing.JLabel();
        EducationSecondarySchoolButton = new javax.swing.JButton();
        EducationHighSchoolButton = new javax.swing.JButton();
        EducationGeneralTrainingButton = new javax.swing.JButton();
        EducationStudyatCollageButton = new javax.swing.JButton();
        EducationMasterDegreeButton = new javax.swing.JButton();
        EducationDrivingLicenceButton = new javax.swing.JButton();
        EducationLiquorPermitButton = new javax.swing.JButton();
        EducationLearnBusinessButton = new javax.swing.JButton();
        EducationLearnLawsButton = new javax.swing.JButton();
        EducationAccountingButton = new javax.swing.JButton();
        EducationLearnManagementButton = new javax.swing.JButton();
        MiniGamesPanel = new javax.swing.JPanel();
        BlackJackButton = new javax.swing.JButton();
        SlotButton = new javax.swing.JButton();
        HorseRaceButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        MainMenuMoneyPicLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\deniz\\OneDrive\\Masaüstü\\Main Men�\\Money.png")); // NOI18N

        MainMenuLodgingPicLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\deniz\\OneDrive\\Masaüstü\\Main Men�\\Lodging.png")); // NOI18N

        MainMenuTransportPicLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\deniz\\OneDrive\\Masaüstü\\Main Men�\\Transport.png")); // NOI18N

        MainMenuEducationPicLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\deniz\\OneDrive\\Masaüstü\\Main Men�\\Education.png")); // NOI18N

        MainMenuHealthPicLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\deniz\\OneDrive\\Masaüstü\\Main Men�\\Health.png")); // NOI18N

        MainMenuFoodPicLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\deniz\\OneDrive\\Masaüstü\\Main Men�\\Food.png")); // NOI18N

        MainMenuMoneyWriteLabel.setText("MONEY");

        MainMenuLodgingWriteLabel.setText("LODGING");

        MainMenuTransportWriteLabel.setText("TRANSPORT");

        MainMenuEducationWriteLabel.setText("EDUCATION");

        MainMenuHealthWriteLabel.setText("HEALTH");

        MainMenuFoodWriteLabel.setText("FOOD");

        MainMenuMoneyAmountLabel.setText(money  + "$");

        MainMenuLodgingAmountLabel.setText(lodging);

        MainMenuTransportAmountLabel.setText(transport);

        MainMenuEducationAmountLabel.setText(education);

        MainMenuHealthAmountLabel.setText(health + "/300");

        MainMenuFoodAmountLabel.setText(food + "/300");

        javax.swing.GroupLayout MainMenuPanelLayout = new javax.swing.GroupLayout(MainMenuPanel);
        MainMenuPanel.setLayout(MainMenuPanelLayout);
        MainMenuPanelLayout.setHorizontalGroup(
            MainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(MainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MainMenuLodgingPicLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(MainMenuTransportPicLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(MainMenuMoneyPicLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(MainMenuEducationPicLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(MainMenuHealthPicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MainMenuFoodPicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MainMenuMoneyWriteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MainMenuLodgingWriteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MainMenuTransportWriteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(MainMenuEducationWriteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MainMenuHealthWriteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MainMenuFoodWriteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(MainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MainMenuMoneyAmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(MainMenuLodgingAmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MainMenuTransportAmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MainMenuEducationAmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MainMenuHealthAmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MainMenuFoodAmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(296, 296, 296))
        );
        MainMenuPanelLayout.setVerticalGroup(
            MainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MainMenuMoneyAmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MainMenuMoneyPicLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MainMenuMoneyWriteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MainMenuLodgingAmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MainMenuLodgingWriteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MainMenuLodgingPicLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MainMenuTransportAmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MainMenuTransportPicLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MainMenuTransportWriteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MainMenuEducationAmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MainMenuEducationPicLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MainMenuEducationWriteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MainMenuHealthAmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MainMenuHealthPicLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MainMenuHealthWriteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MainMenuFoodAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MainMenuFoodWriteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MainMenuFoodPicLabel))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        PanelHolderJTabbedPane.addTab("MAIN MENU", MainMenuPanel);

        JobsWashCarsButton.setText("WASH CARS                                                                                                                                                                                                                                 5$");
        JobsWashCarsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JobsWashCarsButtonActionPerformed(evt);
            }
        });

        JobsBartenderButton.setText("BARTENDER                                                                                                                                                                                                                               20$");
        JobsBartenderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JobsBartenderButtonActionPerformed(evt);
            }
        });

        JobsPostmanButton.setText("POSTMAN                                                                                                                                                                                                                                   50$");
        JobsPostmanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JobsPostmanButtonActionPerformed(evt);
            }
        });

        JobsDriverButton.setText("DRIVER                                                                                                                                                                                                                                      100$");
        JobsDriverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JobsDriverButtonActionPerformed(evt);
            }
        });

        JobsFactoryWorkerButton.setText("FACTORY WORKER                                                                                                                                                                                                                   150$");
        JobsFactoryWorkerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JobsFactoryWorkerButtonActionPerformed(evt);
            }
        });

        JobsBankClerkButton.setText("BANK CLERK                                                                                                                                                                                                                              500$");
        JobsBankClerkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JobsBankClerkButtonActionPerformed(evt);
            }
        });

        JobsOfficeManagerButton.setText("OFFICE MANAGER                                                                                                                                                                                                                    800$");
        JobsOfficeManagerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JobsOfficeManagerButtonActionPerformed(evt);
            }
        });

        JobsRumShopOwnerButton.setText("RUM SHOP OWNER                                                                                                                                                                                                               2.000$");
        JobsRumShopOwnerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JobsRumShopOwnerButtonActionPerformed(evt);
            }
        });

        JobsSupermarketOwnerButton.setText("SUPERMARKET OWNER                                                                                                                                                                                                        4.000$");
        JobsSupermarketOwnerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JobsSupermarketOwnerButtonActionPerformed(evt);
            }
        });

        JobsEcommersWebsiteButton.setText("E-COMMERS WEBSITE                                                                                                                                                                                                           6.000$");
        JobsEcommersWebsiteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JobsEcommersWebsiteButtonActionPerformed(evt);
            }
        });

        JobsBusinessmanButton.setText("BUSINESSMAN                                                                                                                                                                                                                     20.000$");
        JobsBusinessmanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JobsBusinessmanButtonActionPerformed(evt);
            }
        });

        JobsMoneyAmountLabel.setText("Money: " + money + "$");

        JobsHealthAmountLabel.setText("Health: " + health+ "/300");

        JobsFoodAmountLabel.setText("Food: " + food + "/300");

        JobsBegButton.setText("BEG                                                                                                                                                                                                                                               1$");
        JobsBegButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JobsBegButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JobsPanelLayout = new javax.swing.GroupLayout(JobsPanel);
        JobsPanel.setLayout(JobsPanelLayout);
        JobsPanelLayout.setHorizontalGroup(
            JobsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JobsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JobsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JobsSupermarketOwnerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JobsWashCarsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JobsBartenderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JobsPostmanButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JobsDriverButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JobsFactoryWorkerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JobsBankClerkButton, javax.swing.GroupLayout.DEFAULT_SIZE, 882, Short.MAX_VALUE)
                    .addComponent(JobsOfficeManagerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JobsRumShopOwnerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JobsEcommersWebsiteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JobsBusinessmanButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JobsBegButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JobsPanelLayout.createSequentialGroup()
                        .addGroup(JobsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JobsHealthAmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(JobsFoodAmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(JobsMoneyAmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        JobsPanelLayout.setVerticalGroup(
            JobsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JobsPanelLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(JobsBegButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JobsWashCarsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JobsBartenderButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JobsPostmanButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JobsDriverButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JobsFactoryWorkerButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JobsBankClerkButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JobsOfficeManagerButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JobsRumShopOwnerButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JobsSupermarketOwnerButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JobsEcommersWebsiteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JobsBusinessmanButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JobsMoneyAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JobsHealthAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JobsFoodAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelHolderJTabbedPane.addTab("JOBS", JobsPanel);

        MarketFoodLabel.setText("FOOD");

        MarketEatTrashButton.setText("Trash 0$");
        MarketEatTrashButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarketEatTrashButtonActionPerformed(evt);
            }
        });

        MarketEatOatsButton.setText("Oats 2$");
        MarketEatOatsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarketEatOatsButtonActionPerformed(evt);
            }
        });

        MarketEatCupcakeButton.setText("Cupcake 5$");
        MarketEatCupcakeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarketEatCupcakeButtonActionPerformed(evt);
            }
        });

        MarketEatBurgerButton.setText("Burger 20$");
        MarketEatBurgerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarketEatBurgerButtonActionPerformed(evt);
            }
        });

        MarketOrganicFoodButton.setText("Organic food 70$");
        MarketOrganicFoodButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarketOrganicFoodButtonActionPerformed(evt);
            }
        });

        MarketEatInRestaurantButton.setText("Restaurant 140$");
        MarketEatInRestaurantButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarketEatInRestaurantButtonActionPerformed(evt);
            }
        });

        MarketEatInternationalMealsButton.setText("International Meals 200$");
        MarketEatInternationalMealsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarketEatInternationalMealsButtonActionPerformed(evt);
            }
        });

        MarketHealthLabel.setText("HEALTH");

        MarketHealthSleepOnTheRoadButton.setText("Sleep in road 0$");
        MarketHealthSleepOnTheRoadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarketHealthSleepOnTheRoadButtonActionPerformed(evt);
            }
        });

        MarketGeneralPillButton.setText("General pills 2$");
        MarketGeneralPillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarketGeneralPillButtonActionPerformed(evt);
            }
        });

        MarketSmallClinicButton.setText("Small Clinic 5$");
        MarketSmallClinicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarketSmallClinicButtonActionPerformed(evt);
            }
        });

        MarketPolyClinicButton.setText("PolyClinic 20$");
        MarketPolyClinicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarketPolyClinicButtonActionPerformed(evt);
            }
        });

        MarketLocalDoctorButton.setText("Local Doctor 70$");
        MarketLocalDoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarketLocalDoctorButtonActionPerformed(evt);
            }
        });

        MarketHospitalButton.setText("Hospital 140$");
        MarketHospitalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarketHospitalButtonActionPerformed(evt);
            }
        });

        MarketWorldClassHospitalButton.setText("World Class Hospital 200$");
        MarketWorldClassHospitalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarketWorldClassHospitalButtonActionPerformed(evt);
            }
        });

        MarketFoodAmountLabel.setText("FOOD: " + food + "/300");

        MarketHealthAmountLabel.setText("HEALTH: " + health + "/300");

        MarketMoneyAmountLabel.setText("MONEY: " + money + "$");

        MarketLodgingLabel.setText("LODGING");

        MarketRentBasementButton.setText("Rent Basement 70$");
        MarketRentBasementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarketRentBasementButtonActionPerformed(evt);
            }
        });

        MarketRentApartmentButton.setText("Rent Apartment 500$");
        MarketRentApartmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarketRentApartmentButtonActionPerformed(evt);
            }
        });

        MarketBuyApartmentButton.setText("But Apartment 40.000$");
        MarketBuyApartmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarketBuyApartmentButtonActionPerformed(evt);
            }
        });

        MarketBuyPenthouseButton.setText("Buy Penthouse 150.000$");
        MarketBuyPenthouseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarketBuyPenthouseButtonActionPerformed(evt);
            }
        });

        MarketBuyMansionButton.setText("Buy Mansion 500.000$");
        MarketBuyMansionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarketBuyMansionButtonActionPerformed(evt);
            }
        });

        MarketLodgingRemainingTimeLabel.setText("LODGING REMAIN TIME: " + rentRemainingDay);

        MarketTransportLabel.setText("TRANSPORT");

        MarketShoesButton.setText("Shoes 40$");
        MarketShoesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarketShoesButtonActionPerformed(evt);
            }
        });

        MarketBicycleButton.setText("Bicycle 400$");
        MarketBicycleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarketBicycleButtonActionPerformed(evt);
            }
        });

        MarketCarButton.setText("Car 5.000$");
        MarketCarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarketCarButtonActionPerformed(evt);
            }
        });

        MarketLargeTruckButton.setText("Large Truck 20.000$");
        MarketLargeTruckButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarketLargeTruckButtonActionPerformed(evt);
            }
        });

        MarketLimoButton.setText("Limo 70.000$");
        MarketLimoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarketLimoButtonActionPerformed(evt);
            }
        });

        MarketHelicopterButton.setText("Helicopter 200.000$");
        MarketHelicopterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarketHelicopterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MarketPanelLayout = new javax.swing.GroupLayout(MarketPanel);
        MarketPanel.setLayout(MarketPanelLayout);
        MarketPanelLayout.setHorizontalGroup(
            MarketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MarketPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MarketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MarketWorldClassHospitalButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MarketHealthLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MarketEatInternationalMealsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MarketFoodLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MarketPanelLayout.createSequentialGroup()
                        .addGroup(MarketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MarketHealthSleepOnTheRoadButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MarketSmallClinicButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MarketLocalDoctorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MarketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(MarketGeneralPillButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(MarketPolyClinicButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MarketHospitalButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(MarketFoodAmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MarketPanelLayout.createSequentialGroup()
                        .addComponent(MarketEatTrashButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MarketEatOatsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(MarketPanelLayout.createSequentialGroup()
                        .addGroup(MarketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(MarketOrganicFoodButton, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(MarketEatCupcakeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MarketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MarketEatBurgerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MarketEatInRestaurantButton, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(MarketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MarketPanelLayout.createSequentialGroup()
                        .addGroup(MarketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(MarketPanelLayout.createSequentialGroup()
                                .addComponent(MarketShoesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(MarketPanelLayout.createSequentialGroup()
                                .addComponent(MarketHealthAmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(MarketMoneyAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(124, 124, 124))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MarketPanelLayout.createSequentialGroup()
                        .addGroup(MarketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(MarketBicycleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(MarketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MarketPanelLayout.createSequentialGroup()
                                    .addComponent(MarketLimoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(MarketHelicopterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(MarketLodgingRemainingTimeLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MarketBuyMansionButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MarketPanelLayout.createSequentialGroup()
                                    .addGroup(MarketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(MarketRentBasementButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(MarketBuyApartmentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(MarketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(MarketRentApartmentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(MarketBuyPenthouseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(MarketLodgingLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(MarketTransportLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MarketPanelLayout.createSequentialGroup()
                                    .addComponent(MarketCarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(MarketLargeTruckButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        MarketPanelLayout.setVerticalGroup(
            MarketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MarketPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MarketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MarketFoodLabel)
                    .addComponent(MarketLodgingLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MarketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MarketRentBasementButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MarketEatTrashButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MarketEatOatsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MarketRentApartmentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MarketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MarketBuyApartmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MarketEatCupcakeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MarketEatBurgerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MarketBuyPenthouseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MarketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MarketBuyMansionButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(MarketEatInRestaurantButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MarketOrganicFoodButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MarketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MarketLodgingRemainingTimeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MarketEatInternationalMealsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MarketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MarketHealthLabel)
                    .addComponent(MarketTransportLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MarketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MarketShoesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MarketGeneralPillButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MarketHealthSleepOnTheRoadButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MarketBicycleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MarketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MarketLargeTruckButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MarketPolyClinicButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MarketSmallClinicButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MarketCarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MarketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MarketHelicopterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MarketHospitalButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MarketLocalDoctorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MarketLimoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MarketWorldClassHospitalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MarketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MarketMoneyAmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(MarketHealthAmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MarketFoodAmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        PanelHolderJTabbedPane.addTab("MARKET", MarketPanel);

        EducationEducationLabel.setText("EDUCATION");

        EducationSpecialSkillsLabel.setText("SPECIAL SKILLS");

        EducationSecondarySchoolPicLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\deniz\\OneDrive\\Masaüstü\\Education\\Secondary School.png")); // NOI18N

        EducationHighSchoolPicLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\deniz\\OneDrive\\Masaüstü\\Education\\High School.png")); // NOI18N

        EducationGeneralTrainingPicLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\deniz\\OneDrive\\Masaüstü\\Education\\General Training.png")); // NOI18N

        EducationCollagePicLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\deniz\\OneDrive\\Masaüstü\\Education\\Study at Collage.png")); // NOI18N

        EducationMasterDegreePicLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\deniz\\OneDrive\\Masaüstü\\Education\\Master Degree.png")); // NOI18N

        EducationDrivingLicencePicLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\deniz\\OneDrive\\Masaüstü\\Education\\Driving licence.png")); // NOI18N

        EducationLiquorPermitPicLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\deniz\\OneDrive\\Masaüstü\\Education\\liquor permit.png")); // NOI18N

        EducationLearnBusinessPicLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\deniz\\OneDrive\\Masaüstü\\Education\\learn business.png")); // NOI18N

        EducationLearnLawsPicLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\deniz\\OneDrive\\Masaüstü\\Education\\learn laws.png")); // NOI18N

        EducationLearnAccountPicLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\deniz\\OneDrive\\Masaüstü\\Education\\Accounting.png")); // NOI18N

        EducationLearnManagementPicLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\deniz\\OneDrive\\Masaüstü\\Education\\learn management.png")); // NOI18N

        EducationSecondarySchoolButton.setText("Secondary School 100$");
        EducationSecondarySchoolButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EducationSecondarySchoolButtonActionPerformed(evt);
            }
        });

        EducationHighSchoolButton.setText("High School 7.500$");
        EducationHighSchoolButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EducationHighSchoolButtonActionPerformed(evt);
            }
        });

        EducationGeneralTrainingButton.setText("General Training 15.000$");
        EducationGeneralTrainingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EducationGeneralTrainingButtonActionPerformed(evt);
            }
        });

        EducationStudyatCollageButton.setText("Study at Collage 25.000$");
        EducationStudyatCollageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EducationStudyatCollageButtonActionPerformed(evt);
            }
        });

        EducationMasterDegreeButton.setText("Master Degree 100.000$");
        EducationMasterDegreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EducationMasterDegreeButtonActionPerformed(evt);
            }
        });

        EducationDrivingLicenceButton.setText("Driving Licence 300$");
        EducationDrivingLicenceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EducationDrivingLicenceButtonActionPerformed(evt);
            }
        });

        EducationLiquorPermitButton.setText("Liquor Permit 800$");
        EducationLiquorPermitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EducationLiquorPermitButtonActionPerformed(evt);
            }
        });

        EducationLearnBusinessButton.setText("Learn Business 7.000$");
        EducationLearnBusinessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EducationLearnBusinessButtonActionPerformed(evt);
            }
        });

        EducationLearnLawsButton.setText("Learn Laws 12.000$");
        EducationLearnLawsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EducationLearnLawsButtonActionPerformed(evt);
            }
        });

        EducationAccountingButton.setText("Learn Accounting 13.000$");
        EducationAccountingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EducationAccountingButtonActionPerformed(evt);
            }
        });

        EducationLearnManagementButton.setText("Learn Management 25.000$");
        EducationLearnManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EducationLearnManagementButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EducationPanelLayout = new javax.swing.GroupLayout(EducationPanel);
        EducationPanel.setLayout(EducationPanelLayout);
        EducationPanelLayout.setHorizontalGroup(
            EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EducationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EducationEducationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(EducationPanelLayout.createSequentialGroup()
                        .addGroup(EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(EducationPanelLayout.createSequentialGroup()
                                    .addComponent(EducationGeneralTrainingPicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(EducationGeneralTrainingButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(EducationPanelLayout.createSequentialGroup()
                                    .addComponent(EducationHighSchoolPicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(EducationHighSchoolButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(EducationPanelLayout.createSequentialGroup()
                                    .addComponent(EducationSecondarySchoolPicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(EducationSecondarySchoolButton, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(EducationPanelLayout.createSequentialGroup()
                                    .addComponent(EducationMasterDegreePicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(EducationMasterDegreeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(EducationPanelLayout.createSequentialGroup()
                                .addComponent(EducationCollagePicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(EducationStudyatCollageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EducationSpecialSkillsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(EducationPanelLayout.createSequentialGroup()
                        .addGroup(EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EducationLearnLawsPicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EducationLearnAccountPicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EducationLearnManagementPicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EducationLearnBusinessPicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EducationLiquorPermitPicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EducationDrivingLicencePicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(EducationLiquorPermitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EducationLearnBusinessButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EducationLearnManagementButton, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                                .addComponent(EducationDrivingLicenceButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(EducationLearnLawsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EducationAccountingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(125, 125, 125))
        );
        EducationPanelLayout.setVerticalGroup(
            EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EducationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(EducationPanelLayout.createSequentialGroup()
                        .addGroup(EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(EducationPanelLayout.createSequentialGroup()
                                .addGroup(EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(EducationEducationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                    .addComponent(EducationSpecialSkillsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(EducationDrivingLicenceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(EducationDrivingLicencePicLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(EducationSecondarySchoolPicLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(EducationSecondarySchoolButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(EducationHighSchoolButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(EducationLiquorPermitPicLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(EducationHighSchoolPicLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(EducationLiquorPermitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(EducationGeneralTrainingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EducationGeneralTrainingPicLabel)
                                    .addComponent(EducationLearnBusinessPicLabel)
                                    .addComponent(EducationLearnBusinessButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(EducationLearnLawsPicLabel)
                                    .addComponent(EducationLearnLawsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EducationCollagePicLabel)))
                            .addComponent(EducationStudyatCollageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EducationLearnAccountPicLabel)
                            .addComponent(EducationAccountingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EducationMasterDegreePicLabel)))
                    .addComponent(EducationMasterDegreeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EducationLearnManagementPicLabel)
                    .addComponent(EducationLearnManagementButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        PanelHolderJTabbedPane.addTab("EDUCATION", EducationPanel);

        BlackJackButton.setText("MiniGame \n BlackJack");
        BlackJackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlackJackButtonActionPerformed(evt);
            }
        });

        SlotButton.setText("MiniGame \n Slot");
        SlotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SlotButtonActionPerformed(evt);
            }
        });

        HorseRaceButton.setText("MiniGame \n Horse Race");
        HorseRaceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HorseRaceButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MiniGamesPanelLayout = new javax.swing.GroupLayout(MiniGamesPanel);
        MiniGamesPanel.setLayout(MiniGamesPanelLayout);
        MiniGamesPanelLayout.setHorizontalGroup(
            MiniGamesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MiniGamesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BlackJackButton)
                .addGap(18, 18, 360)
                .addComponent(SlotButton)
                .addGap(18, 18, 360)
                .addComponent(HorseRaceButton)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        MiniGamesPanelLayout.setVerticalGroup(
            MiniGamesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MiniGamesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MiniGamesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BlackJackButton)
                    .addComponent(SlotButton)
                    .addComponent(HorseRaceButton))
                .addContainerGap(466, Short.MAX_VALUE))
        );

        PanelHolderJTabbedPane.addTab("MINI GAMES", MiniGamesPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelHolderJTabbedPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelHolderJTabbedPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void MarketEatBurgerButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        if(food <=250 && money >= 20){
        
            health -=5;
            MainMenuHealthAmountLabel.setText(String.valueOf("HEALTH: " +health+ "/300"));
            JobsHealthAmountLabel.setText(String.valueOf("HEALTH: " +health +"/300"));
            MarketHealthAmountLabel.setText(String.valueOf("HEALTH: " +health +"/300"));
            food += 50;
            MainMenuFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            JobsFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            MarketFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            money -=20;
            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " + money + "$"));
            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " + money + "$"));
            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " + money + "$"));
            
            if(health <= 0){
            
                JOptionPane.showMessageDialog(null, "SAY HI TO KOBE BRYANT", "ALERT", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            
            }
            
        
        }
        
        else if(money < 20){
            
            JOptionPane.showMessageDialog(null, "YOU ARE POOR AND CANNOT BUY IT", "ALERT", JOptionPane.PLAIN_MESSAGE);
        
        }
        
        else if(food > 250){
        
            JOptionPane.showMessageDialog(null, "ARE YOU TRYING TO BE OBESE?", "ALERT", JOptionPane.PLAIN_MESSAGE);
        
        }
    }                                                     

    private void MarketBuyPenthouseButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        
        lodging = "BUY PENTHOUSE";
        MainMenuLodgingAmountLabel.setText(lodging);
        money -= 150000;
        MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
        JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
        MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
        MarketBuyPenthouseButton.setEnabled(false);
        
        
    }                                                        

    private void JobsBegButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        
        money += 1;
        MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " + money + "$"));
        JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " + money + "$"));
        MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " + money + "$"));
        health -= 5;
        MainMenuHealthAmountLabel.setText(String.valueOf("HEALTH: " +health +"/300"));
        JobsHealthAmountLabel.setText(String.valueOf("HEALTH: " +health +"/300"));
        MarketHealthAmountLabel.setText(String.valueOf("HEALTH: " +health +"/300"));
        food -= 5;
        MainMenuFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
        JobsFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
        MarketFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
        day++;
        
        if(health <=0 || food <=0){
            JOptionPane.showMessageDialog(null, "SAY HI TO KOBE BRYANT", "ALERT", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        }
              
    }                                             

    private void JobsWashCarsButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        if(transport.equals("SHOES")){
            
            money += 5;
            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            health -= 7;
            MainMenuHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            JobsHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            MarketHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            food -= 7;
            MainMenuFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            JobsFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            MarketFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            day++;
            
            if(health <=0 || food <=0){
                JOptionPane.showMessageDialog(null, "SAY HI TO KOBE BRYANT", "ALERT", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            }
        }
        
        else{
        
            JOptionPane.showMessageDialog(null, "YOU NEED SHOES", "ALERT", JOptionPane.PLAIN_MESSAGE);
        
        }
    }                                                  

    private void JobsBartenderButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        
        if(transport.equals("SHOES")&& lodging.equals("RENT BASEMENT")&&education.equals("SECONDARY SCHOOL")){
            
        	if(rentRemainingDay <1){
                
                JOptionPane.showMessageDialog(null, "YOUR RENT TIME IS OVER RENT AGAIN", "ALERT", JOptionPane.PLAIN_MESSAGE);
            
            }
        	else {
	            money += 20;
	            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
	            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
	            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
	            health -= 9;
	            MainMenuHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
	            JobsHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
	            MarketHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
	            food -= 9;
	            MainMenuFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
	            JobsFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
	            MarketFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
	            rentRemainingDay -=1;
	            MarketLodgingRemainingTimeLabel.setText(String.valueOf("RENT DAY REMAIN: " + rentRemainingDay));
	            day++;
	            
	            
	
	            if(health <=0 || food <=0){
	                JOptionPane.showMessageDialog(null, "SAY HI TO KOBE BRYANT", "ALERT", JOptionPane.PLAIN_MESSAGE);
	                System.exit(0);
	            }
        	}
        
        }
        
        else{
        
            JOptionPane.showMessageDialog(null, "YOU NEED SHOES, RENT BASEMENT, SECONDARY SCHOOL", "ALERT", JOptionPane.PLAIN_MESSAGE);
        
        }
        
    }                                                   

    private void JobsPostmanButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        
        if(transport.equals("BICYCLE")&& lodging.equals("RENT BASEMENT")&&education.equals("SECONDARY SCHOOL")){
        
        	if(rentRemainingDay <=0){
                
                JOptionPane.showMessageDialog(null, "YOUR RENT TIME IS OVER RENT AGAIN", "ALERT", JOptionPane.PLAIN_MESSAGE);
            
            }
        	else {
	            money += 50;
	            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
	            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
	            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
	            health -= 9;
	            MainMenuHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
	            JobsHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
	            MarketHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
	            food -= 11;
	            MainMenuFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
	            JobsFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
	            MarketFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
	            rentRemainingDay -=1;
	            MarketLodgingRemainingTimeLabel.setText(String.valueOf("RENT DAY REMAIN: " + rentRemainingDay));
	            day++;
	          
	            
	
	            if(health <=0 || food <=0){
	                JOptionPane.showMessageDialog(null, "SAY HI TO KOBE BRYANT", "ALERT", JOptionPane.PLAIN_MESSAGE);
	                System.exit(0);
	            }
        	}
        
        }
        
        else{
            
            JOptionPane.showMessageDialog(null, "YOU NEED BICYCLE, RENT BASEMENT, SECONDARY SCHOOL", "ALERT", JOptionPane.PLAIN_MESSAGE);
        
        }
        
    }                                                 

    private void JobsDriverButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
            
        if(transport.equals("CAR")&& lodging.equals("RENT BASEMENT")&&education.equals("SECONDARY SCHOOL")&&specialSkills.equals("DRIVING LICENCE")){
            
        	if(rentRemainingDay <=0){
                
                JOptionPane.showMessageDialog(null, "YOUR RENT TIME IS OVER RENT AGAIN", "ALERT", JOptionPane.PLAIN_MESSAGE);
            
            }
        	else {
	            money += 100;
	            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
	            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
	            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
	            health -= 11;
	            MainMenuHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
	            JobsHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
	            MarketHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
	            food -= 13;
	            MainMenuFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
	            JobsFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
	            MarketFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
	            rentRemainingDay -=1;
	            MarketLodgingRemainingTimeLabel.setText(String.valueOf("RENT DAY REMAIN: " + rentRemainingDay));
	            day++;
	            
	            
	
	            if(health <=0 || food <=0){
	                JOptionPane.showMessageDialog(null, "SAY HI TO KOBE BRYANT", "ALERT", JOptionPane.PLAIN_MESSAGE);
	                System.exit(0);
	            }
        	}
            
        }
            
        else{
            
            JOptionPane.showMessageDialog(null, "YOU NEED CAR, RENT BASEMENT, SECONDARY SCHOOL, DRIVING LICENCE", "ALERT", JOptionPane.PLAIN_MESSAGE);
            
        }
            
    }                                                

    private void JobsFactoryWorkerButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        
        if(transport.equals("CAR")&& lodging.equals("RENT BASEMENT")&&education.equals("GENERAL TRAINING")&&specialSkills.equals("DRIVING LICENCE")){
            
        	if(rentRemainingDay <=0){
                
                JOptionPane.showMessageDialog(null, "YOUR RENT TIME IS OVER RENT AGAIN", "ALERT", JOptionPane.PLAIN_MESSAGE);
            
            }
        	else {
	            money += 150;
	            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
	            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
	            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
	            health -= 13;
	            MainMenuHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
	            JobsHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
	            MarketHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
	            food -= 15;
	            MainMenuFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
	            JobsFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
	            MarketFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
	            rentRemainingDay -=1;
	            MarketLodgingRemainingTimeLabel.setText(String.valueOf("RENT DAY REMAIN: " + rentRemainingDay));
	            day++;
	            
	            
	
	            if(health <=0 || food <=0){
	                JOptionPane.showMessageDialog(null, "SAY HI TO KOBE BRYANT", "ALERT", JOptionPane.PLAIN_MESSAGE);
	                System.exit(0);
	            }
        	}
            
        }
            
        else{
            
            JOptionPane.showMessageDialog(null, "YOU NEED CAR, RENT BASEMENT, GENERAL TRAINING, DRIVING LICENCE", "ALERT", JOptionPane.PLAIN_MESSAGE);
            
        }
        
    }                                                       

    private void JobsBankClerkButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        
        if(transport.equals("CAR")&& lodging.equals("RENT BASEMENT")&&education.equals("COLLAGE")&&specialSkills.equals("DRIVING LICENCE")){

            if(rentRemainingDay <=0){
            
                JOptionPane.showMessageDialog(null, "YOUR RENT TIME IS OVER RENT AGAIN", "ALERT", JOptionPane.PLAIN_MESSAGE);
            
            }
            else {
	            money += 500;
	            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
	            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
	            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
	            health -= 13;
	            MainMenuHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
	            JobsHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
	            MarketHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
	            food -= 20;
	            MainMenuFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
	            JobsFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
	            MarketFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
	            rentRemainingDay -=1;
	            MarketLodgingRemainingTimeLabel.setText(String.valueOf("RENT DAY REMAIN: " + rentRemainingDay));
	            day++;
	            
	
	            if(health <=0 || food <=0){
	                JOptionPane.showMessageDialog(null, "SAY HI TO KOBE BRYANT", "ALERT", JOptionPane.PLAIN_MESSAGE);
	                System.exit(0);
	            }
            }
            
        }
            
        else{
            
            JOptionPane.showMessageDialog(null, "YOU NEED CAR, RENT BASEMENT, COLLAGE, DRIVING LICENCE", "ALERT", JOptionPane.PLAIN_MESSAGE);
            
        }
        
    }                                                   

    private void JobsOfficeManagerButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        
        
        if(transport.equals("CAR")&& lodging.equals("RENT APARTMENT")&&education.equals("COLLAGE")&&specialSkills.equals("DRIVING LICENCE")){
            
        	if(rentRemainingDay <=0){
                
                JOptionPane.showMessageDialog(null, "YOUR RENT TIME IS OVER RENT AGAIN", "ALERT", JOptionPane.PLAIN_MESSAGE);
            
            }
        	
        	else {
	            money += 800;
	            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
	            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
	            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
	            health -= 15;
	            MainMenuHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
	            JobsHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
	            MarketHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
	            food -= 22;
	            MainMenuFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
	            JobsFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
	            MarketFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
	            rentRemainingDay -=1;
	            MarketLodgingRemainingTimeLabel.setText(String.valueOf("RENT DAY REMAIN: " + rentRemainingDay));
	            day++;
	            
	            
	
	            if(health <=0 || food <=0){
	                JOptionPane.showMessageDialog(null, "SAY HI TO KOBE BRYANT", "ALERT", JOptionPane.PLAIN_MESSAGE);
	                System.exit(0);
	            }
        	}
            
        }
            
        else{
            
            JOptionPane.showMessageDialog(null, "YOU NEED CAR, RENT APARTMENT, COLLAGE, DRIVING LICENCE", "ALERT", JOptionPane.PLAIN_MESSAGE);
            
        }
        
    }                                                       

    private void JobsRumShopOwnerButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        
        if(transport.equals("LARGE TRUCK")&& lodging.equals("BUY APARTMENT")&&education.equals("COLLAGE")&&specialSkills.equals("LIQUOR PERMIT")){
            
            money += 2000;
            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            health -= 20;
            MainMenuHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            JobsHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            MarketHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            food -= 24;
            MainMenuFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            JobsFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            MarketFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            day++;
            
            if(health <=0 || food <=0){
                JOptionPane.showMessageDialog(null, "SAY HI TO KOBE BRYANT", "ALERT", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            }
            
        }
            
        else{
            
            JOptionPane.showMessageDialog(null, "YOU NEED LARGE TRUCK, BUY APARTMENT, COLLAGE, LIQUOR PERMIT", "ALERT", JOptionPane.PLAIN_MESSAGE);
            
        }
        
    }                                                      

    private void JobsSupermarketOwnerButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                           
        
        if(transport.equals("LARGE TRUCK")&& lodging.equals("BUY APARTMENT")&&education.equals("COLLAGE")&&specialSkills.equals("LEARN BUSINESS")){
            
            money += 4000;
            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            health -= 22;
            MainMenuHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            JobsHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            MarketHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            food -= 26;
            MainMenuFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            JobsFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            MarketFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            day++;
            
            if(health <=0 || food <=0){
                JOptionPane.showMessageDialog(null, "SAY HI TO KOBE BRYANT", "ALERT", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            }
            
        }
            
        else{
            
            JOptionPane.showMessageDialog(null, "YOU NEED LARGE TRUCK, BUY APARTMENT, COLLAGE, LEARN BUSINESS", "ALERT", JOptionPane.PLAIN_MESSAGE);
            
        }
        
    }                                                          

    private void JobsEcommersWebsiteButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        
        if(transport.equals("LIMO")&& lodging.equals("BUY PENTHOUSE")&&education.equals("MASTER DEGREE")&&specialSkills.equals("LEARN LAWS")){
            
            money += 6000;
            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            health -= 28;
            MainMenuHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            JobsHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            MarketHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            food -= 28;
            MainMenuFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            JobsFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            MarketFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            day++;
            
            if(health <=0 || food <=0){
                JOptionPane.showMessageDialog(null, "SAY HI TO KOBE BRYANT", "ALERT", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            }
            
        }
            
        else{
            
            JOptionPane.showMessageDialog(null, "YOU NEED LIMO, BUY PENTHOUSE, MASTER DEGREE, LEARN LAWS", "ALERT", JOptionPane.PLAIN_MESSAGE);
            
        }
        
    }                                                         

    private void JobsBusinessmanButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        
        if(transport.equals("HELICOPTER")&& lodging.equals("BUY MANSION")&&education.equals("MASTER DEGREE")&&specialSkills.equals("LEARN MANAGEMENT")){
            
            money += 20000;
            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            health -= 30;
            MainMenuHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            JobsHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            MarketHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            food -= 30;
            MainMenuFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            JobsFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            MarketFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            day++;
            
            if(health <=0 || food <=0){
                JOptionPane.showMessageDialog(null, "SAY HI TO KOBE BRYANT", "ALERT", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            }
            
        }
            
        else{
            
            JOptionPane.showMessageDialog(null, "YOU NEED HELICOPTER, BUY MANSION, MASTER DEGREE, LEARN MANAGEMENT", "ALERT", JOptionPane.PLAIN_MESSAGE);
            
        }
        
    }                                                     

    private void MarketEatTrashButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        
        if(food <=290){
        
            health -=5;
            MainMenuHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            JobsHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            MarketHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            food += 10;
            MainMenuFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            JobsFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            MarketFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            
            if(health <= 0){
            
                JOptionPane.showMessageDialog(null, "SAY HI TO KOBE BRYANT", "ALERT", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            
            }
            
        
        }
        
        else{
            
            JOptionPane.showMessageDialog(null, "ARE YOU TRYING TO BE OBESE?", "ALERT", JOptionPane.PLAIN_MESSAGE);
        
        }
        
    }                                                    

    private void MarketEatOatsButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        
        if(food <=285 && money >= 2){
        
            health -=5;
            MainMenuHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            JobsHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            MarketHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            food += 15;
            MainMenuFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            JobsFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            MarketFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            money -=2;
            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            
            if(health <= 0){
            
                JOptionPane.showMessageDialog(null, "SAY HI TO KOBE BRYANT", "ALERT", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            
            }
            
        
        }
        
        else if(food > 285){
            
            JOptionPane.showMessageDialog(null, "ARE YOU TRYING TO BE OBESE?", "ALERT", JOptionPane.PLAIN_MESSAGE);
        
        }
        
        else if(money <2){
            
            JOptionPane.showMessageDialog(null, "YOU ARE POOR AND CANNOT BUY IT", "ALERT", JOptionPane.PLAIN_MESSAGE);
        
        }
        
    }                                                   

    private void MarketEatCupcakeButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        if(food <=280 && money >= 5){
        
            health -=5;
            MainMenuHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            JobsHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            MarketHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            food += 20;
            MainMenuFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            JobsFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            MarketFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            money -=5;
            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            
            if(health <= 0){
            
                JOptionPane.showMessageDialog(null, "SAY HI TO KOBE BRYANT", "ALERT", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            
            }
            
        
        }
        
        else if(food > 280){
            
            JOptionPane.showMessageDialog(null, "ARE YOU TRYING TO BE OBESE?", "ALERT", JOptionPane.PLAIN_MESSAGE);
        
        }
        
        else if(money <5){
            
            JOptionPane.showMessageDialog(null, "YOU ARE POOR AND CANNOT BUY IT", "ALERT", JOptionPane.PLAIN_MESSAGE);
        
        }
    }                                                      

    private void MarketOrganicFoodButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        if(food <=180 && money >= 70){
        
            health -=4;
            MainMenuHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            JobsHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            MarketHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            food += 120;
            MainMenuFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            JobsFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            MarketFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            money -=70;
            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            
            if(health <= 0){
            
                JOptionPane.showMessageDialog(null, "SAY HI TO KOBE BRYANT", "ALERT", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            
            }
            
        
        }
        
        else if(food > 180){
            
            JOptionPane.showMessageDialog(null, "ARE YOU TRYING TO BE OBESE?", "ALERT", JOptionPane.PLAIN_MESSAGE);
        
        }
        
        else if(money <70){
            
            JOptionPane.showMessageDialog(null, "YOU ARE POOR AND CANNOT BUY IT", "ALERT", JOptionPane.PLAIN_MESSAGE);
        
        }
    }                                                       

    private void MarketEatInRestaurantButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                            
        if(food <=150 && money >= 140){
        
            health -=3;
            MainMenuHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            JobsHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            MarketHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            food += 150;
            MainMenuFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            JobsFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            MarketFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            money -=140;
            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            
            if(health <= 0){
            
                JOptionPane.showMessageDialog(null, "SAY HI TO KOBE BRYANT", "ALERT", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            
            }
            
        
        }
        
        else if(food > 150){
            
            JOptionPane.showMessageDialog(null, "ARE YOU TRYING TO BE OBESE?", "ALERT", JOptionPane.PLAIN_MESSAGE);
        
        }
        
        else if(money < 140){
            
            JOptionPane.showMessageDialog(null, "YOU ARE POOR AND CANNOT BUY IT", "ALERT", JOptionPane.PLAIN_MESSAGE);
        
        }
    }                                                           

    private void MarketEatInternationalMealsButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                                  
        if(food <=100 && money > 200){
        
            health -=1;
            MainMenuHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            JobsHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            MarketHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            food += 200;
            MainMenuFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            JobsFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            MarketFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            money -=200;
            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            
            if(health <= 0){
            
                JOptionPane.showMessageDialog(null, "SAY HI TO KOBE BRYANT", "ALERT", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            
            }
            
        
        }
        
        else if(food > 150){
            
            JOptionPane.showMessageDialog(null, "ARE YOU TRYING TO BE OBESE?", "ALERT", JOptionPane.PLAIN_MESSAGE);
        
        }
        
        else if(money < 140){
            
            JOptionPane.showMessageDialog(null, "YOU ARE POOR AND CANNOT BUY IT", "ALERT", JOptionPane.PLAIN_MESSAGE);
        
        }
    }                                                                 

    private void MarketHealthSleepOnTheRoadButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                                 
        if(health <=290){
        
            health +=10;
            MainMenuHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            JobsHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            MarketHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            food -= 5;
            MainMenuFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            JobsFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            MarketFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            
            if(food <= 0){
            
                JOptionPane.showMessageDialog(null, "SAY HI TO KOBE BRYANT", "ALERT", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            
            }
            
        
        }
        
        else{
            
            JOptionPane.showMessageDialog(null, "ARE YOU TRYING TO BE IMMORTAL?", "ALERT", JOptionPane.PLAIN_MESSAGE);
        
        }
    }                                                                

    private void MarketGeneralPillButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        if(health <=285 && money >= 2){
        
            health +=15;
            MainMenuHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            JobsHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            MarketHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            food -= 5;
            MainMenuFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            JobsFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            MarketFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            money -=2;
            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            
            if(food <= 0){
            
                JOptionPane.showMessageDialog(null, "SAY HI TO KOBE BRYANT", "ALERT", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            
            }
            
        
        }
        
        else if(health > 285){
            
            JOptionPane.showMessageDialog(null, "ARE YOU TRYING TO BE IMMORTAL?", "ALERT", JOptionPane.PLAIN_MESSAGE);
        
        }
        
        else if(money < 2){
            
            JOptionPane.showMessageDialog(null, "YOU ARE POOR AND CANNOT BUY IT", "ALERT", JOptionPane.PLAIN_MESSAGE);
        
        }
    }                                                       

    private void MarketSmallClinicButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        if(health <=280 && money >= 5){
        
            health += 20;
            MainMenuHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            JobsHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            MarketHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            food -= 5;
            MainMenuFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            JobsFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            MarketFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            money -= 5;
            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            
            if(food <= 0){
            
                JOptionPane.showMessageDialog(null, "SAY HI TO KOBE BRYANT", "ALERT", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            
            }
            
        
        }
        
        else if(health > 280){
            
            JOptionPane.showMessageDialog(null, "ARE YOU TRYING TO BE IMMORTAL?", "ALERT", JOptionPane.PLAIN_MESSAGE);
        
        }
        
        else if(money < 5){
            
            JOptionPane.showMessageDialog(null, "YOU ARE POOR AND CANNOT BUY IT", "ALERT", JOptionPane.PLAIN_MESSAGE);
        
        }
    }                                                       

    private void MarketPolyClinicButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        if(health <=260 && money >= 20){
        
            health += 40;
            MainMenuHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            JobsHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            MarketHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            food -= 4;
            MainMenuFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            JobsFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            MarketFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            money -= 20;
            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            
            if(food <= 0){
            
                JOptionPane.showMessageDialog(null, "SAY HI TO KOBE BRYANT", "ALERT", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            
            }
            
        
        }
        
        else if(health > 260){
            
            JOptionPane.showMessageDialog(null, "ARE YOU TRYING TO BE IMMORTAL?", "ALERT", JOptionPane.PLAIN_MESSAGE);
        
        }
        
        else if(money < 20){
            
            JOptionPane.showMessageDialog(null, "YOU ARE POOR AND CANNOT BUY IT", "ALERT", JOptionPane.PLAIN_MESSAGE);
        
        }
    }                                                      

    private void MarketLocalDoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        if(health <=180 && money >= 70){
        
            health += 120;
            MainMenuHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            JobsHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            MarketHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            food -= 4;
            MainMenuFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            JobsFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            MarketFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            money -= 70;
            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            
            if(food <= 0){
            
                JOptionPane.showMessageDialog(null, "SAY HI TO KOBE BRYANT", "ALERT", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            
            }
            
        
        }
        
        else if(health > 180){
            
            JOptionPane.showMessageDialog(null, "ARE YOU TRYING TO BE IMMORTAL?", "ALERT", JOptionPane.PLAIN_MESSAGE);
        
        }
        
        else if(money < 70){
            
            JOptionPane.showMessageDialog(null, "YOU ARE POOR AND CANNOT BUY IT", "ALERT", JOptionPane.PLAIN_MESSAGE);
        
        }
    }                                                       

    private void MarketHospitalButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        if(health <=150 && money >= 140){
        
            health += 150;
            MainMenuHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            JobsHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            MarketHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            food -= 3;
            MainMenuFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            JobsFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            MarketFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            money -= 140;
            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            
            if(food <= 0){
            
                JOptionPane.showMessageDialog(null, "SAY HI TO KOBE BRYANT", "ALERT", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            
            }
            
        
        }
        
        else if(health > 150){
            
            JOptionPane.showMessageDialog(null, "ARE YOU TRYING TO BE IMMORTAL?", "ALERT", JOptionPane.PLAIN_MESSAGE);
        
        }
        
        else if(money < 140){
            
            JOptionPane.showMessageDialog(null, "YOU ARE POOR AND CANNOT BUY IT", "ALERT", JOptionPane.PLAIN_MESSAGE);
        
        }
    }                                                    

    private void MarketWorldClassHospitalButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                               
        if(health <=100 && money >= 200){
        
            health += 200;
            MainMenuHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            JobsHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            MarketHealthAmountLabel.setText(String.valueOf("HEALTH: " +health + "/300"));
            food -= 1;
            MainMenuFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            JobsFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            MarketFoodAmountLabel.setText(String.valueOf("FOOD: " +food + "/300"));
            money -= 200;
            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            
            
            if(food <= 0){
            
                JOptionPane.showMessageDialog(null, "SAY HI TO KOBE BRYANT", "ALERT", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            
            }
            
        
        }
        
        else if(health > 100){
            
            JOptionPane.showMessageDialog(null, "ARE YOU TRYING TO BE IMMORTAL?", "ALERT", JOptionPane.PLAIN_MESSAGE);
        
        }
        
        else if(money < 200){
            
            JOptionPane.showMessageDialog(null, "YOU ARE POOR AND CANNOT BUY IT", "ALERT", JOptionPane.PLAIN_MESSAGE);
        
        }
    }                                                              

    private void MarketRentBasementButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        if(money >= 70){
            rentRemainingDay +=30;
            MarketLodgingRemainingTimeLabel.setText(String.valueOf("RENT DAY REMAIN: " + rentRemainingDay));
            lodging = "RENT BASEMENT";
            MainMenuLodgingAmountLabel.setText(lodging);
            money -=70;
            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
        }
        
        else
            JOptionPane.showMessageDialog(null, "YOU ARE POOR AND CANNOT BUY IT", "ALERT", JOptionPane.PLAIN_MESSAGE);
    }                                                        

    private void MarketRentApartmentButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        if(money >= 500){
            rentRemainingDay +=30;
            MarketLodgingRemainingTimeLabel.setText(String.valueOf("RENT DAY REMAIN: " + rentRemainingDay));
            lodging = "RENT APARTMENT";
            MainMenuLodgingAmountLabel.setText(lodging);
            money -=500;
            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
        }
        
        else
            JOptionPane.showMessageDialog(null, "YOU ARE POOR AND CANNOT BUY IT", "ALERT", JOptionPane.PLAIN_MESSAGE);
    }                                                         

    private void MarketBuyApartmentButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        if(money >= 40000){
            lodging = "BUY APARTMENT";
            MainMenuLodgingAmountLabel.setText(lodging);
            money -= 40000;
            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketBuyApartmentButton.setEnabled(false);
        }
        
        else
            JOptionPane.showMessageDialog(null, "YOU ARE POOR AND CANNOT BUY IT", "ALERT", JOptionPane.PLAIN_MESSAGE);
    }                                                        

    private void MarketBuyMansionButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        if(money >= 500000){
            lodging = "BUY MANSION";
            MainMenuLodgingAmountLabel.setText(lodging);
            money -= 500000;
            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketBuyMansionButton.setEnabled(false);
        }
        
        else
            JOptionPane.showMessageDialog(null, "YOU ARE POOR AND CANNOT BUY IT", "ALERT", JOptionPane.PLAIN_MESSAGE);
    }                                                      

    private void MarketShoesButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        if(money >=40){
            transport = "SHOES";
            MainMenuTransportAmountLabel.setText(transport);
            money -=40;
            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketShoesButton.setEnabled(false);
        }
        
        else
            JOptionPane.showMessageDialog(null, "YOU ARE POOR AND CANNOT BUY IT", "ALERT", JOptionPane.PLAIN_MESSAGE);
    }                                                 

    private void MarketBicycleButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        if(money >=400){
            transport = "BICYCLE";
            MainMenuTransportAmountLabel.setText(transport);
            money -=400;
            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketBicycleButton.setEnabled(false);
        }
        
        else
            JOptionPane.showMessageDialog(null, "YOU ARE POOR AND CANNOT BUY IT", "ALERT", JOptionPane.PLAIN_MESSAGE);
    }                                                   

    private void MarketCarButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        if(money >= 5000){
            transport = "CAR";
            MainMenuTransportAmountLabel.setText(transport);
            money -=5000;
            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketCarButton.setEnabled(false);
        }
        
        else
            JOptionPane.showMessageDialog(null, "YOU ARE POOR AND CANNOT BUY IT", "ALERT", JOptionPane.PLAIN_MESSAGE);
    }                                               

    private void MarketLargeTruckButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        if(money >= 20000){
            transport = "LARGE TRUCK";
            MainMenuTransportAmountLabel.setText(transport);
            money -=20000;
            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketLargeTruckButton.setEnabled(false);
        }
        
        else
            JOptionPane.showMessageDialog(null, "YOU ARE POOR AND CANNOT BUY IT", "ALERT", JOptionPane.PLAIN_MESSAGE);
    }                                                      

    private void MarketLimoButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        if(money >= 70000){
            transport = "LIMO";
            MainMenuTransportAmountLabel.setText(transport);
            money -=70000;
            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketLimoButton.setEnabled(false);
        }
        
        else
            JOptionPane.showMessageDialog(null, "YOU ARE POOR AND CANNOT BUY IT", "ALERT", JOptionPane.PLAIN_MESSAGE);
    }                                                

    private void MarketHelicopterButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        if(money >= 200000){
            transport = "HELICOPTER";
            MainMenuTransportAmountLabel.setText(transport);
            money -=200000;
            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketHelicopterButton.setEnabled(false);
        }
        
        else
            JOptionPane.showMessageDialog(null, "YOU ARE POOR AND CANNOT BUY IT", "ALERT", JOptionPane.PLAIN_MESSAGE);
    }                                                      

    private void EducationLiquorPermitButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                            
        if(money >=800){
            
            specialSkills = "LIQUOR PERMIT";
            
            money -= 800;
            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            EducationLiquorPermitButton.setEnabled(false);
            
        
        }
        
        else
            JOptionPane.showMessageDialog(null, "YOU ARE POOR AND CANNOT BUY IT", "ALERT", JOptionPane.PLAIN_MESSAGE);
    }                                                           

    private void EducationHighSchoolButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        if(money >=7500){
            
            education = "HIGH SCHOOL";
            MainMenuEducationAmountLabel.setText(education);
            money -= 7500;
            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            EducationHighSchoolButton.setEnabled(false);
            
        
        }
        
        else
            JOptionPane.showMessageDialog(null, "YOU ARE POOR AND CANNOT BUY IT", "ALERT", JOptionPane.PLAIN_MESSAGE);
    }                                                         

    private void EducationSecondarySchoolButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                               
        if(money >=100){
            
            education = "SECONDARY SCHOOL";
            
            MainMenuEducationAmountLabel.setText(education);
            money -= 100;
            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            EducationSecondarySchoolButton.setEnabled(false);
            
        
        }
        
        else
            JOptionPane.showMessageDialog(null, "YOU ARE POOR AND CANNOT BUY IT", "ALERT", JOptionPane.PLAIN_MESSAGE);
    }                                                              

    private void EducationGeneralTrainingButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                               
        if(money >=15000){
            
            education = "GENERAL TRAINING";
            
            MainMenuEducationAmountLabel.setText(education);
            money -= 15000;
            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            EducationGeneralTrainingButton.setEnabled(false);
        
        }
        
        else
            JOptionPane.showMessageDialog(null, "YOU ARE POOR AND CANNOT BUY IT", "ALERT", JOptionPane.PLAIN_MESSAGE);
    }                                                              

    private void EducationStudyatCollageButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                              
        if(money >=25000){
            
            education = "COLLAGE";
            MainMenuEducationAmountLabel.setText(education);
            money -= 25000;
            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            EducationStudyatCollageButton.setEnabled(false);
        
        }
        
        else
            JOptionPane.showMessageDialog(null, "YOU ARE POOR AND CANNOT BUY IT", "ALERT", JOptionPane.PLAIN_MESSAGE);
    }                                                             

    private void EducationMasterDegreeButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                            
        if(money >=100000){
            
            education = "MASTER DEGREE";
            MainMenuEducationAmountLabel.setText(education);
            money -= 100000;
             MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            EducationMasterDegreeButton.setEnabled(false);
        
        }
        
        else
            JOptionPane.showMessageDialog(null, "YOU ARE POOR AND CANNOT BUY IT", "ALERT", JOptionPane.PLAIN_MESSAGE);
    }                                                           

    private void EducationDrivingLicenceButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                              
        if(money >=300){
            
            specialSkills = "DRIVING LICENCE";
            
            money -= 300;
             MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            EducationDrivingLicenceButton.setEnabled(false);
        
        }
        
        else
            JOptionPane.showMessageDialog(null, "YOU ARE POOR AND CANNOT BUY IT", "ALERT", JOptionPane.PLAIN_MESSAGE);
    }                                                             

    private void EducationLearnBusinessButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                             
        if(money >=7000){
            
            specialSkills = "LEARN BUSINESS";
            
            money -= 7000;
            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            EducationLearnBusinessButton.setEnabled(false);
        
        }
        
        else
            JOptionPane.showMessageDialog(null, "YOU ARE POOR AND CANNOT BUY IT", "ALERT", JOptionPane.PLAIN_MESSAGE);
    }                                                            

    private void EducationLearnLawsButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        if(money >=12000){
            
            specialSkills = "LEARN LAWS";
            
            money -= 12000;
            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            EducationLearnLawsButton.setEnabled(false);
        
        }
        
        else
            JOptionPane.showMessageDialog(null, "YOU ARE POOR AND CANNOT BUY IT", "ALERT", JOptionPane.PLAIN_MESSAGE);
    }                                                        

    private void EducationAccountingButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        if(money >=13000){
            
            specialSkills = "ACCOUNTING";
            
            money -= 13000;
            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            EducationAccountingButton.setEnabled(false);
        
        }
        
        else
            JOptionPane.showMessageDialog(null, "YOU ARE POOR AND CANNOT BUY IT", "ALERT", JOptionPane.PLAIN_MESSAGE);
    }                                                         

    private void EducationLearnManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                               
        if(money >=25000){
            
            specialSkills = "LEARN MANAGEMENT";
            
            money -= 25000;
            MainMenuMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            JobsMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            MarketMoneyAmountLabel.setText(String.valueOf("MONEY: " +money + "$"));
            EducationLearnManagementButton.setEnabled(false);
        
        }
        
        else
            JOptionPane.showMessageDialog(null, "YOU ARE POOR AND CANNOT BUY IT", "ALERT", JOptionPane.PLAIN_MESSAGE);
    }                                                              

    private void BlackJackButtonActionPerformed(java.awt.event.ActionEvent evt) {   
    	 	
        BlackJack.main(money);
        
    }                                        

    private void SlotButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Slot.main(money);
        
    }
    
    private void HorseRaceButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	HorseRace.main(money);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }
                   
    private javax.swing.JButton EducationAccountingButton;
    private javax.swing.JLabel EducationCollagePicLabel;
    private javax.swing.JButton EducationDrivingLicenceButton;
    private javax.swing.JLabel EducationDrivingLicencePicLabel;
    private javax.swing.JLabel EducationEducationLabel;
    private javax.swing.JButton EducationGeneralTrainingButton;
    private javax.swing.JLabel EducationGeneralTrainingPicLabel;
    private javax.swing.JButton EducationHighSchoolButton;
    private javax.swing.JLabel EducationHighSchoolPicLabel;
    private javax.swing.JLabel EducationLearnAccountPicLabel;
    private javax.swing.JButton EducationLearnBusinessButton;
    private javax.swing.JLabel EducationLearnBusinessPicLabel;
    private javax.swing.JButton EducationLearnLawsButton;
    private javax.swing.JLabel EducationLearnLawsPicLabel;
    private javax.swing.JButton EducationLearnManagementButton;
    private javax.swing.JLabel EducationLearnManagementPicLabel;
    private javax.swing.JButton EducationLiquorPermitButton;
    private javax.swing.JLabel EducationLiquorPermitPicLabel;
    private javax.swing.JButton EducationMasterDegreeButton;
    private javax.swing.JLabel EducationMasterDegreePicLabel;
    private javax.swing.JPanel EducationPanel;
    private javax.swing.JButton EducationSecondarySchoolButton;
    private javax.swing.JLabel EducationSecondarySchoolPicLabel;
    private javax.swing.JLabel EducationSpecialSkillsLabel;
    private javax.swing.JButton EducationStudyatCollageButton;
    private javax.swing.JButton JobsBankClerkButton;
    private javax.swing.JButton JobsBartenderButton;
    private javax.swing.JButton JobsBegButton;
    private javax.swing.JButton JobsBusinessmanButton;
    private javax.swing.JButton JobsDriverButton;
    private javax.swing.JButton JobsEcommersWebsiteButton;
    private javax.swing.JButton JobsFactoryWorkerButton;
    private javax.swing.JLabel JobsFoodAmountLabel;
    private javax.swing.JLabel JobsHealthAmountLabel;
    private javax.swing.JLabel JobsMoneyAmountLabel;
    private javax.swing.JButton JobsOfficeManagerButton;
    private javax.swing.JPanel JobsPanel;
    private javax.swing.JButton JobsPostmanButton;
    private javax.swing.JButton JobsRumShopOwnerButton;
    private javax.swing.JButton JobsSupermarketOwnerButton;
    private javax.swing.JButton JobsWashCarsButton;
    private javax.swing.JLabel MainMenuEducationAmountLabel;
    private javax.swing.JLabel MainMenuEducationPicLabel;
    private javax.swing.JLabel MainMenuEducationWriteLabel;
    private javax.swing.JLabel MainMenuFoodAmountLabel;
    private javax.swing.JLabel MainMenuFoodPicLabel;
    private javax.swing.JLabel MainMenuFoodWriteLabel;
    private javax.swing.JLabel MainMenuHealthAmountLabel;
    private javax.swing.JLabel MainMenuHealthPicLabel;
    private javax.swing.JLabel MainMenuHealthWriteLabel;
    private javax.swing.JLabel MainMenuLodgingAmountLabel;
    private javax.swing.JLabel MainMenuLodgingPicLabel;
    private javax.swing.JLabel MainMenuLodgingWriteLabel;
    private javax.swing.JLabel MainMenuMoneyAmountLabel;
    private javax.swing.JLabel MainMenuMoneyPicLabel;
    private javax.swing.JLabel MainMenuMoneyWriteLabel;
    private javax.swing.JPanel MainMenuPanel;
    private javax.swing.JLabel MainMenuTransportAmountLabel;
    private javax.swing.JLabel MainMenuTransportPicLabel;
    private javax.swing.JLabel MainMenuTransportWriteLabel;
    private javax.swing.JButton MarketBicycleButton;
    private javax.swing.JButton MarketBuyApartmentButton;
    private javax.swing.JButton MarketBuyMansionButton;
    private javax.swing.JButton MarketBuyPenthouseButton;
    private javax.swing.JButton MarketCarButton;
    private javax.swing.JButton MarketEatBurgerButton;
    private javax.swing.JButton MarketEatCupcakeButton;
    private javax.swing.JButton MarketEatInRestaurantButton;
    private javax.swing.JButton MarketEatInternationalMealsButton;
    private javax.swing.JButton MarketEatOatsButton;
    private javax.swing.JButton MarketEatTrashButton;
    private javax.swing.JLabel MarketFoodAmountLabel;
    private javax.swing.JLabel MarketFoodLabel;
    private javax.swing.JButton MarketGeneralPillButton;
    private javax.swing.JLabel MarketHealthAmountLabel;
    private javax.swing.JLabel MarketHealthLabel;
    private javax.swing.JButton MarketHealthSleepOnTheRoadButton;
    private javax.swing.JButton MarketHelicopterButton;
    private javax.swing.JButton MarketHospitalButton;
    private javax.swing.JButton MarketLargeTruckButton;
    private javax.swing.JButton MarketLimoButton;
    private javax.swing.JButton MarketLocalDoctorButton;
    private javax.swing.JLabel MarketLodgingLabel;
    private javax.swing.JLabel MarketLodgingRemainingTimeLabel;
    private javax.swing.JLabel MarketMoneyAmountLabel;
    private javax.swing.JButton MarketOrganicFoodButton;
    private javax.swing.JPanel MarketPanel;
    private javax.swing.JButton MarketPolyClinicButton;
    private javax.swing.JButton MarketRentApartmentButton;
    private javax.swing.JButton MarketRentBasementButton;
    private javax.swing.JButton MarketShoesButton;
    private javax.swing.JButton MarketSmallClinicButton;
    private javax.swing.JLabel MarketTransportLabel;
    private javax.swing.JButton MarketWorldClassHospitalButton;
    private javax.swing.JPanel MiniGamesPanel;
    private javax.swing.JTabbedPane PanelHolderJTabbedPane;
    private javax.swing.JButton BlackJackButton;
    private javax.swing.JButton SlotButton;
    private javax.swing.JButton HorseRaceButton;
                   
    private int money = 200;
    String lodging = "STREET";
    String transport = "FOOT";
    String education = "NOTHING";
    String specialSkills = "";
    int health = 300;
    int food = 300;
    int rentRemainingDay = 0;
    int day = 0; 
    
}