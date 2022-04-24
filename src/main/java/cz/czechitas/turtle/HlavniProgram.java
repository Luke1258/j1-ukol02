package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    Turtle zofka;
    public void main(String[] args) {
        zofka = new Turtle();

        zofka.setLocation(300.0,500.0);
        nakresliRovnostrannyTrojuhelnik(100.0);

        nakresliCtverecek(zofka, 150.0);

        zofka.setLocation(600, 500);
        nakresliObdlznik(zofka, 150, 300);

        zofka.setLocation(650, 200);
        nakresliKolecko(zofka, 30.0);
    }

    public void nakresliRovnostrannyTrojuhelnik(double velikostStrany) {
        // Zde lze používat proměnnou velikostStrany.
        // Jeji hodnota je takova, s jakou byla metoda zavolana
        zofka.move(velikostStrany);
        zofka.turnLeft(120.0);
        zofka.move(velikostStrany);
        zofka.turnLeft(120.0);
        zofka.move(velikostStrany);
        zofka.turnLeft(120.0);
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

    private void nakresliKolecko(Turtle turtle, double delkaStrany) {
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