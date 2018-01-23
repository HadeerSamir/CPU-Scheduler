package cpu.sheduler;

import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

public class NewJFrame2 extends javax.swing.JFrame {

    int id;
    float burst;
    float arrival;
    Process p = new Process();
    Process p2 = new Process();
    LinkedList<Process> list = new LinkedList<Process>();
    LinkedList<Process> list1 = new LinkedList<Process>();
    DefaultTableModel model;

    public NewJFrame2() {
        initComponents();
        model = (DefaultTableModel) resultTable.getModel();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        FCFS_process = new javax.swing.JTextField();
        FCFS_burst = new javax.swing.JTextField();
        FCFS_arrival = new javax.swing.JTextField();
        FCFS_back = new javax.swing.JButton();
        FCFS_new = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        FCFS_processno = new javax.swing.JTextField();
        jButton1Sava = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("FCFS Scheduling-Non_Preemptive");

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel2.setText("Process_ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel3.setText("Burst-Time");

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel4.setText("Arrival_Time");

        FCFS_process.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FCFS_processActionPerformed(evt);
            }
        });

        FCFS_burst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FCFS_burstActionPerformed(evt);
            }
        });

        FCFS_back.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        FCFS_back.setText("Back");
        FCFS_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FCFS_backActionPerformed(evt);
            }
        });

        FCFS_new.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        FCFS_new.setText("Save Process");
        FCFS_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FCFS_newActionPerformed(evt);
            }
        });

        resultTable.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process_ID", "Burst-Time", "Arrival-Time", "Waiting-Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(resultTable);

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel5.setText("Results:-");

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel6.setText("Enter Number Of Process");

        FCFS_processno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FCFS_processnoActionPerformed(evt);
            }
        });

        jButton1Sava.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jButton1Sava.setText("Result");
        jButton1Sava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1SavaActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jButton1.setText("Help");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jButton3.setText("Average Waiting Time");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(FCFS_back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 122, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jButton1Sava, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FCFS_new)
                                    .addComponent(FCFS_process, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FCFS_processno, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FCFS_burst, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FCFS_arrival, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(186, 186, 186))))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(FCFS_back)
                    .addComponent(jButton2))
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(FCFS_processno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(FCFS_process, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FCFS_burst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addComponent(FCFS_arrival, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1Sava)
                    .addComponent(FCFS_new))
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void FCFS_processActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FCFS_processActionPerformed


    }//GEN-LAST:event_FCFS_processActionPerformed

    private void FCFS_burstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FCFS_burstActionPerformed

    }//GEN-LAST:event_FCFS_burstActionPerformed

    private void FCFS_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FCFS_newActionPerformed
        
        FCFS_new.setVisible(true);
        jButton1Sava.setVisible(true);
        int processno = Integer.parseInt(FCFS_processno.getText());
        id = Integer.parseInt(FCFS_process.getText());
        burst = Float.parseFloat(FCFS_burst.getText());
        arrival = Float.parseFloat(FCFS_arrival.getText()); 
        p = new Process(id, burst, arrival);
        list.add(p);

        FCFS_process.setText("");
        FCFS_burst.setText("");
        FCFS_arrival.setText("");

               

    }//GEN-LAST:event_FCFS_newActionPerformed

    private void FCFS_processnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FCFS_processnoActionPerformed


    }//GEN-LAST:event_FCFS_processnoActionPerformed


    private void jButton1SavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1SavaActionPerformed
        float waitingTime[]=new float[list.size()];
        float departureTime[]=new float[list.size()];
        float turnAroundTime[]=new float[list.size()];
        float departure=0;
        
        for(int i=0;i<list.size();i++){
            departure+=list.get(i).burstTime;
            departureTime[i]=departure;
        }
        
        for(int i=0;i<list.size();i++){
            turnAroundTime[i]=departureTime[i]-list.get(i).arrivalTime;
        }
        for(int i=0;i<list.size();i++){
            waitingTime[i]=turnAroundTime[i]-list.get(i).burstTime;
             p2 = new Process(list.get(i).processId, list.get(i).burstTime, list.get(i).arrivalTime, waitingTime[i]);
            list1.add(p2);
        }

        Object rowData[] = new Object[4];

        for (int i = 0; i < list1.size(); i++) {
            rowData[0] = list1.get(i).processId;
            rowData[1] = list1.get(i).burstTime;
            rowData[2] = list1.get(i).arrivalTime;
            rowData[3] = list1.get(i).waitingTime;
            model.addRow(rowData);
        }
         FCFS_new.setVisible(false);
         jButton1Sava.setVisible(false);
         FCFS_processno.setText("");

    }//GEN-LAST:event_jButton1SavaActionPerformed

    private void FCFS_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FCFS_backActionPerformed
           new NewJFrame1().setVisible(true);
           this.setVisible(false);
    }//GEN-LAST:event_FCFS_backActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        float averageWaitingTime = 0;
        float totalWaitingTime = 0;
        for (int i = 0; i < list1.size(); i++) {
            totalWaitingTime += list1.get(i).waitingTime;
        }
        averageWaitingTime = totalWaitingTime / (float) list1.size();

        jTextField1.setText(Float.toString(averageWaitingTime));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    new NewJFrame10().setVisible(true);
    this.setVisible(false);
   
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FCFS_arrival;
    private javax.swing.JButton FCFS_back;
    private javax.swing.JTextField FCFS_burst;
    private javax.swing.JButton FCFS_new;
    private javax.swing.JTextField FCFS_process;
    private javax.swing.JTextField FCFS_processno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1Sava;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable resultTable;
    // End of variables declaration//GEN-END:variables

}
