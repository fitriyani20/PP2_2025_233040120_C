/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.pp2_c_233040120.modul08;

import id.ac.unpas.pp2_c_233040120.modul08.model.PersegiPanjangModel;
import id.ac.unpas.pp2_c_233040120.modul08.view.PersegiPanjangView;
import id.ac.unpas.pp2_c_233040120.modul08.controller.PersegiPanjangController;

/**
 *
 * @author Fitriyani Rahmadini
 */
public class Main {
    public static void main(String[] args){
        //1. Instansiasi Model
        PersegiPanjangModel model = new PersegiPanjangModel();
        
        //2. Instansiasi View
        PersegiPanjangView view = new PersegiPanjangView();
        
        //3. Instansiasi Controller (Hubungan model & view
        PersegiPanjangController controller = new PersegiPanjangController(model, view);
        
        //4. tampilkan view
        view.setVisible(true);
    }
}
