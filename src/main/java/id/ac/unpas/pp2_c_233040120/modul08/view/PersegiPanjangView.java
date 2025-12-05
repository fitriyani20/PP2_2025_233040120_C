/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.pp2_c_233040120.modul08.view;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Fitriyani Rahmadini
 */
public class PersegiPanjangView extends JFrame {
    private JTextField txtPanjang = new JTextField(10);
    private JTextField txtLebar = new JTextField(10);
    //tambahan
    private JLabel lblLuas = new JLabel("-");
    private JLabel lblKeliling = new JLabel("-");

    //private JLabel lblHasil = new JLabel("-");
    private JButton btnHasil = new JButton("Hasil");
    private JButton btnReset = new JButton("Reset");
    
    public PersegiPanjangView(){
        //Inisiasi Ui
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(350, 250);
        this.setLayout(new GridLayout(6, 2, 10, 10)); //Grid 4 baris
        this.setTitle("MVC Kalkulator");
        
        this.add(new JLabel("Panjang"));
        this.add(txtPanjang);
        this.add(new JLabel("Lebar"));
        this.add(txtLebar);
        //tambahan 
        this.add(new JLabel("Luas"));
        this.add(lblLuas);
        this.add(new JLabel("Keliling"));
        this.add(lblKeliling);
        
        //this.add(new JLabel(""));// Scaper kosong
        //this.add(btnHitung);
        
        this.add(btnHasil);
        this.add(btnReset);
    }
    
      //Mengambil nilai panjang dari TextField
        public double getPanjang(){
        return Double.parseDouble(txtPanjang.getText());
        }
        
        //Mengambil nilai lebar dari TextField
        public double getLebar(){
            return Double.parseDouble(txtLebar.getText());
        }
        
        //Setter output
        public void setLuas(double luas) {
            lblLuas.setText(String.valueOf(luas));
        }

        public void setKeliling(double keliling) {
            lblKeliling.setText(String.valueOf(keliling));
        }
        
        //Reset input dan hasil
        public void reset() {
            txtPanjang.setText("");
            txtLebar.setText("");
            lblLuas.setText("-");
            lblKeliling.setText("-");
        }
        
        
        //Menampilkan hasil ke Label
        //public void setHasil(double hasil){
        //    lblHasil.setText(String.valueOf(hasil));
        //}
        
        //Menampilkan pesan error (Jika input bukan angka)
        public void tampilkanPesanError(String pesan) {
            JOptionPane.showMessageDialog(this, pesan);
        }
        
        //Mendaftarkan listener untuk tombol (Controller yang akan memberikan aksinya)
        //Listener
        // Listener tunggal
        public void addHitungListener(ActionListener listener) {
            btnHasil.addActionListener(listener);
        }
        
        //resset
        public void addResetListener(ActionListener listener) {
        btnReset.addActionListener(listener);
        }
    }
   

    
        
      

