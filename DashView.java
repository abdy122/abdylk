
package com.toko.controller;



public class DashView extends javax.swing.JFrame {

   
    public DashView() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        transaksiBtn = new javax.swing.JButton();
        supplierBtn = new javax.swing.JButton();
        sidebarPanel = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20));
        dashboardBtn = new javax.swing.JButton();
        transaksiBtn2 = new javax.swing.JButton();
        barangBtn = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(11, 0), new java.awt.Dimension(11, 0), new java.awt.Dimension(11, 0));
        supplierBtn2 = new javax.swing.JButton();
        karyawanBtn = new javax.swing.JButton();
        laporanBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        welcomeLabel = new javax.swing.JLabel();
        roleLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        notificationBtn = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        totalBarangIcon = new javax.swing.JLabel();
        totalBarangLabel = new javax.swing.JLabel();
        totalBarangValue = new javax.swing.JLabel();
        transaksiCard = new javax.swing.JPanel();
        transaksiIcon = new javax.swing.JLabel();
        transaksititle = new javax.swing.JLabel();
        transaksiValue = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        pendapatanIcon = new javax.swing.JLabel();
        pendapatanTitle = new javax.swing.JLabel();
        pendapatanValue = new javax.swing.JLabel();
        stokRendahCard = new javax.swing.JPanel();
        stokRendahIcon = new javax.swing.JLabel();
        stokRendahTitle = new javax.swing.JLabel();
        totalBarangValue3 = new javax.swing.JLabel();
        mainSplitPane = new javax.swing.JSplitPane();
        jPanel9 = new javax.swing.JPanel();

        transaksiBtn.setBackground(new java.awt.Color(44, 62, 80));
        transaksiBtn.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        transaksiBtn.setForeground(new java.awt.Color(255, 255, 255));
        transaksiBtn.setText("💳 Transaksi");
        transaksiBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        transaksiBtn.setBorderPainted(false);
        transaksiBtn.setContentAreaFilled(false);
        transaksiBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transaksiBtn.setFocusPainted(false);
        transaksiBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        transaksiBtn.setOpaque(true);
        transaksiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transaksiBtnActionPerformed(evt);
            }
        });

        supplierBtn.setBackground(new java.awt.Color(44, 62, 80));
        supplierBtn.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        supplierBtn.setForeground(new java.awt.Color(255, 255, 255));
        supplierBtn.setText("🏢 Supplier");
        supplierBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        supplierBtn.setBorderPainted(false);
        supplierBtn.setContentAreaFilled(false);
        supplierBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        supplierBtn.setFocusPainted(false);
        supplierBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        supplierBtn.setOpaque(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("STOKO");
        setBackground(new java.awt.Color(248, 249, 250));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        sidebarPanel.setBackground(new java.awt.Color(44, 62, 80));
        sidebarPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sidebarPanel.setMaximumSize(new java.awt.Dimension(300, 2000));
        sidebarPanel.setMinimumSize(new java.awt.Dimension(180, 400));
        sidebarPanel.setName(""); // NOI18N
        sidebarPanel.setPreferredSize(new java.awt.Dimension(250, 600));
        sidebarPanel.setLayout(new java.awt.GridBagLayout());
        sidebarPanel.add(filler1, new java.awt.GridBagConstraints());

        dashboardBtn.setBackground(new java.awt.Color(44, 62, 80));
        dashboardBtn.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        dashboardBtn.setForeground(new java.awt.Color(255, 255, 255));
        dashboardBtn.setText("📊 Dashboard");
        dashboardBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        dashboardBtn.setBorderPainted(false);
        dashboardBtn.setContentAreaFilled(false);
        dashboardBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboardBtn.setFocusPainted(false);
        dashboardBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dashboardBtn.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        sidebarPanel.add(dashboardBtn, gridBagConstraints);

        transaksiBtn2.setBackground(new java.awt.Color(44, 62, 80));
        transaksiBtn2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        transaksiBtn2.setForeground(new java.awt.Color(255, 255, 255));
        transaksiBtn2.setText("💳 Transaksi");
        transaksiBtn2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        transaksiBtn2.setBorderPainted(false);
        transaksiBtn2.setContentAreaFilled(false);
        transaksiBtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transaksiBtn2.setFocusPainted(false);
        transaksiBtn2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        transaksiBtn2.setOpaque(true);
        transaksiBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transaksiBtn2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        sidebarPanel.add(transaksiBtn2, gridBagConstraints);

        barangBtn.setBackground(new java.awt.Color(44, 62, 80));
        barangBtn.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        barangBtn.setForeground(new java.awt.Color(255, 255, 255));
        barangBtn.setText("📦 Barang");
        barangBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        barangBtn.setBorderPainted(false);
        barangBtn.setContentAreaFilled(false);
        barangBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        barangBtn.setFocusPainted(false);
        barangBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        barangBtn.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        sidebarPanel.add(barangBtn, gridBagConstraints);
        sidebarPanel.add(filler2, new java.awt.GridBagConstraints());
        sidebarPanel.add(filler3, new java.awt.GridBagConstraints());
        sidebarPanel.add(filler4, new java.awt.GridBagConstraints());
        sidebarPanel.add(filler5, new java.awt.GridBagConstraints());

        supplierBtn2.setBackground(new java.awt.Color(44, 62, 80));
        supplierBtn2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        supplierBtn2.setForeground(new java.awt.Color(255, 255, 255));
        supplierBtn2.setText("🏢 Supplier");
        supplierBtn2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        supplierBtn2.setBorderPainted(false);
        supplierBtn2.setContentAreaFilled(false);
        supplierBtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        supplierBtn2.setFocusPainted(false);
        supplierBtn2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        supplierBtn2.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        sidebarPanel.add(supplierBtn2, gridBagConstraints);

        karyawanBtn.setBackground(new java.awt.Color(44, 62, 80));
        karyawanBtn.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        karyawanBtn.setForeground(new java.awt.Color(255, 255, 255));
        karyawanBtn.setText("👥 Karyawan");
        karyawanBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        karyawanBtn.setBorderPainted(false);
        karyawanBtn.setContentAreaFilled(false);
        karyawanBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        karyawanBtn.setFocusPainted(false);
        karyawanBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        karyawanBtn.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        sidebarPanel.add(karyawanBtn, gridBagConstraints);

        laporanBtn.setBackground(new java.awt.Color(44, 62, 80));
        laporanBtn.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        laporanBtn.setForeground(new java.awt.Color(255, 255, 255));
        laporanBtn.setText("📈 Laporan");
        laporanBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        laporanBtn.setBorderPainted(false);
        laporanBtn.setContentAreaFilled(false);
        laporanBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        laporanBtn.setFocusPainted(false);
        laporanBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        laporanBtn.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        sidebarPanel.add(laporanBtn, gridBagConstraints);

        logoutBtn.setBackground(new java.awt.Color(44, 62, 80));
        logoutBtn.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 51, 51));
        logoutBtn.setText("🚪 Logout");
        logoutBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        logoutBtn.setBorderPainted(false);
        logoutBtn.setContentAreaFilled(false);
        logoutBtn.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 20, 15);
        sidebarPanel.add(logoutBtn, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        sidebarPanel.add(jLabel2, gridBagConstraints);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("STOKO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 30, 20);
        sidebarPanel.add(jLabel3, gridBagConstraints);

        getContentPane().add(sidebarPanel, java.awt.BorderLayout.WEST);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.BorderLayout());

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));
        headerPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(220, 221, 225)));
        headerPanel.setMaximumSize(new java.awt.Dimension(1800, 100));
        headerPanel.setMinimumSize(new java.awt.Dimension(600, 60));
        headerPanel.setPreferredSize(new java.awt.Dimension(1200, 80));
        headerPanel.setLayout(new java.awt.GridBagLayout());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        headerPanel.add(jPanel3, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        headerPanel.add(jPanel4, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        headerPanel.add(jPanel5, new java.awt.GridBagConstraints());

        welcomeLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(52, 73, 94));
        welcomeLabel.setText("Selamat datang, Admin");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHEAST;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 10);
        headerPanel.add(welcomeLabel, gridBagConstraints);

        roleLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        roleLabel.setForeground(new java.awt.Color(120, 120, 120));
        roleLabel.setText("Role: Administrator");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 10, 10);
        headerPanel.add(roleLabel, gridBagConstraints);

        dateLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(120, 120, 120));
        dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        dateLabel.setText("Senin, 20 Juni 2025");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        headerPanel.add(dateLabel, gridBagConstraints);

        notificationBtn.setBackground(new java.awt.Color(255, 255, 255));
        notificationBtn.setFont(new java.awt.Font("Segoe UI Emoji", 0, 20)); // NOI18N
        notificationBtn.setText("🔔");
        notificationBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        notificationBtn.setBorderPainted(false);
        notificationBtn.setContentAreaFilled(false);
        notificationBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        notificationBtn.setFocusPainted(false);
        notificationBtn.setOpaque(true);
        notificationBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 20);
        headerPanel.add(notificationBtn, gridBagConstraints);

        jPanel2.add(headerPanel, java.awt.BorderLayout.NORTH);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(220, 221, 225)), javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15)));
        jPanel7.setMaximumSize(new java.awt.Dimension(350, 160));
        jPanel7.setMinimumSize(new java.awt.Dimension(200, 120));
        jPanel7.setName(""); // NOI18N
        jPanel7.setPreferredSize(new java.awt.Dimension(280, 180));
        jPanel7.setRequestFocusEnabled(false);
        jPanel7.setLayout(new java.awt.GridBagLayout());

        totalBarangIcon.setFont(new java.awt.Font("Segoe UI Emoji", 0, 36)); // NOI18N
        totalBarangIcon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        totalBarangIcon.setText("📦");
        totalBarangIcon.setPreferredSize(new java.awt.Dimension(50, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 0.4;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 10);
        jPanel7.add(totalBarangIcon, gridBagConstraints);

        totalBarangLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totalBarangLabel.setForeground(new java.awt.Color(52, 73, 94));
        totalBarangLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        totalBarangLabel.setText("Total Barang");
        totalBarangLabel.setMaximumSize(new java.awt.Dimension(170, 20));
        totalBarangLabel.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.7;
        gridBagConstraints.weighty = 0.4;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        jPanel7.add(totalBarangLabel, gridBagConstraints);

        totalBarangValue.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        totalBarangValue.setForeground(new java.awt.Color(52, 152, 219));
        totalBarangValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        totalBarangValue.setText("150");
        totalBarangValue.setPreferredSize(new java.awt.Dimension(100, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.weightx = 0.7;
        gridBagConstraints.weighty = 0.6;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel7.add(totalBarangValue, gridBagConstraints);

        transaksiCard.setBackground(new java.awt.Color(255, 255, 255));
        transaksiCard.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(220, 221, 225)), javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15)));
        transaksiCard.setMaximumSize(new java.awt.Dimension(350, 160));
        transaksiCard.setMinimumSize(new java.awt.Dimension(200, 120));
        transaksiCard.setName(""); // NOI18N
        transaksiCard.setPreferredSize(new java.awt.Dimension(280, 180));
        transaksiCard.setRequestFocusEnabled(false);
        transaksiCard.setLayout(new java.awt.GridBagLayout());

        transaksiIcon.setFont(new java.awt.Font("Segoe UI Emoji", 0, 36)); // NOI18N
        transaksiIcon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        transaksiIcon.setText("💰");
        transaksiIcon.setPreferredSize(new java.awt.Dimension(50, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 0.4;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 10);
        transaksiCard.add(transaksiIcon, gridBagConstraints);

        transaksititle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        transaksititle.setForeground(new java.awt.Color(52, 73, 94));
        transaksititle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        transaksititle.setText("Transaksi Hari Ini");
        transaksititle.setMaximumSize(new java.awt.Dimension(170, 20));
        transaksititle.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.7;
        gridBagConstraints.weighty = 0.4;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        transaksiCard.add(transaksititle, gridBagConstraints);

        transaksiValue.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        transaksiValue.setForeground(new java.awt.Color(46, 204, 113));
        transaksiValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        transaksiValue.setText("25");
        transaksiValue.setPreferredSize(new java.awt.Dimension(100, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.weightx = 0.7;
        gridBagConstraints.weighty = 0.6;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        transaksiCard.add(transaksiValue, gridBagConstraints);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(220, 221, 225)), javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15)));
        jPanel8.setMaximumSize(new java.awt.Dimension(350, 160));
        jPanel8.setMinimumSize(new java.awt.Dimension(200, 120));
        jPanel8.setName(""); // NOI18N
        jPanel8.setPreferredSize(new java.awt.Dimension(280, 180));
        jPanel8.setRequestFocusEnabled(false);
        jPanel8.setLayout(new java.awt.GridBagLayout());

        pendapatanIcon.setFont(new java.awt.Font("Segoe UI Emoji", 0, 36)); // NOI18N
        pendapatanIcon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pendapatanIcon.setText("💵");
        pendapatanIcon.setPreferredSize(new java.awt.Dimension(50, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 0.4;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 10);
        jPanel8.add(pendapatanIcon, gridBagConstraints);

        pendapatanTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pendapatanTitle.setForeground(new java.awt.Color(52, 73, 94));
        pendapatanTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pendapatanTitle.setText("Pendapatan hari Ini");
        pendapatanTitle.setMaximumSize(new java.awt.Dimension(170, 20));
        pendapatanTitle.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.7;
        gridBagConstraints.weighty = 0.4;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        jPanel8.add(pendapatanTitle, gridBagConstraints);

        pendapatanValue.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pendapatanValue.setForeground(new java.awt.Color(155, 89, 182));
        pendapatanValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pendapatanValue.setText("Rp2.500,000");
        pendapatanValue.setPreferredSize(new java.awt.Dimension(100, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.weightx = 0.7;
        gridBagConstraints.weighty = 0.6;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel8.add(pendapatanValue, gridBagConstraints);

        stokRendahCard.setBackground(new java.awt.Color(255, 255, 255));
        stokRendahCard.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(220, 221, 225)), javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15)));
        stokRendahCard.setMaximumSize(new java.awt.Dimension(350, 160));
        stokRendahCard.setMinimumSize(new java.awt.Dimension(200, 120));
        stokRendahCard.setName(""); // NOI18N
        stokRendahCard.setPreferredSize(new java.awt.Dimension(280, 180));
        stokRendahCard.setRequestFocusEnabled(false);
        stokRendahCard.setLayout(new java.awt.GridBagLayout());

        stokRendahIcon.setFont(new java.awt.Font("Segoe UI Emoji", 0, 36)); // NOI18N
        stokRendahIcon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        stokRendahIcon.setText("⚠️");
        stokRendahIcon.setPreferredSize(new java.awt.Dimension(50, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 0.4;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 10);
        stokRendahCard.add(stokRendahIcon, gridBagConstraints);

        stokRendahTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stokRendahTitle.setForeground(new java.awt.Color(52, 73, 94));
        stokRendahTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        stokRendahTitle.setText("Stok rendah");
        stokRendahTitle.setMaximumSize(new java.awt.Dimension(170, 20));
        stokRendahTitle.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.7;
        gridBagConstraints.weighty = 0.4;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        stokRendahCard.add(stokRendahTitle, gridBagConstraints);

        totalBarangValue3.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        totalBarangValue3.setForeground(new java.awt.Color(231, 76, 60));
        totalBarangValue3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        totalBarangValue3.setText("5");
        totalBarangValue3.setPreferredSize(new java.awt.Dimension(100, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.weightx = 0.7;
        gridBagConstraints.weighty = 0.6;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        stokRendahCard.add(totalBarangValue3, gridBagConstraints);

        mainSplitPane.setBorder(null);
        mainSplitPane.setDividerLocation(700);
        mainSplitPane.setResizeWeight(0.6);
        mainSplitPane.setToolTipText("");
        mainSplitPane.setContinuousLayout(true);
        mainSplitPane.setOneTouchExpandable(true);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(220, 221, 225)));
        jPanel9.setMinimumSize(new java.awt.Dimension(400, 300));
        jPanel9.setPreferredSize(new java.awt.Dimension(700, 450));
        jPanel9.setLayout(new java.awt.GridBagLayout());
        mainSplitPane.setLeftComponent(jPanel9);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(transaksiCard, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addComponent(stokRendahCard, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainSplitPane)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stokRendahCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transaksiCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(mainSplitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jPanel2.add(jPanel6, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void transaksiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transaksiBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transaksiBtnActionPerformed

    private void transaksiBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transaksiBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transaksiBtn2ActionPerformed

   
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
            java.util.logging.Logger.getLogger(dASHvIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dASHvIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dASHvIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dASHvIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dASHvIEW().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton barangBtn;
    private javax.swing.JButton dashboardBtn;
    private javax.swing.JLabel dateLabel;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton karyawanBtn;
    private javax.swing.JButton laporanBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JSplitPane mainSplitPane;
    private javax.swing.JButton notificationBtn;
    private javax.swing.JLabel pendapatanIcon;
    private javax.swing.JLabel pendapatanTitle;
    private javax.swing.JLabel pendapatanValue;
    private javax.swing.JLabel roleLabel;
    private javax.swing.JPanel sidebarPanel;
    private javax.swing.JPanel stokRendahCard;
    private javax.swing.JLabel stokRendahIcon;
    private javax.swing.JLabel stokRendahTitle;
    private javax.swing.JButton supplierBtn;
    private javax.swing.JButton supplierBtn2;
    private javax.swing.JLabel totalBarangIcon;
    private javax.swing.JLabel totalBarangLabel;
    private javax.swing.JLabel totalBarangValue;
    private javax.swing.JLabel totalBarangValue3;
    private javax.swing.JButton transaksiBtn;
    private javax.swing.JButton transaksiBtn2;
    private javax.swing.JPanel transaksiCard;
    private javax.swing.JLabel transaksiIcon;
    private javax.swing.JLabel transaksiValue;
    private javax.swing.JLabel transaksititle;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
