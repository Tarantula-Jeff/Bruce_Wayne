/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dungeontester;

/**
 *
 * @author jeffr
 */
public class DungeonCell {

    Object val;
    DungeonCell next;
    DungeonCell prev;

    public DungeonCell() {
    }

    public DungeonCell(Object val) {
        this.val = val;

    }

    public void setNext(DungeonCell bx) {
        next = bx;

    }

    public DungeonCell getNext() {
        return next;
    }

    public void setPrev(DungeonCell bx) {
        next = bx;

    }

    public DungeonCell getPrev() {
        return prev;
    }

}
