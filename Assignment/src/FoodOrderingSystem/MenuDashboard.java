package FoodOrderingSystem;
import java.util.List;
import java.util.ArrayList;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;

public class MenuDashboard extends javax.swing.JFrame implements MyInterface{

    private String vendorId;
    private String vendorName;
    private String customerId;
    private HashMap<Integer, String> imagePaths = new HashMap<>();
    private ArrayList<String> OrderList = new ArrayList<>(); //BARU DIUBAH
    final private double DELIVERYFEES = 5;
    
    
    /**
     * Creates new form CustomerDashboard
     */
    public MenuDashboard() {
        initComponents();
        addRowSelectionListener();
        ButtonGroup methodGroup = new ButtonGroup();
        methodGroup.add(DineInRadBtn);
        methodGroup.add(TakeAwayRadBtn);
        methodGroup.add(DeliveryRadBtn);
    }
    
    //NEED TO ADD CUSTOMERID
    public MenuDashboard(String VendorID, String CustomerID) {
        initComponents();
        this.vendorId = VendorID;
        this.customerId = CustomerID;
        addRowSelectionListener();
        ButtonGroup methodGroup = new ButtonGroup();
        methodGroup.add(DineInRadBtn);
        methodGroup.add(TakeAwayRadBtn);
        methodGroup.add(DeliveryRadBtn);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WelcomeLbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AppsNameLbl1 = new javax.swing.JLabel();
        AppsNameLbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MenuTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        FoodDescriptions = new javax.swing.JTextArea();
        FoodNameLbl = new javax.swing.JLabel();
        FoodPriceLbl = new javax.swing.JLabel();
        SelectHowMany = new javax.swing.JComboBox<>();
        FoodPictureLbl = new javax.swing.JLabel();
        DeliveryRadBtn = new javax.swing.JRadioButton();
        TakeAwayRadBtn = new javax.swing.JRadioButton();
        DineInRadBtn = new javax.swing.JRadioButton();
        RemarksTxtBox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CloseBut = new javax.swing.JButton();
        OrderBut = new javax.swing.JButton();
        CartBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Dashboard");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WelcomeLbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        WelcomeLbl.setText("Welcome \"USER\"");
        getContentPane().add(WelcomeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("What you want to eat today ?");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        AppsNameLbl1.setFont(new java.awt.Font("STCaiyun", 1, 48)); // NOI18N
        AppsNameLbl1.setText("JOM");
        getContentPane().add(AppsNameLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        AppsNameLbl.setFont(new java.awt.Font("STCaiyun", 1, 48)); // NOI18N
        AppsNameLbl.setText("MAKAN");
        getContentPane().add(AppsNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        MenuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vendor ID", "Food ID", "Price", "Food Name", "Description", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        MenuTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(MenuTable);
        if (MenuTable.getColumnModel().getColumnCount() > 0) {
            MenuTable.getColumnModel().getColumn(0).setResizable(false);
            MenuTable.getColumnModel().getColumn(1).setResizable(false);
            MenuTable.getColumnModel().getColumn(2).setResizable(false);
            MenuTable.getColumnModel().getColumn(3).setResizable(false);
            MenuTable.getColumnModel().getColumn(4).setResizable(false);
            MenuTable.getColumnModel().getColumn(5).setResizable(false);
        }

        FoodDescriptions.setEditable(false);
        FoodDescriptions.setColumns(10);
        FoodDescriptions.setRows(5);
        jScrollPane2.setViewportView(FoodDescriptions);

        FoodNameLbl.setText("Food Name");

        FoodPriceLbl.setText("Food Price");

        SelectHowMany.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        FoodPictureLbl.setText("Food Picture");

        DeliveryRadBtn.setText("Delivery");

        TakeAwayRadBtn.setText("Take Away");

        DineInRadBtn.setText("Dine In");

        jLabel3.setText("Remarks");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(FoodPictureLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FoodPriceLbl)
                            .addComponent(FoodNameLbl)
                            .addComponent(SelectHowMany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(DineInRadBtn)
                                    .addGap(40, 40, 40)
                                    .addComponent(TakeAwayRadBtn)
                                    .addGap(42, 42, 42)
                                    .addComponent(DeliveryRadBtn))
                                .addComponent(RemarksTxtBox)))
                        .addGap(24, 24, 24))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(FoodNameLbl)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FoodPriceLbl)
                            .addComponent(FoodPictureLbl))
                        .addGap(18, 18, 18)
                        .addComponent(SelectHowMany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RemarksTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DineInRadBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TakeAwayRadBtn)
                                .addComponent(DeliveryRadBtn))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 69, 960, 470));

        CloseBut.setText("Close");
        CloseBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButActionPerformed(evt);
            }
        });
        getContentPane().add(CloseBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 600, -1, -1));

        OrderBut.setText("Confirm");
        OrderBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderButActionPerformed(evt);
            }
        });
        getContentPane().add(OrderBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 550, -1, -1));

        CartBtn.setIcon(new javax.swing.ImageIcon("E:\\APU YEAR 2 SEM 1\\OOP JAVA\\ASSIGNMENT\\cart.png")); // NOI18N
        CartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CartBtnActionPerformed(evt);
            }
        });
        getContentPane().add(CartBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, 100, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void OrderButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderButActionPerformed
        Object[] options = {"Add To Cart", "Close"};
        String filename = "Cart.txt";
        String method = "";
        String CartID;
        String setRemarks;
        double totalPrice = 0;
        
        if(!DineInRadBtn.isSelected() && !TakeAwayRadBtn.isSelected() && !DeliveryRadBtn.isSelected()){
            JOptionPane.showMessageDialog(this, "Please select whether you want to dine in, take away, or delivery.",
            "System", JOptionPane.ERROR_MESSAGE);                     
        }else{                               
//          System.out.println("Price Text:" + FoodPriceLbl.getText());
//          System.out.println("Selected quantity: " + SelectHowMany.getSelectedItem());
            try{
                // Getting price from the label
                double Price = Double.parseDouble(FoodPriceLbl.getText().replace("RM ", "").trim());
                String priceText = FoodPriceLbl.getText().replace("RM ", "").trim();            
                // INTERROGATE WITH THE COMBO BOX
                int quantity = Integer.parseInt((String) SelectHowMany.getSelectedItem());
                
                //CALCULATE PRICE
                totalPrice = Price * quantity;
                
                if(DineInRadBtn.isSelected()){
                    method = "Dine-In";
                    System.out.println("Dine-In");
                }else if(TakeAwayRadBtn.isSelected()){
                    method = "Take Away";
                    System.out.println("TA");
                }else if(DeliveryRadBtn.isSelected()){
                    method = "Delivery";
                    System.out.println("Deliver");
                    totalPrice = (Price * quantity) + this.DELIVERYFEES;
                }
                
                
                               
                int response = JOptionPane.showOptionDialog(null,"You selected " + quantity + " item(s).\n" + "Total: RM " + String.format("%.2f", totalPrice), 
                        "Order Confirmation", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,
                                null,
                                options,
                                options[0]);
                            if(response == 0) {
                                int rowCount = 0;
                                
                                try(BufferedReader reader = new BufferedReader(new FileReader("Cart.txt"))){
                                    String line;
                                    while((line = reader.readLine()) != null){
                                        rowCount++;
                                    }
                                    if(rowCount == 0){
                                        CartID = "CR0" + String.valueOf(rowCount + 1);                                        
                                    }else{
                                        CartID = "CR0" + String.valueOf(rowCount + 1);                                         
                                    }
                                    
                                    if(RemarksTxtBox.getText() == null || RemarksTxtBox.getText().trim().isEmpty()){
                                        setRemarks = "-";
                                    }else{
                                        setRemarks = RemarksTxtBox.getText();
                                    }
                                    FileWriter fw = new FileWriter(filename, true);
                                        
                                        fw.write(
                                                CartID + ";" + 
                                                this.vendorId + ";" +
                                                this.customerId + ";" +
                                                FoodNameLbl.getText() + ";" +
                                                String.format("%.2f", totalPrice) + ";" +
                                                quantity + ";" +
                                                setRemarks + ";" +
                                                method + ";" + 
                                                this.DELIVERYFEES + "\n"
                                                );
                                        fw.close();
                                    System.out.println("Row = " + rowCount);
                                }catch(IOException e){
                                    JOptionPane.showMessageDialog(this, "There is something wrong with the system. Contact administrator", "System", JOptionPane.INFORMATION_MESSAGE);
                                }
                                JOptionPane.showMessageDialog(this, "Successfully insert into cart. Click the cart icon to see your order.", "System", JOptionPane.INFORMATION_MESSAGE);
                            }
            }catch(NumberFormatException ex){            
                JOptionPane.showMessageDialog(this, "Invalid price format. Please check the food price.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }       
    }//GEN-LAST:event_OrderButActionPerformed

    private void CloseButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButActionPerformed
        this.setVisible(false);
        VendorList Vendor = new VendorList(this.customerId);
        Vendor.setVisible(true);
        Vendor.setLocationRelativeTo(null);
    }//GEN-LAST:event_CloseButActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        WelcomeLbl.setText("Welcome " + this.customerId);
        this.setLocationRelativeTo(null);
//        DefaultTableModel model = (DefaultTableModel) MenuTable.getModel();
//        model.setRowCount(0);
        refreshData();
        FoodPictureLbl.setText("");
    }//GEN-LAST:event_formWindowActivated

    private void CartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CartBtnActionPerformed
         if(readCartTxt()){
           Cart C = new Cart(this.customerId);
           C.setVisible(true);
           this.setVisible(false); 
        }else{
            JOptionPane.showMessageDialog(this, "No order in the cart, please order first.", "System", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("No order in the cart.");
        }       
    }//GEN-LAST:event_CartBtnActionPerformed

    
     private boolean readCartTxt(){
        try{
            String read;

            FileReader fr = new FileReader("Cart.txt");
            BufferedReader br = new BufferedReader(fr);

            String tempCustId = "";

            while((read = br.readLine()) != null){
                String[] data = read.split(";");

                tempCustId = data[2];
            }

            if(tempCustId.equals(this.customerId)){
                return true;
            }
        }catch(IOException e){
            JOptionPane.showMessageDialog(this, "Something is disrupting the system. Please contact admin.", "System", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;        
    }
     
    //POLYMORPHISM IS APPLIED HERE BECAUSE THIS MEHTOD HAVE INSIDE OTHER CLASS BUT THE USAGE IS DIFFERENT IN THIS FORM
    @Override
    public void refreshData(){
        // SECOND TRY
        
        try{
            String read;
            String fileName = "Menu.txt";
            Object[] options = {"Ok", "Close"};
            FileReader fr = new FileReader(fileName);
            
            // Prevent Glitch from file use BufferedReader
            BufferedReader br = new BufferedReader(fr);
            
               
            // To start use the JTable use DefaultTableModel
            DefaultTableModel model = (DefaultTableModel) MenuTable.getModel();
            
            model.setRowCount(0);
            int rowIndex = 0;
            boolean foundVendor = false;
            
//            List<String> allData = new ArrayList<>();
            
            while((read = br.readLine()) != null){
                String[] data = read.split(";");
                
                String tempVendorId = data[0];
                String FOODID = data[1];
                String PRICE = data[3];
                String FOODNAME = data[2];
                String DESC = data[4];
                String AVAIL = data[5];
                String IMG = data[6];
                
                if(this.vendorId.equalsIgnoreCase(tempVendorId)){
                    foundVendor = true;
                    model.addRow(new Object[]{
                        this.vendorId, FOODID, PRICE, FOODNAME, DESC, AVAIL
                    });
                    this.imagePaths.put(model.getRowCount() -1, IMG);
                }
                
//                System.out.println("Read Line: " + read);
//                allData.add(read);
            }
            
//            System.out.println(allData);
            
//            boolean founderVendor = false;
            
//            for (String line : allData){
//                String[] data = line.split(";");
//                
//                if(data.length < 8) continue;               
//                    String VendorIDs = data[0];
//                    String FoodID = data[1];
//                    String Price = data[3];
//                    String FoodName = data[2];
//                    String Description = data[4];
//                    String Availability = data[6];
//                    String imagePath = data[5];
//                    
//                    if(this.vendorId.equalsIgnoreCase(VendorIDs)){
//                        foundVendor = true;
//                        System.out.println("TESTTTTTTTTTTTTTT");
//                        model.addRow(new Object[]{
//                            VendorIDs, FoodID, Price, FoodName, Description, Availability
//                        });
//                         
//                        this.imagePaths.put(model.getRowCount() -1, imagePath);
//                    }
//            }
            if(!foundVendor){
                int response = JOptionPane.showOptionDialog(null,"This Vendor doesn't have any menu in the list for now", "System", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,
                            null,
                            options,
                            options[0]);
//                        if(response == 0 || response == 1) {
//                            dispose();
//                        }
            }
            br.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, e, "System", JOptionPane.WARNING_MESSAGE);
        }
        
        // FIRST TRY
//            while((read = br.readLine()) != null ){
//                
//                // TO SHOW DATA ONLY FOR PEOPLE WHO'S LOGIN
////                if(read.split(";")[7].equals(login.getUsername())){
//
//                if(data.length < 7) continue;
//                
//                    String VendorIDs = read.split(";")[0];
//                    String FoodID = read.split(";")[1];
//                    String Price = read.split(";")[2];
//                    String FoodName = read.split(";")[3];
//                    String Description = read.split(";")[4];
//                    String Availability = read.split(";")[5];
//                    String imagePath = read.split(";")[6];
//                    
//                    if(VendorIDs.equals(this.vendorId)){
//                        foundVendor = true;
//                        // ADD DATA FROM FILE INTO TABLE
//                    model.addRow(new Object[]{
//                        VendorIDs,FoodID,Price,FoodName,Description,Availability
//                    });
//                    this.imagePaths.put(rowIndex, imagePath);
//                    rowIndex++;
//                    }else if(!foundVendor){
////                        int response = 
//                        int response = JOptionPane.showOptionDialog(null,"This Vendor doesn't have any menu in the list for now", "System", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,
//                            null,
//                            options,
//                            options[0]);
//                        if(response == 0 || response == 1) {
//                            dispose();
//                        }
////                        }else if(response == 1){
////                            
////                        }
//                    } 
////                    // ADD DATA FROM FILE INTO TABLE
////                    model.addRow(new Object[]{
////                        VendorIDs,vendorName,vendorCategory
////                    });
//                }
//        }catch(IOException e){
//            JOptionPane.showMessageDialog(null, e, "System", JOptionPane.WARNING_MESSAGE);
//        }
    }
    
    private void addRowSelectionListener(){
        MenuTable.getSelectionModel().addListSelectionListener((ListSelectionEvent e)->{
            if(!e.getValueIsAdjusting()){
                int selectedRow = MenuTable.getSelectedRow();
                if(selectedRow != -1) {
                    String vendorId = (String) MenuTable.getValueAt(selectedRow,0);
                    String foodId = (String) MenuTable.getValueAt(selectedRow, 1);
                    String foodNames = (String) MenuTable.getValueAt(selectedRow, 3);
                    String imagePath = imagePaths.get(selectedRow);
                    
                    //To display the price in double
                    Object foodPriceObject = MenuTable.getValueAt(selectedRow, 2);
                    double foodPrice = 0.0;
                    if(foodPriceObject instanceof String){
                        try{
                            foodPrice = Double.parseDouble((String) foodPriceObject);
                        }catch(NumberFormatException ex){
                            System.err.println("Invalid food price format: " + foodPriceObject);
                        }
                    }
                    
                    //To display the image using path
                    if(imagePath != null && !imagePath.isEmpty()){
                        ImageIcon icon = new ImageIcon(imagePath);
                        Image img = icon.getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH);
                        FoodPictureLbl.setIcon(new ImageIcon(img));
                    }else{
                        FoodPictureLbl.setIcon(null);
                    }
//                        foodPrice = (Double) foodPriceObject;
//                    }else if(foodPriceObject instanceof Integer){
//                        foodPrice = ((Integer) foodPriceObject).doubleValue();
//                    }
                    String Desc = (String) MenuTable.getValueAt(selectedRow, 4);
                    
                    FoodDescriptions.setText(Desc);
                    FoodNameLbl.setText(foodNames);
                    FoodPriceLbl.setText("RM " + String.format("%.2f", foodPrice));
                }
            }
    });
    }
    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppsNameLbl;
    private javax.swing.JLabel AppsNameLbl1;
    private javax.swing.JButton CartBtn;
    private javax.swing.JButton CloseBut;
    private javax.swing.JRadioButton DeliveryRadBtn;
    private javax.swing.JRadioButton DineInRadBtn;
    private javax.swing.JTextArea FoodDescriptions;
    private javax.swing.JLabel FoodNameLbl;
    private javax.swing.JLabel FoodPictureLbl;
    private javax.swing.JLabel FoodPriceLbl;
    private javax.swing.JTable MenuTable;
    private javax.swing.JButton OrderBut;
    private javax.swing.JTextField RemarksTxtBox;
    private javax.swing.JComboBox<String> SelectHowMany;
    private javax.swing.JRadioButton TakeAwayRadBtn;
    private javax.swing.JLabel WelcomeLbl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
