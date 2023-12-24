/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.revision;

/**
 *
 * @author ayman
 */
class Point {
    private int x;
    private int y;
public Point (int x, int y) {
this.x = x;
this.y = y;
}
public void deplace(int dx, int dy) {
x += dx;
y += dy;
}
public void affiche() {
System.out.println("Coordonnees : " + x + " "
+ y);

}
public void setY(int y) {
this.y=y;
}
public void setX(int x) {
this.x=x;
}
public int getX() {
return x;
}
public int getY() {
return y;
}
}
class pointNom extends Point{
  String nom;

    public String getNom() {
        return nom;
    }
  
  public pointNom(int x,int y,String nom){
  super(x,y);
  this.nom=nom;
  }
  public void setPointNom(int x,int y,String nom){
    this.setX(x);
      this.setY(y);
    this.nom=nom;
  }
  public void setNom(String nom){
    this.nom=nom;
  }
  public void affiche(){
  System.out.println("Coordonnees :"+" "+ getNom()+" " + getX() + " "
+ getY());
  }

    public void affCoord() {
        System.out.println("Coordonnees : " + getX() + " " + getY());
    }
}