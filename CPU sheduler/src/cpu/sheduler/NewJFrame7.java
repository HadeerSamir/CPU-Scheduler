package cpu.sheduler;

import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

public class NewJFrame7 extends javax.swing.JFrame {

    LinkedList<Process> list = new LinkedList<Process>();
    LinkedList<Process> list1 = new LinkedList<Process>();
    Process p0=new Process();
    Process p1 = new Process();
    Process p2 = new Process();
    DefaultTableModel model;

    public NewJFrame7() {
        initComponents();
        model = (DefaultTableModel) jTableSJFNonPreemp.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextSJFNoOfProcessNonPreem = new javax.swing.JTextField();
        jTextSJFProcessIdNonPreem = new javax.swing.JTextField();
        jTextSJFBurstNonPreem = new javax.swing.JTextField();
        jTextSJFArrivalNonPreem = new javax.swing.JTextField();
        jButtoSJFnAddProcess = new javax.swing.JButton();
        jButtonSJFSave = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableSJFNonPreemp = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Shortest Job First Scheduling \"Non_Preemptive\"");

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel2.setText("Enter Number Of Processes");

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel3.setText("Process_ID");

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel4.setText("Burst_Time");

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel5.setText("Arrival_Time");

        jButtoSJFnAddProcess.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jButtoSJFnAddProcess.setText("Save Process");
        jButtoSJFnAddProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoSJFnAddProcessActionPerformed(evt);
            }
        });

        jButtonSJFSave.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jButtonSJFSave.setText("Result");
        jButtonSJFSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSJFSaveActionPerformed(evt);
            }
        });

        jTableSJFNonPreemp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process_ID", "Burst_Time", "Arrival_Time", "Waiting_Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableSJFNonPreemp);

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel6.setText("Result:- ");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jButtonSJFSave)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jButtoSJFnAddProcess))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jTextSJFArrivalNonPreem, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextSJFNoOfProcessNonPreem, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextSJFProcessIdNonPreem, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(jTextSJFBurstNonPreem))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextSJFNoOfProcessNonPreem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextSJFProcessIdNonPreem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextSJFBurstNonPreem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextSJFArrivalNonPreem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSJFSave)
                    .addComponent(jButtoSJFnAddProcess))
                .addGap(39, 39, 39)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtoSJFnAddProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoSJFnAddProcessActionPerformed
        
        jButtoSJFnAddProcess.setVisible(true);
        jButtonSJFSave.setVisible(true);
        int processno = Integer.parseInt(jTextSJFNoOfProcessNonPreem.getText());
        int id = Integer.parseInt(jTextSJFProcessIdNonPreem.getText());
        float burst = Float.parseFloat(jTextSJFBurstNonPreem.getText());
        float arrival = Float.parseFloat(jTextSJFArrivalNonPreem.getText());
        p1 = new Process(id, burst, arrival);
        list.add(p1);

        jTextSJFProcessIdNonPreem.setText("");
        jTextSJFBurstNonPreem.setText("");
        jTextSJFArrivalNonPreem.setText("");
    }//GEN-LAST:event_jButtoSJFnAddProcessActionPerformed

    private void jButtonSJFSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSJFSaveActionPerformed

        int position;
        float temp1;//burst
        float temp2;//arrival
        int temp3;//id
        float waitingTime[]=new float[list.size()];
        float departureTime[]=new float[list.size()];
        float turnAroundTime[]=new float[list.size()];
        float departure=0;
        float sumArrival=0;
        int r=0;
 
 
        waitingTime[0]=0;
        
        for(int n=0;n<list.size();n++){
            sumArrival+=list.get(n).arrivalTime;
        }
        
        if(sumArrival==0 ){
                r=0;
            }
            else{
                r=1;
            }
        
        for(int i=r;i<list.size();i++){
            
            position=i;
           for(int j=i+1;j<list.size();j++){
                if(  list.get(j).burstTime < list.get(position).burstTime && list.get(j).arrivalTime >= list.get(position).arrivalTime){
                    position=j;
               }
        
                //sorting
              
                temp1=list.get(i).burstTime;
                list.get(i).burstTime=list.get(position).burstTime;
                list.get(position).burstTime=temp1;
                
                temp2=list.get(i).arrivalTime;
                list.get(i).arrivalTime=list.get(position).arrivalTime;
                list.get(position).arrivalTime=temp2;
                
                temp3=list.get(i).processId;
                list.get(i).processId=list.get(position).processId;
                list.get(position).processId=temp3;
                  
            }
        }
        
        
        for(int i=0;i<list.size();i++){
            departure+=list.get(i).burstTime;
            departureTime[i]=departure;
        }
        
        for(int i=0;i<list.size();i++){
            turnAroundTime[i]=departureTime[i]-list.get(i).arrivalTime;
            waitingTime[i]=turnAroundTime[i]-list.get(i).burstTime;
            p2 = new Process(list.get(i).processId, list.get(i).burstTime, list.get(i).arrivalTime, waitingTime[i]);
            list1.add(p2);
        }

        Object rowData[] = new Object[4];

        for (int i = 0; i < list.size(); i++) {

            rowData[0] = list1.get(i).processId;
            rowData[1] = list1.get(i).burstTime;
            rowData[2] = list1.get(i).arrivalTime;
            rowData[3] = list1.get(i).waitingTime;
            model.addRow(rowData);
        }
        
         jButtonSJFSave.setVisible(false);
         jTextSJFNoOfProcessNonPreem.setText("");
         jButtoSJFnAddProcess.setVisible(false);
    }//GEN-LAST:event_jButtonSJFSaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new NewJFrame3().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        float totalWaitingTime = 0;
        float averageWaitingTime;
        for (int i = 0; i < list1.size(); i++) {
            totalWaitingTime += list1.get(i).waitingTime;
        }
        averageWaitingTime = totalWaitingTime / list1.size();
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
            java.util.logging.Logger.getLogger(NewJFrame7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtoSJFnAddProcess;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonSJFSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableSJFNonPreemp;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextSJFArrivalNonPreem;
    private javax.swing.JTextField jTextSJFBurstNonPreem;
    private javax.swing.JTextField jTextSJFNoOfProcessNonPreem;
    private javax.swing.JTextField jTextSJFProcessIdNonPreem;
    // End of variables declaration//GEN-END:variables
}
