import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import javax.print.DocFlavor.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Gestion_des_notes extends javax.swing.JFrame{
	private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tble;
    private javax.swing.JComboBox txtbr;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtno;
    private javax.swing.JTextField txtnot;
    private javax.swing.JTextField txtpr;
    private javax.swing.JTextField txtre;
    
    

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       

    }

private void jButton2ActionPerformed(ActionEvent evt) {
	// TODO Auto-generated method stub
	
}

private void jButton3ActionPerformed(ActionEvent evt) {
	// TODO Auto-generated method stub
	
}

private void jButton4ActionPerformed(ActionEvent evt) {
	// TODO Auto-generated method stub
	
}

private void jButton5ActionPerformed(ActionEvent evt) {
	// TODO Auto-generated method stub
	
}

private void jButton6MouseClicked(MouseEvent evt) {
	// TODO Auto-generated method stub
	
}

private void tbleMouseClicked(MouseEvent evt) {
	// TODO Auto-generated method stub
	
}

private void txtreActionPerformed(ActionEvent evt) {
	// TODO Auto-generated method stub
	
}

private void txtreKeyPressed(KeyEvent evt) {
	// TODO Auto-generated method stub
	
}

private void txtnotActionPerformed(ActionEvent evt) {
	// TODO Auto-generated method stub
	
}

private void txtidActionPerformed(ActionEvent evt) {
	// TODO Auto-generated method stub
	
}

private void jMenuItem4ActionPerformed(ActionEvent evt) {
	// TODO Auto-generated method stub
	
}

private void jMenuItem1ActionPerformed(ActionEvent evt) {
	// TODO Auto-generated method stub
	
}

private void jMenuItem3ActionPerformed(ActionEvent evt) {
	// TODO Auto-generated method stub
	
}

private void jMenuItem2ActionPerformed(ActionEvent evt) {
	// TODO Auto-generated method stub
	
}

private void jMenuItem5ActionPerformed(ActionEvent evt) {
	// TODO Auto-generated method stub
	
}


public Gestion_des_notes()  {
	initComponents();
}

private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        txtre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tble = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnot = new javax.swing.JTextField();
        txtbr = new javax.swing.JComboBox();
        txtpr = new javax.swing.JTextField();
        txtno = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(770, 530));
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
       /* java.net.URL imgURL = getClass().getResource("/supprimer.png");
        ImageIcon icon = new ImageIcon(imgURL);
        JLabel lblImage = new JLabel(icon);// NOI18N*/
        jButton1.setText("Supprimer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(180, 400, 143, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      //  jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/ajouter.png"))); // NOI18N
        jButton2.setText("Ajouter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }

		
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(40, 350, 130, 40);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
       // jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/rechercher.png"))); // NOI18N
        jButton3.setText("recherche ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(380, 380, 150, 40);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
       // jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/modifier.png"))); // NOI18N
        jButton4.setText("actualiser");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(180, 350, 140, 40);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
       // jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/actualiser.png"))); // NOI18N
        jButton5.setText("modifier");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(40, 400, 130, 40);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
       // jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/nouveau.png"))); // NOI18N
        jButton6.setText("r�aliser par");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }

		
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(90, 450, 160, 40);
        txtre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtreActionPerformed(evt);
            }

			
        });
        txtre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtreKeyPressed(evt);
            }

		
        });
        getContentPane().add(txtre);
        txtre.setBounds(560, 380, 130, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel6.setText("gestion des notes");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(260, 30, 350, 70);

        tble.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tble.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbleMouseClicked(evt);
            }

		
        });
        jScrollPane1.setViewportView(tble);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(340, 140, 374, 90);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("id :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 110, 42, 17);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Nom :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 150, 42, 17);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Prenom:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 190, 53, 17);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Branche :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 240, 60, 17);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("note  :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 290, 40, 17);

        txtnot.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnotActionPerformed(evt);
            }

		
        });
        getContentPane().add(txtnot);
        txtnot.setBounds(170, 290, 100, 23);

        txtbr.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "INFO", "IGE", "LGE", "PC", "SVT", "SM", "SH" }));
        getContentPane().add(txtbr);
        txtbr.setBounds(170, 240, 100, 22);

        txtpr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtpr);
        txtpr.setBounds(170, 190, 100, 23);

        txtno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtno);
        txtno.setBounds(170, 150, 100, 23);

        txtid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }

			
        });
        getContentPane().add(txtid);
        txtid.setBounds(170, 110, 100, 23);

      //  jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/wallpaper7.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 760, 500);

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("ajouter");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }

			
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("modifier");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }

		
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        jMenuItem3.setText("supprimer");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }

		
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem4.setText("actualiser");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }

		
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("rechercher");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }

		
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("realiser par");
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }

public static void main(String args[]) {
	java.awt.EventQueue.invokeLater(new Runnable() {
		public void run () {
	   new Gestion_des_notes();
			
		}
		
	
	});

}
}
