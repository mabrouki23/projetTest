/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

/**
 *
 * @author Amine
 */
public class Employe {
        private String nas; 
        private String nom;
	private String adresse;
        private String tel;

    public Employe() {
    }

    public Employe(String nas, String nom, String adresse, String tel) {
        this.nas = nas;
        this.nom = nom;
        this.adresse = adresse;
        this.tel = tel;
    }

    public String getNas() {
        return nas;
    }

    public void setNas(String nas) {
        this.nas = nas;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Employe{" + "nas=" + nas + ", nom=" + nom + ", adresse=" + adresse + ", tel=" + tel + '}';
    }
        
        
        
}
