/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yılanoyunu;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JLabel;

/**
 *
 * @author YEŞİL
 */
public class Kutu extends JLabel{
public int Genislik=20;
   
public int mYon=YON.SAG;
Kutu() {
        setBounds(100, 100, Genislik, Genislik);
    }
@Override
    public void paint(Graphics g){
        Graphics2D g2=(Graphics2D)g;
        Rectangle2D rect=new Rectangle2D.Double(1, 1, getWidth()-2, getHeight()-2);
        g2.setColor(Color.red);
        g2.setStroke(new BasicStroke(2));
        g2.draw(rect);
        g2.setColor(Color.red);
        g2.fill(rect);
    } 
    public void SolaGit(){
        int PosX =getX();
            int PosY=getY();
            PosX-=Genislik;
            setBounds(PosX, PosY, Genislik, Genislik);
    }
     public void SagaGit(){
        int PosX =getX();
            int PosY=getY();
            PosX+=Genislik;
            setBounds(PosX, PosY, Genislik, Genislik);
    }
     public void YukariGit(){
        int PosX =getX();
            int PosY=getY();
            PosY-=Genislik;
            setBounds(PosX, PosY, Genislik, Genislik);
    }
      public void AsagıGit(){
        int PosX =getX();
            int PosY=getY();
            PosY+=Genislik;
            setBounds(PosX, PosY, Genislik, Genislik);
    }
      public Kutu KutuOlustur(){
          Kutu K =new Kutu();
         int X=getX();
         int Y=getY();
         K.setBounds(X, Y, Genislik, Genislik);
         K.mYon=-mYon;
         K.Hareket();
         K.mYon=mYon;
          return K;
      }
      public void Hareket(){
          if(mYon==YON.SOL)
              SolaGit();
          else if (mYon==YON.SAG)
              SagaGit();
          else if (mYon==YON.ASAGI)
              AsagıGit();
          else 
          YukariGit();
      }
}
