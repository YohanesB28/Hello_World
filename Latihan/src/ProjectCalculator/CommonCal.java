/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectCalculator;

/**
 *
 * @author Bagus Tri Gularso
 */
import java.text.DecimalFormat;
public class CommonCal extends javax.swing.JFrame {

    /**
     * Creates new form CommonCal
     */
    public CommonCal() {
        initComponents();
        this.setTitle("Calculator");
        area.setText(history + "\n" + current);
    }

    private String history = "", current = "0";
    private double input1, input2;
    private int index;
    private char tanda;
    private boolean reset = false;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        zero = new javax.swing.JButton();
        ichi = new javax.swing.JButton();
        ni = new javax.swing.JButton();
        san = new javax.swing.JButton();
        yon = new javax.swing.JButton();
        go = new javax.swing.JButton();
        roku = new javax.swing.JButton();
        nana = new javax.swing.JButton();
        hachi = new javax.swing.JButton();
        kyu = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        koma = new javax.swing.JButton();
        backspace = new javax.swing.JButton();
        kurang = new javax.swing.JButton();
        kali = new javax.swing.JButton();
        bagi = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        persen = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        common = new javax.swing.JButton();
        Another = new javax.swing.JButton();
        currency = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        area.setColumns(20);
        area.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        area.setRows(5);
        area.setBorder(null);
        area.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(area);

        zero.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        zero.setText("0");
        zero.setBorderPainted(false);
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        ichi.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ichi.setText("1");
        ichi.setBorderPainted(false);
        ichi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ichiActionPerformed(evt);
            }
        });

        ni.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ni.setText("2");
        ni.setBorderPainted(false);
        ni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                niActionPerformed(evt);
            }
        });

        san.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        san.setText("3");
        san.setBorderPainted(false);
        san.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sanActionPerformed(evt);
            }
        });

        yon.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        yon.setText("4");
        yon.setBorderPainted(false);
        yon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yonActionPerformed(evt);
            }
        });

        go.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        go.setText("5");
        go.setBorderPainted(false);
        go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goActionPerformed(evt);
            }
        });

        roku.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        roku.setText("6");
        roku.setBorderPainted(false);
        roku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rokuActionPerformed(evt);
            }
        });

        nana.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        nana.setText("7");
        nana.setBorderPainted(false);
        nana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nanaActionPerformed(evt);
            }
        });

        hachi.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        hachi.setText("8");
        hachi.setBorderPainted(false);
        hachi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hachiActionPerformed(evt);
            }
        });

        kyu.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        kyu.setText("9");
        kyu.setBorderPainted(false);
        kyu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kyuActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        clear.setText("C");
        clear.setBorderPainted(false);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        koma.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        koma.setText(".");
        koma.setBorderPainted(false);
        koma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                komaActionPerformed(evt);
            }
        });

        backspace.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        backspace.setText("←");
        backspace.setBorderPainted(false);
        backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspaceActionPerformed(evt);
            }
        });

        kurang.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        kurang.setText("-");
        kurang.setBorderPainted(false);
        kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurangActionPerformed(evt);
            }
        });

        kali.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        kali.setText("x");
        kali.setBorderPainted(false);
        kali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaliActionPerformed(evt);
            }
        });

        bagi.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        bagi.setText("÷");
        bagi.setBorderPainted(false);
        bagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagiActionPerformed(evt);
            }
        });

        equal.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        equal.setText("=");
        equal.setBorderPainted(false);
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        exit.setText("off");
        exit.setBorderPainted(false);
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        persen.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        persen.setText("%");
        persen.setBorderPainted(false);
        persen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                persenActionPerformed(evt);
            }
        });

        tambah.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        tambah.setText("+");
        tambah.setBorderPainted(false);
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        common.setText("Common");

        Another.setText("Another");
        Another.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnotherActionPerformed(evt);
            }
        });

        currency.setText("Currency");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nana, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(hachi, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ichi, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ni, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(koma, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(san, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bagi, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(persen, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(kyu, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(kurang, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(yon, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(go, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(roku, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(kali, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(common)
                .addGap(36, 36, 36)
                .addComponent(Another)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(currency)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(common)
                    .addComponent(Another)
                    .addComponent(currency))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(persen, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kurang, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kyu, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nana, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hachi, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yon, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(go, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kali, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roku, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ichi, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ni, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(san, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bagi, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(koma, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yonActionPerformed
        if (current.equals("0")) {
            current = "4";
        } else if (reset == true) {
            current = "4";
            reset = false;
        } else {
            current = current + "4";
        }
        area.setText(history + "\n" + current);
    }//GEN-LAST:event_yonActionPerformed

    private void komaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_komaActionPerformed
        if (current.equals("0")) {
            current = ".";
        } else {
            current = current + ".";
        }
        area.setText(history + "\n" + current);
    }//GEN-LAST:event_komaActionPerformed

    private void backspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backspaceActionPerformed
        int size = current.length();
        current = current.substring(0, size - 1);
        area.setText(history + "\n" + current);
    }//GEN-LAST:event_backspaceActionPerformed

    private void kurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurangActionPerformed
        input1 = Double.valueOf(current);
        current = current + "-";
        index = current.length();
        tanda='-';
        area.setText(history + "\n" + current);
    }//GEN-LAST:event_kurangActionPerformed

    private void kaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaliActionPerformed
        input1 = Double.valueOf(current);
        current = current + "X";
        index = current.length();
        tanda='X';
        area.setText(history + "\n" + current);
    }//GEN-LAST:event_kaliActionPerformed

    private void bagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagiActionPerformed
        input1 = Double.valueOf(current);
        current = current + "÷";
        index = current.length();
        tanda='÷';
        area.setText(history + "\n" + current);
    }//GEN-LAST:event_bagiActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
        try{
            input2 = Double.valueOf(current.substring(index));
        }catch(Exception e){
            input2=0;
        }
        double hasilTemp = 0;
        DecimalFormat formatData = new DecimalFormat("#.##");
        switch (tanda) {
            case '+':
                hasilTemp = input1 + input2;
                break;
            case '-':
                hasilTemp = input1 - input2;
                break;
            case 'X':
                hasilTemp = input1 * input2;
                break;
            case '÷':
                hasilTemp = input1 / input2;
                break;
            case '%':
                hasilTemp=input1/100;
                break;
            default:
                break;
        }
        String hasilAkhir = String.valueOf(formatData.format(hasilTemp));
        reset = true;
        current = current + "\n=" + hasilAkhir;
        area.setText(history + "\n" + current);
        history=history+current+"\n";
    }//GEN-LAST:event_equalActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void persenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_persenActionPerformed
        input1 = Double.valueOf(current);
        tanda='%';
        index = current.length();
        equalActionPerformed(evt);
    }//GEN-LAST:event_persenActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        input1 = Double.valueOf(current);
        current = current + "+";
        index = current.length();
        tanda='+';
        area.setText(history + "\n" + current);
    }//GEN-LAST:event_tambahActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        current = "";
        area.setText(history + "\n" + current);
    }//GEN-LAST:event_clearActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        current = current + "0";
        area.setText(history + "\n" + current);
    }//GEN-LAST:event_zeroActionPerformed

    private void ichiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ichiActionPerformed
        if (current.equals("0")) {
            current = "1";
        } else if (reset == true) {
            current = "1";
            reset = false;
        } else {
            current = current + "1";
        }
        area.setText(history + "\n" + current);
    }//GEN-LAST:event_ichiActionPerformed

    private void niActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_niActionPerformed
        if (current.equals("0")) {
            current = "2";
        } else if (reset == true) {
            current = "2";
            reset = false;
        } else {
            current = current + "2";
        }
        area.setText(history + "\n" + current);
    }//GEN-LAST:event_niActionPerformed

    private void sanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sanActionPerformed
        if (current.equals("0")) {
            current = "3";
        } else if (reset == true) {
            current = "3";
            reset = false;
        } else {
            current = current + "3";
        }
        area.setText(history + "\n" + current);
    }//GEN-LAST:event_sanActionPerformed

    private void goActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goActionPerformed
        if (current.equals("0")) {
            current = "5";
        } else if (reset == true) {
            current = "5";
            reset = false;
        } else {
            current = current + "5";
        }
        area.setText(history + "\n" + current);
    }//GEN-LAST:event_goActionPerformed

    private void rokuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rokuActionPerformed
        if (current.equals("0")) {
            current = "6";
        } else if (reset == true) {
            current = "6";
            reset = false;
        } else {
            current = current + "6";
        }
        area.setText(history + "\n" + current);
    }//GEN-LAST:event_rokuActionPerformed

    private void nanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nanaActionPerformed
        if (current.equals("0")) {
            current = "7";
        } else if (reset == true) {
            current = "7";
            reset = false;
        } else {
            current = current + "7";
        }
        area.setText(history + "\n" + current);
    }//GEN-LAST:event_nanaActionPerformed

    private void hachiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hachiActionPerformed
        if (current.equals("0")) {
            current = "8";
        } else if (reset == true) {
            current = "8";
            reset = false;
        } else {
            current = current + "8";
        }
        area.setText(history + "\n" + current);
    }//GEN-LAST:event_hachiActionPerformed

    private void kyuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kyuActionPerformed
        if (current.equals("0")) {
            current = "9";
        } else if (reset == true) {
            current = "9";
            reset = false;
        } else {
            current = current + "9";
        }
        area.setText(history + "\n" + current);
    }//GEN-LAST:event_kyuActionPerformed

    private void AnotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnotherActionPerformed
        this.setVisible(false);
        Another lain=new Another();
        lain.setVisible(true);
    }//GEN-LAST:event_AnotherActionPerformed

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
            java.util.logging.Logger.getLogger(CommonCal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CommonCal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CommonCal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CommonCal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CommonCal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Another;
    private javax.swing.JTextArea area;
    private javax.swing.JButton backspace;
    private javax.swing.JButton bagi;
    private javax.swing.JButton clear;
    private javax.swing.JButton common;
    private javax.swing.JButton currency;
    private javax.swing.JButton equal;
    private javax.swing.JButton exit;
    private javax.swing.JButton go;
    private javax.swing.JButton hachi;
    private javax.swing.JButton ichi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kali;
    private javax.swing.JButton koma;
    private javax.swing.JButton kurang;
    private javax.swing.JButton kyu;
    private javax.swing.JButton nana;
    private javax.swing.JButton ni;
    private javax.swing.JButton persen;
    private javax.swing.JButton roku;
    private javax.swing.JButton san;
    private javax.swing.JButton tambah;
    private javax.swing.JButton yon;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
