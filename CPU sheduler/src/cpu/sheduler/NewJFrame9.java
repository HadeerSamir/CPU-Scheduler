package cpu.sheduler;

import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

public class NewJFrame9 extends javax.swing.JFrame {

    LinkedList<Process> list1 = new LinkedList<Process>();
    LinkedList<Process> list2 = new LinkedList<Process>();
    Process p = new Process();
    Process p1 = new Process();
    DefaultTableModel model;

    public NewJFrame9() {
        initComponents();
        model = (DefaultTableModel) jTablePriorityNonPreemp.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextPriorityNoOfProcessNonPreem = new javax.swing.JTextField();
        jTextPriorityProcessIDNonPreem = new javax.swing.JTextField();
        jTextPriorityBurstNonPreem = new javax.swing.JTextField();
        jTextPriorityArrivalNonPreemp = new javax.swing.JTextField();
        jButtonPrioritySaveNonPreemp = new javax.swing.JButton();
        jButtonPriorityAddNonPreemp = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextPriorityPriorityNonPreemp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePriorityNonPreemp = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Priority Scheduling \"Non_Preemptive\"");

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel2.setText("Enter Number Of Process");

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel3.setText("Process_ID");

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel4.setText("Burst_Time");

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel5.setText("Arrival_Time");

        jTextPriorityNoOfProcessNonPreem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPriorityNoOfProcessNonPreemActionPerformed(evt);
            }
        });

        jButtonPrioritySaveNonPreemp.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jButtonPrioritySaveNonPreemp.setText("Result");
        jButtonPrioritySaveNonPreemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrioritySaveNonPreempActionPerformed(evt);
            }
        });

        jButtonPriorityAddNonPreemp.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jButtonPriorityAddNonPreemp.setText("Save Process");
        jButtonPriorityAddNonPreemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPriorityAddNonPreempActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel6.setText("Priority");

        jTablePriorityNonPreemp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process_ID", "Burst_Time", "Priority", "Arrival_Time", "Waiting_Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablePriorityNonPreemp);

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel7.setText("Results:-");

        jButton1.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jButton4.setText("Average Waiting Time");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(64, 64, 64)))
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(82, 82, 82)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextPriorityProcessIDNonPreem, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextPriorityBurstNonPreem, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextPriorityPriorityNonPreemp, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextPriorityArrivalNonPreemp, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextPriorityNoOfProcessNonPreem, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jButtonPrioritySaveNonPreemp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPriorityAddNonPreemp)))
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 54, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(55, 55, 55)
                        .addComponent(jTextPriorityNoOfProcessNonPreem))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPriorityProcessIDNonPreem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPriorityBurstNonPreem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTextPriorityPriorityNonPreemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextPriorityArrivalNonPreemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPrioritySaveNonPreemp)
                    .addComponent(jButtonPriorityAddNonPreemp))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextPriorityNoOfProcessNonPreemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPriorityNoOfProcessNonPreemActionPerformed

    }//GEN-LAST:event_jTextPriorityNoOfProcessNonPreemActionPerformed

    private void jButtonPriorityAddNonPreempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPriorityAddNonPreempActionPerformed

        jButtonPriorityAddNonPreemp.setVisible(true);
        jButtonPrioritySaveNonPreemp.setVisible(true);
        int processno = Integer.parseInt(jTextPriorityNoOfProcessNonPreem.getText());
        int id = Integer.parseInt(jTextPriorityProcessIDNonPreem.getText());
        float burst = Float.parseFloat(jTextPriorityBurstNonPreem.getText());
        int prior = Integer.parseInt(jTextPriorityPriorityNonPreemp.getText());
        float arrival = Float.parseFloat(jTextPriorityArrivalNonPreemp.getText());
        p = new Process(id, burst, arrival, prior);
        list1.add(p);

        jTextPriorityProcessIDNonPreem.setText("");
        jTextPriorityBurstNonPreem.setText("");
        jTextPriorityArrivalNonPreemp.setText("");
        jTextPriorityPriorityNonPreemp.setText("");

    }//GEN-LAST:event_jButtonPriorityAddNonPreempActionPerformed

    private void jButtonPrioritySaveNonPreempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrioritySaveNonPreempActionPerformed

        int k, m;
        int position;
        int temp1;//id
        float temp2;//burst
        int temp3;//priority
        float temp4;//arrival
        float[] waitingTime = new float[list1.size()];
        float departureTime[]=new float[list1.size()];
        float turnAroundTime[]=new float[list1.size()];
        float departure=0;
        float sumArrival=0;
        int r=0;
        waitingTime[0]=0;
        
        for(int n=0;n<list1.size();n++){
            sumArrival+=list1.get(n).arrivalTime;
        }
        
        if(sumArrival==0 ){
                r=0;
            }
            else{
                r=1;
            }
        
        for (int i = r; i < list1.size(); i++) {
            position = i;
            for (int j = i + 1; j < list1.size(); j++) {
                if ((list1.get(j).priority < list1.get(position).priority )&& (list1.get(j).arrivalTime >= list1.get(position).arrivalTime)) {
                    position = j;
                }
          }

                //sorting
                temp1 = list1.get(i).processId;
                list1.get(i).processId = list1.get(position).processId;
                list1.get(position).processId = temp1;

                temp2 = list1.get(i).burstTime;
                list1.get(i).burstTime = list1.get(position).burstTime;
                list1.get(position).burstTime = temp2;

                temp3 = list1.get(i).priority;
                list1.get(i).priority = list1.get(position).priority;
                list1.get(position).priority = temp3;

                temp4 = list1.get(i).arrivalTime;
                list1.get(i).arrivalTime = list1.get(position).arrivalTime;
                list1.get(position).arrivalTime = temp4;

            
        }
    
        for(int i=0;i<list1.size();i++){
            departure+=list1.get(i).burstTime;
            departureTime[i]=departure;
        }
        
        for(int i=0;i<list1.size();i++){
            turnAroundTime[i]=departureTime[i]-list1.get(i).arrivalTime;
            waitingTime[i]=turnAroundTime[i]-list1.get(i).burstTime;
            p1= new Process(list1.get(i).processId, list1.get(i).burstTime,list1.get(i).priority, list1.get(i).arrivalTime,waitingTime[i]);
            list2.add(p1);
        }
        Object rowData[] = new Object[5];
        for (int i = 0; i < list2.size(); i++) {
            rowData[0] = list2.get(i).processId;
            rowData[1] = list2.get(i).burstTime;
            rowData[2] = list2.get(i).priority;
            rowData[3] = list2.get(i).arrivalTime;
            rowData[4] = list2.get(i).waitingTime;
            model.addRow(rowData);
        }
         jButtonPrioritySaveNonPreemp.setVisible(false);
         jTextPriorityNoOfProcessNonPreem.setText("");
         jButtonPriorityAddNonPreemp.setVisible(false);
    }//GEN-LAST:event_jButtonPrioritySaveNonPreempActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new NewJFrame4().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      float totalWaitingTime=0;
      float averageWaitingTime;
      for(int i=0;i<list2.size();i++){
          totalWaitingTime+=list2.get(i).waitingTime;
      }
      averageWaitingTime=totalWaitingTime/list2.size();
      jTextField1.setText(Float.toString(averageWaitingTime));
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame9().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonPriorityAddNonPreemp;
    private javax.swing.JButton jButtonPrioritySaveNonPreemp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePriorityNonPreemp;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextPriorityArrivalNonPreemp;
    private javax.swing.JTextField jTextPriorityBurstNonPreem;
    private javax.swing.JTextField jTextPriorityNoOfProcessNonPreem;
    private javax.swing.JTextField jTextPriorityPriorityNonPreemp;
    private javax.swing.JTextField jTextPriorityProcessIDNonPreem;
    // End of variables declaration//GEN-END:variables
}
