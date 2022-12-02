/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yılanoyunu;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author YEŞİL
 */
public class AnaPencere extends JFrame{
    private int Genislik=600;
    private int Yükseklik=600;
    private static AnaPencere mPencere=null;
    
    private AnaPencere(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        SetDimension( Genislik, Yükseklik);
        setResizable(false);
        
        Yilan Y=new Yilan();
        add(Y);
        
    }
    public static AnaPencere PencereGetir() {
       if(mPencere==null)
           mPencere =new AnaPencere();
       return mPencere;
        
    }
    public void SetDimension(int Genislik ,int Yükseklik){
        Dimension Dim = Toolkit.getDefaultToolkit().getScreenSize();
        int PosX=0;
        int PosY=0;
        if(Genislik+100>Dim.width)
            Genislik=Dim.width-100;
        if(Yükseklik+100>Dim.height)
            Yükseklik=Dim.height-100;
        PosX=(Dim.width-Genislik)/2;
        PosY=(Dim.height-Yükseklik)/2;
        setBounds(PosX, PosY, Genislik, Yükseklik);
    }
}
