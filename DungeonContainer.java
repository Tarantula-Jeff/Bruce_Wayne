/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dungeontester;

import java.util.Scanner;

/**
 *
 * @author jeffr
 */
public class DungeonContainer {

    private DungeonCell head;
    private DungeonCell tail;
    private int size;
    private Iterator movement;

    public DungeonContainer() {
        this.head = null;
        this.tail = null;
    }

    public void insert(Object val) {
        DungeonCell cell = new DungeonCell(val);
        if (head == null) {
            head = cell;
            tail = cell;
            return;
        }
        tail.next = cell;
        //pointing cell added to the tail connected 
        cell.prev = tail;
        //head.previous is connecting to the cell just added
        head.prev = cell;
        //connecting to the the head 
        cell.next = head;
        //tail just added
        tail = cell;

    }

    public void scan() {
        int val;
        System.out.println("enter movement");
        Scanner player = new Scanner(System.in);
        val = player.nextInt();
        if (val == 7) {
            forward();
        }
        display();
    }

    public void run() {
        MainCharacter stats = new MainCharacter("jeff", 150, 50, 50, 30, 0, 1);
        int play;
        boolean answer = true;
        Scanner game = new Scanner(System.in);
        while (answer) {

            while (answer) {
                System.out.println("Welcome to the Dungeon game");
                System.out.println("----------------------------");
                System.out.println("");
                System.out.println("(1)MAP");
                System.out.println("(2)PLAYER STATS");
                System.out.println("(3)START");
                System.out.println("(4)EXIT");
                play = game.nextInt();
                if (play == 1) {
                    display();
                }
                if (play == 2) {
                    System.out.println("Health: " + stats.gethealth());
                    System.out.println("Speed: " + stats.getspeed());
                    System.out.println("Attack: " + stats.getatk());
                    System.out.println("HeroLevel: " + stats.getherolevel());
                    System.out.println("Defence: " + stats.getDef());
                } else if (play == 3) {
                    scan();

                } else if (play == 4) {
                    answer = false;
                } else {
                    System.out.println("Enter 1-4");
                }

            }
        }
    }

    public DungeonCell getHead() {
        return head;
    }

    public void cells() {

        insert(new GoblinEnemy(90, 45, 65, 10, 50, 0));
        insert(new Empty("Empty", 0, 0, 0, 0, 0, 0));
        insert(new GoblinEnemy(9, 9, 9, 9, 9, 9));
        insert(new Empty("Empty", 0, 0, 0, 0, 0, 0));
        insert(new GoblinEnemy(90, 45, 65, 10, 50, 0));
        insert(new Empty("Empty", 0, 0, 0, 0, 0, 0));
        insert(new Exit("Exit", 0, 0, 0, 0, 0, 0));
        insert(new GoblinEnemy(90, 45, 65, 10, 50, 0));
        insert(new Empty("Empty", 0, 0, 0, 0, 0, 0));
        insertIndex(new MainCharacter("jeff", 150, 50, 50, 30, 0, 1), 6);

        movement = new Iterator(this);
    }

    public void move() {
        int m = 1;
        int n = 1;

        removeCell(head, new MainCharacter());
        insertIndex(60, 7);

    }

    //This will insert an object at the given position
    public void insertIndex(Object newElement, int position) {
        DungeonCell newBox = new DungeonCell(newElement);
        newBox.val = newElement;
        newBox.next = null;
        DungeonCell temp = head;
        int NoOfElements = 0;

        if (temp != null) {
            NoOfElements++;
            temp = temp.next;
        }
        while (temp != head) {
            NoOfElements++;
            temp = temp.next;
        }

        if (position < 1 || position > (NoOfElements + 1)) {
            System.out.print("\nInvalid position.");
        } else if (position == 1) {

            if (head == null) {
                head = newBox;
                head.next = head;
            } else {
                while (temp.next != head) {
                    temp = temp.next;
                }
                newBox.next = head;
                head = newBox;
                temp.next = head;
            }
        } else {
            temp = head;
            for (int i = 1; i < position - 1; i++) {
                temp = temp.next;
            }
            newBox.next = temp.next;
            temp.next = newBox;
        }
    }

    public DungeonCell removeCell(DungeonCell head, Object key) {
        if (head == null) {
            return null;
        }

        DungeonCell curr = head, prev = new DungeonCell();
        while (curr.val != key) {
            if (curr.next == head) {
                break;
            }

            prev = curr;
            curr = curr.next;
        }

        // Check if node is only node
        if (curr == head && curr.next == head) {
            head = null;
            return head;
        }

        // If more than one cell, will check if
        // it is first cell
        if (curr == head) {
            prev = head;
            while (prev.next != head) {
                prev = prev.next;
            }
            head = curr.next;
            prev.next = head;
        } // check if node is last cell
        else if (curr.next == head) {
            prev.next = head;
        } else {
            prev.next = curr.next;
        }
        return head;
    }

    public void forward() {
        DungeonCell Cell = new DungeonCell();

        head = movement.next();
        Cell.val = new MainCharacter();
        if (movement.next() == Cell.val) {
            System.out.println("You have encountered an enemy");
        }

    }

    public void previous() {
        head = movement.previous();
    }

    public void display() {
        DungeonCell cell = head;
        if (head != null) {
            do {
                System.out.print(cell.val + "---");
                cell = cell.next;
            } while (cell != head);
            System.out.println();
        }
    }

}
