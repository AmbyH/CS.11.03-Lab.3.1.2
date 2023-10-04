import javax.swing.*;
import java.net.URL;
import java.util.Random;
import java.util.Scanner;


class Reference { //declaring all variables
    public static int level = 1;
    public static int hp = 15;
    public static int atk = 2;
    public static int def = 10;
    public static int mana = 10;
    public static int spd = 10;
    public static String name = "";
    public static int choice = 0;
    public static String inventory = "";
    public static boolean bobTalked = false;
    public static boolean oldManTalked = false;
    public static boolean travelled = false;
    public static String place = "velnar";
    public static int potion = 0;
    public static boolean mobAlive = true;
    public static boolean hasWolfSkin = false;
    public static String weaponName = "";
    public static int wolfHealth = 0;
    public static int wolfSkin = 0;
    public static String weaponName2 = "";
    public static int gold = 10;
    public static boolean betOver = false;

}
public class Main {

    /*first level - the player will walk through a tutorial
    the player will learn how to move
    the player will learn about their chosen class
    1. Assassin - low hp, high atk, low def, med mana, high spd
    2. Tank - high hp, med atk, high def, med mana, low spd
    3. Elf - med hp, high atk, med def, high mana, med spd
    4. Berserker - low hp, high atk, high def, low mana, low spd
    5. Human - lwo hp, low atk, low def, low mana, low spd (can transcend to god)
    6. Swordsman - med hp, high atk, med def, high mana, high spd
    7. Vampire - low hp, low atk, low def, high mana, high spd
    8. God (cannot be chosen) - high hp, high atk, high def, high mana, high spd
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wise Old Man:  \nHello Adventurer! Welcome to the magnificent land of Velnar. Here, you will adventure through the dark forest to find the mysterious mythical weapon. ");
        System.out.println("Adventurer, what is your name?");
        Reference.name = scanner.nextLine();
        System.out.println("Greetings, " + Reference.name + "! In your adventure, you will face many hardships. Having a weapon is a must! I can offer you 7 weapons right now. ");
        System.out.println("1. Dark Dagger \n2. Thunderforge Hammer \n3. Aetherstrike Bow \n4. Battle-Axe Stormbreaker \n5. Wooden Sword \n6. Lightless Katana \n7. Vampiric Blade");
        int choice = ((scanner.nextInt())-1);
        Reference.weaponName = getBeginnerWeapon(choice);
        Reference.weaponName2 = getWeapon(choice);
        Reference.inventory = "1x "+Reference.weaponName;
        if (choice == 4) {
            System.out.println("Wise Old Man: \nThe wooden sword? Why choose a sword made out of wood when you can choose a sword forged of steel? Whatever, its your life, not mine. ");
        }
        else {
            System.out.println("Wise Old Man: \nYou chose the " + Reference.weaponName + ", huh? Haha, your parents chose the exact same thing 20 years ago. I know you will become a great adventurer. ");
        }
        System.out.println("A quest came in to kill some Goblins in Narshville. Go talk to Bob before you go, he'll give you a map. Good luck!");
        choice1();
        choice2();
        choice3();
        choice4();
        choice5();




    }





    public static String getBeginnerWeapon(int a) {
        String [] weaponName = new String[8];

        weaponName[0] = "Dark Dagger";
        weaponName[1] = "Thunderforge Hammer";
        weaponName[2] = "Aetherstrike Bow";
        weaponName[3] = "Battle-Axe Stormbreaker";
        weaponName[4] = "Wooden Sword";
        weaponName[5] = "Lightless Katana";
        weaponName[6] = "Vampiric Blade";
        weaponName[7] = "Arceus";

        return weaponName[a];
    }
    public static String getWeapon(int a) {

        String[] weaponName = new String[30];

        weaponName[0] = "Splintered Dagger"; //bad versions of all weapons
        weaponName[1] = "Rusty Hammer";
        weaponName[2] = "Wooden Bow";
        weaponName[3] = "Rusted Axe";
        weaponName[4] = "Wooden Sword";
        weaponName[5] = "Rusted Katana";
        weaponName[6] = "Splintered Dagger";

        weaponName[7] = "Dark Dagger"; //1st upgrade of weapon
        weaponName[8] = "Steel Hammer";
        weaponName[9] = "Eldenwood Bow";
        weaponName[10] = "Thunder Axe";
        weaponName[11] = "Wooden Sword";
        weaponName[12] = "Steel Katana";
        weaponName[13] = "Bloody Dagger";

        weaponName[14] = "Shadowstrike Dagger"; //2nd upgrade of weapon
        weaponName[15] = "Ironfury";
        weaponName[16] = "Stellarwind";
        weaponName[17] = "Voidreaper";
        weaponName[18] = "Wooden Sword";
        weaponName[19] = "Soul Slayer";
        weaponName[20] = "Bloodmoon's Bite";

        weaponName[21] = "Seraph's Stiletto"; //final upgrade
        weaponName[22] = "Runic Tempest";
        weaponName[23] = "Arcane Whisper";
        weaponName[24] = "Celestial Waraxe";
        weaponName[25] = "???";
        weaponName[26] = "Kurogane's Katana";
        weaponName[27] = "Crimson Whisper";

        return weaponName[a];


    }

    public static void quit() {
        System.exit(0);
    }

    public static void map1() {
        System.out.println(" Bob");
        System.out.println("|   |");
        System.out.println("|   |");
        System.out.println(" You");

    }

    public static void map2() {
        System.out.println(" Bob");
        System.out.println("|   |");
        System.out.println("|   |");
        System.out.println("|You  Old Man|");
    }

    public static void choice1() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        while (!Reference.bobTalked) {
            System.out.println('\n' +Reference.name + "\n---------------------" + '\n' + "1. Map \n2. Inventory\n3. Quit");
            Reference.choice = scanner.nextInt();
            if (Reference.choice<1 || Reference.choice>3) {
                System.out.println("Choose an actual option.");
            }
            else if (Reference.choice == 1) {
                map1();
                System.out.println('\n' + Reference.name + "\n---------------------" + '\n' + "1. Bob \n2. Exit");
                Reference.choice = scanner.nextInt();
                if (Reference.choice == 1) {
                    System.out.println("Bob:" + '\n' + "Hey! I see you've talked to the old man already. He asked me to give you this map, right? Here you go." + '\n'+"You obtained");
                    for (int i = 0; i < 5; i++) {
                        Thread.sleep(200); // Delay for half a second
                        System.out.print(".");
                    }
                    System.out.println("1x Map!" + '\n' + "You should head back to the old man. ");
                    Reference.bobTalked = true;
                }
                else if (Reference.choice == 2) {
                    choice1();
                }

            }
            else if (Reference.choice == 2) {

                System.out.println("Inventory");
                System.out.println("---------------------");
                System.out.println(Reference.inventory);
                choice1();

                //allow user to use stuff in inventory
            }
            else {
                quit();

            }
        }


    }
    public static void choice2() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        while (!Reference.oldManTalked) {
            System.out.println('\n' + Reference.name + "\n---------------------" + '\n' + "1. Map \n2. Inventory\n3. Quit");
            Reference.choice = scanner.nextInt();
            if (Reference.choice<1 || Reference.choice>3) {
                System.out.println("Choose an actual option.");
            }
            else if (Reference.choice == 1) {
                map2();
                System.out.println('\n' + Reference.name + "\n---------------------" + '\n' + "1. Wise Old Man \n2. Bob \n3. Exit");
                Reference.choice = scanner.nextInt();
                if (Reference.choice == 1) {
                    System.out.println("Wise Old Man:\nI see you got the map! I'll give you these potions. Every one heals 5 hp. Good luck on your adventure!\nYou obtained");
                    for (int i = 0; i < 5; i++) {
                        Thread.sleep(200); // Delay for half a second
                        System.out.print(".");
                    }
                    System.out.println("5x Potion");
                    Reference.potion = Reference.potion+5;
                    Reference.oldManTalked = true;
                }
                else if (Reference.choice == 2) {
                    System.out.println("Bob: \nI told you to talk to the Old Man! Why are you still here?");
                }
                else {
                    Reference.oldManTalked = false;
                }

            }
            else if (Reference.choice == 2) {
                System.out.println("Inventory");
                System.out.println("---------------------");
                System.out.println(Reference.inventory);
            }
            else {
                quit();

            }
        }
    }

    public static void choice3() throws InterruptedException {
        Reference.travelled = false;
        Scanner scanner = new Scanner(System.in);
        while (!Reference.travelled) {
            System.out.println('\n' + Reference.name + "\n---------------------" + '\n' + "1. Map \n2. Inventory\n3. Quit");
            Reference.choice = scanner.nextInt();
            if (Reference.choice<1 || Reference.choice>3) {
                System.out.println("Choose an actual option.");
            }
            else if (Reference.choice == 1) {
                printMap2();
                System.out.println('\n' + Reference.name + "\n---------------------" + '\n' + "1. Travel \n2. Casino\n3. Exit");
                Reference.choice = scanner.nextInt();

                    if (Reference.choice == 1) {

                        System.out.println('\n' + Reference.name + "\n---------------------\n1. Forest\n2. City");
                        Reference.choice = scanner.nextInt();
                        if (Reference.choice == 1) {
                            System.out.println("Travelling to the Forest");
                            for (int i = 0; i < 5; i++) {
                                Thread.sleep(1000); // Delay for a second
                                System.out.print(".");
                            }
                            Reference.place = "darkforest";
                            System.out.println("\nYou have arrived at the Forest! Three weird men stare at you. ");
                            Reference.travelled = true;
                        } else if ((Reference.choice == 2) && (Reference.place.equals("velnar"))) {
                            System.out.println("Your already in Velnar!");
                            Reference.travelled = false;
                        } else {
                            System.out.println("Choose an actual option.");
                            Reference.travelled = false;

                        }
                    } else if (Reference.choice == 2) {
                        System.out.println("You have entered the casino. ");
                        bet();
                    } else if (Reference.choice == 3) {
                        Reference.travelled = false;
                    }

            else if (Reference.choice == 2) {
                    System.out.println("Inventory");
                    System.out.println("---------------------");
                    System.out.println(Reference.inventory);
                } else {
                    quit();

                }
            }
        }
    }


    public static void printMap2() {
        JFrame frame = new JFrame();
        URL image = Main.class.getClassLoader().getResource("map2.png");
        ImageIcon icon = new ImageIcon(image);
        JLabel label = new JLabel(icon);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    public static void printMap1() {
        JFrame frame = new JFrame();
        URL image = Main.class.getClassLoader().getResource("map1.png");
        ImageIcon icon = new ImageIcon(image);
        JLabel label = new JLabel(icon);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    public static String getMonster(String place) {
        Random random = new Random();
        if (place == "darkforest") {
            int randomNumber = random.nextInt(1,3);
            String[] monsterList = new String[4];

            monsterList[0] = "Goblin";
            monsterList[1] = "Spider";
            monsterList[2] = "Slime";
            return monsterList[randomNumber];

        }
        else {
            return "";
        }





    }

    public static void battle1(String place) { //place corresponds to place where user is at
        int wolfAtk = 2;
        Reference.wolfHealth = 10;
        Reference.mobAlive = true;
        Scanner scanner = new Scanner(System.in);
        if (place == "velnar") {
            System.out.println("This city is a safe-zone. You cannot battle here. ");
        }
        else if (place == "darkforest") {
            System.out.println("A wild wolf appeared!"); //battle prompt, random gen a monster from an array (monster stats are in array)
            Reference.wolfHealth = 10;


            while (Reference.mobAlive) {
                System.out.println(Reference.name+"\n---------------------\n1. Fight\n2. Defend\n3. Heal\n4. Run");
                Reference.choice = scanner.nextInt();
                if (Reference.choice<1 || Reference.choice>4) {
                    System.out.println("Please choose an actual option. ");
                    Reference.mobAlive = true;
                }
                else if (Reference.choice==1) {
                    System.out.println("You attacked using your " + Reference.weaponName + "!\nYou did " + Reference.atk +" damage to the wolf. ");
                    System.out.println("The wolf did "+ wolfAtk +" damage. You have "+ Reference.hp +" hp left. ");
                    Reference.wolfHealth = Reference.wolfHealth - Reference.atk;
                    Reference.hp = Reference.hp - wolfAtk;
                    if (Reference.hp>0) {
                        if (Reference.wolfHealth > 0) {
                            Reference.mobAlive = true;
                        } else if (Reference.wolfHealth <= 0) {
                            System.out.println("You have defeated the wolf!\nYou got a wolf skin!");
                            Reference.inventory = Reference.inventory + "\n1x Wolf skin";
                            Reference.wolfSkin += 1;
                            Reference.mobAlive = false;
                            Reference.wolfHealth = 10;
                            if (Reference.wolfSkin >= 4) {
                                Reference.hasWolfSkin = true;
                            } else {
                                Reference.hasWolfSkin = false;
                            }
                        }
                    }
                    else if (Reference.hp<=0) {
                        System.out.println("You have died. ");
                        System.exit(0);
                    }
                }
                else if (Reference.choice==2) {
                    System.out.println("Would you like to shield, or use a defense spell? (1/2)");
                    Reference.choice = scanner.nextInt();
                    if (Reference.choice == 1) {
                        System.out.println("You braced yourself. ");
                        Reference.hp = Reference.hp - 1;
                        System.out.println("The wolf did 1 damage to you. You have " + Reference.hp + "hp left. ");
                        if (Reference.hp > 0) {
                            Reference.mobAlive = true;
                        } else if (Reference.hp <= 0) {
                            System.out.println("You have died. ");
                            System.exit(0);
                        }
                    }
                    else if (Reference.choice==2) {
                        System.out.println("You used a defense spell. You reduced incoming damage by half. ");
                        wolfAtk = wolfAtk/2;
                    }

                }
                else if (Reference.choice==3) {
                    if (Reference.potion>0) {
                        System.out.println("Would you like to use a potion? (y/n)");
                        String choice = scanner.nextLine();
                        if (choice == "y") {
                            if (Reference.hp == 15) {
                                System.out.println("You are already at max health!");
                            }
                            else if ((Reference.hp <15) && (Reference.potion>0)) {
                                Reference.potion -= 1;
                                Reference.hp += 5;
                                System.out.println("You now have "+ Reference.hp + " health. ");
                            }
                        }
                        else if (choice == "n") {
                            Reference.mobAlive = false;
                        }
                    }
                    else {
                        Reference.mobAlive = false;
                    }
                }
                else if (Reference.choice==4) {
                    System.out.println("You have successfully run away. ");
                    Reference.mobAlive = false;
                }

            }


            System.out.println();
        }
    }

    public static void choice4() throws InterruptedException {
        Reference.travelled = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("The old man told you to get 1 wolf skin. ");
        while (!Reference.hasWolfSkin) {
            System.out.println(Reference.name+"\n---------------------\n1. Battle\n2. Heal\n3. Exit");
            Reference.choice = scanner.nextInt();
            if (Reference.choice == 1) {
                battle1(Reference.place);
                System.out.println("You now have enough wolf skin. Get back to the old man. ");
                System.out.println('\n' + Reference.name + "\n---------------------" + '\n' + "1. Travel \n2. Exit");
                Reference.choice = scanner.nextInt();
                if (Reference.choice == 1) {
                    while (!Reference.travelled) {
                        System.out.println("1. Forest\n2. City");
                        Reference.choice = scanner.nextInt();
                        if (Reference.choice == 2) {
                            System.out.println("Travelling to the Velnar.");
                            for (int i = 0; i < 5; i++) {
                                Thread.sleep(1000); // Delay for a second
                                System.out.print(".");
                            }
                            Reference.place = "velnar";
                            System.out.println("\nYou have arrived at the Velnar! ");
                            Reference.travelled = true;
                            Reference.hasWolfSkin = true;
                        } else if ((Reference.choice == 1) && (Reference.place == "darkforest")) {
                            System.out.println("Your already in the Forest!");
                        }
                    }
                }

            }
            else if (Reference.choice == 2) {
                if (Reference.hp == 15) {
                    System.out.println("You are already at max health!");
                }
                else if ((Reference.hp <15) && (Reference.potion>0)) {
                    Reference.potion -= 1;
                    Reference.hp += 5;
                    System.out.println("You now have "+ Reference.hp + " health. ");
                }
            }
            else if (Reference.choice == 3) {
                System.exit(0);
            }
        }
    }
    public static void choice5() {
        System.out.println('\n' + Reference.name + "\n---------------------" + '\n' + "1. Map \n2. Inventory\n3. Quit");
        Scanner scanner = new Scanner(System.in);
        Reference.choice = scanner.nextInt();
        Reference.oldManTalked = false;
        while (!Reference.oldManTalked) {
            if (Reference.choice == 1) {
                printMap2();
                System.out.println('\n' + Reference.name + "\n---------------------" + '\n' + "1. Bob \n2. Old Man\n3. Quit");
                Reference.choice = scanner.nextInt();
                if (Reference.choice == 1) {
                    System.out.println("Bob: \nHey! I see you got the goods. Go talk to the old man. ");
                }
                else if (Reference.choice == 2) {
                    System.out.println("Great! You got the wolf skin I wanted! \nHere, take this!");
                    System.out.println("You obtained a "+Reference.weaponName2 + "!");
                    Reference.inventory = Reference.inventory + "\n1x" + Reference.weaponName;
                    System.out.println("You won the game!");
                    Reference.oldManTalked = true;
                    System.exit(0);
                }
            }
            else if (Reference.choice == 2) {
                System.out.println(Reference.inventory);
            }
            else if (Reference.choice == 3) {
                System.exit(0);
            }
        }
    }
public static void bet() {
    Reference.betOver = false;
    if (Reference.gold == 0) {
        Reference.betOver = true;
    }
    while (!Reference.betOver) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your bet amount: ");
        int betAmount = scanner.nextInt();
        scanner.nextLine(); //clear
        if (Reference.gold - betAmount <= 0) {
            System.out.println("You don't have enough money!");
            Reference.betOver = true;
        } else {
            System.out.print("Choose even or odd (e/o): ");
            String userChoice = scanner.nextLine();
            int randomNumber = (int) (Math.random() * 10) + 1;
            System.out.println("Random number: " + randomNumber);
            boolean isEven = randomNumber % 2 == 0;
            boolean hasWon = false;
            if ((userChoice.equalsIgnoreCase("e") && isEven) || (userChoice.equalsIgnoreCase("o") && !isEven)) {
                hasWon = true;
            }
            int winnings = hasWon ? betAmount : -betAmount;
            if (hasWon) {
                System.out.println("Congratulations! You won " + winnings + " gold.");
            } else {
                System.out.println("Sorry, you lost " + betAmount + " gold.");
            }
            Reference.gold = Reference.gold - winnings;
            if (Reference.gold==0) {
                System.out.println("You have no gold left!");
            }
            else if (Reference.gold<0) {
                System.out.println("You owe the casino gold! \nThree bodyguards come and beat you up. ");
                System.exit(0);
            }
            Reference.betOver = true;
        }
    }
}
public static void bet2() {

}
}








//make a new map for forest city and add option for city