
import javax.swing.JOptionPane;


public class ManageStudentInternalFrame extends javax.swing.JInternalFrame {


    public ManageStudentInternalFrame() {
        initComponents();
    }


    @SuppressWarnings("unchecked")

    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        rbFemale = new javax.swing.JRadioButton();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMobileNumber = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboCourse = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtRollNumber = new javax.swing.JTextField();
        rbMale = new javax.swing.JRadioButton();
        txtName = new javax.swing.JTextField();
        btnGetDetails = new javax.swing.JButton();

        setClosable(true);
        setTitle("ManageStudentInternalFrame");

        buttonGroup1.add(rbFemale);
        rbFemale.setFont(new java.awt.Font("Palatino Linotype", 0, 16)); // NOI18N
        rbFemale.setText("Female");

        txtEmail.setFont(new java.awt.Font("Palatino Linotype", 0, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Palatino Linotype", 0, 16)); // NOI18N
        jLabel6.setText("Mobile Number : ");

        txtMobileNumber.setFont(new java.awt.Font("Palatino Linotype", 0, 16)); // NOI18N

        btnUpdate.setFont(new java.awt.Font("Palatino Linotype", 0, 16)); // NOI18N
        btnUpdate.setText("Update Details");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Palatino Linotype", 0, 16)); // NOI18N
        btnDelete.setText("Delete Record");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 0, 16)); // NOI18N
        jLabel1.setText("Roll Number : ");

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 0, 16)); // NOI18N
        jLabel2.setText("Name : ");

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 0, 16)); // NOI18N
        jLabel3.setText("Email ID : ");

        cboCourse.setFont(new java.awt.Font("Palatino Linotype", 0, 16)); // NOI18N
        cboCourse.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Java", "Android", "PHP" }));

        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 0, 16)); // NOI18N
        jLabel4.setText("Course : ");

        jLabel5.setFont(new java.awt.Font("Palatino Linotype", 0, 16)); // NOI18N
        jLabel5.setText("Gender : ");

        txtRollNumber.setFont(new java.awt.Font("Palatino Linotype", 0, 16)); // NOI18N

        buttonGroup1.add(rbMale);
        rbMale.setFont(new java.awt.Font("Palatino Linotype", 0, 16)); // NOI18N
        rbMale.setSelected(true);
        rbMale.setText("Male");

        txtName.setFont(new java.awt.Font("Palatino Linotype", 0, 16)); // NOI18N

        btnGetDetails.setFont(new java.awt.Font("Palatino Linotype", 0, 16)); // NOI18N
        btnGetDetails.setText("Get Details");
        btnGetDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMobileNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                            .addComponent(txtEmail)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtRollNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47)
                                        .addComponent(btnGetDetails))
                                    .addComponent(cboCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbMale)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbFemale)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addGap(33, 33, 33)))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRollNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGetDetails))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rbMale)
                    .addComponent(rbFemale))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtMobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {
        int rollNumber = Integer.parseInt(txtRollNumber.getText());
        String name = txtName.getText();
        String gender = rbMale.isSelected() ? "Male" : "Female";
        String email = txtEmail.getText();
        String mobileNumber = txtMobileNumber.getText();
        String course = cboCourse.getSelectedItem().toString();
        String data = rollNumber + "," + name + "," + email + "," + course;
        Student s = new Student(rollNumber, name, gender, email, mobileNumber, course);
        boolean status = DBManager.updateStudent(s);
        if (status == true) {
            JOptionPane.showMessageDialog(this, "Record Updated!");
            resetForm();
        } else {
            JOptionPane.showMessageDialog(this, "Record has not been updated!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        int x = JOptionPane.showConfirmDialog(this, "Do you wish to delete this Record", "Confirm", JOptionPane.YES_NO_OPTION);
        if (x == JOptionPane.YES_OPTION) {
            int rollNumber = Integer.parseInt(txtRollNumber.getText());
            boolean status = DBManager.deleteStudent(rollNumber);
            if (status == true) {
                JOptionPane.showMessageDialog(this, "Record Deleted!");
                resetForm();
            } else {
                JOptionPane.showMessageDialog(this, "Record has not been deleted!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    private void btnGetDetailsActionPerformed(java.awt.event.ActionEvent evt) {
        int rollNumber = Integer.parseInt(txtRollNumber.getText());
        Student s = DBManager.getStudent(rollNumber);
        if (s == null) {
            JOptionPane.showMessageDialog(this, "Record not Found!");
            resetForm();
        } else {
            txtName.setText(s.getName());
            if (s.getGender().equals("Male")) {
                rbMale.setSelected(true);
            } else {
                rbFemale.setSelected(true);
            }
            txtEmail.setText(s.getEmail());
            txtMobileNumber.setText(s.getMobileNumber());
            cboCourse.setSelectedItem(s.getCourse());
        }
    }
    void resetForm() {
        txtRollNumber.setText(null);
        txtName.setText(null);
        rbMale.setSelected(true);
        txtEmail.setText(null);
        txtMobileNumber.setText(null);
        cboCourse.setSelectedIndex(0);
        txtRollNumber.requestFocus();
    }


    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGetDetails;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cboCourse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobileNumber;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRollNumber;

}
