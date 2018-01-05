package library;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




public class Menu extends javax.swing.JFrame {

    static String uyeNo=new String();
    
    public Menu(String uyeNum){
        this.uyeNo=uyeNum;
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabPanel = new javax.swing.JTabbedPane();
        kitaplarimTab = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        kullaniciTable = new javax.swing.JTable();
        aramaTab = new javax.swing.JPanel();
        isimAramaLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        aramaTable = new javax.swing.JTable();
        yazarAramaField = new javax.swing.JTextField();
        yazarAramaButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        yazarAramaLabel = new javax.swing.JLabel();
        isimAramaField = new javax.swing.JTextField();
        isimAramaButton = new javax.swing.JButton();
        kiralaTab = new javax.swing.JPanel();
        kiralaLabel = new javax.swing.JLabel();
        kiralaButton = new javax.swing.JButton();
        iadeTab = new javax.swing.JPanel();
        iadeLabel = new javax.swing.JLabel();
        iadeComboBox = new javax.swing.JComboBox<>();
        iadeButton = new javax.swing.JButton();
        cikisTab = new javax.swing.JPanel();
        cikisButPanel = new javax.swing.JPanel();
        cikisButton = new javax.swing.JLabel();
        kitapListPanel = new javax.swing.JPanel();
        kitapListYenileButton = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        kitapList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kütüphane");

        tabPanel.setBackground(new java.awt.Color(255, 224, 0));
        tabPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabPanel.setForeground(new java.awt.Color(1, 1, 1));
        tabPanel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        kitaplarimTab.setBackground(new java.awt.Color(255, 255, 172));
        kitaplarimTab.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        kullaniciTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kitap İsmi", "Yazarı", "Kiralanma Tarihi", "Geri Dönüş Tarihi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(kullaniciTable);

        javax.swing.GroupLayout kitaplarimTabLayout = new javax.swing.GroupLayout(kitaplarimTab);
        kitaplarimTab.setLayout(kitaplarimTabLayout);
        kitaplarimTabLayout.setHorizontalGroup(
            kitaplarimTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        kitaplarimTabLayout.setVerticalGroup(
            kitaplarimTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kitaplarimTabLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        tabPanel.addTab("Kitaplarım", kitaplarimTab);

        aramaTab.setBackground(new java.awt.Color(255, 255, 172));

        isimAramaLabel.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        isimAramaLabel.setText("Kitap İsmine Göre Arama:");

        aramaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kitap İsmi", "Yazar", "Uygunluk", "Dönüş Tarihi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(aramaTable);
        if (aramaTable.getColumnModel().getColumnCount() > 0) {
            aramaTable.getColumnModel().getColumn(2).setResizable(false);
        }

        yazarAramaField.setText("Yazar ismini giriniz");
        yazarAramaField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                yazarAramaFieldFocusGained(evt);
            }
        });

        yazarAramaButton.setText("Ara");
        yazarAramaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yazarAramaButtonActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(254, 254, 254));
        jSeparator1.setForeground(new java.awt.Color(254, 254, 254));
        jSeparator1.setOpaque(true);

        yazarAramaLabel.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        yazarAramaLabel.setText("Yazara Göre Arama:");

        isimAramaField.setText("Kitap ismini giriniz");
        isimAramaField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                isimAramaFieldMouseClicked(evt);
            }
        });

        isimAramaButton.setText("Ara");
        isimAramaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isimAramaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout aramaTabLayout = new javax.swing.GroupLayout(aramaTab);
        aramaTab.setLayout(aramaTabLayout);
        aramaTabLayout.setHorizontalGroup(
            aramaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(aramaTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(aramaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(aramaTabLayout.createSequentialGroup()
                        .addComponent(isimAramaLabel)
                        .addGap(18, 18, 18)
                        .addComponent(isimAramaField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(isimAramaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(aramaTabLayout.createSequentialGroup()
                        .addComponent(yazarAramaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(yazarAramaField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(yazarAramaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        aramaTabLayout.setVerticalGroup(
            aramaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aramaTabLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(aramaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isimAramaLabel)
                    .addComponent(isimAramaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isimAramaButton))
                .addGap(41, 41, 41)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(aramaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yazarAramaLabel)
                    .addComponent(yazarAramaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yazarAramaButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabPanel.addTab("Arama", aramaTab);

        kiralaTab.setBackground(new java.awt.Color(255, 255, 172));

        kiralaLabel.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        kiralaLabel.setText("Kiralanacak Kitabı Listeden Seçiniz:");

        kiralaButton.setText("Kirala");
        kiralaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kiralaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kiralaTabLayout = new javax.swing.GroupLayout(kiralaTab);
        kiralaTab.setLayout(kiralaTabLayout);
        kiralaTabLayout.setHorizontalGroup(
            kiralaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kiralaTabLayout.createSequentialGroup()
                .addGroup(kiralaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kiralaTabLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(kiralaLabel))
                    .addGroup(kiralaTabLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(kiralaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        kiralaTabLayout.setVerticalGroup(
            kiralaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kiralaTabLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(kiralaLabel)
                .addGap(18, 18, 18)
                .addComponent(kiralaButton)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        tabPanel.addTab("Kitap Kirala", kiralaTab);

        iadeTab.setBackground(new java.awt.Color(255, 255, 172));

        iadeLabel.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        iadeLabel.setText("İade Edilecek Kitabı Seçiniz");

        iadeComboBox.setName(""); // NOI18N

        iadeButton.setText("İade Et");
        iadeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iadeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout iadeTabLayout = new javax.swing.GroupLayout(iadeTab);
        iadeTab.setLayout(iadeTabLayout);
        iadeTabLayout.setHorizontalGroup(
            iadeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iadeTabLayout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addGroup(iadeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iadeTabLayout.createSequentialGroup()
                        .addComponent(iadeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iadeTabLayout.createSequentialGroup()
                        .addComponent(iadeLabel)
                        .addGap(107, 107, 107))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iadeTabLayout.createSequentialGroup()
                        .addComponent(iadeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(181, 181, 181))))
        );
        iadeTabLayout.setVerticalGroup(
            iadeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iadeTabLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(iadeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iadeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iadeButton)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        tabPanel.addTab("Kitap İade", iadeTab);

        cikisTab.setBackground(new java.awt.Color(255, 255, 172));

        cikisButPanel.setBackground(java.awt.Color.orange);
        cikisButPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cikisButton.setBackground(new java.awt.Color(1, 1, 1));
        cikisButton.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        cikisButton.setText("Oturumu Kapat");
        cikisButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cikisButtonMouseClicked(evt);
            }
        });
        cikisButPanel.add(cikisButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 190, 40));

        javax.swing.GroupLayout cikisTabLayout = new javax.swing.GroupLayout(cikisTab);
        cikisTab.setLayout(cikisTabLayout);
        cikisTabLayout.setHorizontalGroup(
            cikisTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cikisTabLayout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addComponent(cikisButPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );
        cikisTabLayout.setVerticalGroup(
            cikisTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cikisTabLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(cikisButPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        tabPanel.addTab("Çıkış", cikisTab);

        kitapListPanel.setBackground(new java.awt.Color(172, 228, 214));
        kitapListPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(23, 23, 23), null));
        kitapListPanel.setForeground(new java.awt.Color(172, 228, 214));

        kitapListYenileButton.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        kitapListYenileButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kitapListYenileButton.setText("Yenile");
        kitapListYenileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kitapListYenileButtonMouseClicked(evt);
            }
        });

        kitapList.setBackground(new java.awt.Color(172, 228, 214));
        kitapList.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kitaplar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 18))); // NOI18N
        kitapList.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        jScrollPane3.setViewportView(kitapList);

        javax.swing.GroupLayout kitapListPanelLayout = new javax.swing.GroupLayout(kitapListPanel);
        kitapListPanel.setLayout(kitapListPanelLayout);
        kitapListPanelLayout.setHorizontalGroup(
            kitapListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kitapListYenileButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kitapListPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        kitapListPanelLayout.setVerticalGroup(
            kitapListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kitapListPanelLayout.createSequentialGroup()
                .addComponent(kitapListYenileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(kitapListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kitapListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabPanel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void cikisButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cikisButtonMouseClicked
        setVisible(false);
        LoginPanel login = new LoginPanel();
        login.setVisible(true);
    }//GEN-LAST:event_cikisButtonMouseClicked

    private void kitapListYenileButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kitapListYenileButtonMouseClicked
        Database database = new Database();
        
        // Kitaplar panelini yenileme
        
        DefaultListModel kitapModel = new DefaultListModel();  
        try {
            database.runDatabase();
            String query = "SELECT name FROM books";
            database.state = database.con.createStatement();
            database.result = database.state.executeQuery(query);
            while(database.result.next()){
                String a=database.result.getString(1);
                kitapModel.addElement(a);
            }
            database.result.close();
            database.state.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        kitapList.setModel(kitapModel);
        
        // Kullanicinin kitap tablosunu yenileme
        
        String queryKullaniciBooks="SELECT name,author,rent_date,return_date FROM books WHERE owner='"+uyeNo+"'";
        DefaultTableModel kullaniciModel = (DefaultTableModel) kullaniciTable.getModel();
        Object rowData[]=new Object[4];
        kullaniciModel.setRowCount(0); // Onceki sorgunun silinmesi
   
        try {
            database.state=database.con.createStatement();
            database.result=database.state.executeQuery(queryKullaniciBooks);
            while(database.result.next()){
                rowData[0]=database.result.getString(1);
                rowData[1]=database.result.getString(2);
                rowData[2]=database.result.getDate(3);
                rowData[3]=database.result.getDate(4);
                kullaniciModel.addRow(rowData);
            }
            database.result.close();
            database.state.close();
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Kullanicinin iade panelindeki combobox'ı yenileme
        
        String queryKullaniciIadeBooks="SELECT name FROM books WHERE owner='"+uyeNo+"'";
        iadeComboBox.removeAllItems();
        try{
            database.state=database.con.createStatement();
            database.result=database.state.executeQuery(queryKullaniciIadeBooks);
            while(database.result.next()){
                iadeComboBox.addItem(database.result.getString(1));   
            }    
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        
    }//GEN-LAST:event_kitapListYenileButtonMouseClicked

    private void yazarAramaFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yazarAramaFieldFocusGained
        yazarAramaField.setText("");
    }//GEN-LAST:event_yazarAramaFieldFocusGained

    private void isimAramaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isimAramaButtonActionPerformed
        String aramaMetni=isimAramaField.getText();
        String query="SELECT name,author,is_available,return_date FROM books WHERE name LIKE '%"+aramaMetni+"%'";             
        Database database=new Database();
        
        DefaultTableModel model = (DefaultTableModel) aramaTable.getModel();
        Object rowData[]=new Object[4];
        model.setRowCount(0); // Onceki sorgunun silinmesi
        try {
            database.runDatabase();
            database.state=database.con.createStatement();
            database.result=database.state.executeQuery(query);
            while(database.result.next()){
                rowData[0]=database.result.getString(1);
                rowData[1]=database.result.getString(2);
                rowData[2]=database.result.getBoolean(3);
                rowData[3]=database.result.getDate(4);
                model.addRow(rowData);
            }
            database.result.close();
            database.state.close();
            database.con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_isimAramaButtonActionPerformed

    private void yazarAramaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yazarAramaButtonActionPerformed
        String aramaMetni=yazarAramaField.getText();
        String query="SELECT name,author,is_available,return_date FROM books WHERE author LIKE '%"+aramaMetni+"%'";             
        Database database=new Database();
        
        DefaultTableModel model = (DefaultTableModel) aramaTable.getModel();
        Object rowData[]=new Object[4];
        model.setRowCount(0); // Onceki sorgunun silinmesi
        try {
            database.runDatabase();
            database.state=database.con.createStatement();
            database.result=database.state.executeQuery(query);
            while(database.result.next()){
                rowData[0]=database.result.getString(1);
                rowData[1]=database.result.getString(2);
                rowData[2]=database.result.getBoolean(3);
                rowData[3]=database.result.getDate(4);
                model.addRow(rowData);
            }
            database.result.close();
            database.state.close();
            database.con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_yazarAramaButtonActionPerformed

    private void kiralaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kiralaButtonActionPerformed
        
        String kiralanacakKitap=kitapList.getSelectedValue();

        Database database = new Database();
        
        String query1="SELECT book1,book2,book3 FROM users WHERE id="+uyeNo;
        String updateUsers=new String();
        String updateBooks="UPDATE books SET is_available=false, owner='"+uyeNo +"', rent_date=CURDATE(), return_date=DATE_ADD(CURDATE(),INTERVAL 1 MONTH) WHERE name='"+kitapList.getSelectedValue()+"'";
        String queryControl="SELECT is_available FROM books WHERE name='"+kitapList.getSelectedValue()+"'";
        
        int i=0;
        
        try {
            database.runDatabase();
            
            //Kitap uygunluğunun kontrolü
            
            database.state=database.con.createStatement();
            database.result=database.state.executeQuery(queryControl);
            while(database.result.next()){
                if(!database.result.getBoolean(1)){
                    JOptionPane.showMessageDialog(null,"Kitap kiralanmaya uygun değil!");
                    return; 
                }
            }
            database.result.close();
            database.state.close();
            
            //Kullanicinin kitap alabilme uygunluğu ve seçimi
            
            database.state=database.con.createStatement();
            database.result=database.state.executeQuery(query1);           
            String durum []=new String[3];

            while(database.result.next()){
                while(i<3){
                    String tmp=database.result.getString(i+1);
                    if(database.result.wasNull()){
                        updateUsers="UPDATE users SET book"+(i+1)+"='"+kiralanacakKitap+"' WHERE id="+uyeNo;
                        break;
                    }
                    i++;
                    if(i==3){
                        JOptionPane.showMessageDialog(null,"Kitap kiralama limitiniz dolu!");
                        return;  
                    }  
                }
                  
            }
            database.result.close();
            database.state.close();

            // Kullanıci güncelleme
            
            database.state=database.con.createStatement();
            database.state.executeUpdate(updateUsers);
            database.result.close();
            database.state.close();          
            
            //Kitap güncelleme
            
            database.state=database.con.createStatement();
            database.state.executeUpdate(updateBooks);
            database.result.close();
            database.state.close();
            database.con.close();
            JOptionPane.showMessageDialog(null,"Kitap kiralama işleminiz başarı ile sonuçlandı!");
            
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_kiralaButtonActionPerformed

    private void iadeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iadeButtonActionPerformed
        Database database = new Database();
        
        if(iadeComboBox.getItemCount()==0){
            JOptionPane.showMessageDialog(null,"İade edilecek kitabı seçmediniz!");
            return;
        }
        
        String iadeKitap=(String)iadeComboBox.getSelectedItem();
        String updateBooks="UPDATE books SET owner=null, rent_date=null, return_date=null, is_available=true where name='"+iadeKitap+"'";
        String queryUsers="SELECT book1,book2,book3 FROM users where id="+uyeNo;
        String updateUsers=new String();
        String updateUsers1="UPDATE users SET book1=null WHERE id="+uyeNo;
        String updateUsers2="UPDATE users SET book2=null WHERE id="+uyeNo;
        String updateUsers3="UPDATE users SET book3=null WHERE id="+uyeNo;
        try { // Veritabanından hangi bookx değişkeninin silinceği bulundu
            database.runDatabase();
            database.state=database.con.createStatement();
            database.result=database.state.executeQuery(queryUsers);
            while(database.result.next()){
                if(iadeKitap.equals(database.result.getString(1))){
                    updateUsers=updateUsers1;
                    break;
                } else if(iadeKitap.equals(database.result.getString(2))){
                    updateUsers=updateUsers2;
                    break;
                }else if(iadeKitap.equals(database.result.getString(3))){
                    updateUsers=updateUsers3;
                    break;
                }
            }
            database.result.close();
            database.state.close();
            
            // Kitap tablosunun güncellenmesi
            
            database.state=database.con.createStatement();
            database.state.executeUpdate(updateBooks);
            database.result.close();
            database.state.close();
            
            // Kullanici tablosunun güncellenmesi
            
            database.state=database.con.createStatement();
            database.state.executeUpdate(updateUsers);
            database.result.close();
            database.state.close();
            database.con.close();
            JOptionPane.showMessageDialog(null,"Kitap başarılı bir şekilde iade edildi!");
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        iadeComboBox.removeItem((Object)iadeComboBox.getSelectedItem());
    }//GEN-LAST:event_iadeButtonActionPerformed

    private void isimAramaFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_isimAramaFieldMouseClicked
        isimAramaField.setText("");
    }//GEN-LAST:event_isimAramaFieldMouseClicked


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Menu("2").setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aramaTab;
    private javax.swing.JTable aramaTable;
    private javax.swing.JPanel cikisButPanel;
    private javax.swing.JLabel cikisButton;
    private javax.swing.JPanel cikisTab;
    private javax.swing.JButton iadeButton;
    private javax.swing.JComboBox<String> iadeComboBox;
    private javax.swing.JLabel iadeLabel;
    private javax.swing.JPanel iadeTab;
    private javax.swing.JButton isimAramaButton;
    private javax.swing.JTextField isimAramaField;
    private javax.swing.JLabel isimAramaLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton kiralaButton;
    private javax.swing.JLabel kiralaLabel;
    private javax.swing.JPanel kiralaTab;
    private javax.swing.JList<String> kitapList;
    private javax.swing.JPanel kitapListPanel;
    private javax.swing.JLabel kitapListYenileButton;
    private javax.swing.JPanel kitaplarimTab;
    private javax.swing.JTable kullaniciTable;
    private javax.swing.JTabbedPane tabPanel;
    private javax.swing.JButton yazarAramaButton;
    private javax.swing.JTextField yazarAramaField;
    private javax.swing.JLabel yazarAramaLabel;
    // End of variables declaration//GEN-END:variables
}
