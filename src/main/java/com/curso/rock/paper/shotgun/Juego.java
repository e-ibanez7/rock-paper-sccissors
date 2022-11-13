/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.rock.paper.shotgun;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author eibaneza
 */
public class Juego {
    private int playerScore;
    private int iaScore;
    private int turn;
    
    
    public Juego (){
        this.playerScore = 0;
        this.iaScore = 0;
        this.turn=1;
    }
    
    
    
    public int getPlayerScore () {
        return this.playerScore;
    }
    public int getIaScore () {
        return this.iaScore;
    }
    public int getTurn () {
        return this.turn;
    }
    
    
    public void addPoint (boolean player) {
        if (player)
            this.playerScore++;
        else
            this.iaScore++;
    }
    
    
    public void gameLoop () {
        System.out.println("************************* Rock, Paper, Scissor *************************");
        System.out.println("******************************* Main Menu ******************************");
        System.out.println("********************************* Score ********************************");
        System.out.println("************************  Player "+this.playerScore+"  ** IA "+this.iaScore+"0  ***************************");
        System.out.println("Enter username");
        System.out.println("**** Introduzca \"exit\" para salir, cualquier otra para continuar: ****");
        Scanner inputs = new Scanner(System.in);
        String option = inputs.nextLine();
        option = option.toLowerCase();
        if (!option.equals("exit")){
            this.gameRound();
            this.gameLoop();
        }
    }
    public void gameRound () {
        System.out.println("******************************* Ronda  "+this.getTurn()+" ******************************");
        System.out.println("* Introduzca su jugada: piedra (rock, r), papel (paper, p) o tijera (scissors, s) *");
        System.out.println("******************************* prooobandooo ******************************");
        Scanner inputs = new Scanner(System.in);
        String option = inputs.nextLine();
        option = option.toLowerCase();
        switch (option) {
            case "piedra", "rock", "r" -> this.resolveGame(0);
            case "papel", "p", "paper" -> this.resolveGame(1);
            case "tijera", "s", "scissors" -> this.resolveGame(2);
            default -> {
                System.out.println("*********** Input no reconocido, por favor inténtelo de nuevo **********");
                this.gameRound();
            }
        }
        
        

    }
    public void resolveGame (int option){
        int optionCPU;
        Random r = new Random();
        optionCPU = r.nextInt(3);
        if (option == 0){
            switch (optionCPU) {
                case 0 -> gameDraw();
                case 1 -> gameLost();
                default -> gameWin();
            }
        }
        else if (option == 1){
            switch (optionCPU) {
                case 0 -> gameWin();
                case 1 -> gameDraw();
                default -> gameLost();
            }
                
        }
        else{
            switch (optionCPU) {
                case 0 -> gameLost();
                case 1 -> gameWin();
                default -> gameDraw();
            }
        }
        
    }
    
    public void gameWin(){}
    public void gameDraw(){}
    public void gameLost(){}
    
    public String getJugada(){}
}
    
    
    
    
    
    
