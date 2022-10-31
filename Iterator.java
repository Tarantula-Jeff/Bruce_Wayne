/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dungeontester;

/**
 *
 * @author jeffr
 */
public class Iterator {

    DungeonCell cell;

    public Iterator(DungeonContainer iTer) {
        cell = iTer.getHead();
    }

    public DungeonCell next() {
        cell = cell.next;
        return cell;
    }

    public DungeonCell previous() {
        cell = cell.prev;
        return cell;
    }

    public boolean hasNext() {
        if (cell.next != null) {
            return true;
        }
        return false;
    }

}
