package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    Turtle zofka;

    public void main(String[] args) {
        zofka = new Turtle();

        Color cervenaFarba;
        cervenaFarba=new Color(255,0,0);

//  Commented first part because of cleaning screen
//        zofka.setLocation(300.0,500.0);
//        nakresliRovnostrannyTrojuhelnik(100.0);
//
//        nakresliCtverecek(zofka, 150.0);
//
//        zofka.setLocation(600, 500);
//        nakresliObdlznik(zofka, 150, 300);
//
//        zofka.setLocation(650, 200);
//        nakresliKolecko(zofka, 30.0);

        nakresliZmrzlinu(cervenaFarba);
        nakresliSnehuliaka(cervenaFarba);
        nakresliMasinku(cervenaFarba);

    }

    private void nakresliMasinku(Color cervenaFarba) {
        zofka.setLocation(800, 650);
        nakresliRovnostrannyTrojuhelnik(150.0, cervenaFarba);
        zofka.move(50);
        nakresliObdlznik(zofka, 150.0, 300.0);
        zofka.turnRight(90);
        for (int i = 0; i < 2; i++) {
            zofka.move(100);
            nakresliKolecko(zofka, 10.0, new Color(0,127,255));
        }
        zofka.move(100);
        zofka.turnLeft(90);
        nakresliObdlznik(zofka, 300.0, 200.0);
        nakresliKolecko(zofka, 26.5, new Color(0,127,255));
    }

    private void nakresliSnehuliaka(Color cervenaFarba) {
        zofka.setLocation(500, 670);
        nakresliKolecko(zofka,35.0, cervenaFarba);
        zofka.setLocation(500, 400);
        nakresliKolecko(zofka, 25.0, new Color(0,127,255));
        zofka.setLocation(500, 210);
        nakresliKolecko(zofka, 15.0, cervenaFarba);
        zofka.setLocation(390, 300);
        zofka.turnLeft(90);
        nakresliKolecko(zofka, 10.0, new Color(0,127,255));
        zofka.turnRight(180);
        zofka.setLocation(580, 300);
        nakresliKolecko(zofka, 10.0, cervenaFarba);
    }

    private void nakresliZmrzlinu(Color cervenaFarba) {
        zofka.setLocation(250, 500);
        zofka.turnLeft(90);
        nakresliRovnostrannyTrojuhelnik(200.0, cervenaFarba);
        zofka.setLocation(225, 550);
        zofka.penUp();
        zofka.move(60);
        zofka.penDown();
        nakresliKolecko(zofka, 30.0, new Color(0,127,255));
    }

    public void nakresliRovnostrannyTrojuhelnik(double velikostStrany, Color farbaCiary) {
        zofka.setPenColor(farbaCiary);
        for (int i = 0; i < 3; i++) {
            zofka.move(velikostStrany);
            zofka.turnLeft(120.0);
        }
    }

    private void nakresliCtverecek(Turtle turtle, double delkaStrany) {
        nakresliMnohouhelnik(turtle, delkaStrany, 4);
    }

    private void nakresliObdlznik(Turtle turtle, double delkaStranyA, double delkaStranyB) {
        for (int i = 0; i < 2; i++) {
            turtle.move(delkaStranyA);
            turtle.turnRight(90);
            turtle.move(delkaStranyB);
            turtle.turnRight(90);
        }
    }

    private void nakresliKolecko(Turtle turtle, double delkaStrany, Color farbaCiary) {
        zofka.setPenColor(farbaCiary);
        nakresliMnohouhelnik(turtle, delkaStrany, 24);
    }

    private void nakresliMnohouhelnik(Turtle turtle, double delkaStrany, int pocetStran) {
        double uhel = 360.0 / pocetStran;
        for (int i = 0; i < pocetStran; i++) {
            turtle.move(delkaStrany);
            turtle.turnRight(uhel);
        }
    }

}