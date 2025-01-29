package model;

public class Game {
    private int fieldWidth;
    protected int fieldHeigth;
    private int finishFieldWight;
    private int finishFieldHeight;
    private int finishX;
    private int finishY;
    private Entity[] players;
    private int steps = 0;

    public Game(){}

    public Game(int fieldWidth, int fieldHeigth, int finishFieldWight, int finishFieldHeight, int finishX, int finishY, Entity[] players) {
        this.fieldWidth = fieldWidth;
        this.fieldHeigth = fieldHeigth;
        this.finishFieldWight = finishFieldWight;
        this.finishFieldHeight = finishFieldHeight;
        this.finishX = finishX;
        this.finishY = finishY;
        this.players = players;
        Entity.setFieldSize(fieldWidth,fieldHeigth);
    }

    public Entity start(){
        while (true){
            for (int i = 0; i < players.length; i++) {
                players[i].move();
            }
            steps++;
            for (int i = 0; i < players.length; i++){
                if (players[i].getX() >= finishX && players[i].getX() <= finishX + finishFieldWight && players[i].getY() >= finishY && players[i].getY() <= finishY + finishFieldHeight){
                    System.out.println(players[i]);
                    return players[i];
                }
            }
        }
    }
}