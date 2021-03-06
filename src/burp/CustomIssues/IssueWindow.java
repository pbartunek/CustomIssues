/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burp.CustomIssues;

import burp.IBurpExtenderCallbacks;
import burp.IExtensionHelpers;
import burp.IHttpRequestResponse;

public class IssueWindow extends java.awt.Frame {

    /**
     * Creates new form IssueWindow
     * @param callbacks
     * @param helpers
     * @param httpRequestResponseList
     */
    public IssueWindow(IBurpExtenderCallbacks callbacks, IExtensionHelpers helpers, IHttpRequestResponse[] httpRequestResponseList) {
        initComponents();
        this.callbacks = callbacks;
        this.helpers = helpers;
        this.httpRequestResponseList = httpRequestResponseList;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        issueBackgroundPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        issueBackgroundTextArea = new javax.swing.JTextArea();
        remediationDetailPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        remediationDetailTextArea = new javax.swing.JTextArea();
        issueNamePanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        issueNameTextArea = new javax.swing.JTextArea();
        remediationBackgroundPanel = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        remediationBackgroundTextArea = new javax.swing.JTextArea();
        issueDetailPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        issueDetailTextArea = new javax.swing.JTextArea();
        addIssueBtn = new javax.swing.JButton();
        severityCombo = new javax.swing.JComboBox<>();
        severityLabel = new javax.swing.JLabel();
        confidenceLabel = new javax.swing.JLabel();
        confidenceCombo = new javax.swing.JComboBox<>();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        issueBackgroundPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Issue Background"));
        issueBackgroundPanel.setAutoscrolls(true);
        issueBackgroundPanel.setPreferredSize(new java.awt.Dimension(10, 100));

        issueBackgroundTextArea.setColumns(20);
        issueBackgroundTextArea.setRows(2);
        jScrollPane3.setViewportView(issueBackgroundTextArea);

        javax.swing.GroupLayout issueBackgroundPanelLayout = new javax.swing.GroupLayout(issueBackgroundPanel);
        issueBackgroundPanel.setLayout(issueBackgroundPanelLayout);
        issueBackgroundPanelLayout.setHorizontalGroup(
            issueBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        issueBackgroundPanelLayout.setVerticalGroup(
            issueBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
        );

        remediationDetailPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Remediation Detail"));
        remediationDetailPanel.setAutoscrolls(true);
        remediationDetailPanel.setPreferredSize(new java.awt.Dimension(10, 100));

        remediationDetailTextArea.setColumns(20);
        remediationDetailTextArea.setRows(2);
        jScrollPane4.setViewportView(remediationDetailTextArea);

        javax.swing.GroupLayout remediationDetailPanelLayout = new javax.swing.GroupLayout(remediationDetailPanel);
        remediationDetailPanel.setLayout(remediationDetailPanelLayout);
        remediationDetailPanelLayout.setHorizontalGroup(
            remediationDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
        );
        remediationDetailPanelLayout.setVerticalGroup(
            remediationDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
        );

        issueNamePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Issue Name"));
        issueNamePanel.setAutoscrolls(true);

        issueNameTextArea.setColumns(20);
        issueNameTextArea.setRows(2);
        issueNameTextArea.setToolTipText("");
        issueNameTextArea.setAutoscrolls(false);
        jScrollPane2.setViewportView(issueNameTextArea);

        javax.swing.GroupLayout issueNamePanelLayout = new javax.swing.GroupLayout(issueNamePanel);
        issueNamePanel.setLayout(issueNamePanelLayout);
        issueNamePanelLayout.setHorizontalGroup(
            issueNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        issueNamePanelLayout.setVerticalGroup(
            issueNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(issueNamePanelLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        remediationBackgroundPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Remediation Background"));
        remediationBackgroundPanel.setAutoscrolls(true);
        remediationBackgroundPanel.setPreferredSize(new java.awt.Dimension(10, 100));

        remediationBackgroundTextArea.setColumns(20);
        remediationBackgroundTextArea.setRows(2);
        jScrollPane5.setViewportView(remediationBackgroundTextArea);

        javax.swing.GroupLayout remediationBackgroundPanelLayout = new javax.swing.GroupLayout(remediationBackgroundPanel);
        remediationBackgroundPanel.setLayout(remediationBackgroundPanelLayout);
        remediationBackgroundPanelLayout.setHorizontalGroup(
            remediationBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
        );
        remediationBackgroundPanelLayout.setVerticalGroup(
            remediationBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
        );

        issueDetailPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Issue Detail"));
        issueDetailPanel.setAutoscrolls(true);
        issueDetailPanel.setPreferredSize(new java.awt.Dimension(10, 100));

        issueDetailTextArea.setColumns(20);
        issueDetailTextArea.setRows(2);
        jScrollPane1.setViewportView(issueDetailTextArea);

        javax.swing.GroupLayout issueDetailPanelLayout = new javax.swing.GroupLayout(issueDetailPanel);
        issueDetailPanel.setLayout(issueDetailPanelLayout);
        issueDetailPanelLayout.setHorizontalGroup(
            issueDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        issueDetailPanelLayout.setVerticalGroup(
            issueDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
        );

        addIssueBtn.setText("Add issue");
        addIssueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addIssueBtnActionPerformed(evt);
            }
        });

        severityCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "High", "Medium", "Low", "Information" }));

        severityLabel.setText("Severity");

        confidenceLabel.setText("Confidence");

        confidenceCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Certain", "Firm", "Tentative" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(remediationDetailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
                    .addComponent(remediationBackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
                    .addComponent(issueBackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
                    .addComponent(issueDetailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
                    .addComponent(issueNamePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(confidenceLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(confidenceCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(severityLabel)
                            .addGap(72, 72, 72)
                            .addComponent(severityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(addIssueBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(issueNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(issueDetailPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(issueBackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(remediationDetailPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(remediationBackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(severityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(severityLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confidenceLabel)
                    .addComponent(confidenceCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addIssueBtn)
                .addContainerGap())
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        setVisible(false);
        dispose();
    }//GEN-LAST:event_exitForm

    private void addIssueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addIssueBtnActionPerformed
        
        for (IHttpRequestResponse rq : httpRequestResponseList)
        {
            CustomScanIssue issue = new CustomScanIssue(
                helpers.analyzeRequest(rq).getUrl(),
                rq);

            issue.setName(issueNameTextArea.getText());
            issue.setDetail(issueDetailTextArea.getText());
            issue.setBackground(issueBackgroundTextArea.getText());
            issue.setRemediationDetail(remediationDetailTextArea.getText());
            issue.setRemediationBackground(remediationBackgroundTextArea.getText());
            issue.setSeverity(severityCombo.getSelectedItem().toString());
            issue.setConfidence(confidenceCombo.getSelectedItem().toString());

            callbacks.addScanIssue(issue);
        }

        setVisible(false);
        dispose();
    }//GEN-LAST:event_addIssueBtnActionPerformed

    private IBurpExtenderCallbacks callbacks;
    private IExtensionHelpers helpers;
    private IHttpRequestResponse[] httpRequestResponseList;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addIssueBtn;
    private javax.swing.JComboBox<String> confidenceCombo;
    private javax.swing.JLabel confidenceLabel;
    private javax.swing.JPanel issueBackgroundPanel;
    private javax.swing.JTextArea issueBackgroundTextArea;
    private javax.swing.JPanel issueDetailPanel;
    private javax.swing.JTextArea issueDetailTextArea;
    private javax.swing.JPanel issueNamePanel;
    private javax.swing.JTextArea issueNameTextArea;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPanel remediationBackgroundPanel;
    private javax.swing.JTextArea remediationBackgroundTextArea;
    private javax.swing.JPanel remediationDetailPanel;
    private javax.swing.JTextArea remediationDetailTextArea;
    private javax.swing.JComboBox<String> severityCombo;
    private javax.swing.JLabel severityLabel;
    // End of variables declaration//GEN-END:variables
}
