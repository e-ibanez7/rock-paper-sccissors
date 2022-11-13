/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.curso.rock.paper.shotgun;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author eibaneza
 */
public class RockPaperShotgun {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Juego j = new Juego ();
        j.gameLoop();
        
    }
}
