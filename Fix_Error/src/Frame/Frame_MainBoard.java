/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/*
    아이템 보여주고 1번째는 아이템 번호, 2번째는 아이템 이름 
*/

import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;

/**
 *
 * @author 솔데스크
 */
public class Frame_MainBoard extends javax.swing.JFrame {

    /**
     * Creates new form Frame_Cpu
     */
    public Frame_MainBoard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Lbl_MainBoard1 = new javax.swing.JLabel();
        Lbl_MainBoard2 = new javax.swing.JLabel();
        Lbl_MainBoard3 = new javax.swing.JLabel();
        Lbl_Name1 = new javax.swing.JLabel();
        Lbl_Name2 = new javax.swing.JLabel();
        Lbl_Name3 = new javax.swing.JLabel();
        Lbl_Price1 = new javax.swing.JLabel();
        Lbl_Price2 = new javax.swing.JLabel();
        Lbl_Price3 = new javax.swing.JLabel();
        Lbl_Info2 = new javax.swing.JLabel();
        Lbl_Info3 = new javax.swing.JLabel();
        Lbl_Info1 = new javax.swing.JLabel();
        Lbl_Exam1 = new javax.swing.JLabel();
        Lbl_Exam3 = new javax.swing.JLabel();
        Lbl_Exam2 = new javax.swing.JLabel();
        Button_Next = new javax.swing.JButton();
        Btn_Selec1 = new javax.swing.JButton();
        Btn_Selec2 = new javax.swing.JButton();
        Btn_Selec3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Btn_MoveSelect = new javax.swing.JButton();

        jLabel7.setText("이름:");

        jLabel9.setText("이름:");

        jLabel15.setText("정보:");

        jLabel17.setText("정보:");

        jLabel20.setText("설명:");

        jButton2.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));

        jLabel1.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel1.setText("GPU");

        jLabel2.setFont(new java.awt.Font("맑은 고딕", 3, 18)); // NOI18N
        jLabel2.setText("아이템 추가는 소스에서 추가 가능");

        

        ImageIcon icon = new ImageIcon("C:\\test1234\\Git_onboarding\\Fix_Error\\src\\ASRock B760M Pro-A.JPG");
        Image Image = icon.getImage();
        Image resizeImage = Image.getScaledInstance( 100, 80, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizeImage);
        Lbl_MainBoard1.setIcon(resizedIcon);
        Lbl_MainBoard1.setText("");


        ImageIcon icon1 = new ImageIcon("C:\\test1234\\Git_onboarding\\Fix_Error\\src\\ASUS ROG Strix Z890-E Gaming WiFi.JPG");
        Image Image1 = icon1.getImage();
        Image resizeImage1 = Image1.getScaledInstance( 100, 80, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon1 = new ImageIcon(resizeImage1);
        Lbl_MainBoard2.setIcon(resizedIcon1);
        Lbl_MainBoard2.setText("");

        ImageIcon icon2 = new ImageIcon("C:\\test1234\\Git_onboarding\\Fix_Error\\src\\ASUS TUF Gaming B650M-PLUS WiFi.JPG");
        Image Image2 = icon2.getImage();
        Image resizeImage2 = Image2.getScaledInstance( 100, 80, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon2 = new ImageIcon(resizeImage2);
        Lbl_MainBoard3.setIcon(resizedIcon2);
        Lbl_MainBoard3.setText("");



        Lbl_Name1.setText("이름:");

        Lbl_Name2.setText("이름:");

        Lbl_Name3.setText("이름:");

        Lbl_Price1.setText("가격:");

        Lbl_Price2.setText("가격:");

        Lbl_Price3.setText("가격:");

        Lbl_Info2.setText("정보:");

        Lbl_Info3.setText("정보:");

        Lbl_Info1.setText("정보:");

        Lbl_Exam1.setText("설명:");

        Lbl_Exam3.setText("설명:");

        Lbl_Exam2.setText("설명:");

        Button_Next.setLabel("다음 페이지");
        Button_Next.setPreferredSize(new java.awt.Dimension(100, 30));
        Button_Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_NextActionPerformed(evt);
            }
        });

        Btn_Selec1.setText("jButton1");
        Btn_Selec1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Selec1ActionPerformed(evt);
            }
        });

        Btn_Selec2.setText("jButton1");
        Btn_Selec2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Selec2ActionPerformed(evt);
            }
        });

        Btn_Selec3.setText("jButton1");
        Btn_Selec3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Selec3ActionPerformed(evt);
            }
        });

        
        ArrayList<MainBoard_02> MainBoardList = MainBoard_02.getMainBoardList();
        MainBoard_02 mainboard = MainBoardList.get(0);
        Object[][] data = new Object[MainBoardList.size()][5];

        for (int i = 0; i < MainBoardList.size(); i++) {
        	MainBoard_02 mb = MainBoardList.get(i);
            data[i][0] = mb.getobid();
            data[i][1] = mb.getmbid();
            data[i][2] = mb.getmbdata();
            data[i][3] = mb.getPrice();
        }
        jLabel4.setText(mainboard.getmbid());
        jLabel3.setText(mainboard.getPrice());
        jLabel5.setText(mainboard.getobid());
        jLabel8.setText(mainboard.getmbdata());
        
        if (MainBoardList.size() > 1) {
        MainBoard_02 mb1 = MainBoardList.get(1);
        jLabel10.setText(mb1.getmbid());
        jLabel11.setText(mb1.getPrice());
        jLabel12.setText(mb1.getobid());
        jLabel13.setText(mb1.getmbdata());
        }

        if (MainBoardList.size() > 2) {
        MainBoard_02 mb2 = MainBoardList.get(2);
        jLabel14.setText(mb2.getmbid());
        jLabel16.setText(mb2.getPrice());
        jLabel18.setText(mb2.getobid());
        jLabel19.setText(mb2.getmbdata());
        }
        
        

       

        Btn_MoveSelect.setText("초기화면");
        Btn_MoveSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_MoveSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Btn_MoveSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Lbl_MainBoard3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Lbl_Price3)
                                .addComponent(Lbl_Name3)
                                .addComponent(Lbl_Info3)
                                .addComponent(Lbl_Exam3)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Lbl_MainBoard2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Lbl_Name2)
                                .addComponent(Lbl_Info2)
                                .addComponent(Lbl_Exam2)
                                .addComponent(Lbl_Price2)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Lbl_MainBoard1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Lbl_Name1)
                                .addComponent(Lbl_Exam1)
                                .addComponent(Lbl_Price1)
                                .addComponent(Lbl_Info1)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel14)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Btn_Selec3)
                        .addComponent(Btn_Selec2)
                        .addComponent(Btn_Selec1))
                    .addComponent(Button_Next, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Lbl_Name1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Lbl_Price1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Lbl_Info1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Lbl_Exam1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn_Selec1)
                                .addGap(95, 95, 95)
                                .addComponent(Btn_Selec2)
                                .addGap(95, 95, 95)
                                .addComponent(Btn_Selec3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Lbl_MainBoard1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lbl_MainBoard2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Lbl_Name2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Lbl_Price2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Lbl_Info2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Lbl_Exam2)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lbl_MainBoard3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Lbl_Name3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Lbl_Price3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Lbl_Info3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Lbl_Exam3))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(236, 236, 236)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel19))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(118, 118, 118)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)))
                                .addGap(29, 29, 29)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Btn_MoveSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_Next, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>                        

    private void Button_NextActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        Frame_MainBoradNext next = new Frame_MainBoradNext();
        dispose();
        next.setVisible(true);
    }                                           

    private void Btn_Selec1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void Btn_Selec2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void Btn_Selec3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void Btn_MoveSelectActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        Frame_Select next = new Frame_Select();
        dispose();
        next.setVisible(true);
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
            java.util.logging.Logger.getLogger(Frame_MainBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_MainBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_MainBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_MainBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_MainBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Btn_MoveSelect;
    private javax.swing.JButton Btn_Selec1;
    private javax.swing.JButton Btn_Selec2;
    private javax.swing.JButton Btn_Selec3;
    private javax.swing.JButton Button_Next;
    private javax.swing.JLabel Lbl_Exam1;
    private javax.swing.JLabel Lbl_Exam2;
    private javax.swing.JLabel Lbl_Exam3;
    private javax.swing.JLabel Lbl_Info1;
    private javax.swing.JLabel Lbl_Info2;
    private javax.swing.JLabel Lbl_Info3;
    private javax.swing.JLabel Lbl_MainBoard1;
    private javax.swing.JLabel Lbl_MainBoard2;
    private javax.swing.JLabel Lbl_MainBoard3;
    private javax.swing.JLabel Lbl_Name1;
    private javax.swing.JLabel Lbl_Name2;
    private javax.swing.JLabel Lbl_Name3;
    private javax.swing.JLabel Lbl_Price1;
    private javax.swing.JLabel Lbl_Price2;
    private javax.swing.JLabel Lbl_Price3;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration                   
}
