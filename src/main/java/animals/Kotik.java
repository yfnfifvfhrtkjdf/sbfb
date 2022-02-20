package animals;

import java.util.*;

public class Kotik {
    private String name; // имя
    private String voice; // голос
    private int satiety; // сытость
    private int weight; // вес
    private static int count = 0; // отвечает за кол-во экземпляров класса
    private static ArrayList cat = new ArrayList(count);

    // Конструкторы //
    public Kotik(String name, String voice, int satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;

    }

    public Kotik() {
        name = getName();
        voice = getVoice();
        satiety = getSatiety();
        weight = getWeight();
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public static int getCount() {
        return count++;
    }

    public void setCount(int count) {
        this.count = getCount();
    }

    public static void setCat(ArrayList cat) {
        Kotik.cat = cat;
        count++;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    private int play; // играть
    private int sleep; // спать
    private int wash; // умываться
    private int walk; // гулять
    private int hunt; // охотиться
    private String eda;

    public String getEda() {
        return eda;
    }

    public void setEda() {
        this.eda = eda;
    }

    public int getPlay() {
        return play;
    }

    public void setPlay(int play) {
        this.play = play;
    }

    public int getSleep() {
        return sleep;
    }

    public void setSleep(int sleep) {
        this.sleep = sleep;
    }

    public int getWash() {
        return wash;
    }

    public void setWash(int wash) {
        this.wash = wash;
    }

    public int getWalk() {
        return walk;
    }

    public void setWalk(int walk) {
        this.walk = walk;
    }

    public int getHunt() {
        return play;
    }

    public void setHunt(int hunt) {
        this.hunt = hunt;
    }

    public boolean play() {
        setPlay(play);
        if (satiety > 0) {
            satiety--;
            System.out.println("Котик играет");
            return true;
        } else {
            System.out.println("Котик просит есть ");
            return false;
        }
    }

    public boolean sleep() {
        setSleep(sleep);
        if (satiety > 0) {
            satiety--;
            System.out.println("Котик спит");
            return true;
        } else {
            System.out.println("Котик просит есть");
            return false;
        }
    }

    public boolean wash() {
        setWash(wash);
        if (satiety > 0) {
            satiety--;
            System.out.println("Котик умывается");
            return true;
        } else {
            System.out.println("Котик просит есть");
            return false;
        }
    }

    public boolean walk() {
        setWalk(walk);
        if (satiety > 0) {
            satiety--;
            System.out.println("Котик гуляет");
            return true;
        } else {
            System.out.println("Котик просит есть");
            return false;
        }
    }

    public boolean hunt() {
        setHunt(hunt);
        if (satiety > 0) {
            satiety--;
            System.out.println("Котик охотится");
            return true;
        } else {
            System.out.println("Котик просит есть");
            return false;
        }

    }

    public boolean getSatiety(int s2) {
        if (satiety < 1) {
            satiety++;
            return true;
        } else {
            return false;
        }
    }

    public void eat(int s2) {
        this.satiety = satiety;
        if (satiety < 1) {
            getSatiety();
            satiety++;
            satiety += s2;
            System.out.println("котик поел. Сытость: " + satiety);
        } else {
            System.out.println("Котик не голоден. Уровень сытости: " + satiety);
        }
    }

    public void eat(int satiety, String eda) {
        this.eda = eda;
        this.satiety = satiety;
        System.out.println("Котик ел " + eda + " Уровень сытости " + satiety);
    }

    public void eat() {
        this.satiety = satiety;
        satiety++;
        this.eda = eda;
        this.eat(satiety, eda);
        eat(satiety, eda);
    }

    private static final int METHODS = 5;
    public String[] liveAnotherDay() {
        String[] myArray;
        int num=0;
        myArray = new String[24];
        for (String s:myArray) {
        while (num < 24) {
            switch ((int) (Math.random() * METHODS) +1) {
                case 1:
                    play();
                    if (satiety>0) {
                        num++;
                        myArray[0] =num+ " - играл";
                        System.out.println(myArray[0]);
                        continue;
                  } else {
                       num++;
                       satiety++;
                       myArray[5] =num+ " - ел";
                       System.out.println(myArray[5]);
                   }continue;
                case 2:
                    sleep();
                    if (satiety>0) {
                        num++;
                        myArray[1] =num+ " - спал";
                        System.out.println(myArray[1]);
                  } else {
                      satiety++;
                       num++;
                       myArray[5] =num+ " - ел";
                       System.out.println(myArray[5]);

                    }continue;

                case 3:
                    wash();
                    if (satiety>0) {
                        num++;
                        myArray[2] =num+ " - умывался";
                        System.out.println(myArray[2]);

                   } else {
                        satiety++;
                       num++;
                      myArray[5] =num+ " - ел";
                       System.out.println(myArray[5]);

                   }continue;
                case 4:
                    walk();
                    if (satiety>0) {
                        num++;
                        myArray[3] =num+ " - гулял";
                        System.out.println(myArray[3]);
                   } else {
                        satiety++;
                      num++;
                        myArray[5] =num+ " - ел";
                        System.out.println(myArray[5]);
                   }continue;
                case 5:
                    hunt();
                    if (satiety>0) {
                        num++;
                        myArray[4] =num+ " - охотился";
                        System.out.println(myArray[4]);
                    } else {
                       num++;
                        satiety++;
                       myArray[5] =num+ " - ел";
                       System.out.println(myArray[5]);
                   }continue;
             //   default:
              //      num++;
              //      myArray[5] =num+ " - ел";
               //     satiety++;
              //     System.out.println(myArray[5]);
            }
            System.out.println(s);
        }num=24;
        break;
            }
        return myArray;
        }
         }


