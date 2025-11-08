/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.pp2_c_233040120.modul05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Fitriyani Rahmadini
 */
public class TugasModul05 {
    public static void main(String[] args) {
        // Membuat JFrame
        JFrame frame = new JFrame("Tugas Modul 05 - BorderLayout");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Membuat JLabel
        JLabel label = new JLabel("Selamat Datang!", SwingConstants.CENTER);
        frame.add(label, BorderLayout.CENTER);

        // Membuat JButton untuk setiap posisi
        JButton btnNorth = new JButton("NORTH");
        JButton btnSouth = new JButton("SOUTH");
        JButton btnEast = new JButton("EAST");
        JButton btnWest = new JButton("WEST");

        // Menambahkan tombol ke JFrame
        frame.add(btnNorth, BorderLayout.NORTH);
        frame.add(btnSouth, BorderLayout.SOUTH);
        frame.add(btnEast, BorderLayout.EAST);
        frame.add(btnWest, BorderLayout.WEST);

        // Aksi untuk setiap tombol
        btnNorth.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Tombol NORTH diklik!");
            }
        });

        btnSouth.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Tombol SOUTH diklik!");
            }
        });

        btnEast.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Tombol EAST diklik!");
            }
        });

        btnWest.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Tombol WEST diklik!");
            }
        });

        // Tampilkan frame
        frame.setVisible(true);
    }
}

