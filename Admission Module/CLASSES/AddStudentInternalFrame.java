
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class AddStudentInternalFrame extends javax.swing.JInternalFrame {


    public AddStudentInternalFrame() {
        initComponents();
    }




    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboCourse = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtRollNumber = new javax.swing.JTextField();
        rbMale = new javax.swing.JRadioButton();
        txtName = new javax.swing.JTextField();
        rbFemale = new javax.swing.JRadioButton();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMobileNumber = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Add Student Frame");

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
        txtRollNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRollNumberFocusLost(evt);
            }
        });
        txtRollNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRollNumberKeyTyped(evt);
            }
        });

        buttonGroup1.add(rbMale);
        rbMale.setFont(new java.awt.Font("Palatino Linotype", 0, 16)); // NOI18N
        rbMale.setSelected(true);
        rbMale.setText("Male");

        txtName.setFont(new java.awt.Font("Palatino Linotype", 0, 16)); // NOI18N

        buttonGroup1.add(rbFemale);
        rbFemale.setFont(new java.awt.Font("Palatino Linotype", 0, 16)); // NOI18N
        rbFemale.setText("Female");

        txtEmail.setFont(new java.awt.Font("Palatino Linotype", 0, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Palatino Linotype", 0, 16)); // NOI18N
        jLabel6.setText("Mobile Number : ");

        txtMobileNumber.setFont(new java.awt.Font("Palatino Linotype", 0, 16)); // NOI18N

        btnSave.setFont(new java.awt.Font("Palatino Linotype", 0, 16)); // NOI18N
        btnSave.setText("Save Data");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Palatino Linotype", 0, 16)); // NOI18N
        btnReset.setText("Reset Form");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Please enter a 4-Digit Number");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMobileNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(txtEmail)
                            .addComponent(cboCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbMale)
                                .addGap(18, 18, 18)
                                .addComponent(rbFemale))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSave)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset)
                        .addGap(33, 33, 33)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtRollNumber))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRollNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                    .addComponent(btnSave)
                    .addComponent(btnReset))
                .addGap(29, 29, 29))
        );

        pack();
    }

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {


        String errors = "";
        if(txtRollNumber.getText().equals("")){
            errors += "Roll Number can not be empty!\n";
        }
        if(txtName.getText().equals("")){
            errors += "Name can not be empty!\n";
        }
        if(txtEmail.getText().equals("")){
            errors += "Email ID can not be empty!\n";
        }
        if(txtMobileNumber.getText().equals("")){
            errors += "Mobile Number can not be empty!\n";
        }

        if(!errors.equals("")){
            JOptionPane.showMessageDialog(this, errors, "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }


        if(!Pattern.matches("\\d{4}", txtRollNumber.getText())){
            errors += "Roll Number must be a 4-Digit Number!\n";
        }
        if(!Pattern.matches("[A-Za-z]+(\\s[A-Za-z]+)*", txtName.getText())){
            errors += "Name has some Invalid Characters!\n";
        }
        if(!Pattern.matches("\\w+@\\w+[.]com", txtEmail.getText())){
            errors += "Email is not Valid!\n";
        }
        if(!Pattern.matches("\\d{10}", txtMobileNumber.getText())){
            errors += "Mobile Number must be a 10-Digit Number!\n";
        }
        if(!errors.equals("")){
            JOptionPane.showMessageDialog(this, errors, "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int rollNumber = Integer.parseInt(txtRollNumber.getText());
        Student st = DBManager.getStudent(rollNumber);
        if (st != null) {
            JOptionPane.showMessageDialog(this, "Roll Number already exists");
            txtRollNumber.requestFocus();
            return;
        }


        String name = txtName.getText();
        String gender = rbMale.isSelected()?"Male":"Female";
        String email = txtEmail.getText();
        String mobileNumber = txtMobileNumber.getText();
        String course = cboCourse.getSelectedItem().toString();
        String data = rollNumber+","+name+","+email+","+course;
        //boolean status = DBManager.insertStudent(rollNumber, name, gender, email, mobileNumber, course);
        Student s = new Student(rollNumber, name, gender, email, mobileNumber, course);
        boolean status = DBManager.insertStudent(s);
        if(status==true){
            JOptionPane.showMessageDialog(this, "Record saved!");
            resetForm();
        }else{
            JOptionPane.showMessageDialog(this, "Record has not been saved!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {
        resetForm();
    }
    private void txtRollNumberKeyTyped(java.awt.event.KeyEvent evt) {
        /*char ch = evt.getKeyChar();
        if(Character.isDigit(ch)){
            if(txtRollNumber.getText().length()==4){
                evt.consume();
            }
        }else{
            //JOptionPane.showMessageDialog(this, "Only digits are allowed", "Error", JOptionPane.ERROR_MESSAGE);
            evt.consume();
        }*/

    }
    private void txtRollNumberFocusLost(java.awt.event.FocusEvent evt) {
        /*if(txtRollNumber.getText().length()<4){
            txtRollNumber.requestFocus();
        }
        int rollNumber = Integer.parseInt(txtRollNumber.getText());
        Student s = DBManager.getStudent(rollNumber);
        if (s != null) {
            JOptionPane.showMessageDialog(this, "Rollnumber already exists");
            txtRollNumber.requestFocus();
        } */
    }
    void resetForm(){
        txtRollNumber.setText(null);
        txtName.setText(null);
        rbMale.setSelected(true);
        txtEmail.setText(null);
        txtMobileNumber.setText(null);
        cboCourse.setSelectedIndex(0);
        txtRollNumber.requestFocus();
    }
  private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cboCourse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobileNumber;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRollNumber;

}
